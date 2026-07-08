package X;

import androidx.fragment.app.Fragment;
import com.bytedance.provider.impl.GScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555400qZu extends C1554710qYn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1555590qaD LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1555400qZu.class, "fragmentWeak", "getFragmentWeak()Landroidx/fragment/app/Fragment;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final Fragment LIZIZ() {
        C1555590qaD c1555590qaD = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        Fragment fragment = (Fragment) c1555590qaD.LIZ.get();
        if (fragment != null) {
            return fragment;
        }
        throw new RuntimeException("fragment is already destroyed!");
    }

    @Override // X.C1554710qYn, X.InterfaceC665370Q7z
    public final Object getHost() {
        C1555590qaD c1555590qaD = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return c1555590qaD.LIZ.get();
    }

    @Override // X.C1554710qYn, X.InterfaceC665370Q7z
    public final C1554890qZ5 getTree() {
        return (C1554890qZ5) this.LLILZIL.getValue();
    }

    public final void LIZ(final C1555400qZu c1555400qZu) {
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        if (Intrinsics.LJFF(c1555400qZu.getTree().LJIIIIZZ(), GScope.LL) && this != null) {
            C128Y c128yLIZIZ = c1555400qZu.LIZIZ();
            if ((c128yLIZIZ instanceof C0Q8A) && !((C0Q8A) c128yLIZIZ).Dw()) {
                return;
            }
            if (C1557550qdN.LJFF) {
                c1555400qZu.getTree().LIZ(new InterfaceC1554770qYt() { // from class: X.0qZr
                    @Override // X.InterfaceC1554770qYt
                    public final InterfaceC665370Q7z LIZ() {
                        Fragment parentFragment = this.LIZ.LIZIZ().getParentFragment();
                        if (parentFragment != null) {
                            return C1558360qeg.LJFF(parentFragment, null);
                        }
                        C19EG activity = this.LIZ.LIZIZ().getActivity();
                        if (activity != null) {
                            return C1558360qeg.LJI(activity, null);
                        }
                        throw new RuntimeException("fragment is not attached to host");
                    }
                });
                return;
            }
            Fragment parentFragment = c1555400qZu.LIZIZ().getParentFragment();
            if (parentFragment != null) {
                interfaceC665370Q7zLJI = C1558360qeg.LJFF(parentFragment, null);
            } else {
                C19EG activity = c1555400qZu.LIZIZ().getActivity();
                if (activity != null) {
                    interfaceC665370Q7zLJI = C1558360qeg.LJI(activity, null);
                } else {
                    throw new RuntimeException("fragment is not attached to host");
                }
            }
            c1555400qZu.getTree().LIZIZ(interfaceC665370Q7zLJI);
        }
    }

    public C1555400qZu(Fragment fragment, String str) {
        super(str);
        this.LLILZ = new C1555590qaD(new C1555430qZx(fragment));
        this.LLILZIL = C452501pT.LIZIZ(new C1555390qZt(this));
        if (LIZIZ().getHost() != null) {
            C665410Q8d.LIZIZ(new C1555500qa4(fragment, this));
            LIZ(this);
        } else {
            "this fragment is not attached to host!".toString();
            throw new IllegalStateException("this fragment is not attached to host!");
        }
    }
}
