package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769130w8d {
    public final boolean LIZ;
    public final EnumC1768240w7C LIZIZ;
    public final EnumC1769240w8o LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final Map<String, Object> LJI;
    public final EnumC1769260w8q LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final Long LJIIJJI;
    public final EnumC1769240w8o LJIIL;
    public final EnumC1769240w8o LJIILIIL;
    public final Map<String, Object> LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769130w8d)) {
            return false;
        }
        C1769130w8d c1769130w8d = (C1769130w8d) obj;
        return this.LIZ == c1769130w8d.LIZ && this.LIZIZ == c1769130w8d.LIZIZ && this.LIZJ == c1769130w8d.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1769130w8d.LIZLLL) && Intrinsics.LJFF(this.LJ, c1769130w8d.LJ) && Intrinsics.LJFF(this.LJFF, c1769130w8d.LJFF) && Intrinsics.LJFF(this.LJI, c1769130w8d.LJI) && this.LJII == c1769130w8d.LJII && this.LJIIIIZZ == c1769130w8d.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1769130w8d.LJIIIZ) && this.LJIIJ == c1769130w8d.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1769130w8d.LJIIJJI) && this.LJIIL == c1769130w8d.LJIIL && this.LJIILIIL == c1769130w8d.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c1769130w8d.LJIILJJIL);
    }

    public static C1769130w8d LIZ(C1769130w8d c1769130w8d, EnumC1768240w7C enumC1768240w7C, EnumC1769240w8o enumC1769240w8o, Map map, EnumC1769260w8q enumC1769260w8q, EnumC1769240w8o enumC1769240w8o2, Map map2, int i) {
        boolean z;
        Integer num;
        String str;
        Long l;
        int i2;
        String str2;
        Long l2;
        EnumC1769260w8q enumC1769260w8q2 = enumC1769260w8q;
        Map map3 = map2;
        Map map4 = map;
        EnumC1769240w8o enumC1769240w8o3 = enumC1769240w8o;
        EnumC1769240w8o enumC1769240w8o4 = enumC1769240w8o2;
        EnumC1768240w7C enumC1768240w7C2 = enumC1768240w7C;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = c1769130w8d.LIZ;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            enumC1768240w7C2 = c1769130w8d.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC1769240w8o3 = c1769130w8d.LIZJ;
        }
        EnumC1769240w8o enumC1769240w8o5 = null;
        if ((i & 8) != 0) {
            num = c1769130w8d.LIZLLL;
        } else {
            num = null;
        }
        if ((i & 16) != 0) {
            str = c1769130w8d.LJ;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            l = c1769130w8d.LJFF;
        } else {
            l = null;
        }
        if ((i & 64) != 0) {
            map4 = c1769130w8d.LJI;
        }
        if ((i & 128) != 0) {
            enumC1769260w8q2 = c1769130w8d.LJII;
        }
        if ((i & 256) != 0) {
            i2 = c1769130w8d.LJIIIIZZ;
        } else {
            i2 = 0;
        }
        if ((i & 512) != 0) {
            str2 = c1769130w8d.LJIIIZ;
        } else {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            z2 = c1769130w8d.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            l2 = c1769130w8d.LJIIJJI;
        } else {
            l2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            enumC1769240w8o5 = c1769130w8d.LJIIL;
        }
        if ((i & 8192) != 0) {
            enumC1769240w8o4 = c1769130w8d.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            map3 = c1769130w8d.LJIILJJIL;
        }
        return new C1769130w8d(z, enumC1768240w7C2, enumC1769240w8o3, num, str, l, map4, enumC1769260w8q2, i2, str2, z2, l2, enumC1769240w8o5, enumC1769240w8o4, map3);
    }

    public C1769130w8d(boolean z, EnumC1768240w7C enumC1768240w7C, EnumC1769240w8o enumC1769240w8o, Integer num, String str, Long l, Map<String, ? extends Object> map, EnumC1769260w8q enumC1769260w8q, int i, String str2, boolean z2, Long l2, EnumC1769240w8o enumC1769240w8o2, EnumC1769240w8o enumC1769240w8o3, Map<String, ? extends Object> map2) {
        this.LIZ = z;
        this.LIZIZ = enumC1768240w7C;
        this.LIZJ = enumC1769240w8o;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = l;
        this.LJI = map;
        this.LJII = enumC1769260w8q;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str2;
        this.LJIIJ = z2;
        this.LJIIJJI = l2;
        this.LJIIL = enumC1769240w8o2;
        this.LJIILIIL = enumC1769240w8o3;
        this.LJIILJJIL = map2;
    }
}
