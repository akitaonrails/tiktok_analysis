package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LY8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LY8 {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Long LJI;
    public final Integer LJII;
    public final Boolean LJIIIIZZ;
    public final List<String> LJIIIZ;
    public final Boolean LJIIJ;
    public final AIGCOfflineModel LJIIJJI;
    public final String LJIIL;
    public final Boolean LJIILIIL;
    public final Boolean LJIILJJIL;

    public C0LY8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LY8)) {
            return false;
        }
        C0LY8 c0ly8 = (C0LY8) obj;
        return Intrinsics.LJFF(this.LIZ, c0ly8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ly8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ly8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ly8.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ly8.LJ) && Intrinsics.LJFF(this.LJFF, c0ly8.LJFF) && Intrinsics.LJFF(this.LJI, c0ly8.LJI) && Intrinsics.LJFF(this.LJII, c0ly8.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0ly8.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0ly8.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0ly8.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0ly8.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0ly8.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0ly8.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0ly8.LJIILJJIL);
    }

    public /* synthetic */ C0LY8(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null);
    }

    public C0LY8(String str, Integer num, String str2, Boolean bool, Integer num2, Integer num3, Long l, Integer num4, Boolean bool2, List<String> list, Boolean bool3, AIGCOfflineModel aIGCOfflineModel, String str3, Boolean bool4, Boolean bool5) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = num2;
        this.LJFF = num3;
        this.LJI = l;
        this.LJII = num4;
        this.LJIIIIZZ = bool2;
        this.LJIIIZ = list;
        this.LJIIJ = bool3;
        this.LJIIJJI = aIGCOfflineModel;
        this.LJIIL = str3;
        this.LJIILIIL = bool4;
        this.LJIILJJIL = bool5;
    }

    public static C0LY8 LIZ(C0LY8 c0ly8, String str, Integer num, String str2, Boolean bool, Integer num2, Integer num3, Long l, Boolean bool2, List list, Boolean bool3, AIGCOfflineModel aIGCOfflineModel, String str3, Boolean bool4, int i) {
        Integer num4;
        Boolean bool5 = bool4;
        String str4 = str3;
        Long l2 = l;
        Integer num5 = num3;
        AIGCOfflineModel aIGCOfflineModel2 = aIGCOfflineModel;
        Integer num6 = num2;
        Boolean bool6 = bool3;
        Boolean bool7 = bool;
        List list2 = list;
        String str5 = str2;
        Boolean bool8 = bool2;
        Integer num7 = num;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = c0ly8.LIZ;
        }
        if ((i & 2) != 0) {
            num7 = c0ly8.LIZIZ;
        }
        if ((i & 4) != 0) {
            str5 = c0ly8.LIZJ;
        }
        if ((i & 8) != 0) {
            bool7 = c0ly8.LIZLLL;
        }
        if ((i & 16) != 0) {
            num6 = c0ly8.LJ;
        }
        if ((i & 32) != 0) {
            num5 = c0ly8.LJFF;
        }
        if ((i & 64) != 0) {
            l2 = c0ly8.LJI;
        }
        Boolean bool9 = null;
        if ((i & 128) != 0) {
            num4 = c0ly8.LJII;
        } else {
            num4 = null;
        }
        if ((i & 256) != 0) {
            bool8 = c0ly8.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            list2 = c0ly8.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            bool6 = c0ly8.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            aIGCOfflineModel2 = c0ly8.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = c0ly8.LJIIL;
        }
        if ((i & 8192) != 0) {
            bool9 = c0ly8.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            bool5 = c0ly8.LJIILJJIL;
        }
        c0ly8.getClass();
        return new C0LY8(str6, num7, str5, bool7, num6, num5, l2, num4, bool8, list2, bool6, aIGCOfflineModel2, str4, bool9, bool5);
    }
}
