package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360210EAh {
    public final C375830EoP<EnumC360240EAk> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<ResourceItem> LIZLLL;
    public final C375830EoP<C360160EAc> LJ;
    public final C375830EoP<C360150EAb> LJFF;
    public final C375830EoP<Boolean> LJI;
    public final C375830EoP<Boolean> LJII;
    public final boolean LJIIIIZZ;
    public final List<Float> LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;

    public C360210EAh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C360210EAh)) {
            return false;
        }
        C360210EAh c360210EAh = (C360210EAh) obj;
        return Intrinsics.LJFF(this.LIZ, c360210EAh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c360210EAh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c360210EAh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c360210EAh.LIZLLL) && Intrinsics.LJFF(this.LJ, c360210EAh.LJ) && Intrinsics.LJFF(this.LJFF, c360210EAh.LJFF) && Intrinsics.LJFF(this.LJI, c360210EAh.LJI) && Intrinsics.LJFF(this.LJII, c360210EAh.LJII) && this.LJIIIIZZ == c360210EAh.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c360210EAh.LJIIIZ) && this.LJIIJ == c360210EAh.LJIIJ && this.LJIIJJI == c360210EAh.LJIIJJI && this.LJIIL == c360210EAh.LJIIL && this.LJIILIIL == c360210EAh.LJIILIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        List<Float> list = this.LJIIIZ;
        return ((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public final String toString() {
        return "RetouchPanelStates(pageStatus=" + this.LIZ + ", isResListShow=" + this.LIZIZ + ", updateResListWhiteDot=" + this.LIZJ + ", resourceListSelectItem=" + this.LIZLLL + ", autoRetouchUIStatus=" + this.LJ + ", seekbarUIStatus=" + this.LJFF + ", resetUIStatus=" + this.LJI + ", retryPrimaryResList=" + this.LJII + ", isAllResourceInitialed=" + this.LJIIIIZZ + ", scaleUpSurfaceView=" + this.LJIIIZ + ", isAutoLoadingVisible=" + this.LJIIJ + ", isShowBgAndMask=" + this.LJIIJJI + ", autoRetouchProgress=" + this.LJIIL + ", shouldShowStar=" + this.LJIILIIL + ')';
    }

    public /* synthetic */ C360210EAh(int i) {
        C375830EoP c375830EoP = new C375830EoP(EnumC360240EAk.PRIMARY);
        C375830EoP c375830EoP2 = new C375830EoP(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this(c375830EoP, c375830EoP2, new C375830EoP(bool), new C375830EoP(new ResourceItem()), new C375830EoP(new C360160EAc(false, false, false)), new C375830EoP(new C360150EAb(3)), new C375830EoP(bool), new C375830EoP(bool), false, null, false, false, 0, true);
    }

    public C360210EAh(C375830EoP<EnumC360240EAk> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<ResourceItem> c375830EoP4, C375830EoP<C360160EAc> c375830EoP5, C375830EoP<C360150EAb> c375830EoP6, C375830EoP<Boolean> c375830EoP7, C375830EoP<Boolean> c375830EoP8, boolean z, List<Float> list, boolean z2, boolean z3, int i, boolean z4) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
        this.LJFF = c375830EoP6;
        this.LJI = c375830EoP7;
        this.LJII = c375830EoP8;
        this.LJIIIIZZ = z;
        this.LJIIIZ = list;
        this.LJIIJ = z2;
        this.LJIIJJI = z3;
        this.LJIIL = i;
        this.LJIILIIL = z4;
    }

    public static C360210EAh LIZ(C360210EAh c360210EAh, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, C375830EoP c375830EoP8, boolean z, List list, boolean z2, boolean z3, int i, boolean z4, int i2) {
        boolean z5 = z4;
        int i3 = i;
        boolean z6 = z3;
        boolean z7 = z2;
        List list2 = list;
        boolean z8 = z;
        C375830EoP c375830EoP9 = c375830EoP8;
        C375830EoP c375830EoP10 = c375830EoP7;
        C375830EoP c375830EoP11 = c375830EoP6;
        C375830EoP c375830EoP12 = c375830EoP5;
        C375830EoP c375830EoP13 = c375830EoP4;
        C375830EoP c375830EoP14 = c375830EoP3;
        C375830EoP c375830EoP15 = c375830EoP2;
        C375830EoP c375830EoP16 = c375830EoP;
        if ((i2 & 1) != 0) {
            c375830EoP16 = c360210EAh.LIZ;
        }
        if ((i2 & 2) != 0) {
            c375830EoP15 = c360210EAh.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            c375830EoP14 = c360210EAh.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c375830EoP13 = c360210EAh.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP12 = c360210EAh.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP11 = c360210EAh.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP10 = c360210EAh.LJI;
        }
        if ((i2 & 128) != 0) {
            c375830EoP9 = c360210EAh.LJII;
        }
        if ((i2 & 256) != 0) {
            z8 = c360210EAh.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            list2 = c360210EAh.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            z7 = c360210EAh.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c360210EAh.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i3 = c360210EAh.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            z5 = c360210EAh.LJIILIIL;
        }
        c360210EAh.getClass();
        return new C360210EAh(c375830EoP16, c375830EoP15, c375830EoP14, c375830EoP13, c375830EoP12, c375830EoP11, c375830EoP10, c375830EoP9, z8, list2, z7, z6, i3, z5);
    }
}
