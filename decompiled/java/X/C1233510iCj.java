package X;

import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233510iCj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC1234280iDy LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final Float LJIIJ;
    public final Integer LJIIJJI;
    public final Integer LJIIL;
    public final Integer LJIILIIL;
    public final Bundle LJIILJJIL;
    public final Integer LJIILL;

    public final int hashCode() {
        return Arrays.hashCode(new String[]{this.LIZ, this.LIZIZ});
    }

    public final String toString() {
        return "LinkParams(linkId=" + this.LIZ + ", uid=" + this.LIZIZ + ", secUid=" + this.LIZJ + ", checksum=" + this.LIZLLL + ", shareType=" + this.LJ + ", shareSource=" + this.LJFF + ", timestamp=" + this.LJI + ", legacyItemId=" + this.LJII + ", inviteScene=" + this.LJIIIIZZ + ", isRelowIterationExpEnabled=" + this.LJIIIZ + ", followToPlayDuration=" + this.LJIIJ + ", clickEmptyToPlay=" + this.LJIIJJI + ", profileClickable=" + this.LJIIL + ", dynamicCover=" + this.LJIILIIL + ", extra=" + this.LJIILJJIL + ", liveLinkRelationAB=" + this.LJIILL + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1233510iCj) {
            C1233510iCj c1233510iCj = (C1233510iCj) obj;
            if (Intrinsics.LJFF(c1233510iCj.LIZ, this.LIZ) && Intrinsics.LJFF(c1233510iCj.LIZIZ, this.LIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1233510iCj(String str, String str2, String str3, String str4, EnumC1234280iDy enumC1234280iDy, String str5, String str6, String str7, String str8, Boolean bool, Float f, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        Integer num5 = num2;
        Integer num6 = num;
        Float f2 = f;
        Integer num7 = num4;
        Integer num8 = num3;
        Boolean bool2 = (i & 512) != 0 ? Boolean.FALSE : bool;
        f2 = (i & 1024) != 0 ? null : f2;
        num6 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num6;
        num5 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num5;
        num8 = (i & 8192) != 0 ? null : num8;
        num7 = (i & 32768) != 0 ? null : num7;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = enumC1234280iDy;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = bool2;
        this.LJIIJ = f2;
        this.LJIIJJI = num6;
        this.LJIIL = num5;
        this.LJIILIIL = num8;
        this.LJIILJJIL = null;
        this.LJIILL = num7;
    }
}
