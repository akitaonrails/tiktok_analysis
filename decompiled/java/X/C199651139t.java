package X;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.139t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199651139t implements InterfaceC199653139v {
    public final Application LIZ;
    public final InterfaceC199652139u LIZIZ;
    public final C20121913oH LIZJ = new AbstractC199656139y() { // from class: X.13oH
        @Override // X.AbstractC199656139y, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 26) {
                FragmentManager fragmentManager = activity.getFragmentManager();
                final C199651139t c199651139t = this.LL;
                fragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: X.13oJ
                    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
                    public final void onFragmentDestroyed(FragmentManager fragmentManager2, Fragment fragment) {
                        c199651139t.LIZIZ(fragment);
                    }
                }, true);
            }
            if (activity instanceof C19EG) {
                final C199651139t c199651139t2 = this.LL;
                c199651139t2.getClass();
                ((C19EG) activity).getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.13oI
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager2, androidx.fragment.app.Fragment fragment) {
                        c199651139t2.LIZIZ(fragment);
                    }
                }, true);
            }
        }
    };
    public final Set<String> LIZLLL;

    @Override // X.InterfaceC199653139v
    public final void LIZ() {
        this.LIZ.registerActivityLifecycleCallbacks(this.LIZJ);
    }

    public final void LIZIZ(Object obj) {
        if (obj == null) {
            return;
        }
        String name = obj.getClass().getName();
        if (this.LIZLLL.isEmpty() || this.LIZLLL.contains(name)) {
            InterfaceC199652139u interfaceC199652139u = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(name);
            sbLIZ.append(" received Fragment#onDestroy()");
            ((C199657139z) interfaceC199652139u).LIZ(obj, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.13oH] */
    public C199651139t(Application application, C199657139z c199657139z, String[] strArr) {
        Set<String> setEmptySet;
        this.LIZ = application;
        this.LIZIZ = c199657139z;
        if (strArr != null && strArr.length != 0) {
            setEmptySet = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
        } else {
            setEmptySet = Collections.emptySet();
        }
        this.LIZLLL = setEmptySet;
    }
}
