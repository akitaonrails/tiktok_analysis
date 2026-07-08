package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.coupon.SeaCouponInfo;
import java.util.List;

/* JADX INFO: renamed from: X.047y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10480047y {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<SeaCouponInfo> LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10480047y(List list, String str, String str2, int i) {
        List list2 = list;
        this(0L, (i & 32) != 0 ? C13BV.INSTANCE : list2, 0, 0, (i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "");
    }

    public C10480047y(long j, List list, int i, int i2, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = list;
    }

    public static C10480047y LIZ(C10480047y c10480047y, String str, int i, int i2, List list, int i3) {
        String str2;
        long j;
        List list2 = list;
        int i4 = i2;
        int i5 = i;
        String str3 = str;
        if ((i3 & 1) != 0) {
            str2 = c10480047y.LIZ;
        } else {
            str2 = null;
        }
        if ((i3 & 2) != 0) {
            str3 = c10480047y.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            j = c10480047y.LIZJ;
        } else {
            j = 0;
        }
        if ((i3 & 8) != 0) {
            i5 = c10480047y.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c10480047y.LJ;
        }
        if ((i3 & 32) != 0) {
            list2 = c10480047y.LJFF;
        }
        c10480047y.getClass();
        return new C10480047y(j, list2, i5, i4, str2, str3);
    }
}
