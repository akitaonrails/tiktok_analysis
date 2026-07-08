package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import webcast.data.multi_guest_play.PlaybookFlowExtra;

/* JADX INFO: renamed from: X.14lF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20357914lF {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public volatile long LIZLLL;
    public volatile int LJ;
    public volatile int LJFF;
    public volatile int LJI;
    public volatile EnumC20429514wn LJII;
    public PlaybookFlowExtra LJIIIIZZ;
    public final int LJIIIZ;
    public final List<String> LJIIJ;
    public final String LJIIJJI;

    public C20357914lF(String str, long j, long j2, int i, List list, String str2, int i2) {
        EnumC20429514wn enumC20429514wn;
        str = (i2 & 1) != 0 ? "" : str;
        j = (i2 & 2) != 0 ? 0L : j;
        j2 = (i2 & 4) != 0 ? 0L : j2;
        long j3 = (i2 & 16) != 0 ? -1L : 0L;
        if ((i2 & 256) != 0) {
            enumC20429514wn = EnumC20429514wn.IDLE;
        } else {
            enumC20429514wn = null;
        }
        i = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i;
        list = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list;
        String str3 = (i2 & 16384) == 0 ? str2 : "";
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = enumC20429514wn;
        this.LJIIIIZZ = null;
        this.LJIIIZ = i;
        this.LJIIJ = list;
        this.LJIIJJI = str3;
    }
}
