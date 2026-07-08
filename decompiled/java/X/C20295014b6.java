package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS82S1000000_32;
import njp.a;

/* JADX INFO: renamed from: X.14b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService$checkECommerceToggleResult$1$2", f = "ECommerceVideoService.kt", l = {}, m = "invokeSuspend")
public final class C20295014b6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20295014b6(Fragment fragment, InterfaceC1364105Vn<? super C20295014b6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20295014b6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceVideoService@f5c5.checkECommerceToggleResult$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = new C013C();
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL.requireContext());
        c1397580mTM.LJI(this.LL.getResources().getString(2131832731));
        c1397580mTM.LIZIZ(this.LL.getResources().getString(2131832730));
        C985403tE.LIZ(c1397580mTM, new AwS396S0200000_30(this.LL, c013c, 58));
        c1397580mTM.LIZLLL(new AwS609S0100000_30(c013c, 274));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C21271918Mj.LIZ.getClass();
        C1018703yb.LIZLLL("tiktokec_popup_show", new AwS82S1000000_32("video_brand_organic_toggle", 11));
        C20295114b7.LIZ().storeBoolean("key_ec_video_bo_tip_show", true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceVideoService@f5c5.checkECommerceToggleResult$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
