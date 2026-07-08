package X;

import android.app.Activity;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KJK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJK extends C0KNX {
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public String LJIIJJI;
    public final String LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> LJIJ;
    public HashMap<String, Object> LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public Map<String, ? extends Object> LJIL;
    public String LJJ;
    public C0KMQ LJJI;
    public boolean LJJIFFI;
    public Map<String, String> LJJII;
    public String LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;

    @Override // X.C0KNX
    public final boolean LIZ() {
        return !Intrinsics.LJFF(this.LJIIJJI, "one_month");
    }

    public C0KJK(WeakReference<Activity> weakReference, String str, boolean z, boolean z2, String str2, boolean z3, String str3, String str4, String str5, Map<String, String> map) {
        super(weakReference, str5, map);
        this.LJI = str;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = str2;
        this.LJIIJ = z3;
        this.LJIIJJI = str3;
        this.LJIIL = str4;
        this.LJIJJ = "";
        this.LJIJJLI = "";
        this.LJIL = new LinkedHashMap();
        this.LJJ = "";
        this.LJJII = C2097608Jq.LJ();
        this.LJJIII = "";
    }
}
