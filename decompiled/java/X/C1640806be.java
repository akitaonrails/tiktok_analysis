package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.vh.DMPushVH$initClickListener$1$1$1", f = "DMPushVH.kt", l = {}, m = "invokeSuspend")
public final class C1640806be extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640806be(String str, InterfaceC1364105Vn<? super C1640806be> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640806be(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMPushVH@d520.initClickListener$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C19296410eQ.LIZIZ.batchSetPushSettingItems(this.LL, 1, true, null, null);
            C19328310jZ.LIZIZ.LIZIZ(((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII());
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMPushVH@d520.initClickListener$1$1$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DMPushVH@d520.initClickListener$1$1$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
