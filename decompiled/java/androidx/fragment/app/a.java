package androidx.fragment.app;

import X.C19EH;
import X.C19EW;
import X.C20135813qW;
import X.C2188811AlT;
import X.C2349809Iq;
import X.InterfaceC21506619Eq;
import X.InterfaceC988103tf;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class a extends C19EH implements InterfaceC988103tf, InterfaceC21506619Eq {
    public final FragmentManager LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;

    @Override // X.C19EH
    public final int LJIIIZ() {
        return LJJIIJ(false, true);
    }

    @Override // X.C19EH
    public final int LJIIJ() {
        return LJJIIJ(true, true);
    }

    @Override // X.C19EH
    public final void LJIIJJI() {
        if (this.LJIIIIZZ) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.LJIIIZ = false;
        this.LJIJI.LJJJJJ(this, false);
    }

    @Override // X.C19EH
    public final void LJIIL() {
        if (this.LJIIIIZZ) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.LJIIIZ = false;
        this.LJIJI.LJJJJJ(this, true);
    }

    @Override // X.C19EH
    public final boolean LJIILLIIL() {
        return this.LIZJ.isEmpty();
    }

    public final void LJJIII() {
        int size = this.LIZJ.size() - 1;
        while (size >= 0) {
            C19EW c19ew = (C19EW) ListProtector.get(this.LIZJ, size);
            if (c19ew.LIZJ) {
                if (c19ew.LIZ == 8) {
                    c19ew.LIZJ = false;
                    ListProtector.remove(this.LIZJ, size - 1);
                    size--;
                } else {
                    int i = c19ew.LIZIZ.mContainerId;
                    c19ew.LIZ = 2;
                    c19ew.LIZJ = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C19EW c19ew2 = (C19EW) ListProtector.get(this.LIZJ, i2);
                        if (c19ew2.LIZJ && c19ew2.LIZIZ.mContainerId == i) {
                            ListProtector.remove(this.LIZJ, i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.LJIJJLI >= 0) {
            sb.append(" #");
            sb.append(this.LJIJJLI);
        }
        if (this.LJIIJ != null) {
            sb.append(" ");
            sb.append(this.LJIIJ);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // X.InterfaceC988103tf
    public final String getName() {
        return this.LJIIJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(FragmentManager fragmentManager) {
        ClassLoader classLoader;
        C20135813qW c20135813qWLJJLIIIJJIZ = fragmentManager.LJJLIIIJJIZ();
        if (fragmentManager.LJJLIIIJLJLI() != null) {
            classLoader = fragmentManager.LJJLIIIJLJLI().LLILLJJLI.getClassLoader();
        } else {
            classLoader = null;
        }
        super(c20135813qWLJJLIIIJJIZ, classLoader);
        this.LJIJJLI = -1;
        this.LJIJI = fragmentManager;
    }

    @Override // X.C19EH
    public final void LJIILIIL(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.LJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            sbLIZ.append(fragment.toString());
            sbLIZ.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        super.LJIILIIL(fragment);
    }

    @Override // X.C19EH
    public final C19EH LJIILL(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.LJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            sbLIZ.append(fragment.toString());
            sbLIZ.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        super.LJIILL(fragment);
        return this;
    }

    @Override // X.C19EH
    public final C19EH LJIIZILJ(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.LJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sbLIZ.append(fragment.toString());
            sbLIZ.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        super.LJIIZILJ(fragment);
        return this;
    }

    @Override // X.C19EH
    public final C19EH LJJ(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.LJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
            sbLIZ.append(fragment.toString());
            sbLIZ.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        super.LJJ(fragment);
        return this;
    }

    @Override // X.C19EH
    public final C19EH LJJIFFI(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.LJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            sbLIZ.append(fragment.toString());
            sbLIZ.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        super.LJJIFFI(fragment);
        return this;
    }

    public final void LJJII(int i) {
        if (!this.LJIIIIZZ) {
            return;
        }
        int size = this.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C19EW) ListProtector.get(this.LIZJ, i2)).LIZIZ;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
            }
        }
    }

    @Override // X.InterfaceC21506619Eq
    public final boolean LIZ(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.LJIIIIZZ) {
            this.LJIJI.LIZJ(this);
            return true;
        }
        return true;
    }

    @Override // X.C19EH
    public final C19EH LJIL(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager == this.LJIJI) {
            if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot set maximum Lifecycle to ");
                sbLIZ.append(state);
                sbLIZ.append(" after the Fragment has been created");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (state != Lifecycle.State.DESTROYED) {
                super.LJIL(fragment, state);
                return this;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Cannot set maximum Lifecycle to ");
            sbLIZ2.append(state);
            sbLIZ2.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        sbLIZ3.append(this.LJIJI);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final int LJJIIJ(boolean z, boolean z2) {
        if (!this.LJIJJ) {
            if (FragmentManager.LJLI()) {
                PrintWriter printWriter = new PrintWriter(new C2349809Iq());
                LJJIIJZLJL("  ", printWriter, true);
                printWriter.close();
            }
            this.LJIJJ = true;
            if (this.LJIIIIZZ) {
                this.LJIJJLI = this.LJIJI.LJII();
            } else {
                this.LJIJJLI = -1;
            }
            if (z2) {
                this.LJIJI.LJJJJ(this, z);
            }
            return this.LJIJJLI;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void LJJIIJZLJL(String str, PrintWriter printWriter, boolean z) {
        String strLIZIZ;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.LJIIJ);
            printWriter.print(" mIndex=");
            printWriter.print(this.LJIJJLI);
            printWriter.print(" mCommitted=");
            printWriter.println(this.LJIJJ);
            if (this.LJII != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.LJII));
            }
            if (this.LIZLLL != 0 || this.LJ != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.LIZLLL));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.LJ));
            }
            if (this.LJFF != 0 || this.LJI != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.LJFF));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.LJI));
            }
            if (this.LJIIJJI != 0 || this.LJIIL != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.LJIIJJI));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.LJIIL);
            }
            if (this.LJIILIIL != 0 || this.LJIILJJIL != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.LJIILIIL));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.LJIILJJIL);
            }
        }
        if (!this.LIZJ.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.LIZJ.size();
            for (int i = 0; i < size; i++) {
                C19EW c19ew = (C19EW) ListProtector.get(this.LIZJ, i);
                switch (c19ew.LIZ) {
                    case 0:
                        strLIZIZ = "NULL";
                        break;
                    case 1:
                        strLIZIZ = "ADD";
                        break;
                    case 2:
                        strLIZIZ = "REPLACE";
                        break;
                    case 3:
                        strLIZIZ = "REMOVE";
                        break;
                    case 4:
                        strLIZIZ = "HIDE";
                        break;
                    case 5:
                        strLIZIZ = "SHOW";
                        break;
                    case 6:
                        strLIZIZ = "DETACH";
                        break;
                    case 7:
                        strLIZIZ = "ATTACH";
                        break;
                    case 8:
                        strLIZIZ = "SET_PRIMARY_NAV";
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLIZIZ = "UNSET_PRIMARY_NAV";
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strLIZIZ = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cmd=");
                        sbLIZ.append(c19ew.LIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(strLIZIZ);
                printWriter.print(" ");
                printWriter.println(c19ew.LIZIZ);
                if (z) {
                    if (c19ew.LIZLLL != 0 || c19ew.LJ != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c19ew.LIZLLL));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c19ew.LJ));
                    }
                    if (c19ew.LJFF != 0 || c19ew.LJI != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c19ew.LJFF));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c19ew.LJI));
                    }
                }
            }
        }
    }

    @Override // X.C19EH
    public final void LJIILJJIL(int i, Fragment fragment, String str, int i2) {
        super.LJIILJJIL(i, fragment, str, i2);
        fragment.mFragmentManager = this.LJIJI;
    }
}
