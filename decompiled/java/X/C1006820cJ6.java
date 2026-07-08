package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0cJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006820cJ6 {
    public static final HashSet<EnumC993270bxF> LIZ = new HashSet<>();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public static boolean LIZ(final EnumC993270bxF enumC993270bxF) {
        HashSet<EnumC993270bxF> hashSet = LIZ;
        if (hashSet.contains(enumC993270bxF)) {
            return false;
        }
        hashSet.add(enumC993270bxF);
        C786410Ut5.LJLIIL(1000L, LIZIZ, new Runnable(enumC993270bxF) { // from class: X.0cJ7
            public final EnumC993270bxF LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveGiftOpenDialogHelper$OpenDialogRunnable@d7fd.run");
                try {
                    EnumC993270bxF enumC993270bxF2 = this.LL;
                    if (enumC993270bxF2 != null) {
                        C1006820cJ6.LIZ.remove(enumC993270bxF2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveGiftOpenDialogHelper$OpenDialogRunnable@d7fd.run");
            }

            {
                this.LL = enumC993270bxF;
            }
        });
        return true;
    }
}
