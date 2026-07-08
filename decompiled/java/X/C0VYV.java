package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0VYV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYV extends AbstractC813200VvC {
    public C800390VaX LL;

    public C0VYV(C800390VaX c800390VaX) {
        this.LL = c800390VaX;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        String str;
        boolean z;
        Object c098200Yq;
        if (this.LL.LIZ) {
            Object tag = view.getTag(R.id.web_client_security);
            String canonicalName = null;
            if (tag != null && (tag instanceof String)) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z || !u.LJJIIJZLJL(str, "Fragment#", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fragment#");
                sbLIZ.append(fragment.getClass().getCanonicalName());
                view.setTag(R.id.web_client_security, C2188811AlT.LIZIZ(sbLIZ));
            }
            C0VYW.LIZ.getClass();
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (fragment.getActivity() != null) {
                C19EG activity = fragment.getActivity();
                if (activity != null) {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                String canonicalName2 = fragment.getClass().getCanonicalName();
                if (canonicalName != null && canonicalName.length() != 0 && canonicalName2 != null && canonicalName2.length() != 0) {
                    ConcurrentHashMap<String, List<String>> concurrentHashMap = C0VYW.LIZIZ;
                    if (concurrentHashMap.containsKey(canonicalName)) {
                        List<String> arrayList = concurrentHashMap.get(canonicalName);
                        if (arrayList != null) {
                            arrayList.add(canonicalName2);
                        } else {
                            arrayList = new ArrayList<>();
                        }
                        concurrentHashMap.put(canonicalName, arrayList);
                    } else {
                        concurrentHashMap.put(canonicalName, C1697810uHb.LJIILJJIL(canonicalName2));
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C0VZK.LIZ(thM5exceptionOrNullimpl, "fragment_recorder_onFragmentViewCreated_error", C2097608Jq.LJIIJ(new Pair("message", "fragment_recorder_onFragmentViewCreated_error")));
                    }
                }
            }
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
    }
}
