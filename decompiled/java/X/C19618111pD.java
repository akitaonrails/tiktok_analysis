package X;

import Y.ACListenerS139S0100000_4;
import Y.ACListenerS163S0100000_29;
import Y.ALAdapterS24S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.basesticker.SecretRepliesStickerCreateComponent$initSecretRepliesStickerEditView$1;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19618111pD extends AbstractC388880FMo<SecretRepliesStickerModel> {
    public C19618211pE LJII;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.SECRET_REPLIES;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        SecretRepliesStickerModel secretRepliesStickerModel = (SecretRepliesStickerModel) stickerModel;
        return secretRepliesStickerModel.copy(BaseStickerModel.copy$default(secretRepliesStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1073741826, 15, null), secretRepliesStickerModel.visible, secretRepliesStickerModel.questionText, secretRepliesStickerModel.editable);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        SecretRepliesStickerModel secretRepliesStickerModel = (SecretRepliesStickerModel) stickerModel;
        return new C19618311pF(this.LIZ, secretRepliesStickerModel.copy(BaseStickerModel.copy$default(secretRepliesStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), secretRepliesStickerModel.visible, secretRepliesStickerModel.questionText, secretRepliesStickerModel.editable), this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
        Parcelable secretRepliesStickerModel;
        C19618211pE c19618211pE = this.LJII;
        if (c0ftj == null || (secretRepliesStickerModel = c0ftj.LJLI()) == null) {
            secretRepliesStickerModel = new SecretRepliesStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), true, null, false);
        }
        SecretRepliesStickerModel secretRepliesStickerModel2 = (SecretRepliesStickerModel) secretRepliesStickerModel;
        if (C19618011pC.LIZ(str)) {
            secretRepliesStickerModel2.getBaseStickerModel().setStickerSource("2");
        }
        if (c19618211pE == null) {
            C19618211pE c19618211pE2 = new C19618211pE(this.LIZ, this.LJFF);
            this.LJII = c19618211pE2;
            this.LIZJ.addView(c19618211pE2, new ViewGroup.LayoutParams(-1, -1));
            C19618211pE c19618211pE3 = this.LJII;
            if (c19618211pE3 != null) {
                LifecycleOwner lifecycleOwner = this.LIZLLL;
                c19618211pE3.LLJILJIL = secretRepliesStickerModel2.copy(BaseStickerModel.copy$default(secretRepliesStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), secretRepliesStickerModel2.visible, secretRepliesStickerModel2.questionText, secretRepliesStickerModel2.editable);
                c19618211pE3.LLJILJILJ = new C1664680tQA<>(secretRepliesStickerModel2.copy(BaseStickerModel.copy$default(secretRepliesStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), false, secretRepliesStickerModel2.questionText, true));
                c19618211pE3.LLIZ = new C1664680tQA<>(secretRepliesStickerModel2.copy(BaseStickerModel.copy$default(secretRepliesStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), false, secretRepliesStickerModel2.questionText, true));
                c19618211pE3.LLILZLL = lifecycleOwner;
                boolean z = C786410Ut5.Sd(R.layout.f4u, C786410Ut5.ne(c19618211pE3.getContext()), c19618211pE3) instanceof ViewGroup;
                c19618211pE3.LLILZIL = (ViewGroup) c19618211pE3.findViewById(R.id.uik);
                C11BN c11bn = new C11BN(c19618211pE3.getContext());
                LifecycleOwner lifecycleOwner2 = c19618211pE3.LLILZLL;
                C1664680tQA<SecretRepliesStickerModel> c1664680tQA = c19618211pE3.LLIZ;
                if (c1664680tQA != null && lifecycleOwner2 != null) {
                    c11bn.LIZIZ(lifecycleOwner2, c1664680tQA);
                }
                c19618211pE3.LLJILLL = c11bn;
                c19618211pE3.addView(c11bn);
                c19618211pE3.LLJIJIL = (TuxTextView) c19618211pE3.findViewById(R.id.zj1);
                C1295960jpS c1295960jpS = (C1295960jpS) c19618211pE3.findViewById(R.id.ftq);
                c19618211pE3.LLJI = c1295960jpS;
                if (c1295960jpS != null) {
                    c1295960jpS.setAnimation("effect_dice_lottie.json");
                }
                TextView textView = (TextView) c19618211pE3.findViewById(R.id.tv_reply_disclaimer);
                if (textView != null) {
                    textView.setText(textView.getContext().getString(2131847220));
                }
                FrameLayout frameLayout = (FrameLayout) c19618211pE3.findViewById(R.id.ia2);
                c19618211pE3.LLIZLLLIL = frameLayout;
                if (frameLayout != null) {
                    frameLayout.addView(c19618211pE3.getSecretRepliesStickerView());
                }
                ViewGroup viewGroup = c19618211pE3.LLILZIL;
                if (viewGroup != null) {
                    C786410Ut5.K7(viewGroup, new ACListenerS163S0100000_29(c19618211pE3, 199));
                }
                TuxTextView tuxTextView = c19618211pE3.LLJIJIL;
                if (tuxTextView != null) {
                    C786410Ut5.I7(new AkS95S0100000_29(c19618211pE3, 68), tuxTextView);
                }
                C1295960jpS c1295960jpS2 = c19618211pE3.LLJI;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.setSpeed(1.5f);
                    c1295960jpS2.addAnimatorListener(new ALAdapterS24S0100000_29(c19618211pE3, 15));
                    C786410Ut5.c8(c1295960jpS2, new ACListenerS139S0100000_4(c1295960jpS2, 70));
                }
            }
            this.LIZLLL.getLifecycle().addObserver(new SecretRepliesStickerCreateComponent$initSecretRepliesStickerEditView$1(this));
            c19618211pE = this.LJII;
        } else {
            c19618211pE.LLJILJIL = secretRepliesStickerModel2.copy(BaseStickerModel.copy$default(secretRepliesStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), secretRepliesStickerModel2.visible, secretRepliesStickerModel2.questionText, secretRepliesStickerModel2.editable);
            C1664680tQA<SecretRepliesStickerModel> c1664680tQA2 = c19618211pE.LLJILJILJ;
            if (c1664680tQA2 != null) {
                c1664680tQA2.LIZLLL(new AwS608S0100000_29(secretRepliesStickerModel2, 553), true);
            }
            C1664680tQA<SecretRepliesStickerModel> c1664680tQA3 = c19618211pE.LLIZ;
            if (c1664680tQA3 != null) {
                c1664680tQA3.LIZLLL(new AwS608S0100000_29(secretRepliesStickerModel2, 554), true);
            }
        }
        if (c390370FSh != null) {
            c390370FSh.LIZIZ(secretRepliesStickerModel2);
        }
        if (c19618211pE != null) {
            c19618211pE.setStickerEditListener(new C0FSM(EnumC1466150oFx.SECRET_REPLIES, function1, c390370FSh, c0ftj));
            int visibility = c19618211pE.getVisibility();
            c19618211pE.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c19618211pE);
            if (!c19618211pE.LJIIJJI()) {
                C11BN secretRepliesStickerView = c19618211pE.getSecretRepliesStickerView();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(secretRepliesStickerView);
                secretRepliesStickerView.setScaleX(0.0f);
                C11BN secretRepliesStickerView2 = c19618211pE.getSecretRepliesStickerView();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(secretRepliesStickerView2);
                secretRepliesStickerView2.setScaleY(0.0f);
                C1664680tQA<SecretRepliesStickerModel> c1664680tQA4 = c19618211pE.LLJILJILJ;
                if (c1664680tQA4 != null) {
                    c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(297), true);
                }
                C1664680tQA<SecretRepliesStickerModel> c1664680tQA5 = c19618211pE.LLIZ;
                if (c1664680tQA5 != null) {
                    c1664680tQA5.LIZLLL(AFwS273S0000000_29.get$arr$(298), true);
                }
            }
            HandlerHook.viewPostDelay(c19618211pE, new ARunnableS129S0100000_29(c19618211pE, 136), 300L);
            C783760Uoo.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "others_secret_reply_sticker");
            c0lab.LJ("shoot_way", "story");
            C20684815ws.LJIILLIIL("enter_secret_reply_edit_page", c0lab.LIZ);
        }
    }

    public C19618111pD(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }
}
