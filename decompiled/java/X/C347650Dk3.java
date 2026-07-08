package X;

import com.bytedance.ies.nle.editor_jni.NLEPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Dk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C347650Dk3 {
    public final EnumC355960DxS LIZ;
    public String LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJII;
    public long LJIIIIZZ;
    public double LJIIJ;
    public boolean LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public List<NLEPoint> LJIILLIIL;
    public String LJIIZILJ;
    public long LJI = -2;
    public float LJIIIZ = 1.0f;
    public float LJIIJJI = 1.0f;
    public float LJIILL = 1.0f;
    public List<C347630Dk1> LJIJ = new ArrayList();

    public String toString() {
        return "AudioParams(type=" + this.LIZ + ", filePath=" + this.LIZIZ + ", uuid=" + this.LIZJ + ", timeClipStart=" + this.LIZLLL + ", timeClipEnd=" + this.LJ + ", startTime=" + this.LJFF + ", endTime=" + this.LJI + ", volume=" + this.LJIIIZ + ", dbRange=" + this.LJIIJ + ", speed=" + this.LJIIJJI + ", filterList=" + this.LJIJ + ')';
    }

    public C347650Dk3(EnumC355960DxS enumC355960DxS) {
        this.LIZ = enumC355960DxS;
    }
}
