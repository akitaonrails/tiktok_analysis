package X;

import android.widget.FrameLayout;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0IEU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEU {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public EnumC918990a1R LJI;
    public String LJII;
    public InterfaceC463550IFt LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public final boolean LJIIJJI;

    public final String toString() {
        return "AudienceLayoutParams(width=" + this.LIZ + ", height=" + this.LIZIZ + ", topMargin=" + this.LIZJ + ", leftMargin=" + this.LIZLLL + ", rightMargin=" + this.LJ + ", isFullScreen=" + this.LJFF + ", layoutName=" + this.LJI + ", from=" + this.LJII + ", changeListener=" + this.LJIIIIZZ + ", enableSeiFilter=" + this.LJIIIZ + ", source=" + this.LJIIJ + ", forceChangeLayoutParams=" + this.LJIIJJI + ')';
    }

    public final FrameLayout.LayoutParams LIZ() {
        if (!this.LJFF) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.LIZ, this.LIZIZ);
            layoutParams.gravity = 51;
            layoutParams.leftMargin = this.LIZLLL;
            layoutParams.rightMargin = this.LJ;
            layoutParams.topMargin = this.LIZJ;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.rightMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = 0;
        layoutParams2.topMargin = 0;
        return layoutParams2;
    }

    public /* synthetic */ C0IEU(int i, int i2, int i3, int i4, int i5, boolean z, EnumC918990a1R enumC918990a1R, String str, InterfaceC463550IFt interfaceC463550IFt, String str2, boolean z2, int i6) {
        this(i, i2, i3, i4, i5, z, enumC918990a1R, (i6 & 128) != 0 ? "multi-guest v3 widget" : str, (i6 & 256) != 0 ? null : interfaceC463550IFt, false, (i6 & 1024) != 0 ? "" : str2, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2);
    }

    public C0IEU(int i, int i2, int i3, int i4, int i5, boolean z, EnumC918990a1R enumC918990a1R, String str, InterfaceC463550IFt interfaceC463550IFt, boolean z2, String str2, boolean z3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = z;
        this.LJI = enumC918990a1R;
        this.LJII = str;
        this.LJIIIIZZ = interfaceC463550IFt;
        this.LJIIIZ = z2;
        this.LJIIJ = str2;
        this.LJIIJJI = z3;
    }
}
