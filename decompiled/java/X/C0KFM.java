package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KFM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KFM extends C0KNY {
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final List<? extends C0KQD> LJIILJJIL;
    public Long LJIILL;
    public Integer LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public String LJIJI;
    public Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> LJIJJ;
    public HashMap<String, Object> LJIJJLI;
    public String LJIL;
    public String LJJ;
    public Map<String, String> LJJI;
    public String LJJIFFI;
    public C0KLW LJJII;
    public C0KOJ LJJIII;
    public boolean LJJIIJ;
    public Map<String, String> LJJIIJZLJL;
    public String LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;

    @Override // X.C0KNY
    public final boolean LIZ() {
        return !Intrinsics.LJFF(this.LJIIJJI, "one_month");
    }

    public C0KFM(WeakReference<Activity> weakReference, String str, boolean z, boolean z2, String str2, boolean z3, String str3, String str4, String str5, List<? extends C0KQD> list, String str6, Map<String, String> map) {
        super(weakReference, str6, map);
        this.LJI = str;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = str2;
        this.LJIIJ = z3;
        this.LJIIJJI = str3;
        this.LJIIL = str4;
        this.LJIILIIL = str5;
        this.LJIILJJIL = list;
        this.LJIL = "";
        this.LJJ = "";
        this.LJJI = new LinkedHashMap();
        this.LJJIFFI = "";
        this.LJJIIJZLJL = C2097608Jq.LJ();
        this.LJJIIZ = "";
    }
}
