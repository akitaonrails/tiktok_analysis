package X;

import Y.ALAdapterS4S0200000_7;
import android.animation.AnimatorSet;
import android.view.View;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem$showSmallCardWithAnchorListCache$1", f = "GiftAnchorPanelGiftPageGiftPageBottomAssem.kt", l = {657, 666}, m = "invokeSuspend")
public final class C1145120fuA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GiftAnchorPanelGiftPageGiftPageBottomAssem LLILLJJLI;
    public final /* synthetic */ C1146350fw9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145120fuA(GiftAnchorPanelGiftPageGiftPageBottomAssem giftAnchorPanelGiftPageGiftPageBottomAssem, C1146350fw9 c1146350fw9, InterfaceC1364105Vn<? super C1145120fuA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = giftAnchorPanelGiftPageGiftPageBottomAssem;
        this.LLILLL = c1146350fw9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1145120fuA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Float fLIZLLL;
        C1C7U.LIZ("GiftAnchorPanelGiftPageGiftPageBottomAssem@c42.showSmallCardWithAnchorListCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLJJLI.op(this.LLILLL);
                GiftAnchorPanelGiftPageGiftPageBottomAssem giftAnchorPanelGiftPageGiftPageBottomAssem = this.LLILLJJLI;
                AnimatorSet animatorSet = giftAnchorPanelGiftPageGiftPageBottomAssem.LLJLL;
                animatorSet.playTogether(giftAnchorPanelGiftPageGiftPageBottomAssem.hp(true));
                animatorSet.start();
            }
        } else {
            C155000ia.LIZIZ(obj);
            View view = this.LLILLJJLI.LLJJIII;
            if (view != null) {
                fLIZLLL = C2286608xc.LIZLLL(view.getY());
            } else {
                fLIZLLL = null;
            }
            if (Intrinsics.LIZLLL(fLIZLLL, 0.0f)) {
                GiftAnchorPanelGiftPageGiftPageBottomAssem giftAnchorPanelGiftPageGiftPageBottomAssem2 = this.LLILLJJLI;
                this.LL = 1;
                AnimatorSet animatorSet2 = giftAnchorPanelGiftPageGiftPageBottomAssem2.LLJLL;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                animatorSet2.playTogether(giftAnchorPanelGiftPageGiftPageBottomAssem2.hp(false));
                animatorSet2.addListener(new ALAdapterS4S0200000_7(animatorSet2, c2252611DEt, 14));
                c2252611DEt.LJJII(new AwS595S0100000_16(animatorSet2, 326));
                animatorSet2.start();
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ != C099R.LJFF()) {
                    objLJIJ = Unit.LIZ;
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("GiftAnchorPanelGiftPageGiftPageBottomAssem@c42.showSmallCardWithAnchorListCache$1");
                    return objLJFF;
                }
                this.LLILLJJLI.op(this.LLILLL);
                GiftAnchorPanelGiftPageGiftPageBottomAssem giftAnchorPanelGiftPageGiftPageBottomAssem3 = this.LLILLJJLI;
                AnimatorSet animatorSet3 = giftAnchorPanelGiftPageGiftPageBottomAssem3.LLJLL;
                animatorSet3.playTogether(giftAnchorPanelGiftPageGiftPageBottomAssem3.hp(true));
                animatorSet3.start();
            } else {
                this.LLILLJJLI.op(this.LLILLL);
                GiftAnchorPanelGiftPageGiftPageBottomAssem giftAnchorPanelGiftPageGiftPageBottomAssem4 = this.LLILLJJLI;
                AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(giftAnchorPanelGiftPageGiftPageBottomAssem4, 501);
                this.LL = 2;
                if (giftAnchorPanelGiftPageGiftPageBottomAssem4.mp(awS561S0100000_17, this) == objLJFF) {
                    C1C7U.LIZIZ("GiftAnchorPanelGiftPageGiftPageBottomAssem@c42.showSmallCardWithAnchorListCache$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageGiftPageBottomAssem@c42.showSmallCardWithAnchorListCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
