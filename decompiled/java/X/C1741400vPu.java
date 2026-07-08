package X;

import Y.ARunnableS124S0100000_24;
import com.bytedance.android.btm.api.BtmSDK;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment$onNodeShow$1", f = "ShopMallMixFragment.kt", l = {}, m = "invokeSuspend")
public final class C1741400vPu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopMallMixFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741400vPu(ShopMallMixFragment shopMallMixFragment, InterfaceC1364105Vn<? super C1741400vPu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopMallMixFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741400vPu(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShopMallMixFragment@3794.onNodeShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShopMallMixFragment shopMallMixFragment = this.LL;
        boolean z = false;
        shopMallMixFragment.LLJJJ.LJI = false;
        C1735100vFk c1735100vFk = C1735100vFk.LIZ;
        AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(shopMallMixFragment, 50);
        c1735100vFk.getClass();
        C1735100vFk.LIZIZ("shop_tab", null, null, awS603S0100000_24);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this.LL, 330);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS568S0100000_24);
        ShopMallMixFragment shopMallMixFragment2 = this.LL;
        if (shopMallMixFragment2.LLJJIJIIJIL) {
            shopMallMixFragment2.LLJJIJIIJIL = false;
        }
        if (C1767800w6U.LJ()) {
            C2211631BhB.LJIIZILJ(this.LL, false);
        } else {
            C2211631BhB.LJIIL(this.LL, null);
        }
        C1741160vPW c1741160vPW = this.LL.LLJJJIL;
        c1741160vPW.getClass();
        C2341109Fh.LJFF(AFwS215S0000000_26.get$arr$(532));
        c1741160vPW.LJ.getActivity();
        C1741260vPg c1741260vPgLIZIZ = c1741160vPW.LIZIZ();
        if (c1741260vPgLIZIZ.LIZIZ != EnumC1741180vPY.OUT_OF_MALL) {
            C1741370vPr.LIZ(C1741370vPr.LIZ, "proxyMallTabOnNodeShowWhenResumed", "unexpected status", c1741260vPgLIZIZ, 24);
        }
        EnumC1741200vPa enumC1741200vPa = EnumC1741200vPa.ENTER_MALL;
        if (C300430Bq5.LIZ() && !C1569200qwA.LIZ()) {
            c1741160vPW.LJ.LLJJJ.getClass();
            C1767790w6T c1767790w6T = C1767980w6m.LJII;
            if (!Intrinsics.LJFF(c1741160vPW.LJIIJ, c1767790w6T)) {
                c1741160vPW.LJIIJ = c1767790w6T;
                z = true;
            }
            c1741160vPW.LIZ(EnumC1741180vPY.IN_MALL_NOT_LOGIN, new C1741150vPV(enumC1741200vPa, z, 4));
            C23250099c.LIZLLL(c1741160vPW.LJ.ZR(), null, null, new C1741380vPs(c1741160vPW, "proxyMallTabOnNodeShowWhenResumed", null), 3);
        } else {
            c1741160vPW.LJFF("proxyMallTabOnNodeShowWhenResumed", enumC1741200vPa);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        ShopMallMixFragment shopMallMixFragment3 = this.LL;
        C0PSL c0psl = new C0PSL();
        c0psl.LIZ = true;
        btmSDK.onPageShow(shopMallMixFragment3, true, c0psl);
        C786410Ut5.LJL(C0CAU.LIZ, new ARunnableS124S0100000_24(this.LL, 22));
        this.LL.setUserVisibleHint(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixFragment@3794.onNodeShow$1");
        return unit;
    }
}
