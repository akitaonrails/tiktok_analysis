package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978700bZk {
    public final String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC919170a1j LJ;
    public boolean LJFF;
    public boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final Function0<Unit> LJIIL;

    public C978700bZk() {
        throw null;
    }

    public C978700bZk(String str, String str2, String str3, String str4, EnumC919170a1j enumC919170a1j, boolean z, boolean z2, long j, AwS559S0100000_15 awS559S0100000_15, Function0 function0, int i) {
        z = (i & 128) != 0 ? false : z;
        z2 = (i & 256) != 0 ? false : z2;
        j = (i & 1024) != 0 ? 0L : j;
        Function0<Unit> function02 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? AFwS203S0000000_15.get$arr$(235) : awS559S0100000_15;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = enumC919170a1j;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = false;
        this.LJIIJ = j;
        this.LJIIJJI = function02;
        this.LJIIL = function0;
    }
}
