package X;

import android.view.View;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.00l1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC170100l1 implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<View, String, Unit> LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC170100l1(View view, String str, Function2<? super View, ? super String, Unit> function2) {
        this.LL = view;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PgcExposureCompat@f098.exposeOnce$1");
        try {
            Map<View, Set<String>> map = C2261008tU.LIZ;
            View view = this.LL;
            Set<String> linkedHashSet = map.get(view);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(view, linkedHashSet);
            }
            if (linkedHashSet.add(this.LLILLJJLI)) {
                this.LLILLL.invoke(this.LL, this.LLILLJJLI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PgcExposureCompat@f098.exposeOnce$1");
    }
}
