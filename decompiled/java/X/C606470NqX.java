package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0NqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606470NqX {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(final int i, final String str, final String str2) {
        if (C299770Bp1.LIZ() > 0 && i > 0) {
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.0NqW
                public final void LIZ() {
                    C20684815ws.LJIJ("feed_data_change", C591500NHw.LIZ(new Pair("enter_from", "homepage_hot"), new Pair("rule", "delete"), new Pair("count", Integer.valueOf(i)), new Pair("diff_type", str), new Pair("request_id", str2)));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedRequestResponseMonitor@435d.recordDeleteItems$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedRequestResponseMonitor@435d.recordDeleteItems$1");
                }
            });
        }
    }
}
