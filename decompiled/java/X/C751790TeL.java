package X;

import Y.AAListenerS323S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import androidx.cardview.widget.CardView;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.utils.animation.view.SponsoredComboProgressView$showFinalView$1", f = "SponsoredComboProgressView.kt", l = {434}, m = "invokeSuspend")
public final class C751790TeL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1126110fPV LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751790TeL(C1126110fPV c1126110fPV, String str, Bitmap bitmap, Function0<Unit> function0, InterfaceC1364105Vn<? super C751790TeL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1126110fPV;
        this.LLILLL = str;
        this.LLILZ = bitmap;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751790TeL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SponsoredComboProgressView@ce53.showFinalView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ValueAnimator valueAnimator = this.LLILLJJLI.LLJJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLILLJJLI.LLJILJIL.setText(this.LLILLL);
            C500260Jjc.LLFFF(this.LLILLJJLI.LLJI);
            CardView cardView = this.LLILLJJLI.LLJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(cardView);
            cardView.setX(C1126110fPV.LLJJIJIL * C1136970fh1.LJFF());
            C500260Jjc.LLFFF(this.LLILLJJLI.LLJ);
            C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(7.0f), this.LLILLJJLI.LLJ);
            C1295960jpS c1295960jpS = this.LLILLJJLI.LLJ;
            if (C497740JfY.LJJ()) {
                str = "ttlive_sponsor_combo_congrats_rtl.zip";
            } else {
                str = "ttlive_sponsor_combo_congrats.zip";
            }
            C0KZZ.LIZLLL(c1295960jpS, str, Collections.singletonList("image_0"), Collections.singletonList(this.LLILZ), C2286608xc.LJ(C1126110fPV.LLJJIJI), C2286608xc.LJ(C1126110fPV.LLJJIJIIJIL), false, true, "tiktok_live_revenue_normal_1");
            C500260Jjc.LJIILIIL(this.LLILLJJLI.LLJIJIL);
            this.LLILLJJLI.LLJ.playAnimation();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("SponsoredComboProgressView@ce53.showFinalView$1");
                return objLJFF;
            }
        }
        this.LLILZIL.invoke();
        C1126110fPV c1126110fPV = this.LLILLJJLI;
        c1126110fPV.getClass();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(C1126110fPV.LLJJJ, 1);
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(c1126110fPV, 32));
            valueAnimatorOfInt.addListener(new AAListenerS323S0100000_12(c1126110fPV, 13));
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.start();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SponsoredComboProgressView@ce53.showFinalView$1");
        return unit;
    }
}
