package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0b6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960670b6f extends C09AY implements Function1<C915460Zvk, Unit> {
    public final /* synthetic */ C960620b6a LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C960670b6f(C960620b6a c960620b6a) {
        super(1);
        this.LL = c960620b6a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C915460Zvk c915460Zvk) {
        C915460Zvk c915460Zvk2 = c915460Zvk;
        if (c915460Zvk2.LIZJ != EnumC950510aqH.USER_LIST) {
            C960620b6a c960620b6a = this.LL;
            for (Map.Entry entry : ((LinkedHashMap) C1195704m3.LIZ(c960620b6a.LJIIZILJ().Y1(), new C960690b6h(c915460Zvk2.LIZ, c915460Zvk2.LIZIZ))).entrySet()) {
                MultiCoHostHistoryContract$AbsView multiCoHostHistoryContract$AbsView = (MultiCoHostHistoryContract$AbsView) c960620b6a.LL;
                if (multiCoHostHistoryContract$AbsView != null) {
                    multiCoHostHistoryContract$AbsView.UR(c960620b6a.LJIIZILJ().Y1().indexOf(entry.getKey()), entry.getValue());
                }
            }
        }
        return Unit.LIZ;
    }
}
