package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService$openPermissionSettingPage$1$1", f = "LauncherShortcutService.kt", l = {}, m = "invokeSuspend")
public final class C2429509fZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LauncherShortcutService LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2429509fZ(LauncherShortcutService launcherShortcutService, Context context, InterfaceC1364105Vn<? super C2429509fZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = launcherShortcutService;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2429509fZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Intent intentLIZ;
        C1C7U.LIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        C0WHT c0whtLJIIJJI = LauncherShortcutService.LJIIJJI();
        if (c0whtLJIIJJI != null && (intentLIZ = c0whtLJIIJJI.LIZ(this.LLILLJJLI)) != null) {
            C2429209fW.LIZ().appendDataFlowId(intentLIZ, 1207969302);
            Context context = this.LLILLJJLI;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZ, context);
            C2204961BRm.LJJJJJL(context, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapdpHN2SCuatS6ZH8trdIY0RqJV5BJ1wupgOGBiIYb8NLbKLh+4g==", null));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
