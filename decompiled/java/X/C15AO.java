package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixGuestShowdownAnimationContainerSetting;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15AO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AO {
    public final String LIZ;
    public String LIZIZ;
    public final Function2<String, Pair<Integer, Integer>, Bitmap> LIZJ;
    public Map<String, String> LIZLLL;
    public final C20345814jI LJ;
    public final long LJFF;
    public final float LJI;
    public final boolean LJII;
    public final C20345714jH LJIIIIZZ;
    public final List<String> LJIIIZ;
    public final Map<String, C1294720jnS> LJIIJ;

    public final String toString() {
        return "CommonLottieInfo(channelName=" + this.LIZ + ", fileName=" + this.LIZIZ + ", fileNameToBitmapMap=" + this.LIZJ + ", imageIdTextMap=" + this.LIZLLL + ", repeatInfo=" + this.LJ + ", delay=" + this.LJFF + ", startProgress=" + this.LJI + ", forceUseLottie=" + this.LJII + ", screenShotLottieInfo=" + this.LJIIIIZZ + ", fileNameList=" + this.LJIIIZ + ", lottieCache=" + this.LJIIJ + ')';
    }

    public final C15AO LIZIZ() {
        if (BugFixGuestShowdownAnimationContainerSetting.INSTANCE.isEnable()) {
            String str = this.LIZ;
            String str2 = this.LIZIZ;
            Function2<String, Pair<Integer, Integer>, Bitmap> function2 = this.LIZJ;
            Map<String, String> map = this.LIZLLL;
            C20345814jI c20345814jI = this.LJ;
            return new C15AO(str, str2, function2, map, new C20345814jI(c20345814jI.LIZ, c20345814jI.LIZIZ), this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, (List<String>) C13LP.LLIIII(this.LJIIIZ), this.LJIIJ);
        }
        String str3 = this.LIZ;
        String str4 = this.LIZIZ;
        Function2<String, Pair<Integer, Integer>, Bitmap> function22 = this.LIZJ;
        Map<String, String> map2 = this.LIZLLL;
        C20345814jI c20345814jI2 = this.LJ;
        return new C15AO(str3, str4, (Function2) function22, (Map) map2, new C20345814jI(c20345814jI2.LIZ, c20345814jI2.LIZIZ), this.LJFF, false, (C20345714jH) null, C13LP.LLIIII(this.LJIIIZ), (Map) null, 1408);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Function2<String, Pair<Integer, Integer>, Bitmap> function2 = this.LIZJ;
        int iHashCode2 = (((((((((((iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        C20345714jH c20345714jH = this.LJIIIIZZ;
        int iHashCode3 = (((iHashCode2 + (c20345714jH == null ? 0 : c20345714jH.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31;
        Map<String, C1294720jnS> map = this.LJIIJ;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15AO)) {
            return false;
        }
        C15AO c15ao = (C15AO) obj;
        if (!Intrinsics.LJFF(this.LIZ, c15ao.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c15ao.LIZIZ) || !Intrinsics.LJFF(this.LIZLLL, c15ao.LIZLLL) || !Intrinsics.LJFF(this.LJ, c15ao.LJ) || this.LJFF != c15ao.LJFF || this.LJI != c15ao.LJI || this.LJII != c15ao.LJII || !Intrinsics.LJFF(this.LJIIIZ, c15ao.LJIIIZ)) {
            return false;
        }
        return true;
    }

    public static C15AO LIZ(C15AO c15ao, String str, C20345814jI c20345814jI, int i) {
        String str2;
        Function2<String, Pair<Integer, Integer>, Bitmap> function2;
        Map<String, String> map;
        long j;
        float f;
        boolean z;
        C20345714jH c20345714jH;
        List<String> list;
        C20345814jI c20345814jI2 = c20345814jI;
        String str3 = str;
        Map<String, C1294720jnS> map2 = null;
        if ((i & 1) != 0) {
            str2 = c15ao.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = c15ao.LIZIZ;
        }
        if ((i & 4) != 0) {
            function2 = c15ao.LIZJ;
        } else {
            function2 = null;
        }
        if ((i & 8) != 0) {
            map = c15ao.LIZLLL;
        } else {
            map = null;
        }
        if ((i & 16) != 0) {
            c20345814jI2 = c15ao.LJ;
        }
        if ((i & 32) != 0) {
            j = c15ao.LJFF;
        } else {
            j = 0;
        }
        if ((i & 64) != 0) {
            f = c15ao.LJI;
        } else {
            f = 0.0f;
        }
        if ((i & 128) != 0) {
            z = c15ao.LJII;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            c20345714jH = c15ao.LJIIIIZZ;
        } else {
            c20345714jH = null;
        }
        if ((i & 512) != 0) {
            list = c15ao.LJIIIZ;
        } else {
            list = null;
        }
        if ((i & 1024) != 0) {
            map2 = c15ao.LJIIJ;
        }
        c15ao.getClass();
        return new C15AO(str2, str3, function2, map, c20345814jI2, j, f, z, c20345714jH, list, map2);
    }

    public C15AO(String str, String str2, Function2 function2, Map map, C20345814jI c20345814jI, long j, boolean z, C20345714jH c20345714jH, List list, Map map2, int i) {
        this(str, str2, (Function2<? super String, ? super Pair<Integer, Integer>, Bitmap>) ((i & 4) != 0 ? null : function2), (Map<String, String>) ((i & 8) != 0 ? C2097608Jq.LJ() : map), (i & 16) != 0 ? C20345814jI.LIZJ : c20345814jI, (i & 32) != 0 ? 0L : j, 0.0f, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : c20345714jH, (List<String>) ((i & 512) != 0 ? C13BV.INSTANCE : list), (Map<String, C1294720jnS>) ((i & 1024) == 0 ? map2 : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15AO(String str, String str2, Function2<? super String, ? super Pair<Integer, Integer>, Bitmap> function2, Map<String, String> map, C20345814jI c20345814jI, long j, float f, boolean z, C20345714jH c20345714jH, List<String> list, Map<String, C1294720jnS> map2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = function2;
        this.LIZLLL = map;
        this.LJ = c20345814jI;
        this.LJFF = j;
        this.LJI = f;
        this.LJII = z;
        this.LJIIIIZZ = c20345714jH;
        this.LJIIIZ = list;
        this.LJIIJ = map2;
    }
}
