package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0Chr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320810Chr {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final int LJFF;

    public C320810Chr() {
        this(null, 16383);
    }

    public C320810Chr(String str, int i) {
        int i2;
        long j;
        str = (i & 2) != 0 ? "" : str;
        String str2 = (i & 16) == 0 ? null : "";
        if ((i & 128) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            j = 1;
        } else {
            j = 0;
        }
        int i3 = (i & 8192) == 0 ? 0 : 1;
        this.LIZ = false;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = j;
        this.LJFF = i3;
    }
}
