package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: renamed from: X.0FE6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FE6 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("zh-CN", "zh-TW", "ja-JP", "ko-KR", "ar-SA", "th-TH", "my-MM", "bn-BD");

    public static List LIZ() {
        Object c098200Yq;
        k kVar = (k) C0C64.LJIILLIIL().LJJII(n.class, null, "studio_editor_pro_caption_format_unsupported_language", true);
        if (kVar == null || (kVar instanceof m)) {
            return LIZ;
        }
        try {
            c098200Yq = (List) C08JS.LIZIZ().LIZLLL(kVar, new TypeToken<List<? extends String>>() { // from class: X.0F2g
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
