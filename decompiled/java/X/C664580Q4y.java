package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Q4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664580Q4y {
    public static void LIZ() {
        C01GW c01gw = AnonymousClass0750.LIZ;
        if (((Number) c01gw.getValue()).longValue() > 0) {
            C664570Q4x value = C664570Q4x.LJFF.getValue();
            if (value.LIZJ) {
                return;
            }
            value.LIZJ = true;
            C314640CVa.LIZ("search");
            C0V2A c0v2a = value.LIZ;
            if (c0v2a != null) {
                c0v2a.LJFF();
            }
            value.LIZLLL = C823050WQl.LJ().schedule(new Runnable() { // from class: X.0POe
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchFpsMonitor@1ce9.startInternal$1");
                    try {
                        C664570Q4x.LJFF.getValue().LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchFpsMonitor@1ce9.startInternal$1");
                }
            }, ((Number) c01gw.getValue()).longValue(), TimeUnit.SECONDS);
        }
    }
}
