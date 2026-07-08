package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0QCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC666570QCp implements C0QD4 {
    public abstract String LIZJ(Aweme aweme, String str, C653660PkS c653660PkS);

    @Override // X.C0QD4
    public final boolean LIZ(String str) {
        String str2;
        if (TextUtils.equals(str, "search_result") || TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_ecommerce") || C1ER1.LIZIZ.LLJJL(str)) {
            return true;
        }
        if (!TextUtils.equals(str, "trending_page") && !TextUtils.equals(str, "compilation_detail") && !TextUtils.equals(str, "from_city_card")) {
            return false;
        }
        C650950Pg5.Companion.getClass();
        C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
        if (c0prwLIZIZ != null) {
            str2 = c0prwLIZIZ.searchId;
        } else {
            str2 = null;
        }
        return !TextUtils.isEmpty(str2);
    }

    @Override // X.C0QD4
    public final String LIZIZ(Aweme aweme, String str, int i, InterfaceC631150OpF interfaceC631150OpF) {
        C653660PkS c653660PkS;
        Map<String, Object> mapLIZLLL;
        Object obj;
        Object obj2;
        C653660PkS c653660PkS2 = null;
        if (interfaceC631150OpF != null && (interfaceC631150OpF instanceof C653660PkS)) {
            c653660PkS = (C653660PkS) interfaceC631150OpF;
            if (c653660PkS == null) {
            }
            return LIZJ(aweme, str, c653660PkS);
        }
        c653660PkS = null;
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if ((interfaceC649890PeNLIZ == null || (mapLIZLLL = interfaceC649890PeNLIZ.LIZLLL()) == null || (obj = mapLIZLLL.get(C653670PkT.class.getSimpleName())) == null || !(obj instanceof WeakReference) || (obj2 = ((Reference) obj).get()) == null || !(obj2 instanceof C653660PkS) || (c653660PkS = (C653660PkS) obj2) == null) && aweme != null) {
            WeakReference<C653660PkS> weakReference = C666560QCo.LJIJJ.get(aweme.getAid());
            if (weakReference != null) {
                c653660PkS2 = weakReference.get();
            }
            c653660PkS = c653660PkS2;
        }
        return LIZJ(aweme, str, c653660PkS);
    }
}
