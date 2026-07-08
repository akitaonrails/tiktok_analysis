package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import java.util.Map;

/* JADX INFO: renamed from: X.0w65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767550w65 {
    public static final /* synthetic */ int LJJIJL = 0;
    public final boolean LIZ;
    public final EnumC1767410w5r LIZIZ;
    public final EnumC1767640w6E LIZJ;
    public String LIZLLL;
    public final Integer LJ;
    public String LJFF;
    public String LJI;
    public final Map<String, String> LJII;
    public Uri LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public EnumC1768230w7B LJIJI;
    public EnumC1768240w7C LJIJJ;
    public String LJIJJLI;
    public EnumC1154800g9m LJIL;
    public C1767500w60 LJJ;
    public DiversionTargetResCfg LJJI;
    public String LJJIFFI;
    public EnumC1155020gA8 LJJII;
    public Map<String, String> LJJIII;
    public EnumC1741050vPL LJJIIJ;
    public Integer LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public Map<String, ? extends Object> LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public String LJJIJIL;

    public C1767550w65(boolean z, EnumC1767410w5r enumC1767410w5r, EnumC1767640w6E enumC1767640w6E, String str, Integer num, String str2, String str3, Map map, Uri uri, int i) {
        EnumC1768230w7B enumC1768230w7B;
        EnumC1768240w7C enumC1768240w7C;
        EnumC1154800g9m enumC1154800g9m;
        EnumC1767410w5r enumC1767410w5r2 = enumC1767410w5r;
        String str4 = str;
        EnumC1767640w6E enumC1767640w6E2 = enumC1767640w6E;
        String str5 = str2;
        Integer num2 = num;
        Map map2 = map;
        String str6 = str3;
        Uri uri2 = uri;
        boolean z2 = (i & 1) != 0 ? false : z;
        enumC1767410w5r2 = (i & 2) != 0 ? EnumC1767410w5r.CLICK_TAB : enumC1767410w5r2;
        enumC1767640w6E2 = (i & 4) != 0 ? EnumC1767640w6E.NON : enumC1767640w6E2;
        str4 = (i & 8) != 0 ? null : str4;
        num2 = (i & 16) != 0 ? null : num2;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? "" : str6;
        map2 = (i & 128) != 0 ? null : map2;
        uri2 = (i & 256) != 0 ? null : uri2;
        if ((1048576 & i) != 0) {
            enumC1768230w7B = EnumC1768230w7B.DEFAULT;
        } else {
            enumC1768230w7B = null;
        }
        if ((2097152 & i) != 0) {
            enumC1768240w7C = EnumC1768240w7C.DEFAULT;
        } else {
            enumC1768240w7C = null;
        }
        if ((i & 8388608) != 0) {
            enumC1154800g9m = EnumC1154800g9m.NATURE;
        } else {
            enumC1154800g9m = null;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.LIZ = z2;
        this.LIZIZ = enumC1767410w5r2;
        this.LIZJ = enumC1767640w6E2;
        this.LIZLLL = str4;
        this.LJ = num2;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = map2;
        this.LJIIIIZZ = uri2;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = enumC1768230w7B;
        this.LJIJJ = enumC1768240w7C;
        this.LJIJJLI = null;
        this.LJIL = enumC1154800g9m;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ = null;
        this.LJJIIJZLJL = null;
        this.LJJIIZ = null;
        this.LJJIIZI = strValueOf;
        this.LJJIJ = null;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = null;
    }
}
