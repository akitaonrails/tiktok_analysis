package X;

import com.ss.android.ugc.aweme.report.ClickReportInfo;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.report.ShowReportInfo;

/* JADX INFO: renamed from: X.15w7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20680115w7 {
    public final C20646415qg LIZ;
    public final OutreachInfo LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ShowReportInfo LJ;
    public final ClickReportInfo LJFF;
    public OutreachFlowReportItem LJI;

    public C20680115w7() {
        this(null, null, null, null, null, null, 127);
    }

    public C20680115w7(C20646415qg c20646415qg, OutreachInfo outreachInfo, String str, String str2, ShowReportInfo showReportInfo, ClickReportInfo clickReportInfo, int i) {
        c20646415qg = (i & 1) != 0 ? null : c20646415qg;
        outreachInfo = (i & 2) != 0 ? null : outreachInfo;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        showReportInfo = (i & 16) != 0 ? null : showReportInfo;
        clickReportInfo = (i & 32) != 0 ? null : clickReportInfo;
        this.LIZ = c20646415qg;
        this.LIZIZ = outreachInfo;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = showReportInfo;
        this.LJFF = clickReportInfo;
        this.LJI = null;
    }
}
