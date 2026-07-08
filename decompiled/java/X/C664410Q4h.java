package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Q4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664410Q4h {
    public static final void LIZ(C0Q45 c0q45, EnumC664420Q4i enumC664420Q4i, Throwable th, String str) {
        LIZIZ(c0q45, enumC664420Q4i, th, str, C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
    }

    public static final void LIZIZ(InterfaceC654480Plm interfaceC654480Plm, C0Q0Q c0q0q, Throwable th, String str, Map<String, String> map, Map<String, String> map2, String str2) {
        String simpleName;
        try {
            C13DA c13da = new C13DA();
            c13da.putAll(map2);
            c13da.put("biz_catalog", interfaceC654480Plm.getCatalog());
            c13da.put("biz_subcategory", interfaceC654480Plm.getSubcategory());
            c13da.put("tech_catalog", c0q0q.getCatalog());
            c13da.put("tech_subcategory", c0q0q.getSubcategory());
            if (th != null) {
                simpleName = th.getClass().getSimpleName();
            } else {
                simpleName = "";
            }
            c13da.put("exception_class_name", simpleName);
            Npth.reportBizException(str2, th, str, (Map<String, String>) c13da.build(), map);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
