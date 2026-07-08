package X;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: renamed from: X.1BLM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLM {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;
    public PendingIntent LJII;
    public Exception LJIIIIZZ;
    public Map<String, Object> LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MorpheusState{packageName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", versionCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", totalBytesToDownload=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bytesDownloaded=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", downloadTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", resolutionIntent=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1BLM(String str, AbstractC2457909k9 abstractC2457909k9) {
        this(str, C08PT.LJ(), abstractC2457909k9.LJII());
        this.LIZLLL = abstractC2457909k9.LJIIIIZZ();
        this.LJ = abstractC2457909k9.LIZ();
        this.LJII = abstractC2457909k9.LJFF();
        this.LJI = abstractC2457909k9.LIZJ();
    }

    public C1BLM(long j, long j2, String str) {
        this.LIZ = str;
        this.LIZIZ = C08PT.LJ();
        this.LIZJ = 6;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJI = -10;
    }

    public C1BLM(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
