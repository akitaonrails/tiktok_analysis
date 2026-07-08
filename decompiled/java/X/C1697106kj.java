package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1697106kj extends LinearLayout {
    public C430210Gtv LL;
    public TuxIconView LLILLJJLI;
    public View LLILLL;
    public LinearLayout LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public C197039127h LLJI;
    public final C01GW LLJIJIL;

    private final PrivacySettingsFeature getPrivacySettings() {
        return (PrivacySettingsFeature) this.LLJIJIL.getValue();
    }

    public final C430210Gtv getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LL = (C430210Gtv) callbackFindViewById;
        }
        return (C430210Gtv) callbackFindViewById;
    }

    public final TuxTextView getBody1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c7y);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getBody2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c82);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getBody3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c89);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getContentBgFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.euo);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getIvCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lc0);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C197039127h getPrimaryButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ru5);
            this.LLJI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getSecondaryButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ui7);
            this.LLJ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final LinearLayout getStatusContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w13);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        getPrivacySettings().LJFF("message_read_status", 1, C11S5.LIZ(), C1701940uOG.LIZIZ(), AFwS187S0000000_2.get$arr$(415), AFwS229S0000000_2.get$arr$(266), false);
    }

    public final void setAvatarFromXml(C430210Gtv c430210Gtv) {
        this.LL = c430210Gtv;
    }

    public final void setBody1FromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setBody2FromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setBody3FromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setContentBgFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setIvCloseFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setPrimaryButtonFromXml(C197039127h c197039127h) {
        this.LLJI = c197039127h;
    }

    public final void setSecondaryButtonFromXml(C197039127h c197039127h) {
        this.LLJ = c197039127h;
    }

    public final void setStatusContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public C1697106kj(final Context context, final EnumC1651806dQ enumC1651806dQ) {
        int iIntValue;
        int iIntValue2;
        super(context, null, 0);
        this.LLJIJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(806));
        setOrientation(1);
        setGravity(1);
        C786410Ut5.Sd(R.layout.cfn, C786410Ut5.ne(context), this);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ(getAvatarFromXml());
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331750klB.LIZJ = iIntValue;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C786410Ut5.a9(getIvCloseFromXml(), new ACListenerS137S0100000_2(this, 54));
        View contentBgFromXml = getContentBgFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        contentBgFromXml.setBackground(c384050F3z.LIZ(context));
        LinearLayout statusContainerFromXml = getStatusContainerFromXml();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(40));
        c384050F3z2.LJFF = Integer.valueOf(R.attr.bw);
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.bx);
        statusContainerFromXml.setBackground(c384050F3z2.LIZ(context));
        getBody1FromXml().setText(context.getString(2131848780));
        getBody2FromXml().setText(context.getString(2131848781));
        String string = context.getString(2131848783);
        String strJ4 = C786410Ut5.j4(context.getString(2131848782), Arrays.copyOf(new Object[]{string}, 1));
        SpannableString spannableString = new SpannableString(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        if (iLJJJ >= 0 && length >= 0) {
            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.06kk
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    SmartRouter.buildRoute(context, "aweme://chatcontrol/setting").open();
                    if (enumC1651806dQ == EnumC1651806dQ.O18) {
                        String str = TuxSheet._pnsPageId;
                        C1391190mJ3.LJ(this, new C1697306kl(true));
                    } else {
                        String str2 = TuxSheet._pnsPageId;
                        C1391190mJ3.LJ(this, new C1697306kl(false));
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 33);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), iLJJJ, length, 33);
        }
        getBody3FromXml().setText(spannableString);
        getBody3FromXml().setMovementMethod(LinkMovementMethod.getInstance());
        int i = C1652106dT.LIZ[enumC1651806dQ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                getTitleFromXml().setText(context.getString(2131848787));
                getPrimaryButtonFromXml().setText(context.getString(2131848786));
                getSecondaryButtonFromXml().setText(context.getString(2131848785));
                C786410Ut5.U8(getPrimaryButtonFromXml(), new ACListenerS137S0100000_2(this, 56));
                C786410Ut5.U8(getSecondaryButtonFromXml(), new ACListenerS137S0100000_2(this, 57));
                return;
            }
            return;
        }
        getTitleFromXml().setText(context.getString(2131848779));
        C786410Ut5.LLLLLLJ(getSecondaryButtonFromXml(), 8);
        C197039127h primaryButtonFromXml = getPrimaryButtonFromXml();
        ViewGroup.LayoutParams layoutParams = getPrimaryButtonFromXml().getLayoutParams();
        layoutParams.width = -1;
        C786410Ut5.J6(primaryButtonFromXml, layoutParams);
        getPrimaryButtonFromXml().setText(context.getString(2131848784));
        C426750GoL.LJIIIZ(getPrimaryButtonFromXml(), 0, 0, 0, 0, false, 16);
        C786410Ut5.U8(getPrimaryButtonFromXml(), new ACListenerS137S0100000_2(this, 55));
    }
}
