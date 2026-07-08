package Y;

import X.C01GW;
import X.C1865620yeG;
import X.C18PZ;
import X.C1C7U;
import X.C21278818Pa;
import X.C21278918Pb;
import X.C21279218Pe;
import X.C21371318kJ;
import X.C21382118m3;
import X.C2341109Fh;
import X.ExecutorC1592406Li;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.NameWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS24S1300000_32 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) ((WeakReference) this.l1).get();
        if (appCompatTextView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            appCompatTextView.setPrecomputedText((C21371318kJ) this.l2);
        } else {
            try {
                if (C21382118m3.LIZ(appCompatTextView).LIZ(((C21371318kJ) this.l2).LLILLJJLI)) {
                    appCompatTextView.setPrecomputedText((C21371318kJ) this.l2);
                } else {
                    appCompatTextView.setText(this.s0);
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                appCompatTextView.setText(this.s0);
            }
        }
        ((NameWidget) this.l3).M1(appCompatTextView);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:4|(1:(2:7|8))(9:(1:10)|11|(5:13|51|22|(1:26)|29)|30|49|31|(1:35)|38|(3:53|40|(2:42|43)(1:56))(1:55))|14|(3:16|(1:20)|21)|11|(0)|30|49|31|(2:33|35)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS24S1300000_32.LIZ$1():void");
    }

    public final void LIZ$2() {
        C18PZ c18pz = C18PZ.LIZ;
        String str = this.s0;
        c18pz.getClass();
        if (!C18PZ.LIZJ(str)) {
            C18PZ.LIZJ = false;
            return;
        }
        C18PZ.LIZJ = true;
        C01GW c01gw = C21278818Pa.LIZ;
        if (C21278818Pa.LJIIJ((Aweme) this.l1) || C21278818Pa.LJIIIZ((Aweme) this.l1, this.s0)) {
            try {
                ScheduledFuture<?> scheduledFuture = C18PZ.LJIIIIZZ;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C21278918Pb.LIZ.getClass();
            if (true ^ ((Boolean) C1865620yeG.LIZ.getValue()).booleanValue()) {
                try {
                    ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS93S0000000_16(7));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(185);
            c2341109Fh.getClass();
            C2341109Fh.LJFF(aFwS223S0000000_32);
            C18PZ c18pz2 = C18PZ.LIZ;
            Context context = (Context) this.l2;
            C21279218Pe c21279218Pe = (C21279218Pe) this.l3;
            String str2 = this.s0;
            c18pz2.getClass();
            C18PZ.LJIIJJI(context, c21279218Pe, str2);
        }
    }

    public static final void run$0(ARunnableS24S1300000_32 aRunnableS24S1300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("NameWidget@1177.asyncSetText$1$1");
        try {
            aRunnableS24S1300000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NameWidget@1177.asyncSetText$1$1");
    }

    public static final void run$1(ARunnableS24S1300000_32 aRunnableS24S1300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoDataUnbind$$inlined$runOnWorkerThread$1");
        try {
            C18PZ c18pz = C18PZ.LIZ;
            String str = aRunnableS24S1300000_32.s0;
            c18pz.getClass();
            if (C18PZ.LIZJ(str)) {
                C01GW c01gw = C21278818Pa.LIZ;
                if (C21278818Pa.LJIIJ((Aweme) aRunnableS24S1300000_32.l1)) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(182);
                    c2341109Fh.getClass();
                    C2341109Fh.LJFF(aFwS223S0000000_32);
                    C18PZ.LJIIJJI((Context) aRunnableS24S1300000_32.l2, (C21279218Pe) aRunnableS24S1300000_32.l3, aRunnableS24S1300000_32.s0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoDataUnbind$$inlined$runOnWorkerThread$1");
    }

    public static final void run$2(ARunnableS24S1300000_32 aRunnableS24S1300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoHolderDestroy$$inlined$runOnWorkerThread$1");
        try {
            C18PZ c18pz = C18PZ.LIZ;
            String str = aRunnableS24S1300000_32.s0;
            c18pz.getClass();
            if (C18PZ.LIZJ(str)) {
                C01GW c01gw = C21278818Pa.LIZ;
                if (C21278818Pa.LJIIJ((Aweme) aRunnableS24S1300000_32.l1)) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(183);
                    c2341109Fh.getClass();
                    C2341109Fh.LJFF(aFwS223S0000000_32);
                    C18PZ.LJIIJJI((Context) aRunnableS24S1300000_32.l2, (C21279218Pe) aRunnableS24S1300000_32.l3, aRunnableS24S1300000_32.s0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoHolderDestroy$$inlined$runOnWorkerThread$1");
    }

    public static final void run$3(ARunnableS24S1300000_32 aRunnableS24S1300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoSlideIn$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS24S1300000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoSlideIn$$inlined$runOnWorkerThread$1");
    }

    public static final void run$4(ARunnableS24S1300000_32 aRunnableS24S1300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoSlideOut$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS24S1300000_32.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoSlideOut$$inlined$runOnWorkerThread$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS24S1300000_32(android.content.Context r2, X.C21279218Pe r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 1: goto L12;
                case 2: goto L12;
                case 3: goto L5;
                case 4: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS24S1300000_32.<init>(android.content.Context, X.18Pe, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS24S1300000_32(WeakReference weakReference, WeakReference<AppCompatTextView> weakReference2, C21371318kJ c21371318kJ, String str, NameWidget nameWidget) {
        this.$t = nameWidget;
        this.l1 = weakReference;
        this.l2 = weakReference2;
        this.s0 = c21371318kJ;
        this.l3 = str;
    }
}
