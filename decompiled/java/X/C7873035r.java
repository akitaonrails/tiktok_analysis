package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.List;

/* JADX INFO: renamed from: X.035r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7873035r {
    public List<String> LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public Boolean LJ;
    public String LJFF;
    public long LJI;
    public PaymentInfo LJII;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;

    public C7873035r(List list, String str, boolean z, String str2, PaymentInfo paymentInfo, Integer num, String str3, int i) {
        list = (i & 1) != 0 ? null : list;
        str = (i & 2) != 0 ? null : str;
        z = (i & 4) != 0 ? false : z;
        str2 = (i & 16) != 0 ? null : str2;
        paymentInfo = (i & 256) != 0 ? null : paymentInfo;
        num = (i & 512) != 0 ? null : num;
        str3 = (i & 1024) != 0 ? null : str3;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = 0L;
        this.LJII = paymentInfo;
        this.LJIIIIZZ = num;
        this.LJIIIZ = str3;
        this.LJIIJ = false;
        this.LJIIJJI = null;
    }
}
