package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.nfc.EMVReader$readFrom$2$5", f = "EMVReader.kt", l = {}, m = "invokeSuspend")
public final class C1722460uvM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1722550uvV LL;
    public final /* synthetic */ IOException LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722460uvM(C1722550uvV c1722550uvV, IOException iOException, InterfaceC1364105Vn<? super C1722460uvM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1722550uvV;
        this.LLILLJJLI = iOException;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722460uvM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EMVReader@4b4e.readFrom$2$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ.onError(6);
        IOException iOException = this.LLILLJJLI;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iOException.getClass().getSimpleName());
            sbLIZ.append(": ");
            sbLIZ.append(iOException.getMessage());
            C1715520ukA.LIZLLL("nfc_error", C2188811AlT.LIZIZ(sbLIZ), null, null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EMVReader@4b4e.readFrom$2$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
