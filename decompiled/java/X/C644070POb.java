package X;

import android.os.Handler;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0POb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644070POb {
    public static C644130POh LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(681));

    static {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0POg
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchAutoPlayTracker@e5a.<init>$1");
                try {
                    C0PPO c0ppo = C0PPO.LIZIZ;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchAutoPlayTracker@e5a.<init>$1");
            }
        });
    }

    public static void LIZ() {
        C644130POh c644130POh;
        C19EG c19egLJ = C651290Pgd.LJ();
        if (c19egLJ == null || !C659080PtC.LIZLLL(c19egLJ) || (c644130POh = LIZ) == null) {
            return;
        }
        c644130POh.LJIJ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record start auto play time:");
        C644130POh c644130POh2 = LIZ;
        sbLIZ.append(c644130POh2 != null ? Long.valueOf(c644130POh2.LJIJ) : null);
        sbLIZ.append(" in this search ");
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = LIZIZ;
        ((Handler) c01gw.getValue()).removeCallbacksAndMessages(null);
        Handler handler = (Handler) c01gw.getValue();
        C644130POh c644130POh3 = LIZ;
        if (c644130POh3 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        final C644130POh c644130POh4 = new C644130POh();
        c644130POh4.LJIIZILJ = c644130POh3.LJIIZILJ;
        c644130POh4.LJIJ = c644130POh3.LJIJ;
        C786410Ut5.LJLIIL(1000L, handler, new Runnable(c644130POh4) { // from class: X.0POd
            public final C644130POh LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchAutoPlayTracker$SearchResultAutoPlayEventCallBack@7790.run");
                try {
                    C644130POh c644130POh5 = this.LL;
                    long j = c644130POh5.LJIIZILJ;
                    if (j != -1) {
                        long j2 = c644130POh5.LJIJ;
                        if (j2 != -1) {
                            long j3 = j2 - j;
                            if (j3 >= 0) {
                                c644130POh5.LJIIZILJ("duration", String.valueOf(j3));
                                c644130POh5.LJIILJJIL();
                                c644130POh5.LJIIZILJ = -1L;
                                c644130POh5.LJIJ = -1L;
                            }
                        }
                    }
                    C644070POb.LIZ = null;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchAutoPlayTracker$SearchResultAutoPlayEventCallBack@7790.run");
            }

            {
                this.LL = c644130POh4;
            }
        });
    }
}
