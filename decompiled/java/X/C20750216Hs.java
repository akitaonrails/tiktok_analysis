package X;

import androidx.viewpager.widget.ViewPager;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.16Hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750216Hs implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C20750216Hs c20750216Hs) {
        C15QI c15qi = ((C15QK) c20750216Hs.l0).LLJJJ;
        if (c15qi != null) {
            c15qi.LIZIZ();
            return false;
        }
        return false;
    }

    public static final boolean onBackPressed$1(C20750216Hs c20750216Hs) {
        int currentItem;
        C16CO c16co = (C16CO) c20750216Hs.l0;
        C16CP c16cp = c16co.LLJJIII;
        if (c16cp != null) {
            ViewPager viewPager = c16co.LLJJI;
            if (viewPager != null) {
                currentItem = viewPager.getCurrentItem();
            } else {
                currentItem = 0;
            }
            Object obj = ((LinkedHashMap) c16cp.LLILZIL).get(Integer.valueOf(currentItem));
            if (obj == null) {
                obj = null;
            }
            C16CS c16cs = (C16CS) obj;
            if (c16cs != null) {
                c16cs.onBackPress();
                return true;
            }
            return true;
        }
        return true;
    }

    public C20750216Hs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
