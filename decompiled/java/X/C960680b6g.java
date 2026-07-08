package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0b6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960680b6g extends C09AY implements Function1<C915780ZwG, Unit> {
    public final /* synthetic */ C960620b6a LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C960680b6g(C960620b6a c960620b6a) {
        super(1);
        this.LL = c960620b6a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C915780ZwG c915780ZwG) {
        C960620b6a c960620b6a = this.LL;
        for (Map.Entry entry : ((LinkedHashMap) C1195704m3.LIZ(c960620b6a.LJIIZILJ().Y1(), new C960690b6h(c915780ZwG.LIZ, -1L))).entrySet()) {
            MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) c960620b6a.LL;
            if (multiCoHostHistoryContract$AbsView != null) {
                multiCoHostHistoryContract$AbsView.UR(c960620b6a.LJIIZILJ().Y1().indexOf(entry.getKey()), entry.getValue());
            }
        }
        return Unit.LIZ;
    }
}
