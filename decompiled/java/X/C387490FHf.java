package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0FHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387490FHf {
    public final EnumC371580EhY LIZ;
    public final List<C0FGS> LIZIZ;
    public final List<C0FGZ> LIZJ;
    public final Integer LIZLLL;
    public final C387180FGa LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C375830EoP<Unit> LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final C375830EoP<Integer> LJIIIZ;
    public final C375830EoP<Unit> LJIIJ;
    public final int LJIIJJI;

    public C387490FHf() {
        this(0);
    }

    public /* synthetic */ C387490FHf(int i) {
        this(EnumC371580EhY.HIDE, null, null, null, null, false, false, null, null, null, null, 0);
    }

    public C387490FHf(EnumC371580EhY enumC371580EhY, List<C0FGS> list, List<C0FGZ> list2, Integer num, C387180FGa c387180FGa, boolean z, boolean z2, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Integer> c375830EoP3, C375830EoP<Unit> c375830EoP4, int i) {
        this.LIZ = enumC371580EhY;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = num;
        this.LJ = c387180FGa;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = c375830EoP;
        this.LJIIIIZZ = c375830EoP2;
        this.LJIIIZ = c375830EoP3;
        this.LJIIJ = c375830EoP4;
        this.LJIIJJI = i;
    }

    public static C387490FHf LIZ(C387490FHf c387490FHf, EnumC371580EhY enumC371580EhY, List list, List list2, Integer num, C387180FGa c387180FGa, boolean z, boolean z2, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, int i, int i2) {
        int i3 = i;
        C375830EoP c375830EoP5 = c375830EoP4;
        C375830EoP c375830EoP6 = c375830EoP3;
        C375830EoP c375830EoP7 = c375830EoP2;
        C375830EoP c375830EoP8 = c375830EoP;
        boolean z3 = z2;
        boolean z4 = z;
        C387180FGa c387180FGa2 = c387180FGa;
        Integer num2 = num;
        List list3 = list2;
        List list4 = list;
        EnumC371580EhY enumC371580EhY2 = enumC371580EhY;
        if ((i2 & 1) != 0) {
            enumC371580EhY2 = c387490FHf.LIZ;
        }
        if ((i2 & 2) != 0) {
            list4 = c387490FHf.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            list3 = c387490FHf.LIZJ;
        }
        if ((i2 & 8) != 0) {
            num2 = c387490FHf.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c387180FGa2 = c387490FHf.LJ;
        }
        if ((i2 & 32) != 0) {
            z4 = c387490FHf.LJFF;
        }
        if ((i2 & 64) != 0) {
            z3 = c387490FHf.LJI;
        }
        if ((i2 & 128) != 0) {
            c375830EoP8 = c387490FHf.LJII;
        }
        if ((i2 & 256) != 0) {
            c375830EoP7 = c387490FHf.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c375830EoP6 = c387490FHf.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            c375830EoP5 = c387490FHf.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i3 = c387490FHf.LJIIJJI;
        }
        c387490FHf.getClass();
        return new C387490FHf(enumC371580EhY2, list4, list3, num2, c387180FGa2, z4, z3, c375830EoP8, c375830EoP7, c375830EoP6, c375830EoP5, i3);
    }
}
