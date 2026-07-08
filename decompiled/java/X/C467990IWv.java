package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0IWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467990IWv {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public long LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public int LJIIJ;
    public final int LJIIJJI;
    public final EnterRoomConfig LJIIL;
    public String LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public volatile boolean LJIJ;

    public C467990IWv(long j, String str, String str2, String str3, String str4, String str5, long j2, long j3, int i, EnterRoomConfig enterRoomConfig, int i2) {
        String str6;
        long j4;
        long j5;
        long j6;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        String str10 = str4;
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        long j7 = j3;
        long j8 = j2;
        int i3 = i;
        String str11 = str5;
        long j9 = (i2 & 1) != 0 ? -1L : j;
        str9 = (i2 & 2) != 0 ? "" : str9;
        str8 = (i2 & 4) != 0 ? "" : str8;
        str7 = (i2 & 8) != 0 ? "" : str7;
        str10 = (i2 & 16) != 0 ? "" : str10;
        if ((i2 & 32) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        if ((i2 & 64) != 0) {
            j4 = -1;
        } else {
            j4 = 0;
        }
        str11 = (i2 & 128) != 0 ? "" : str11;
        j8 = (i2 & 256) != 0 ? -1L : j8;
        j7 = (i2 & 512) != 0 ? -1L : j7;
        i3 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i3;
        enterRoomConfig2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : enterRoomConfig2;
        String str12 = (i2 & 8192) == 0 ? null : "";
        if ((i2 & 16384) != 0) {
            j5 = -1;
        } else {
            j5 = 0;
        }
        if ((i2 & 32768) != 0) {
            j6 = -1;
        } else {
            j6 = 0;
        }
        this.LIZ = j9;
        this.LIZIZ = str9;
        this.LIZJ = str8;
        this.LIZLLL = str7;
        this.LJ = str10;
        this.LJFF = str6;
        this.LJI = j4;
        this.LJII = str11;
        this.LJIIIIZZ = j8;
        this.LJIIIZ = j7;
        this.LJIIJ = 0;
        this.LJIIJJI = i3;
        this.LJIIL = enterRoomConfig2;
        this.LJIILIIL = str12;
        this.LJIILJJIL = j5;
        this.LJIILL = j6;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        this.LJIJ = false;
    }
}
