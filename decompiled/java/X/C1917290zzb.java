package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0zzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917290zzb {
    public String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public long LJI;
    public long LJII;
    public String LJIIIIZZ;
    public C10CT LJIIIZ;
    public C1917340zzg LJIIJ;
    public String LJIIJJI;

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        C10CT c10ct = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (c10ct == null ? 0 : c10ct.hashCode())) * 31;
        C1917340zzg c1917340zzg = this.LJIIJ;
        return ((iHashCode3 + (c1917340zzg == null ? 0 : c1917340zzg.hashCode())) * 31 * 31) + this.LJIIJJI.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1917290zzb(String str, String str2, String str3, String str4, String str5, String str6, C10CT c10ct, C1917340zzg c1917340zzg, String str7, int i) {
        String str8;
        C10CT c10ct2 = c10ct;
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        String str14 = (i & 1) != 0 ? "normal" : str;
        str13 = (i & 2) != 0 ? "" : str13;
        str12 = (i & 4) != 0 ? "" : str12;
        str11 = (i & 8) != 0 ? "" : str11;
        str10 = (i & 16) != 0 ? null : str10;
        str9 = (i & 32) != 0 ? "" : str9;
        if ((i & 256) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        this(str14, str13, str12, str11, str10, str9, 0L, 0L, str8, (i & 512) != 0 ? null : c10ct2, (i & 1024) == 0 ? c1917340zzg : null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str7 : "");
    }

    public C1917290zzb(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, C10CT c10ct, C1917340zzg c1917340zzg, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = c10ct;
        this.LJIIJ = c1917340zzg;
        this.LJIIJJI = str8;
    }
}
