package X;

import android.os.SystemClock;
import android.os.Trace;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1C7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225261C7o {
    public InterfaceC2190421Ao4 LIZIZ;
    public ConcurrentHashMap<String, C1777620wMK> LIZ = new ConcurrentHashMap<>();
    public String LIZJ = "";

    public final void LIZ(String str) {
        long jCurrentThreadTimeMillis;
        C1C7R.LIZ.getClass();
        boolean zLJFF = Intrinsics.LJFF(Thread.currentThread(), C1C7R.LIZIZ);
        if (!zLJFF && C146T.LIZIZ.LJ != null) {
            throw new RuntimeException("please call in main thread");
        }
        if (this.LIZJ.length() > 0) {
            LIZIZ(this.LIZJ);
        }
        if (C146T.LIZIZ.LJ != null) {
            Trace.beginSection(str);
        }
        if (zLJFF) {
            jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        } else {
            jCurrentThreadTimeMillis = 0;
        }
        this.LIZ.put(str, new C1777620wMK(str, jCurrentThreadTimeMillis, System.currentTimeMillis(), System.nanoTime()));
        this.LIZJ = str;
    }

    public final void LIZIZ(String str) {
        int i;
        if (C146T.LIZIZ.LJ != null) {
            Trace.endSection();
        }
        C1C7R.LIZ.getClass();
        boolean zLJFF = Intrinsics.LJFF(Thread.currentThread(), C1C7R.LIZIZ);
        if (!zLJFF && C146T.LIZIZ.LJ != null) {
            throw new RuntimeException("please call in main thread");
        }
        C1777620wMK c1777620wMK = this.LIZ.get(str);
        if (c1777620wMK != null) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zLJFF) {
                i = (int) (jCurrentThreadTimeMillis - c1777620wMK.LIZIZ);
            } else {
                i = 0;
            }
            c1777620wMK.LJ = i;
            c1777620wMK.LJFF = (int) (jCurrentTimeMillis - c1777620wMK.LIZJ);
        }
    }
}
