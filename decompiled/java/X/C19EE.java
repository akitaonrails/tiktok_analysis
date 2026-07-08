package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManagerViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.19EE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19EE {
    public final ArrayList<Fragment> LIZ = new ArrayList<>();
    public final HashMap<String, C19EC> LIZIZ = new HashMap<>();
    public final HashMap<String, Bundle> LIZJ = new HashMap<>();
    public FragmentManagerViewModel LIZLLL;

    public final List<C19EC> LIZLLL() {
        ArrayList arrayList = new ArrayList();
        for (C19EC c19ec : this.LIZIZ.values()) {
            if (c19ec != null) {
                arrayList.add(c19ec);
            }
        }
        return arrayList;
    }

    public final List<Fragment> LJ() {
        ArrayList arrayList = new ArrayList();
        for (C19EC c19ec : this.LIZIZ.values()) {
            if (c19ec != null) {
                arrayList.add(c19ec.LIZJ);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> LJFF() {
        ArrayList arrayList;
        if (this.LIZ.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.LIZ) {
            try {
                arrayList = new ArrayList(this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LIZ(Fragment fragment) {
        if (!this.LIZ.contains(fragment)) {
            synchronized (this.LIZ) {
                try {
                    this.LIZ.add(fragment);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            fragment.mAdded = true;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment already added: ");
        sbLIZ.append(fragment);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Fragment LIZIZ(String str) {
        C19EC c19ec = this.LIZIZ.get(str);
        if (c19ec != null) {
            return c19ec.LIZJ;
        }
        return null;
    }

    public final Fragment LIZJ(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C19EC c19ec : this.LIZIZ.values()) {
            if (c19ec != null && (fragmentFindFragmentByWho = c19ec.LIZJ.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final void LJI(C19EC c19ec) {
        Fragment fragment = c19ec.LIZJ;
        if (this.LIZIZ.get(fragment.mWho) != null) {
            return;
        }
        this.LIZIZ.put(fragment.mWho, c19ec);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                FragmentManagerViewModel fragmentManagerViewModel = this.LIZLLL;
                if (!fragmentManagerViewModel.LLILZLL && !fragmentManagerViewModel.LL.containsKey(fragment.mWho)) {
                    fragmentManagerViewModel.LL.put(fragment.mWho, fragment);
                }
            } else {
                this.LIZLLL.wQ2(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
    }

    public final void LJII(C19EC c19ec) {
        Fragment fragment = c19ec.LIZJ;
        if (fragment.mRetainInstance) {
            this.LIZLLL.wQ2(fragment);
        }
        if (this.LIZIZ.get(fragment.mWho) != c19ec) {
            return;
        }
        this.LIZIZ.put(fragment.mWho, null);
    }

    public final Bundle LJIIIIZZ(Bundle bundle, String str) {
        if (bundle != null) {
            return this.LIZJ.put(str, bundle);
        }
        return this.LIZJ.remove(str);
    }
}
