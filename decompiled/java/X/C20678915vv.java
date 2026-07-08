package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;

/* JADX INFO: renamed from: X.15vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20678915vv {
    public final InterfaceC20677715vj LIZ;
    public final OutreachInfo LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public OutreachFlowReportItem LJFF;

    public C20678915vv() {
        this(null, null, null, null, null, 63);
    }

    public C20678915vv(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str, String str2, String str3, int i) {
        interfaceC20677715vj = (i & 1) != 0 ? null : interfaceC20677715vj;
        outreachInfo = (i & 2) != 0 ? null : outreachInfo;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        this.LIZ = interfaceC20677715vj;
        this.LIZIZ = outreachInfo;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = null;
    }
}
