package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CM1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CM1 extends C09AY implements Function2<CopyOnWriteArrayList<C0CM8>, C0CME, Unit> {
    public C0CM1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList, C0CME c0cme) {
        final CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList2 = copyOnWriteArrayList;
        Iterator<C0CM8> it2 = copyOnWriteArrayList2.iterator();
        if (it2 != null) {
            while (it2.hasNext()) {
                final C0CM8 next = it2.next();
                Runnable runnable = new Runnable() { // from class: X.0CM2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$3$1$1");
                        try {
                            C312230CLt.LJII(next, copyOnWriteArrayList2);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$3$1$1");
                    }
                };
                if (!next.LLILLL) {
                    runnable.run();
                } else {
                    C786410Ut5.LJJZZIII((Handler) C312230CLt.LJIIZILJ.getValue(), runnable);
                }
            }
        }
        return Unit.LIZ;
    }
}
