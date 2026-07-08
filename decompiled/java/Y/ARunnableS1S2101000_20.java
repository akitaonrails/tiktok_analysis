package Y;

import X.AbstractC1277570jLn;
import X.AbstractC1298860ju8;
import X.C1266350j3h;
import X.C1268630j7N;
import X.C1277540jLk;
import X.C1278210jMp;
import X.C1C7U;
import X.InterfaceC1266360j3i;
import com.lynx.tasm.LynxBackgroundRuntime;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S2101000_20 implements Runnable {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S2101000_20 aRunnableS1S2101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreImpl@e164.addUserMetaData$1");
        try {
            C1266350j3h c1266350j3h = ((C1268630j7N) aRunnableS1S2101000_20.l2).LLJI;
            if (c1266350j3h != null) {
                c1266350j3h.LJIIIIZZ(aRunnableS1S2101000_20.s0, aRunnableS1S2101000_20.s1, aRunnableS1S2101000_20.i3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreImpl@e164.addUserMetaData$1");
    }

    public static final void run$1(ARunnableS1S2101000_20 aRunnableS1S2101000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS1S2101000_20.l2;
        String str = aRunnableS1S2101000_20.s0;
        String str2 = aRunnableS1S2101000_20.s1;
        int i = aRunnableS1S2101000_20.i3;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.addUserMetaData$1L");
        AbstractC1277570jLn abstractC1277570jLn = c1277540jLk.LIZ;
        if (abstractC1277570jLn != null) {
            abstractC1277570jLn.setProperty(new C1278210jMp(str, str2, i));
        }
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.addUserMetaData$1L");
    }

    public static final void run$2(ARunnableS1S2101000_20 aRunnableS1S2101000_20) {
        LynxBackgroundRuntime lynxBackgroundRuntime = (LynxBackgroundRuntime) aRunnableS1S2101000_20.l2;
        String str = aRunnableS1S2101000_20.s0;
        String str2 = aRunnableS1S2101000_20.s1;
        int i = aRunnableS1S2101000_20.i3;
        lynxBackgroundRuntime.getClass();
        C1C7U.LIZ("LynxBackgroundRuntime@265f.onModuleMethodInvoked$1L");
        Iterator<AbstractC1298860ju8> it2 = lynxBackgroundRuntime.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(str, str2, i);
        }
        C1C7U.LIZIZ("LynxBackgroundRuntime@265f.onModuleMethodInvoked$1L");
    }

    public static final void run$3(ARunnableS1S2101000_20 aRunnableS1S2101000_20) {
        boolean zLIZ;
        InterfaceC1266360j3i interfaceC1266360j3i;
        C1C7U.LIZ("LiveStream@24e7.addUserMetaData$1");
        try {
            if (((C1266350j3h) aRunnableS1S2101000_20.l2).LLILZLL.LJJJIL() && (interfaceC1266360j3i = ((C1266350j3h) aRunnableS1S2101000_20.l2).LLIZ) != null) {
                interfaceC1266360j3i.LJIIIIZZ(aRunnableS1S2101000_20.s0, aRunnableS1S2101000_20.s1, aRunnableS1S2101000_20.i3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.addUserMetaData$1");
    }

    public ARunnableS1S2101000_20(Object obj, String str, String str2, int i, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
    }
}
