package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0StH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class C735570StH {
    public User LIZ;
    public LifecycleOwner LJIIIIZZ;
    public boolean LIZIZ = true;
    public EnumC1387060mCO LIZJ = EnumC1387060mCO.MESSAGE_ICE_BREAKING;
    public EnumC2274741E1w LIZLLL = EnumC2274741E1w.TUX_NORMAL;
    public final Map<String, String> LJ = new LinkedHashMap();
    public final Map<C0SY7, C1908890zm3> LJFF = new LinkedHashMap();
    public final Map<C0SY7, Integer> LJI = new LinkedHashMap();
    public final Map<C0SY7, Boolean> LJII = new LinkedHashMap();
    public final boolean LJIIIZ = true;
    public final C00IW LJIIJ = C00IW.TT_NORMAL;
    public final boolean LJIIJJI = true;

    public final C1908830zlx LIZ() {
        if (this.LIZ == null) {
            C2344809Gs.LJI(new IllegalStateException("relation button user is null"));
        }
        return new C1908830zlx(this.LIZ, this.LIZIZ, false, 1, false, this.LIZJ, this.LIZLLL, false, this.LJ, this.LJFF, this.LJI, this.LJII, false, this.LJIIIIZZ, null, this.LJIIIZ, false, null, false, this.LJIIJ, false, false, false, false, this.LJIIJJI, false, false, false, new C735600StK(null, null, null), false, false, null);
    }
}
