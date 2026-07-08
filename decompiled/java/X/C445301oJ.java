package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.plugin.core.utils.SearchPluginManager$checkOrInstallPluginAsync$1", f = "SearchPluginManager.kt", l = {}, m = "invokeSuspend")
public final class C445301oJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445301oJ(String str, InterfaceC1364105Vn<? super C445301oJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C445301oJ c445301oJ = new C445301oJ(this.LLILLJJLI, interfaceC1364105Vn);
        c445301oJ.LL = obj;
        return c445301oJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPluginManager@551d.checkOrInstallPluginAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C673070Qaf.LIZ.getClass();
            C189200o6.m2constructorimpl(Boolean.valueOf(C673070Qaf.LIZ(null, false)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPluginManager@551d.checkOrInstallPluginAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
