package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.04o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1207804o0 {
    public static final List<String> LIZ = Collections.singletonList("7397544677768958465");

    public static List LIZ() {
        Object c098200Yq;
        k kVar = (k) C0C64.LJIILLIIL().LJJII(n.class, null, "studio_editor_pro_caption_format_unsupported_resource_id", true);
        if (kVar == null || (kVar instanceof m)) {
            return LIZ;
        }
        try {
            c098200Yq = (List) C08JS.LIZIZ().LIZLLL(kVar, new TypeToken<List<? extends String>>() { // from class: X.04o1
            }.getType());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        List list = (List) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return list == null ? LIZ : list;
    }
}
