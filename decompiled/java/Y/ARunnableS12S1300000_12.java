package Y;

import X.C0TS5;
import X.C1248210iaR;
import X.C1254890ilD;
import X.C1C7U;
import X.C2188811AlT;
import X.C772840UTi;
import X.EnumC1253850ijX;
import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS12S1300000_12 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((C1254890ilD) this.l1).LIZLLL();
        ((C1254890ilD) this.l1).LLILZ.invoke((List) this.l2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Background image uploaded successfully: ");
        sbLIZ.append(this.s0);
        C1248210iaR.LJ("ImageBackgroundHandler", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        List<String> list = (List) this.l2;
        Iterator it2 = ((ArrayList) C1254890ilD.LLJIJIL).iterator();
        while (it2.hasNext()) {
            ((C0TS5) it2.next()).LIZ(list);
        }
        if (((C1254890ilD) this.l1).LLILLL) {
            C1248210iaR.LJ("ImageBackgroundHandler", "Finishing activity after commit success", EnumC1253850ijX.OTHERS, "");
            ((Activity) this.l3).finish();
        }
    }

    public static final void run$0(ARunnableS12S1300000_12 aRunnableS12S1300000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ImageBackgroundHandler@94e8.handleCommitSuccess$1");
        try {
            aRunnableS12S1300000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageBackgroundHandler@94e8.handleCommitSuccess$1");
    }

    public static final void run$1(ARunnableS12S1300000_12 aRunnableS12S1300000_12) {
        C772840UTi c772840UTi = (C772840UTi) aRunnableS12S1300000_12.l1;
        ClassLoader classLoader = (ClassLoader) aRunnableS12S1300000_12.l2;
        IHostPlugin iHostPlugin = (IHostPlugin) aRunnableS12S1300000_12.l3;
        String str = aRunnableS12S1300000_12.s0;
        c772840UTi.getClass();
        C1C7U.LIZ("LiveBroadcastContext@a389.loadHostLibrary$1L");
        if (classLoader != null) {
            try {
                IHostPlugin.Companion.getClass();
                iHostPlugin.loadLibrary(2, c772840UTi.LIZ, null, str, classLoader);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1C7U.LIZIZ("LiveBroadcastContext@a389.loadHostLibrary$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS12S1300000_12(Object obj, C1254890ilD c1254890ilD, List<String> list, String str, Activity activity) {
        this.$t = activity;
        this.l1 = obj;
        this.l2 = c1254890ilD;
        this.s0 = list;
        this.l3 = str;
    }
}
