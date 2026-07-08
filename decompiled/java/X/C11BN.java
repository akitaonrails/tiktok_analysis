package X;

import Y.AObjectS247S0100000_29;
import Y.AObjectS307S0200000_29;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11BN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11BN extends AbstractC19588311kP<SecretRepliesStickerModel> {
    public C1664680tQA<SecretRepliesStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public final C0I7D LLIZ;
    public final SmartAvatarImageView LLIZLLLIL;
    public final TuxIconView LLJ;
    public final LinearLayout LLJI;
    public final TuxTextView LLJIJIL;
    public C0I7D LLJILJIL;
    public final Keva LLJILJILJ;

    public final C0I7D getSecretReplyQuestionEditText() {
        return this.LLJILJIL;
    }

    public C11BN(Context context) {
        super(0, 8, context, (AttributeSet) null);
        this.LLJILJILJ = Keva.getRepo("secret_replies");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f4v, this, true);
        this.LLJILJIL = (C0I7D) viewTd.findViewById(R.id.hdj);
        this.LLIZ = (C0I7D) viewTd.findViewById(R.id.tv_secret_replies_sticker_reply_area_text);
        this.LLIZLLLIL = (SmartAvatarImageView) viewTd.findViewById(R.id.bgl);
        this.LLJ = (TuxIconView) viewTd.findViewById(R.id.uif);
        this.LLJI = (LinearLayout) viewTd.findViewById(R.id.nhl);
        this.LLJIJIL = (TuxTextView) viewTd.findViewById(R.id.tv_shoot_hint);
    }

    public final void setSecretReplyQuestionEditText(C0I7D c0i7d) {
        this.LLJILJIL = c0i7d;
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        C19591311kt c19591311kt = C19591311kt.LIZ;
        C0I7D c0i7d = this.LLJILJIL;
        c19591311kt.getClass();
        C19591311kt.LJIIIIZZ(c0i7d, 10.0d);
        final C0I7D c0i7d2 = this.LLJILJIL;
        c0i7d2.addTextChangedListener(new TextWatcher(c0i7d2) { // from class: X.0Hgh
            public final EditText LL;
            public String LLILLJJLI = "";

            {
                this.LL = c0i7d2;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int length;
                int i;
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                int selectionStart = this.LL.getSelectionStart();
                if (editable != null) {
                    if (length > 50) {
                        editable.replace(0, length, this.LLILLJJLI);
                        int length2 = this.LLILLJJLI.length();
                        try {
                            this.LL.setSelection(Math.max(0, Math.min(selectionStart, length2)));
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LL.setSelection(length2);
                        }
                    } else {
                        this.LLILLJJLI = editable.toString();
                    }
                }
                EditText editText = this.LL;
                if (length > 0) {
                    i = 4;
                } else {
                    i = 5;
                }
                editText.setTextAlignment(i);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence != null && (charSequence.length() + i3) - i2 > 50) {
                    this.LLILLJJLI = charSequence.toString();
                }
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19591311kt c19591311kt2 = C19591311kt.LIZ;
                EditText editText = this.LL;
                c19591311kt2.getClass();
                C19591311kt.LJIIIIZZ(editText, 10.0d);
            }
        });
        c0i7d2.setClickable(false);
        c0i7d2.setFocusable(false);
        c0i7d2.setCursorVisible(false);
        c0i7d2.setFocusableInTouchMode(false);
        c0i7d2.setLongClickable(false);
        C0I7D c0i7d3 = this.LLIZ;
        c0i7d3.setClickable(false);
        c0i7d3.setFocusable(false);
        c0i7d3.setCursorVisible(false);
        c0i7d3.setFocusableInTouchMode(false);
        c0i7d3.setLongClickable(false);
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(currentUser.getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LJJ(this.LLIZLLLIL);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        LinearLayout linearLayout = this.LLJI;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(24));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        linearLayout.setBackground(gradientDrawable);
        this.LLJ.LIZ();
        if (!this.LLJILJILJ.getBoolean("has_edit_sticker_guidance_hint_shown", false)) {
            C786410Ut5.LLLLZLL(this.LLJIJIL, 0);
            this.LLJILJILJ.storeBoolean("has_edit_sticker_guidance_hint_shown", true);
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 != null) {
            c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11BO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SecretRepliesStickerModel) obj).getVisible());
                }
            }).LIZ(this.LLILZLL, new AObjectS247S0100000_29(this, 93));
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 != null) {
            c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11BP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SecretRepliesStickerModel) obj).getEditable());
                }
            }).LIZ(this.LLILZLL, new AObjectS247S0100000_29(this, 94));
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 != null) {
            c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11BQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SecretRepliesStickerModel) obj).getQuestionText();
                }
            }).LIZ(this.LLILZLL, new AObjectS307S0200000_29((C1664680tQA) c1664680tQA4, (C1664680tQA<SecretRepliesStickerModel>) this, (C11BN) 4));
        }
    }
}
