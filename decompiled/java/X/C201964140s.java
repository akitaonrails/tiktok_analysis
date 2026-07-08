package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.zhihu.matisse.ui.MatisseActivity;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: X.140s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201964140s {
    public final C1737720vJy LIZ;
    public final C201963140r LIZIZ;

    public final void LIZ(AbstractC201966140u abstractC201966140u) {
        C201963140r c201963140r = this.LIZIZ;
        if (c201963140r.LJII == null) {
            c201963140r.LJII = new ArrayList();
        }
        ((ArrayList) this.LIZIZ.LJII).add(abstractC201966140u);
    }

    public final void LIZIZ(int i) {
        Fragment fragment;
        Activity activity = this.LIZ.LIZ.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MatisseActivity.class);
        WeakReference<Fragment> weakReference = this.LIZ.LIZIZ;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != null) {
            C1701330uNH.LIZ(intent, fragment);
            C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD1RLgXxyPWnTGNipO+Lxciw==", null));
        } else {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD1RLgXxyPWnTGNipO+Lxciw==", null));
        }
    }

    public C201964140s(C1737720vJy c1737720vJy, Set set) {
        this.LIZ = c1737720vJy;
        C201963140r c201963140r = C20149313sh.LIZ;
        c201963140r.LIZJ = false;
        c201963140r.LIZLLL = R.style.k3;
        c201963140r.LJFF = false;
        c201963140r.LJI = 1;
        c201963140r.LJII = null;
        c201963140r.LJIIIIZZ = 3;
        c201963140r.LJIIIZ = 0.5f;
        c201963140r.LJIIJ = true;
        c201963140r.LJIIJJI = Integer.MAX_VALUE;
        this.LIZIZ = c201963140r;
        c201963140r.LIZ = set;
        c201963140r.LIZIZ = true;
        c201963140r.LJ = -1;
    }
}
