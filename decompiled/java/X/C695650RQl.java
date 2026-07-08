package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695650RQl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C703950RjN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695650RQl(C703950RjN c703950RjN) {
        super(0);
        this.LL = c703950RjN;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Iterator it2 = ((LinkedHashMap) this.LL.LLJJJ).values().iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJLLLLLL(8, (View) ((Pair) it2.next()).getSecond());
        }
        return Unit.LIZ;
    }
}
