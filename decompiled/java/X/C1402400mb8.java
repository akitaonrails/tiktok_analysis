package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.tiktok.report.ReportWebContainer;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402400mb8 extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    public static final void LJLIIIL$0(C1402400mb8 c1402400mb8, InterfaceC1541990qEH interfaceC1541990qEH) {
    }

    public static final void LJLLI$0(C1402400mb8 c1402400mb8, SparkContext sparkContext) {
    }

    public static final void LJLLJ$0(C1402400mb8 c1402400mb8, SparkContext sparkContext, C1548490qOl c1548490qOl) {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        if (1 - this.$t != 0) {
            super.LJLI(interfaceC1541990qEH, str, str2);
        } else {
            LJLI$0(this, interfaceC1541990qEH, str, str2);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (this.$t != 0) {
            super.LJLIIL(interfaceC1541990qEH, str);
        } else {
            LJLIIL$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLI(SparkContext sparkContext) {
        if (this.$t != 0) {
            super.LJLLI(sparkContext);
        } else {
            LJLLI$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (this.$t != 0) {
            super.LJLLJ(sparkContext, c1548490qOl);
        } else {
            LJLLJ$0(this, sparkContext, c1548490qOl);
        }
    }

    public C1402400mb8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$1(C1402400mb8 c1402400mb8, InterfaceC1541990qEH interfaceC1541990qEH) {
        String objectID;
        String strLJ;
        ((ReportWebContainer) c1402400mb8.l0).LLILZIL = true;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[5];
        InterfaceC1381130m2p interfaceC1381130m2p = ((ReportWebContainer) c1402400mb8.l0).LLJILJILJ;
        String reportType = null;
        if (interfaceC1381130m2p != null) {
            reportType = interfaceC1381130m2p.getReportType();
        }
        String str = "";
        if (reportType == null) {
            reportType = "";
        }
        pairArr[0] = new Pair("report_type", reportType);
        InterfaceC1381130m2p interfaceC1381130m2p2 = ((ReportWebContainer) c1402400mb8.l0).LLJILJILJ;
        if (interfaceC1381130m2p2 == null || (objectID = interfaceC1381130m2p2.getObjectID()) == null) {
            objectID = "";
        }
        pairArr[1] = new Pair("object_id", objectID);
        InterfaceC1381130m2p interfaceC1381130m2p3 = ((ReportWebContainer) c1402400mb8.l0).LLJILJILJ;
        if (interfaceC1381130m2p3 != null && (strLJ = interfaceC1381130m2p3.LJ()) != null) {
            str = strLJ;
        }
        pairArr[2] = new Pair("owner_id", str);
        pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - ((ReportWebContainer) c1402400mb8.l0).LLILZ));
        pairArr[4] = new Pair("url_path", ((ReportWebContainer) c1402400mb8.l0).LLILLL);
        interfaceC1519030pdFLIZJ.LIZ("tns_report_container_load_success", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static final void LJJZZIII$0(C1402400mb8 c1402400mb8, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((C1356260lOi) c1402400mb8.l0).LJFF();
        C1356250lOh.LIZ(((C1356260lOi) c1402400mb8.l0).LLJJIII, "spark_view_load_failed");
        ((C1356260lOi) c1402400mb8.l0).LJI(null);
    }

    public static final void LJLIIL$0(C1402400mb8 c1402400mb8, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1356260lOi c1356260lOi = (C1356260lOi) c1402400mb8.l0;
        if (!c1356260lOi.LLJILJILJ) {
            C1548820qPI.LIZLLL("onCompletion", c1356260lOi.LLJJJIL);
            C1548820qPI.LIZLLL("onStart", c1356260lOi.LLJJJ);
            C1548820qPI.LIZLLL("onPlayError", c1356260lOi.LLJJJJ);
            C1548820qPI.LIZLLL("onClick", c1356260lOi.LLJJJJJIL);
            C1548820qPI.LIZLLL("playBackgroundVoice", c1356260lOi.LLJJJJLIIL);
            C1548820qPI.LIZLLL("pauseBackgroundVoice", c1356260lOi.LLJJL);
            C1548820qPI.LIZLLL("onClickButton", c1356260lOi.LLJJLIIIJLLLLLLLZ);
            C1548820qPI.LIZLLL("onClose", c1356260lOi.LLJL);
            c1356260lOi.LLJILJILJ = true;
        }
    }

    public static final void LJLI$0(C1402400mb8 c1402400mb8, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        String objectID;
        String strLJ;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[5];
        InterfaceC1381130m2p interfaceC1381130m2p = ((ReportWebContainer) c1402400mb8.l0).LLJILJILJ;
        String reportType = null;
        if (interfaceC1381130m2p != null) {
            reportType = interfaceC1381130m2p.getReportType();
        }
        String str3 = "";
        if (reportType == null) {
            reportType = "";
        }
        pairArr[0] = new Pair("report_type", reportType);
        InterfaceC1381130m2p interfaceC1381130m2p2 = ((ReportWebContainer) c1402400mb8.l0).LLJILJILJ;
        if (interfaceC1381130m2p2 == null || (objectID = interfaceC1381130m2p2.getObjectID()) == null) {
            objectID = "";
        }
        pairArr[1] = new Pair("object_id", objectID);
        InterfaceC1381130m2p interfaceC1381130m2p3 = ((ReportWebContainer) c1402400mb8.l0).LLJILJILJ;
        if (interfaceC1381130m2p3 != null && (strLJ = interfaceC1381130m2p3.LJ()) != null) {
            str3 = strLJ;
        }
        pairArr[2] = new Pair("owner_id", str3);
        pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - ((ReportWebContainer) c1402400mb8.l0).LLILZ));
        pairArr[4] = new Pair("url_path", ((ReportWebContainer) c1402400mb8.l0).LLILLL);
        interfaceC1519030pdFLIZJ.LIZ("tns_report_container_load_failed", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
