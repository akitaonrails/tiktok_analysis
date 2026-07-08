package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19678511yx {
    public final float LIZ;
    public final Pair<Integer, Boolean> LIZIZ;
    public final EnumC19678411yw LIZJ;
    public final boolean LIZLLL;
    public final List<Pair<EnumC19678411yw, Boolean>> LJ;
    public final boolean LJFF;
    public final C375830EoP<Boolean> LJI;
    public final C375830EoP<Boolean> LJII;
    public final C375830EoP<Boolean> LJIIIIZZ;
    public final C375830EoP<Boolean> LJIIIZ;
    public final C375830EoP<Boolean> LJIIJ;
    public final String LJIIJJI;

    public C19678511yx() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19678511yx(int i) {
        Boolean bool = Boolean.FALSE;
        this(-1.0f, new Pair(6, bool), EnumC19678411yw.NULL, false, C1697810uHb.LJIIJJI(new Pair(EnumC19678411yw.NORMAL_BRUSH, bool), new Pair(EnumC19678411yw.HIGHLIGHT_BRUSH, bool), new Pair(EnumC19678411yw.ERASER, bool), new Pair(EnumC19678411yw.CHANGE_COLOR, bool)), false, null, null, null, null, null, "");
    }

    public static C19678511yx LIZ(C19678511yx c19678511yx, EnumC19678411yw enumC19678411yw, List list, boolean z, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, String str, int i) {
        float f;
        Pair<Integer, Boolean> pair;
        boolean z2;
        String str2 = str;
        C375830EoP c375830EoP6 = c375830EoP5;
        C375830EoP c375830EoP7 = c375830EoP4;
        C375830EoP c375830EoP8 = c375830EoP3;
        C375830EoP c375830EoP9 = c375830EoP;
        boolean z3 = z;
        List list2 = list;
        C375830EoP c375830EoP10 = c375830EoP2;
        EnumC19678411yw enumC19678411yw2 = enumC19678411yw;
        if ((i & 1) != 0) {
            f = c19678511yx.LIZ;
        } else {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            pair = c19678511yx.LIZIZ;
        } else {
            pair = null;
        }
        if ((i & 4) != 0) {
            enumC19678411yw2 = c19678511yx.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c19678511yx.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            list2 = c19678511yx.LJ;
        }
        if ((i & 32) != 0) {
            z3 = c19678511yx.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP9 = c19678511yx.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP10 = c19678511yx.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP8 = c19678511yx.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP7 = c19678511yx.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP6 = c19678511yx.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str2 = c19678511yx.LJIIJJI;
        }
        c19678511yx.getClass();
        return new C19678511yx(f, pair, enumC19678411yw2, z2, list2, z3, c375830EoP9, c375830EoP10, c375830EoP8, c375830EoP7, c375830EoP6, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19678511yx(float f, Pair<Integer, Boolean> pair, EnumC19678411yw enumC19678411yw, boolean z, List<? extends Pair<? extends EnumC19678411yw, Boolean>> list, boolean z2, C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<Boolean> c375830EoP4, C375830EoP<Boolean> c375830EoP5, String str) {
        this.LIZ = f;
        this.LIZIZ = pair;
        this.LIZJ = enumC19678411yw;
        this.LIZLLL = z;
        this.LJ = list;
        this.LJFF = z2;
        this.LJI = c375830EoP;
        this.LJII = c375830EoP2;
        this.LJIIIIZZ = c375830EoP3;
        this.LJIIIZ = c375830EoP4;
        this.LJIIJ = c375830EoP5;
        this.LJIIJJI = str;
    }
}
