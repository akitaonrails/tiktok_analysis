package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS53S0201000_29;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS52S0301000_29;

/* JADX INFO: renamed from: X.11il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19578111il extends AbstractC19588311kP<SecretRepliesResponseStickerModel> {
    public final Aweme LLILZIL;
    public C1664680tQA<SecretRepliesResponseStickerModel> LLILZLL;
    public LifecycleOwner LLIZ;
    public final ConstraintLayout LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;
    public final ConstraintLayout LLJIJIL;
    public final ConstraintLayout LLJILJIL;

    public final void LIZIZ() {
        float fLIZIZ = C418440Gaw.LIZIZ(18);
        ConstraintLayout constraintLayout = this.LLJIJIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.tn, getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        constraintLayout.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout2 = this.LLJILJIL;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ2 != null) {
            gradientDrawable2.setColor(numLIZJ2.intValue());
        }
        constraintLayout2.setBackground(gradientDrawable2);
    }

    public final Aweme getAweme() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        C1C1T c1c1t;
        C1C1Q c1c1q;
        C1C1N c1c1n;
        InterfaceC19578011ik interfaceC19578011ik;
        int iIntValue;
        User author;
        String uid;
        Integer numLIZLLL;
        C705930RmZ c705930RmZ;
        this.LLILZ = interactStickerStruct;
        Aweme aweme = this.LLILZIL;
        if (aweme != null && (c1c1t = C2203191BKr.LIZ(aweme).socialBlob) != null && (c1c1q = c1c1t.secret_reply_blob) != null && (c1c1n = c1c1q.secret_reply_response_sticker_blob) != null) {
            C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
            C0P0T c0p0tLIZIZ = null;
            if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null) {
                interfaceC19578011ik = c705930RmZ.LJIILL;
            } else {
                interfaceC19578011ik = null;
            }
            String string = c1c1n.item_id.toString();
            Aweme aweme2 = this.LLILZIL;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null && (uid = author.getUid()) != null && interfaceC19578011ik != null && (numLIZLLL = interfaceC19578011ik.LIZLLL(uid, string)) != null) {
                iIntValue = numLIZLLL.intValue();
            } else {
                iIntValue = -1;
            }
            C450840Hm6 c450840Hm6 = new C450840Hm6();
            c450840Hm6.LIZLLL = getContext().getString(2131847215);
            c450840Hm6.LJFF = new ACListenerS53S0201000_29(this, iIntValue, interfaceC19578011ik, 2);
            C450840Hm6 c450840Hm62 = new C450840Hm6();
            c450840Hm62.LIZLLL = getContext().getString(2131847216);
            c450840Hm62.LJFF = new ACListenerS131S0200000_29(interfaceC19578011ik, this, 33);
            if (iIntValue != -1 || (interfaceC19578011ik != null && interfaceC19578011ik.LJII())) {
                C450860Hm8 c450860Hm8 = new C450860Hm8(getContext());
                EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.BOTTOM;
                C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                c1391600mJi.LIZLLL = enumC1235690iGF;
                c1391600mJi.LIZIZ = this.LLIZLLLIL;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LJII = 3000L;
                c450860Hm8.LJIIJ(new AwS52S0301000_29(iIntValue, c450840Hm6, interfaceC19578011ik, c450840Hm62, 3));
                c0p0tLIZIZ = c450860Hm8.LIZIZ();
            }
            C786410Ut5.I7(new AkS95S0100000_29(c0p0tLIZIZ, 72), this.LLIZLLLIL);
            String str = c1c1n.prompt_text;
            String str2 = c1c1n.reply_text;
            this.LLJ.setText(str);
            this.LLJI.setText(str2);
            LIZIZ();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19578111il(Context context, C19591211ks c19591211ks, Aweme aweme, int i) {
        c19591211ks = (i & 8) != 0 ? null : c19591211ks;
        aweme = (i & 16) != 0 ? null : aweme;
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLILZIL = aweme;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f4s, this, true);
        this.LLIZLLLIL = (ConstraintLayout) viewTd.findViewById(R.id.dyc);
        this.LLJ = (TuxTextView) viewTd.findViewById(R.id.tv_response_header);
        this.LLJI = (TuxTextView) viewTd.findViewById(R.id.tv_response_body);
        this.LLJIJIL = (ConstraintLayout) viewTd.findViewById(R.id.dyb);
        this.LLJILJIL = (ConstraintLayout) viewTd.findViewById(R.id.dya);
    }
}
