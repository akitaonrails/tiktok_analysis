package X;

import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.PluginService$removePluginData$1", f = "PluginService.kt", l = {}, m = "invokeSuspend")
public final class C412101ix extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PluginService LLILLJJLI;
    public final /* synthetic */ Map<Long, C10SX> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C412101ix(PluginService pluginService, Map<Long, C10SX> map, Function0<Unit> function0, InterfaceC1364105Vn<? super C412101ix> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pluginService;
        this.LLILLL = map;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C412101ix c412101ix = new C412101ix(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c412101ix.LL = obj;
        return c412101ix;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("PluginService@95b4.removePluginData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        this.LLILLJJLI.updatePlugins(this.LLILLL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C412001iw(this.LLILZ, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PluginService@95b4.removePluginData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
