package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01QA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.utils.FeedMobReportUtils$Companion$reportVideosReceive$1", f = "FeedMobReportUtils.kt", l = {}, m = "invokeSuspend")
public final class C01QA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Map<String, String>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01QA(List<? extends Map<String, String>> list, InterfaceC1364105Vn<? super C01QA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01QA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedMobReportUtils$Companion@9c2a.reportVideosReceive$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<Map<String, String>> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C20684815ws.LJIILLIIL("video_receive", it2.next());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedMobReportUtils$Companion@9c2a.reportVideosReceive$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
