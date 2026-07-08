package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0le7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365810le7 {
    public final List<IMContact> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;

    public C1365810le7() {
        throw null;
    }

    public C1365810le7(List list, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, String str5, String str6, String str7, String str8, boolean z3, boolean z4, int i2) {
        String str9 = str7;
        boolean z5 = z3;
        String str10 = (i2 & 512) != 0 ? null : str6;
        str9 = (i2 & 1024) != 0 ? null : str9;
        String str11 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str8 : null;
        z5 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z5;
        boolean z6 = (i2 & 8192) == 0 ? z4 : false;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str10;
        this.LJIIJ = str9;
        this.LJIIJJI = str11;
        this.LJIIL = z5;
        this.LJIILIIL = z6;
    }
}
