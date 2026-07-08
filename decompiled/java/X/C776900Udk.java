package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Udk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C776900Udk {
    public final Context LIZ;
    public View LIZIZ;
    public int LJ;
    public int LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public TimeInterpolator LJIIJ;
    public InterfaceC778060Ufc LJIIL;
    public InterfaceC779170UhP LJIILIIL;
    public int LJIILJJIL;
    public int LIZJ = -2;
    public int LIZLLL = -2;
    public int LJI = 3;
    public long LJIIIZ = 300;
    public String LJIIJJI = C776920Udm.LIZIZ;

    public final void LIZ() {
        Map<String, AbstractC776850Udf> map = C776920Udm.LIZ;
        if (((HashMap) map).containsKey(this.LJIIJJI)) {
            C20441214yg.LJ("LiveFloatWindowManager", "Float window has been added!");
            return;
        }
        if (this.LIZIZ == null) {
            C20441214yg.LJ("LiveFloatWindowManager", "view can not be null!");
            return;
        }
        if (this.LIZ == null) {
            C20441214yg.LJ("LiveFloatWindowManager", "host is null!");
        } else {
            if (this.LIZIZ == null) {
                C20441214yg.LJ("LiveFloatWindowManager", "view can not be null!");
                return;
            }
            HashMap map2 = (HashMap) map;
            map2.put(this.LJIIJJI, new C778030UfZ(this));
        }
    }

    public C776900Udk(Context context) {
        this.LIZ = context;
    }
}
