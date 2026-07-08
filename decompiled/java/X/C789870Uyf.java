package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0Uyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789870Uyf {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final String toString() {
        return C786410Ut5.j4("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r1 = this.LIZ;
        int i = r1;
        if (this.LIZIZ) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.LIZJ) {
            i2 = i + 256;
        }
        return this.LIZLLL ? i2 + SpeechEngineDefines.TTS_WORK_MODE_BOTH : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789870Uyf)) {
            return false;
        }
        C789870Uyf c789870Uyf = (C789870Uyf) obj;
        if (this.LIZ == c789870Uyf.LIZ && this.LIZIZ == c789870Uyf.LIZIZ && this.LIZJ == c789870Uyf.LIZJ && this.LIZLLL == c789870Uyf.LIZLLL) {
            return true;
        }
        return false;
    }

    public C789870Uyf(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
