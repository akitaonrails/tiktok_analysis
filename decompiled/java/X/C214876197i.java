package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.ui.LifeCycleCompatFragment;
import com.bytedance.scene.ui.ScopeHolderCompatFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.197i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214876197i {
    public final Fragment LIZ;
    public final Class<? extends C19A3> LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public InterfaceC214877197j LJ;
    public boolean LJFF = true;

    public final void LIZ() {
        Scene sceneLIZ;
        final Fragment fragment = this.LIZ;
        int i = this.LIZJ;
        Class<? extends C19A3> cls = this.LIZIZ;
        InterfaceC214877197j interfaceC214877197j = this.LJ;
        boolean z = this.LIZLLL;
        boolean z2 = this.LJFF;
        C12WP.LIZ();
        WeakHashMap<Fragment, HashSet<String>> weakHashMap = C0OC8.LIZ;
        if (weakHashMap.get(fragment) != null && weakHashMap.get(fragment).contains("LifeCycleCompatFragment")) {
            throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Fragment");
        }
        HashSet<String> hashSet = weakHashMap.get(fragment);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            C0OC8.LIZ.put(fragment, hashSet);
        }
        hashSet.add("LifeCycleCompatFragment");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        LifeCycleCompatFragment lifeCycleCompatFragment = (LifeCycleCompatFragment) childFragmentManager.LJJJJZI("LifeCycleCompatFragment");
        if (lifeCycleCompatFragment != null && !z) {
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(lifeCycleCompatFragment);
            if (z2) {
                c19ehLJIIJ.LJIIL();
            } else {
                c19ehLJIIJ.LJIIJ();
            }
            lifeCycleCompatFragment = null;
        }
        InterfaceC19394510uF interfaceC19394510uF = new InterfaceC19394510uF(fragment) { // from class: X.10uB
            public final Fragment LIZ;

            {
                this.LIZ = fragment;
            }

            @Override // X.InterfaceC19394510uF
            public final <T extends View> T LIZ(int i2) {
                T t = (T) this.LIZ.getView().findViewById(i2);
                if (t != null) {
                    return t;
                }
                try {
                    String resourceName = this.LIZ.getResources().getResourceName(i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" ");
                    sbLIZ.append(resourceName);
                    sbLIZ.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        };
        if (interfaceC214877197j == null || (sceneLIZ = interfaceC214877197j.LIZ(fragment.getClass().getClassLoader(), cls.getName(), null)) == null) {
            sceneLIZ = C2350509Ix.LIZ(null, cls);
        }
        if (lifeCycleCompatFragment != null) {
            lifeCycleCompatFragment.LL = new C19AK(i, interfaceC19394510uF, sceneLIZ, ScopeHolderCompatFragment.MR(fragment, false, z2), z);
            return;
        }
        ScopeHolderCompatFragment scopeHolderCompatFragmentMR = ScopeHolderCompatFragment.MR(fragment, !z, z2);
        LifeCycleCompatFragment lifeCycleCompatFragment2 = new LifeCycleCompatFragment();
        lifeCycleCompatFragment2.LL = new C19AK(i, interfaceC19394510uF, sceneLIZ, scopeHolderCompatFragmentMR, z);
        C19EH c19ehLJIIJ2 = childFragmentManager.LJIIJ();
        c19ehLJIIJ2.LIZJ(i, lifeCycleCompatFragment2, "LifeCycleCompatFragment");
        if (z2) {
            c19ehLJIIJ2.LJIIL();
        } else {
            c19ehLJIIJ2.LJIIJ();
        }
    }

    public C214876197i(Fragment fragment, Class cls, int i) {
        C19BL.LJI(fragment, "Fragment can't be null");
        this.LIZ = fragment;
        this.LIZIZ = cls;
        this.LIZJ = i;
    }
}
