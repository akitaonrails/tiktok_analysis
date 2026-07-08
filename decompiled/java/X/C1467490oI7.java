package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0oI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467490oI7 {
    public static final EnumC1469010oKZ[] LJIIJ = {EnumC1469010oKZ.LLILZ, EnumC1469010oKZ.LLILZIL, EnumC1469010oKZ.LLILZLL, EnumC1469010oKZ.LLIZ, EnumC1469010oKZ.LLJI, EnumC1469010oKZ.LLJIJIL, EnumC1469010oKZ.LLJILJIL};
    public InterfaceC1467500oI8 LIZIZ;
    public int LIZJ;
    public int LJ;
    public int LJFF;
    public float LJI;
    public String LJII;
    public int LJIIIZ;
    public final C1467480oI6 LIZ = new C1467480oI6();
    public final HashMap<Double, Long> LIZLLL = new HashMap<>();
    public final ArrayList<String> LJIIIIZZ = new ArrayList<>();

    public final void LIZ(int i, int i2) {
        if (this.LIZJ != 0 && i != 0 && i2 != 0) {
            long jLIZIZ = this.LIZ.LIZIZ();
            this.LIZ.LIZ();
            if (jLIZIZ == 0) {
                return;
            }
            double dLIZJ = this.LIZIZ.LIZJ(i, i2);
            if (this.LIZLLL.size() <= 20) {
                this.LIZLLL.put(Double.valueOf(dLIZJ), Long.valueOf(jLIZIZ));
            }
            if (this.LJIIIIZZ.size() <= 20) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("w:");
                sbLIZ.append(i);
                sbLIZ.append(",h:");
                sbLIZ.append(i2);
                sbLIZ.append(",srf:");
                sbLIZ.append(1.0f);
                sbLIZ.append(",wt:");
                sbLIZ.append(jLIZIZ);
                this.LJIIIIZZ.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("this:");
            sbLIZ2.append(this);
            sbLIZ2.append(",record playback quality, score:");
            sbLIZ2.append(dLIZJ);
            sbLIZ2.append(", watchT:");
            sbLIZ2.append(jLIZIZ);
            TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
