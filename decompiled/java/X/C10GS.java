package X;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: X.10GS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10GS {
    public static final C19216610Fw LJIIJJI = new C19216610Fw();
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10GS() {
        long j = 0;
        String str = null;
        int i = 0;
        this(j, str, j, i, str, str, i, str, 2047);
    }

    public final void LIZ() {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(this.LIZ));
        String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(this.LJII));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupRecord[");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("]@");
        sbLIZ.append(str);
        sbLIZ.append(": freq: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", show: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", type: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", action(");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PopupTracking");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C10GS(long j, String str, long j2, int i, String str2, String str3, int i2, String str4, int i3) {
        String str5;
        String str6 = str4;
        int value = i2;
        String str7 = str3;
        String str8 = str2;
        long j3 = j2;
        String str9 = str;
        int i4 = i;
        long j4 = (i3 & 1) != 0 ? 0L : j;
        str9 = (i3 & 2) != 0 ? "" : str9;
        j3 = (i3 & 4) != 0 ? 0L : j3;
        i4 = (i3 & 8) != 0 ? 0 : i4;
        str8 = (i3 & 16) != 0 ? "others" : str8;
        str7 = (i3 & 32) != 0 ? "normal" : str7;
        value = (i3 & 64) != 0 ? C10CR.NOT_ACTION_TYPE.getValue() : value;
        str6 = (i3 & 256) != 0 ? "" : str6;
        if ((i3 & 512) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        this(j4, str9, j3, i4, str8, str7, value, 0L, str6, str5, (i3 & 1024) == 0 ? null : "");
    }

    public C10GS(long j, String str, long j2, int i, String str2, String str3, int i2, long j3, String str4, String str5, String str6) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = j2;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = i2;
        this.LJII = j3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
    }
}
