package X;

import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import java.util.List;

/* JADX INFO: renamed from: X.10Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19242510Pv extends C1869040yjm {
    public static final /* synthetic */ int LJI = 0;
    public final boolean LIZIZ;
    public final C19245810Rc LIZJ;
    public final List<NewUserInterestStruct> LIZLLL;
    public final List<Object> LJ;
    public final String LJFF;

    public C19242510Pv() {
        this(null, null, null, 63);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19242510Pv(C19245810Rc c19245810Rc, List list, String str, int i) {
        boolean z;
        C13BV c13bv;
        List list2 = list;
        C19245810Rc c19245810Rc2 = c19245810Rc;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        c19245810Rc2 = (i & 2) != 0 ? null : c19245810Rc2;
        list2 = (i & 4) != 0 ? C13BV.INSTANCE : list2;
        if ((i & 8) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(z, c19245810Rc2, list2, c13bv, null, (i & 32) == 0 ? str : null);
    }

    public C19242510Pv(boolean z, C19245810Rc c19245810Rc, List<NewUserInterestStruct> list, List<Object> list2, String str, String str2) {
        super(str);
        this.LIZIZ = z;
        this.LIZJ = c19245810Rc;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = str2;
    }
}
