package X;

import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;

/* JADX INFO: renamed from: X.19qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21665519qf {
    public final NLETrackSlot LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final Size LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final InterfaceC1461390o8H LJFF;
    public final C375830EoP<C21665719qh> LJI;
    public final C375830EoP<Unit> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public static C21665519qf LIZ(C21665519qf c21665519qf, NLETrackSlot nLETrackSlot, C375830EoP c375830EoP, Size size, C375830EoP c375830EoP2, C375830EoP c375830EoP3, String str, String str2, int i) {
        boolean z;
        boolean z2;
        InterfaceC1461390o8H interfaceC1461390o8H;
        String str3 = str2;
        String str4 = str;
        C375830EoP c375830EoP4 = c375830EoP3;
        Size size2 = size;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        if ((i & 1) != 0) {
            nLETrackSlot2 = c21665519qf.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP6 = c21665519qf.LIZIZ;
        }
        if ((i & 4) != 0) {
            size2 = c21665519qf.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c21665519qf.LIZLLL;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = c21665519qf.LJ;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            interfaceC1461390o8H = c21665519qf.LJFF;
        } else {
            interfaceC1461390o8H = null;
        }
        if ((i & 64) != 0) {
            c375830EoP5 = c21665519qf.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP4 = c21665519qf.LJII;
        }
        if ((i & 256) != 0) {
            str4 = c21665519qf.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            str3 = c21665519qf.LJIIIZ;
        }
        c21665519qf.getClass();
        return new C21665519qf(nLETrackSlot2, c375830EoP6, size2, z, z2, interfaceC1461390o8H, c375830EoP5, c375830EoP4, str4, str3);
    }

    public C21665519qf(NLETrackSlot nLETrackSlot, C375830EoP<Boolean> c375830EoP, Size size, boolean z, boolean z2, InterfaceC1461390o8H interfaceC1461390o8H, C375830EoP<C21665719qh> c375830EoP2, C375830EoP<Unit> c375830EoP3, String str, String str2) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = c375830EoP;
        this.LIZJ = size;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = interfaceC1461390o8H;
        this.LJI = c375830EoP2;
        this.LJII = c375830EoP3;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
    }
}
