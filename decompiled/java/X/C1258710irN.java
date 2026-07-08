package X;

import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0irN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258710irN {
    public static final /* synthetic */ int LJ = 0;
    public final int LIZ = ((Number) C267280Adi.LIZ.getValue()).intValue();
    public final int LIZIZ = ((Number) C0B9J.LIZ.getValue()).intValue();
    public final Pair<? extends AtomicInteger, ? extends AtomicInteger> LIZJ = new Pair<>(new AtomicInteger(0), new AtomicInteger(0));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(106));

    public final void LIZ(final int i, final int i2, final int i3, final int i4, final String str, final InterfaceC1259140is4 interfaceC1259140is4, final int i5) {
        ((ExecutorService) this.LIZLLL.getValue()).execute(new Runnable() { // from class: X.0irO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ListReachBottomChecker@463e.checkIfReachBottom$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ListReachBottomChecker@463e.checkIfReachBottom$runnable$1");
            }

            public final void LIZ() {
                int i6;
                int iMax;
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                int i7 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkIfReachBottom start, source = ");
                sbLIZ.append(str);
                sbLIZ.append(", flingDistance = ");
                sbLIZ.append(i5);
                sbLIZ.append(", mainThread = ");
                sbLIZ.append(C371410EhH.LIZ());
                C2188811AlT.LIZIZ(sbLIZ);
                if (i == this.LIZJ.getFirst().get() && i5 == this.LIZJ.getSecond().get()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("The list index didn't changes, lastVisibleIndex = ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", flingDistance = ");
                    sbLIZ2.append(i5);
                    C1720106oR.LJI("ListReachBottomChecker", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                this.LIZJ.getFirst().set(i);
                this.LIZJ.getSecond().set(i5);
                int i8 = i4;
                if (i8 < 1) {
                    i8 = 1;
                }
                int i9 = i3;
                if (i9 < 1) {
                    i9 = 1;
                }
                C1258710irN c1258710irN = this;
                int i10 = i;
                int i11 = i2;
                int i12 = c1258710irN.LIZ;
                int i13 = i5;
                c1258710irN.getClass();
                int i14 = i10 / i8;
                if (i13 > 0) {
                    i14 += i13 / i9;
                }
                int i15 = (i11 / i8) - i14;
                boolean z = i15 <= i12;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkIfReachBottom, reachBottom = ");
                sbLIZ3.append(z);
                sbLIZ3.append(", leftRow = ");
                sbLIZ3.append(i15);
                sbLIZ3.append(", lastVisibleIndex = ");
                sbLIZ3.append(i10);
                sbLIZ3.append(", totalItemCount = ");
                sbLIZ3.append(i11);
                sbLIZ3.append(", itemHeight = ");
                sbLIZ3.append(i9);
                sbLIZ3.append(", spanCount = ");
                sbLIZ3.append(i8);
                sbLIZ3.append(", rowThreshold = ");
                sbLIZ3.append(i12);
                sbLIZ3.append(", flingDistance = ");
                sbLIZ3.append(i13);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (z) {
                    int i16 = i5;
                    if (i16 <= 0) {
                        iMax = this.LIZIZ;
                        i6 = -1;
                    } else {
                        i6 = (i16 / i9) * i8;
                        iMax = Math.max(Math.min(i6, this.LIZIZ + 6), 9);
                    }
                    InterfaceC1259140is4 interfaceC1259140is42 = interfaceC1259140is4;
                    if (interfaceC1259140is42 != null) {
                        interfaceC1259140is42.LIZ(iMax, str);
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("reachBottom, requestCount = ");
                    sbLIZ4.append(iMax);
                    sbLIZ4.append(", source = ");
                    sbLIZ4.append(str);
                    sbLIZ4.append("，flingCount = ");
                    sbLIZ4.append(i6);
                    sbLIZ4.append("， cost = ");
                    sbLIZ4.append(SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos);
                    C1720106oR.LJI("ListReachBottomChecker", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
        });
    }
}
