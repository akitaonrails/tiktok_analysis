package Y;

import X.C08L6;
import X.C0M7L;
import X.C0VSJ;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C809400Vp4;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS0S2000000_3 implements Runnable {
    public final int $t;
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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0VSJ c0vsj = new C0VSJ(this.s0);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[logFileInfo]: current creation id: ");
            sbLIZ.append(this.s1);
            C0M7L.LIZIZ("", C2188811AlT.LIZIZ(sbLIZ));
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    long length = file.isFile() ? file.length() : -1L;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[logFileInfo]: file path : ");
                    sbLIZ2.append(file);
                    sbLIZ2.append(" exist : ");
                    sbLIZ2.append(file.exists());
                    sbLIZ2.append(", size: ");
                    sbLIZ2.append(length);
                    C0M7L.LIZIZ("", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    public static final void run$0(ARunnableS0S2000000_3 aRunnableS0S2000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DraftFileUtils@8791.logFileInfo$1");
        try {
            aRunnableS0S2000000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftFileUtils@8791.logFileInfo$1");
    }

    public static final void run$1(ARunnableS0S2000000_3 aRunnableS0S2000000_3) {
        String str = aRunnableS0S2000000_3.s0;
        String str2 = aRunnableS0S2000000_3.s1;
        C1C7U.LIZ("TraceLogger@e3a7.e$1L");
        C20441214yg.LJ(str, str2);
        C1C7U.LIZIZ("TraceLogger@e3a7.e$1L");
    }

    public static final void run$2(ARunnableS0S2000000_3 aRunnableS0S2000000_3) {
        String str = aRunnableS0S2000000_3.s0;
        String str2 = aRunnableS0S2000000_3.s1;
        C1C7U.LIZ("TraceLogger@e3a7.i$2L");
        C20441214yg.LJIIIZ(str, str2);
        C1C7U.LIZIZ("TraceLogger@e3a7.i$2L");
    }

    public static final void run$3(ARunnableS0S2000000_3 aRunnableS0S2000000_3) {
        String str = aRunnableS0S2000000_3.s0;
        String str2 = aRunnableS0S2000000_3.s1;
        C1C7U.LIZ("TraceLogger@e3a7.d$1L");
        C20441214yg.LIZIZ(str, str2);
        C1C7U.LIZIZ("TraceLogger@e3a7.d$1L");
    }

    public static final void run$4(ARunnableS0S2000000_3 aRunnableS0S2000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcTraceManager@5565.addStage$1");
        try {
            C08L6 c08l6 = C08L6.LIZ;
            String str = aRunnableS0S2000000_3.s0;
            String str2 = aRunnableS0S2000000_3.s1;
            c08l6.getClass();
            C08L6.LIZ(str, str2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcTraceManager@5565.addStage$1");
    }

    public static final void run$5(ARunnableS0S2000000_3 aRunnableS0S2000000_3) {
        String str = aRunnableS0S2000000_3.s0;
        String str2 = aRunnableS0S2000000_3.s1;
        C1C7U.LIZ("OppoSystemPushUtil@8fb3.verifyMessage$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("configs initiated, start handling message...@");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        C809400Vp4.LIZIZ(str2);
        C1C7U.LIZIZ("OppoSystemPushUtil@8fb3.verifyMessage$1L");
    }

    public ARunnableS0S2000000_3(String str, String str2, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 4:
                this.s0 = str;
                this.s1 = str2;
                break;
            case 1:
            case 2:
            case 3:
            default:
                this.s0 = str;
                this.s1 = str2;
                break;
        }
    }
}
