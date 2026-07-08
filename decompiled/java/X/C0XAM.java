package X;

import android.os.SystemClock;
import com.bytedance.sliver.Sliver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0XAM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XAM implements Runnable {
    public volatile boolean LL = true;
    public C0XAN LLILLJJLI;
    public C0XAN LLILLL;
    public C0XAR LLILZ;
    public Long LLILZIL;
    public final /* synthetic */ C0XA9 LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[Catch: all -> 0x00df, LOOP:0: B:29:0x00ac->B:31:0x00b8, LOOP_END, TryCatch #0 {all -> 0x00df, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0014, B:8:0x0017, B:10:0x001b, B:12:0x0022, B:14:0x002e, B:15:0x0033, B:17:0x0075, B:19:0x007a, B:20:0x0083, B:22:0x0087, B:23:0x0094, B:25:0x00a1, B:27:0x00a7, B:28:0x00aa, B:29:0x00ac, B:31:0x00b8, B:35:0x00cb, B:32:0x00c5, B:16:0x0058), top: B:41:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[EDGE_INSN: B:43:0x00cb->B:35:0x00cb BREAK  A[LOOP:0: B:29:0x00ac->B:31:0x00b8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XAM.LIZ():void");
    }

    public final void LIZIZ() {
        int i;
        long[] jArr;
        int iIntValue;
        C0XAN c0xan = this.LLILLJJLI;
        if (c0xan == null) {
            return;
        }
        C0XAN c0xan2 = this.LLILLL;
        this.LLILLJJLI = (c0xan2 == null || c0xan2.LIZ) ? null : this.LLILLL;
        this.LLILLL = c0xan;
        this.LLILZLL.LLIZ = SystemClock.uptimeMillis();
        try {
            C0XAP c0xap = new C0XAP();
            Iterator it2 = ((ArrayList) c0xan.LIZIZ).iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                for (C0XAS c0xas : ((C0XAR) it2.next()).LIZ) {
                    if (c0xas != null && (jArr = c0xas.LIZ) != null && jArr.length != 0) {
                        int length = jArr.length;
                        while (true) {
                            length--;
                            if (length >= 0) {
                                long[] jArr2 = c0xas.LIZ;
                                long j = jArr2[length];
                                Integer num = c0xap.LIZ.get(Long.valueOf(j));
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    c0xap.LIZ.put(Long.valueOf(j), Integer.valueOf(c0xap.LIZIZ));
                                    iIntValue = c0xap.LIZIZ;
                                    c0xap.LIZIZ = iIntValue + 1;
                                }
                                jArr2[length] = iIntValue;
                            }
                        }
                    }
                }
            }
            Set<Long> setKeySet = c0xap.LIZ.keySet();
            String stackTrace = "";
            if (!setKeySet.isEmpty()) {
                long[] jArr3 = new long[setKeySet.size()];
                Iterator<Long> it3 = setKeySet.iterator();
                while (it3.hasNext()) {
                    jArr3[i] = it3.next().longValue();
                    i++;
                }
                try {
                    stackTrace = Sliver.getStackTrace(jArr3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C2225611C8x.LIZ(c0xan, stackTrace, C07KM.LIZ.invoke().longValue(), C07KM.LIZJ);
            c0xan.LIZ();
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = new C0XAN();
            }
            this.LLILLJJLI.LIZ = true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c0xan.LIZ();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BigJankFetcher$DumpTask@2334.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BigJankFetcher$DumpTask@2334.run");
    }

    public C0XAM(C0XA9 c0xa9) {
        this.LLILZLL = c0xa9;
    }
}
