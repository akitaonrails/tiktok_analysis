package X;

import android.graphics.Shader;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.1AIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177251AIx {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final Shader LJFF;
    public final int LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final Boolean LJIIJJI;
    public final EnumC2177131AIl LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final Map<Integer, InterfaceC1600660rku> LJIILLIIL;

    public C2177251AIx() {
        this(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, null, null, false, false, false, null, 131071);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int iHashCode = (((i + (num == null ? 0 : num.hashCode())) * 31) + this.LIZLLL) * 31;
        Integer num2 = this.LJ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Shader shader = this.LJFF;
        int iHashCode3 = (((((((((((iHashCode2 + (shader == null ? 0 : shader.hashCode())) * 31) + this.LJI) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31;
        Boolean bool = this.LJIIJJI;
        int iHashCode4 = (((((((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31;
        Map<Integer, InterfaceC1600660rku> map = this.LJIILLIIL;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public C2177251AIx(int i, int i2, Integer num, int i3, int i4, float f, float f2, int i5, int i6, Boolean bool, EnumC2177131AIl enumC2177131AIl, boolean z, boolean z2, boolean z3, Map map, int i7) {
        int i8 = i3;
        Integer num2 = num;
        int iLIZIZ = i2;
        float f3 = f2;
        float f4 = f;
        int i9 = i4;
        Boolean bool2 = bool;
        int i10 = i6;
        int i11 = i5;
        boolean z4 = z2;
        boolean z5 = z;
        EnumC2177131AIl enumC2177131AIl2 = enumC2177131AIl;
        Map map2 = map;
        boolean z6 = z3;
        int iLIZIZ2 = (i7 & 1) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) : i;
        iLIZIZ = (i7 & 2) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : iLIZIZ;
        num2 = (i7 & 4) != 0 ? null : num2;
        i8 = (i7 & 8) != 0 ? 0 : i8;
        i9 = (i7 & 64) != 0 ? 3 : i9;
        f4 = (i7 & 128) != 0 ? 0.7f : f4;
        f3 = (i7 & 256) != 0 ? 1.0f : f3;
        i11 = (i7 & 512) != 0 ? R.attr.bw : i11;
        i10 = (i7 & 1024) != 0 ? R.attr.a1j : i10;
        bool2 = (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool2;
        enumC2177131AIl2 = (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? EnumC2177131AIl.NO_TAIL : enumC2177131AIl2;
        z5 = (i7 & 8192) != 0 ? false : z5;
        z4 = (i7 & 16384) != 0 ? true : z4;
        z6 = (32768 & i7) != 0 ? false : z6;
        map2 = (i7 & 65536) != 0 ? null : map2;
        this.LIZ = iLIZIZ2;
        this.LIZIZ = iLIZIZ;
        this.LIZJ = num2;
        this.LIZLLL = i8;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = i9;
        this.LJII = f4;
        this.LJIIIIZZ = f3;
        this.LJIIIZ = i11;
        this.LJIIJ = i10;
        this.LJIIJJI = bool2;
        this.LJIIL = enumC2177131AIl2;
        this.LJIILIIL = z5;
        this.LJIILJJIL = z4;
        this.LJIILL = z6;
        this.LJIILLIIL = map2;
    }
}
