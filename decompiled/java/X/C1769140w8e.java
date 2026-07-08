package X;

import android.graphics.Bitmap;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769140w8e {
    public final boolean LIZ;
    public final String LIZIZ;
    public final Bitmap LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final Boolean LJFF;
    public final long LJI;
    public final Map<String, Object> LJII;
    public final EnumC1769260w8q LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;
    public final EnumC2003907t7 LJIIJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1769140w8e() {
        this(false, (String) null, (Bitmap) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), 0L, (Map) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (EnumC2003907t7) (0 == true ? 1 : 0), 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769140w8e)) {
            return false;
        }
        C1769140w8e c1769140w8e = (C1769140w8e) obj;
        return this.LIZ == c1769140w8e.LIZ && Intrinsics.LJFF(this.LIZIZ, c1769140w8e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1769140w8e.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1769140w8e.LIZLLL) && Intrinsics.LJFF(this.LJ, c1769140w8e.LJ) && Intrinsics.LJFF(this.LJFF, c1769140w8e.LJFF) && this.LJI == c1769140w8e.LJI && Intrinsics.LJFF(this.LJII, c1769140w8e.LJII) && this.LJIIIIZZ == c1769140w8e.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1769140w8e.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1769140w8e.LJIIJ) && this.LJIIJJI == c1769140w8e.LJIIJJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1769140w8e(boolean z, String str, Bitmap bitmap, String str2, Boolean bool, Boolean bool2, long j, Map map, Integer num, String str3, EnumC2003907t7 enumC2003907t7, int i) {
        EnumC1769260w8q enumC1769260w8q;
        String str4 = str3;
        Integer num2 = num;
        Map map2 = map;
        long j2 = j;
        Boolean bool3 = bool;
        String str5 = str2;
        Bitmap bitmap2 = bitmap;
        Boolean bool4 = bool2;
        String str6 = str;
        boolean z2 = (i & 1) != 0 ? false : z;
        str6 = (i & 2) != 0 ? "" : str6;
        bitmap2 = (i & 4) != 0 ? null : bitmap2;
        str5 = (i & 8) != 0 ? null : str5;
        bool3 = (i & 16) != 0 ? null : bool3;
        bool4 = (i & 32) != 0 ? null : bool4;
        j2 = (i & 64) != 0 ? 3000L : j2;
        map2 = (i & 128) != 0 ? null : map2;
        if ((i & 256) != 0) {
            enumC1769260w8q = EnumC1769260w8q.OTHER;
        } else {
            enumC1769260w8q = null;
        }
        this(z2, str6, bitmap2, str5, bool3, bool4, j2, (Map<String, ? extends Object>) map2, enumC1769260w8q, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? enumC2003907t7 : null);
    }

    public C1769140w8e(boolean z, String str, Bitmap bitmap, String str2, Boolean bool, Boolean bool2, long j, Map<String, ? extends Object> map, EnumC1769260w8q enumC1769260w8q, Integer num, String str3, EnumC2003907t7 enumC2003907t7) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = bitmap;
        this.LIZLLL = str2;
        this.LJ = bool;
        this.LJFF = bool2;
        this.LJI = j;
        this.LJII = map;
        this.LJIIIIZZ = enumC1769260w8q;
        this.LJIIIZ = num;
        this.LJIIJ = str3;
        this.LJIIJJI = enumC2003907t7;
    }
}
