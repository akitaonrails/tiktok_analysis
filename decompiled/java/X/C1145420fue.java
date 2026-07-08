package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145420fue extends C09AY implements Function2<Long, Function0<? extends Unit>, Function0<? extends Unit>> {
    public C1145420fue() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.00kr, java.lang.Runnable] */
    @Override // kotlin.jvm.functions.Function2
    public final Function0<? extends Unit> invoke(Long l, Function0<? extends Unit> function0) {
        long jLongValue = l.longValue();
        final Function0<? extends Unit> function02 = function0;
        ?? r1 = new Runnable() { // from class: X.00kr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AudienceBoardRenderSessionRegistry@2ac4.scheduleOnMainHandler$runnable$1");
                try {
                    function02.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AudienceBoardRenderSessionRegistry@2ac4.scheduleOnMainHandler$runnable$1");
            }
        };
        C786410Ut5.LJLIIL(jLongValue, (Handler) C1145410fud.LJI.getValue(), r1);
        return new C1145460fui(r1);
    }
}
