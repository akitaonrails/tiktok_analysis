package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.resourcemanage.lego.DMLegoDowngradeCommonExecutionHandler$recoverTask$1", f = "DMLegoDowngradeCommonExecutionHandler.kt", l = {}, m = "invokeSuspend")
public final class C473920IiE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0W3D LL;
    public final /* synthetic */ InterfaceC473930IiF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C473920IiE(C0W3D c0w3d, InterfaceC473930IiF interfaceC473930IiF, InterfaceC1364105Vn<? super C473920IiE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0w3d;
        this.LLILLJJLI = interfaceC473930IiF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473920IiE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMLegoDowngradeCommonExecutionHandler@9cff.recoverTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            String str = this.LL.LIZ;
            c799900VZk.getClass();
            C799900VZk.LJI(str);
            this.LL.LJ();
            C799890VZj c799890VZjLIZ = this.LLILLJJLI.LIZ(EnumC800210VaF.Suspend);
            if (c799890VZjLIZ != null) {
                c799890VZjLIZ.LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recoverTask error: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMLegoDowngradeCommonExecutionHandler@9cff.recoverTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
