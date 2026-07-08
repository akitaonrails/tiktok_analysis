package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.StoreHeaderAbility;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ability.StoreTabBarAbility;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreOverlayAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.PointData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreMixAddCartEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreOverlayAssem$onReceiveEvent$1$1", f = "StoreOverlayAssem.kt", l = {102, 106, 112, 116}, m = "invokeSuspend")
public final class C1166510gSf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoreMixAddCartEvent LLILLJJLI;
    public final /* synthetic */ StoreOverlayAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166510gSf(StoreMixAddCartEvent storeMixAddCartEvent, StoreOverlayAssem storeOverlayAssem, InterfaceC1364105Vn<? super C1166510gSf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storeMixAddCartEvent;
        this.LLILLL = storeOverlayAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1166510gSf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLLLZL;
        Number numberLJ;
        Number numberLJ2;
        Number numberLJ3;
        Number numberLJ4;
        int iLLLZL2;
        C1C7U.LIZ("StoreOverlayAssem@a3b4.onReceiveEvent$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Integer num = this.LLILLJJLI.actionType;
            int iCz0 = 0;
            if (num != null) {
                if (num.intValue() == 1) {
                    PointData pointData = this.LLILLJJLI.startPoint;
                    if (pointData == null || (numberLJ = pointData.x) == null) {
                        numberLJ = C2286608xc.LJ(0);
                    }
                    float fLIZIZ = C418440Gaw.LIZIZ(numberLJ);
                    PointData pointData2 = this.LLILLJJLI.startPoint;
                    if (pointData2 == null || (numberLJ2 = pointData2.y) == null) {
                        numberLJ2 = C2286608xc.LJ(0);
                    }
                    float fLIZIZ2 = C418440Gaw.LIZIZ(numberLJ2);
                    PointData pointData3 = this.LLILLJJLI.endPoint;
                    if (pointData3 == null || (numberLJ3 = pointData3.x) == null) {
                        numberLJ3 = C2286608xc.LJ(0);
                    }
                    float fLIZIZ3 = C418440Gaw.LIZIZ(numberLJ3);
                    PointData pointData4 = this.LLILLJJLI.endPoint;
                    if (pointData4 == null || (numberLJ4 = pointData4.y) == null) {
                        numberLJ4 = C2286608xc.LJ(0);
                    }
                    float fLIZIZ4 = C418440Gaw.LIZIZ(numberLJ4);
                    if (C1165500gR2.LIZ.ravenEnable) {
                        C1166240gSE c1166240gSEHo = this.LLILLL.Ho();
                        if (c1166240gSEHo != null && c1166240gSEHo.LIZIZ) {
                            int[] iArr = new int[2];
                            View viewLJJIJL = this.LLILLL.LJJIJL();
                            if (viewLJJIJL != null) {
                                viewLJJIJL.getLocationInWindow(iArr);
                            }
                            fLIZIZ2 -= iArr[1];
                        }
                        View viewLJJIJL2 = this.LLILLL.LJJIJL();
                        this.LL = 1;
                        if (C1206000hUM.LIZIZ(viewLJJIJL2, fLIZIZ, fLIZIZ2, fLIZIZ3, fLIZIZ4, this) == objLJFF) {
                            C1C7U.LIZIZ("StoreOverlayAssem@a3b4.onReceiveEvent$1$1");
                            return objLJFF;
                        }
                    } else {
                        StoreHeaderAbility storeHeaderAbility = (StoreHeaderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLL), StoreHeaderAbility.class, null);
                        if (storeHeaderAbility != null) {
                            iLLLZL2 = storeHeaderAbility.LLLZL();
                        } else {
                            iLLLZL2 = 0;
                        }
                        StoreTabBarAbility storeTabBarAbility = (StoreTabBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLL), StoreTabBarAbility.class, null);
                        if (storeTabBarAbility != null) {
                            iCz0 = storeTabBarAbility.cz0();
                        }
                        View viewLJJIJL3 = this.LLILLL.LJJIJL();
                        float f = fLIZIZ2 + iLLLZL2;
                        this.LL = 2;
                        if (C1206000hUM.LIZIZ(viewLJJIJL3, fLIZIZ, iCz0 + f, fLIZIZ3, fLIZIZ4, this) == objLJFF) {
                            C1C7U.LIZIZ("StoreOverlayAssem@a3b4.onReceiveEvent$1$1");
                            return objLJFF;
                        }
                    }
                } else if (num.intValue() == 2) {
                    if (C1165500gR2.LIZ.ravenEnable) {
                        View viewLJJIJL4 = this.LLILLL.LJJIJL();
                        StoreMixAddCartEvent storeMixAddCartEvent = this.LLILLJJLI;
                        this.LL = 3;
                        if (C1206000hUM.LIZJ(viewLJJIJL4, storeMixAddCartEvent, 0, this) == objLJFF) {
                            C1C7U.LIZIZ("StoreOverlayAssem@a3b4.onReceiveEvent$1$1");
                            return objLJFF;
                        }
                    } else {
                        StoreHeaderAbility storeHeaderAbility2 = (StoreHeaderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLL), StoreHeaderAbility.class, null);
                        if (storeHeaderAbility2 != null) {
                            iLLLZL = storeHeaderAbility2.LLLZL();
                        } else {
                            iLLLZL = 0;
                        }
                        StoreTabBarAbility storeTabBarAbility2 = (StoreTabBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLL), StoreTabBarAbility.class, null);
                        if (storeTabBarAbility2 != null) {
                            iCz0 = storeTabBarAbility2.cz0();
                        }
                        this.LL = 4;
                        if (C1206000hUM.LIZJ(this.LLILLL.LJJIJL(), this.LLILLJJLI, iLLLZL + iCz0, this) == objLJFF) {
                            C1C7U.LIZIZ("StoreOverlayAssem@a3b4.onReceiveEvent$1$1");
                            return objLJFF;
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreOverlayAssem@a3b4.onReceiveEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
