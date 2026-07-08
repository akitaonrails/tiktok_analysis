package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ctk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.api.StoryViewerCachePreloader$preload$1", f = "StoryViewerCachePreloader.kt", l = {}, m = "invokeSuspend")
public final class C328180Ctk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328180Ctk(List<String> list, InterfaceC1364105Vn<? super C328180Ctk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328180Ctk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryViewerCachePreloader@dcc5.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            InterfaceC330760Cxu interfaceC330760CxuLJJLIIIJJI = C1618440sDa.LIZIZ.LJJLIIIJJI();
            interfaceC330760CxuLJJLIIIJJI.LJI();
            Iterator<String> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                interfaceC330760CxuLJJLIIIJJI.LJIIJ(it2.next());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryViewerCachePreloader@dcc5.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
