package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.IconSize;

/* JADX INFO: renamed from: X.18QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18QZ {
    public Image LIZ;
    public Image LIZIZ;
    public IconSize LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Integer LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public Integer LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public int LJIJJLI;
    public Integer LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public float LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJFF = -1;
    public String LJIILIIL = "";

    public static Integer LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static C212339187t LIZIZ(Integer num, Integer num2, String str) {
        if (str != null && str.length() != 0 && num != null && num2 != null) {
            C1003920cEQ c1003920cEQ = InterfaceC1003930cER.LJIILIIL;
            int iIntValue = num.intValue();
            c1003920cEQ.getClass();
            return new C212339187t(str, C1003920cEQ.LIZ(iIntValue), num2.intValue());
        }
        return null;
    }

    public static C212338187s LIZ(float f, int i, Integer num, Integer num2) {
        if (num == null && f <= 0.0f) {
            return null;
        }
        return new C212338187s(f, i, num, num2);
    }
}
