package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.PluginManager$executeImmediate$1", f = "PluginManager.kt", l = {}, m = "invokeSuspend")
public final class C1702690uPT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C2250331D5z LLILLJJLI;
    public final /* synthetic */ C2250321D5y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702690uPT(Function0<Unit> function0, C2250331D5z c2250331D5z, C2250321D5y c2250321D5y, InterfaceC1364105Vn<? super C1702690uPT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = c2250331D5z;
        this.LLILLL = c2250321D5y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702690uPT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PluginManager@a35a.executeImmediate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2250321D5y c2250321D5y = this.LLILLL;
            c2250321D5y.getClass();
            c2250321D5y.LJ = C1D3K.FAILED;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PluginManager@a35a.executeImmediate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
