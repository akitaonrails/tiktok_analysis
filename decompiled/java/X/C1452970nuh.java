package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.vesdk.VEUserConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452970nuh {
    public final C00CM LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final VEUserConfig LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final int LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final Pair<Integer, Integer> LJIIIZ;
    public final String LJIIJ;

    public /* synthetic */ C1452970nuh(C00CM c00cm, String str, long j, VEUserConfig vEUserConfig, boolean z, int i, boolean z2, int i2, int i3) {
        boolean z3;
        Pair pair;
        boolean z4 = z;
        VEUserConfig vEUserConfig2 = vEUserConfig;
        boolean z5 = z2;
        long j2 = (i3 & 4) != 0 ? -1L : j;
        vEUserConfig2 = (i3 & 8) != 0 ? null : vEUserConfig2;
        z4 = (i3 & 32) != 0 ? false : z4;
        if ((i3 & 64) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        z5 = (i3 & 256) != 0 ? true : z5;
        if ((i3 & 1024) != 0) {
            pair = new Pair(0, 0);
        } else {
            pair = null;
        }
        this(c00cm, str, j2, vEUserConfig2, z4, z3, i, z5, i2, pair, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : null);
    }

    public C1452970nuh(C00CM c00cm, String str, long j, VEUserConfig vEUserConfig, boolean z, boolean z2, int i, boolean z3, int i2, Pair pair, String str2) {
        this.LIZ = c00cm;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = vEUserConfig;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = i;
        this.LJII = z3;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = pair;
        this.LJIIJ = str2;
    }
}
