package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.00eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C131800eq {
    public static final List<String> LIZ() {
        Object c098200Yq;
        List<String> listAsList;
        try {
            c098200Yq = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("ttclid_regex_block_list", String[].class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object[] objArr = (Object[]) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return (objArr == null || (listAsList = Arrays.asList(objArr)) == null) ? C13BV.INSTANCE : listAsList;
    }
}
