package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.15l7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611915l7 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final UrlModel LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final C20611315l1 LJIIL;
    public final C316780CbM LJIILIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C20611915l7() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        this((String) null, 0, (int) (0 == true ? 1 : 0), (String) objArr, (String) objArr2, (UrlModel) objArr3, (String) objArr4, (String) objArr5, (int) (0 == true ? 1 : 0), (String) objArr6, (boolean) (0 == true ? 1 : 0), (String) objArr7, (C20611315l1) objArr8, 16383);
    }

    public static C20611915l7 LIZ(C20611915l7 c20611915l7, C316780CbM c316780CbM) {
        return new C20611915l7(c20611915l7.LIZ, c20611915l7.LIZIZ, c20611915l7.LIZJ, c20611915l7.LIZLLL, c20611915l7.LJ, c20611915l7.LJFF, c20611915l7.LJI, c20611915l7.LJII, c20611915l7.LJIIIIZZ, c20611915l7.LJIIIZ, c20611915l7.LJIIJ, c20611915l7.LJIIJJI, c20611915l7.LJIIL, c316780CbM);
    }

    public /* synthetic */ C20611915l7(String str, int i, int i2, String str2, String str3, UrlModel urlModel, String str4, String str5, int i3, String str6, boolean z, String str7, C20611315l1 c20611315l1, int i4) {
        C316780CbM c316780CbM;
        C20611315l1 c20611315l12 = c20611315l1;
        boolean z2 = z;
        int i5 = i3;
        String str8 = str5;
        String str9 = str4;
        UrlModel urlModel2 = urlModel;
        String str10 = str3;
        String str11 = str2;
        int i6 = i2;
        int i7 = i;
        String str12 = str7;
        String str13 = (i4 & 1) != 0 ? "" : str;
        i7 = (i4 & 2) != 0 ? 0 : i7;
        i6 = (i4 & 4) != 0 ? 0 : i6;
        str11 = (i4 & 8) != 0 ? "" : str11;
        str10 = (i4 & 16) != 0 ? "" : str10;
        urlModel2 = (i4 & 32) != 0 ? null : urlModel2;
        str9 = (i4 & 64) != 0 ? "" : str9;
        str8 = (i4 & 128) != 0 ? "" : str8;
        i5 = (i4 & 256) != 0 ? -1 : i5;
        String str14 = (i4 & 512) == 0 ? str6 : "";
        z2 = (i4 & 1024) != 0 ? true : z2;
        str12 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str12;
        c20611315l12 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new C20611315l1(null, null, false, null, null, null, null, 0, null, null, 2047) : c20611315l12;
        if ((i4 & 8192) != 0) {
            c316780CbM = new C316780CbM(null, 3, 0);
        } else {
            c316780CbM = null;
        }
        this(str13, i7, i6, str11, str10, urlModel2, str9, str8, i5, str14, z2, str12, c20611315l12, c316780CbM);
    }

    public C20611915l7(String str, int i, int i2, String str2, String str3, UrlModel urlModel, String str4, String str5, int i3, String str6, boolean z, String str7, C20611315l1 c20611315l1, C316780CbM c316780CbM) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = urlModel;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = str6;
        this.LJIIJ = z;
        this.LJIIJJI = str7;
        this.LJIIL = c20611315l1;
        this.LJIILIIL = c316780CbM;
    }
}
