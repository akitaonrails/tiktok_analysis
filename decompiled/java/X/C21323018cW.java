package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.tiktok.myna.render.render.MynaTemplateProtocol;

/* JADX INFO: renamed from: X.18cW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21323018cW {
    public final MynaTemplateProtocol LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final Long LJIIJJI;
    public final Long LJIIL;

    public C21323018cW(MynaTemplateProtocol mynaTemplateProtocol, long j, int i, String str, String str2, String str3, String str4, boolean z, String str5, Long l, Long l2, int i2) {
        j = (i2 & 8) != 0 ? 0L : j;
        i = (i2 & 16) != 0 ? 0 : i;
        str = (i2 & 32) != 0 ? null : str;
        str2 = (i2 & 64) != 0 ? "OTHER" : str2;
        str3 = (i2 & 128) != 0 ? null : str3;
        str4 = (i2 & 256) != 0 ? null : str4;
        z = (i2 & 512) != 0 ? false : z;
        str5 = (i2 & 1024) != 0 ? null : str5;
        l = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : l;
        Long l3 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? l2 : null;
        this.LIZ = mynaTemplateProtocol;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = j;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = z;
        this.LJIIJ = str5;
        this.LJIIJJI = l;
        this.LJIIL = l3;
    }
}
