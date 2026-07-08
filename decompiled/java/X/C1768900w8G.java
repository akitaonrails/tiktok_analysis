package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$executeNewAndCancelLastTask$1", f = "CustomDotVMV2.kt", l = {587}, m = "invokeSuspend")
public final class C1768900w8G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1769030w8T LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;
    public final /* synthetic */ C1769030w8T LLILZ;
    public final /* synthetic */ EnumC1768910w8H LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768900w8G(C1769030w8T c1769030w8T, CustomDotVMV2 customDotVMV2, C1769030w8T c1769030w8T2, EnumC1768910w8H enumC1768910w8H, InterfaceC1364105Vn<? super C1768900w8G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1769030w8T;
        this.LLILLL = customDotVMV2;
        this.LLILZ = c1769030w8T2;
        this.LLILZIL = enumC1768910w8H;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768900w8G(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotVMV2@ba3d.executeNewAndCancelLastTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1769030w8T c1769030w8T = this.LLILLJJLI;
            if (c1769030w8T != null) {
                this.LL = 1;
                if (c1769030w8T.LIZLLL(C1697810uHb.LJIIJJI(EnumC1768880w8E.TAB_TOOLTIP, EnumC1768880w8E.TAB_ICON, EnumC1768880w8E.TAB_BADGE), EnumC1769260w8q.OTHER, this) == objLJFF) {
                    C1C7U.LIZIZ("CustomDotVMV2@ba3d.executeNewAndCancelLastTask$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.LLJJL = this.LLILZ;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopByteSync ReachCfgProcess=====  ui action: ");
        sbLIZ.append(this.LLILZIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (this.LLILZIL == EnumC1768910w8H.SHOW) {
            C1769030w8T c1769030w8T2 = this.LLILZ;
            InterfaceC497601wk interfaceC497601wk = c1769030w8T2.LJFF.get();
            if (interfaceC497601wk != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1408020mkC(c1769030w8T2, null), 2);
            }
            c1769030w8T2.LJI = anonymousClass0956LIZLLL;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.executeNewAndCancelLastTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
