package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387050mCN {
    public final User LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJIIJ;
    public LifecycleOwner LJIIJJI;
    public ViewModelStoreOwner LJIIL;
    public boolean LJIILJJIL;
    public C0ZD9 LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public Function0<Unit> LJJIIJZLJL;
    public boolean LIZIZ = true;
    public EnumC1387060mCO LJ = EnumC1387060mCO.MESSAGE_ICE_BREAKING;
    public EnumC2274741E1w LJFF = EnumC2274741E1w.TUX_NORMAL;
    public final Map<String, String> LJI = new LinkedHashMap();
    public final Map<C0SY7, C1908890zm3> LJII = new LinkedHashMap();
    public final Map<C0SY7, Integer> LJIIIIZZ = new LinkedHashMap();
    public final Map<C0SY7, Boolean> LJIIIZ = new LinkedHashMap();
    public boolean LJIILIIL = true;
    public final C00IW LJIIZILJ = C00IW.TT_NORMAL;
    public boolean LJIJJLI = true;
    public int LJJIFFI = 1;
    public C735600StK LJJII = new C735600StK(null, null, null);

    public final C1908830zlx LIZ() {
        User user = this.LIZ;
        boolean z = this.LIZIZ;
        boolean z2 = this.LIZJ;
        int i = this.LJJIFFI;
        boolean z3 = this.LIZLLL;
        EnumC1387060mCO enumC1387060mCO = this.LJ;
        EnumC2274741E1w enumC2274741E1w = this.LJFF;
        Map<String, String> map = this.LJI;
        Map<C0SY7, C1908890zm3> map2 = this.LJII;
        Map<C0SY7, Integer> map3 = this.LJIIIIZZ;
        Map<C0SY7, Boolean> map4 = this.LJIIIZ;
        boolean z4 = this.LJIIJ;
        LifecycleOwner lifecycleOwner = this.LJIIJJI;
        ViewModelStoreOwner viewModelStoreOwner = this.LJIIL;
        boolean z5 = this.LJIILIIL;
        boolean z6 = this.LJIILJJIL;
        C0ZD9 c0zd9 = this.LJIILL;
        boolean z7 = this.LJIILLIIL;
        C00IW c00iw = this.LJIIZILJ;
        C735600StK c735600StK = this.LJJII;
        boolean z8 = this.LJIJ;
        boolean z9 = this.LJJIIJ;
        return new C1908830zlx(user, z, z2, i, z3, enumC1387060mCO, enumC2274741E1w, false, map, map2, map3, map4, z4, lifecycleOwner, viewModelStoreOwner, z5, z6, c0zd9, z7, c00iw, false, z8, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJJI, this.LJJ, this.LJIL, c735600StK, this.LJJIII, z9, this.LJJIIJZLJL);
    }

    public C1387050mCN(User user) {
        this.LIZ = user;
    }

    public final void LIZIZ(Map map) {
        Map<C0SY7, Integer> map2 = this.LJIIIIZZ;
        if (map == null) {
            return;
        }
        map2.putAll(map);
    }
}
