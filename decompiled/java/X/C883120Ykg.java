package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ykg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.MainSafeSDKManager$onBizSceneChanged$1", f = "MainSafeSDKManager.kt", l = {134}, m = "invokeSuspend")
public final class C883120Ykg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ EnumC883570YlP LLILLL;
    public final /* synthetic */ C883090Ykd LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883120Ykg(EnumC883570YlP enumC883570YlP, C883090Ykd c883090Ykd, InterfaceC1364105Vn<? super C883120Ykg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC883570YlP;
        this.LLILZ = c883090Ykd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C883120Ykg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("MainSafeSDKManager@313d.onBizSceneChanged$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBizSceneChanged: ");
            sbLIZ.append(this.LLILLL);
            C882690Yjz.LJIIIZ("MainSafeSDKManager", C2188811AlT.LIZIZ(sbLIZ));
            switch (C883580YlQ.LIZ[this.LLILLL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    C883090Ykd c883090Ykd = this.LLILZ;
                    AbstractC883300Yky abstractC883300Yky = c883090Ykd.LLIZLLLIL;
                    if (!(abstractC883300Yky instanceof C883190Ykn) && !(abstractC883300Yky instanceof C883170Ykl)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C883310Ykz c883310Ykz = new C883310Ykz(C883090Ykd.LJIIJ(abstractC883300Yky), 1);
                    this.LL = i;
                    this.LLILLJJLI = 1;
                    obj = c883090Ykd.LJIILJJIL(c883310Ykz, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("MainSafeSDKManager@313d.onBizSceneChanged$1");
                        return objLJFF;
                    }
                    break;
                default:
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MainSafeSDKManager@313d.onBizSceneChanged$1");
                    return unit;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (i != 0 && zBooleanValue) {
            z = true;
        }
        C882400YjW.LIZ.getClass();
        C882410YjX c882410YjXLJ = C882400YjW.LJFF().LJ();
        EnumC883570YlP enumC883570YlP = this.LLILLL;
        c882410YjXLJ.getClass();
        IIMUserPortraitManager iIMUserPortraitManager = (IIMUserPortraitManager) PluggableExtentionKt.pluggableSpiForReal(IIMUserPortraitManager.class);
        if (iIMUserPortraitManager != null) {
            iIMUserPortraitManager.LJI(z, enumC883570YlP, C0I0B.LJFF.LIZIZ());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MainSafeSDKManager@313d.onBizSceneChanged$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
