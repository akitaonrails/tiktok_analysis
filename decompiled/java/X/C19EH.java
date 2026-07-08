package X;

import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.monitor.page.FragmentOpType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.FragmentAddRecorder;
import com.bytedance.tt.reliability.monitor.viewchecker.FragmentChecker;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19EH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19EH {
    public final C20135813qW LIZ;
    public final ClassLoader LIZIZ;
    public final ArrayList<C19EW> LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public CharSequence LJIIL;
    public int LJIILIIL;
    public CharSequence LJIILJJIL;
    public ArrayList<String> LJIILL;
    public ArrayList<String> LJIILLIIL;
    public boolean LJIIZILJ;
    public ArrayList<Runnable> LJIJ;

    public abstract int LJIIIZ();

    public abstract int LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    public boolean LJIILLIIL() {
        return this.LIZJ.isEmpty();
    }

    public C19EH() {
        this.LIZJ = new ArrayList<>();
        this.LJIIIZ = true;
        this.LJIIZILJ = false;
        this.LIZ = null;
        this.LIZIZ = null;
    }

    public final void LJFF(C19EW c19ew) {
        this.LIZJ.add(c19ew);
        c19ew.LIZLLL = this.LIZLLL;
        c19ew.LJ = this.LJ;
        c19ew.LJFF = this.LJFF;
        c19ew.LJI = this.LJI;
    }

    public final void LJII(String str) {
        if (this.LJIIIZ) {
            this.LJIIIIZZ = true;
            this.LJIIJ = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void LJIIIIZZ(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ATTACH);
        LJFF(new C19EW(7, fragment));
    }

    public void LJIILIIL(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_DETACH);
        LJFF(new C19EW(6, fragment));
    }

    public C19EH LJIILL(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_HIDE);
        LJFF(new C19EW(4, fragment));
        return this;
    }

    public C19EH LJIIZILJ(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_REMOVE);
        LJFF(new C19EW(3, fragment));
        return this;
    }

    public C19EH LJJ(Fragment fragment) {
        LJFF(new C19EW(8, fragment));
        return this;
    }

    public final void LJJI(int i) {
        try {
            if (C1389600mGU.LIZ() && (i == 4097 || i == 8194)) {
                i = 4099;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJII = i;
    }

    public C19EH LJJIFFI(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_SHOW);
        LJFF(new C19EW(5, fragment));
        return this;
    }

    public C19EH(C20135813qW c20135813qW, ClassLoader classLoader) {
        this.LIZJ = new ArrayList<>();
        this.LJIIIZ = true;
        this.LJIIZILJ = false;
        this.LIZ = c20135813qW;
        this.LIZIZ = classLoader;
    }

    public final void LIZIZ(int i, Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ADD);
        LJIILJJIL(i, fragment, null, 1);
    }

    public final void LIZLLL(Fragment fragment, String str) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ADD);
        LJIILJJIL(0, fragment, str, 1);
    }

    public final void LJI(View view, String str) {
        if (C20302914cN.LIZ != null || C20302914cN.LIZIZ != null) {
            String strLJIIJ = C14K9.LJIIJ(view);
            if (strLJIIJ != null) {
                if (this.LJIILL == null) {
                    this.LJIILL = new ArrayList<>();
                    this.LJIILLIIL = new ArrayList<>();
                } else if (!this.LJIILLIIL.contains(str)) {
                    if (this.LJIILL.contains(strLJIIJ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("A shared element with the source name '");
                        sbLIZ.append(strLJIIJ);
                        sbLIZ.append("' has already been added to the transaction.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("A shared element with the target name '");
                    sbLIZ2.append(str);
                    sbLIZ2.append("' has already been added to the transaction.");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LJIILL.add(strLJIIJ);
                this.LJIILLIIL.add(str);
                return;
            }
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
    }

    public final void LJIJI(Runnable runnable, boolean z) {
        if (!z) {
            if (!this.LJIIIIZZ) {
                this.LJIIIZ = false;
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = new ArrayList<>();
        }
        this.LJIJ.add(runnable);
    }

    public final void LJIJJ(int i, int i2) {
        try {
            if (C1389600mGU.LIZ()) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LJIJJLI(i, i2, 0, 0);
    }

    public C19EH LJIL(Fragment fragment, Lifecycle.State state) {
        LJFF(new C19EW(fragment, state));
        return this;
    }

    public final void LIZJ(int i, Fragment fragment, String str) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_ADD);
        LJIILJJIL(i, fragment, str, 1);
    }

    public final void LJ(Class cls, Bundle bundle, String str) {
        C20135813qW c20135813qW = this.LIZ;
        if (c20135813qW != null) {
            if (this.LIZIZ != null) {
                Fragment fragmentLIZ = c20135813qW.LIZ(cls.getName());
                fragmentLIZ.setArguments(bundle);
                LIZJ(R.id.content, fragmentLIZ, str);
                return;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public final void LJIJ(int i, Fragment fragment, String str) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOpReached(fragment, FragmentOpType.OP_REPLACE);
        if (i != 0) {
            LJIILJJIL(i, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void LJIILJJIL(int i, Fragment fragment, String str, int i2) {
        try {
            if (FragmentChecker.filterFragment(fragment, str)) {
                FragmentAddRecorder.record(fragment, str, i, FragmentChecker.getHostActivity(fragment), 24);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C19EM.LIZJ(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Can't change tag of fragment ");
                    sbLIZ.append(fragment);
                    sbLIZ.append(": was ");
                    sbLIZ.append(fragment.mTag);
                    sbLIZ.append(" now ");
                    sbLIZ.append(str);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Can't change container ID of fragment ");
                        sbLIZ2.append(fragment);
                        sbLIZ2.append(": was ");
                        sbLIZ2.append(fragment.mFragmentId);
                        sbLIZ2.append(" now ");
                        sbLIZ2.append(i);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Can't add fragment ");
                    sbLIZ3.append(fragment);
                    sbLIZ3.append(" with tag ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" to container view with no id");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            LJFF(new C19EW(i2, fragment));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Fragment ");
        sbLIZ4.append(cls.getCanonicalName());
        sbLIZ4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public final void LJIJJLI(int i, int i2, int i3, int i4) {
        try {
            if (C1389600mGU.LIZ()) {
                if (i != 0) {
                    i = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                }
                if (i3 != 0) {
                    i3 = 0;
                }
                if (i4 != 0) {
                    i4 = 0;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = i4;
    }
}
