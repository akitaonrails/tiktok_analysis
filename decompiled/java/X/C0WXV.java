package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WXV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXV implements C0WWR {
    public C2211641BhC LIZ;
    public C2211641BhC LIZIZ;
    public String LIZJ;
    public final /* synthetic */ InterfaceC824510WWb LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ Fragment LJFF;

    @Override // X.C0WWR
    public final void LIZLLL() {
        C2211641BhC c2211641BhC;
        String str = this.LIZJ;
        if (str != null && (c2211641BhC = this.LIZIZ) != null) {
            C2211621BhA.LIZ.getClass();
            if (!Intrinsics.LJFF(C2211621BhA.LJFF(str), c2211641BhC)) {
                C2211621BhA.LJII.put(str, c2211641BhC);
            }
            C2211621BhA.LJFF = c2211641BhC;
            C2211621BhA.LIZJ = c2211641BhC;
            if (Unit.LIZ != null) {
                return;
            }
        }
        C2211621BhA c2211621BhA = C2211621BhA.LIZ;
        C2211641BhC c2211641BhC2 = this.LIZ;
        c2211621BhA.getClass();
        C2211621BhA.LJFF = c2211641BhC2;
    }

    @Override // X.C0WWR
    public final void LIZIZ(final Fragment fragment) {
        if (fragment instanceof TuxSheet) {
            fragment.getChildFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.0WXW
                @Override // X.AbstractC813200VvC
                public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment2, View view, Bundle bundle) {
                    this.LL.LJFF(fragment2);
                    fragment.getChildFragmentManager().LLIILZL(this);
                }
            }, false);
        }
    }

    @Override // X.C0WWR
    public final void LJ(Fragment fragment) {
        if (!(fragment instanceof TuxSheet)) {
            if (fragment instanceof SparkPopup) {
                LJFF(fragment);
                return;
            }
            LJFF(fragment);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcUgShopTabPopupManager, fragment's type error: ");
            sbLIZ.append(fragment.getClass());
            sbLIZ.append(", schema: ");
            sbLIZ.append(this.LJ);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJFF(Fragment fragment) {
        String strValueOf = String.valueOf(fragment.hashCode());
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLJFF = C2211621BhA.LJFF(strValueOf);
        if (c2211641BhCLJFF == null) {
            View view = fragment.getView();
            if (view != null) {
                c2211641BhCLJFF = C2211621BhA.LIZLLL(view, null);
            } else {
                c2211641BhCLJFF = null;
            }
        }
        C2211641BhC c2211641BhC = C2211621BhA.LJ;
        this.LIZ = c2211641BhC;
        if (c2211641BhCLJFF != null) {
            this.LIZJ = strValueOf;
            this.LIZIZ = c2211641BhCLJFF;
            c2211641BhCLJFF.LIZLLL(c2211641BhC);
            C2211621BhA.LJ = null;
            C2211621BhA.LJFF = c2211641BhCLJFF;
            return;
        }
        C2211621BhA.LJFF = c2211641BhC;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcUgShopTabPopupManager, pageRecord is null, ");
        sbLIZ.append(fragment.getClass());
        sbLIZ.append(", schema:");
        sbLIZ.append(this.LJ);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0WWR
    public final void LIZ(String str, String str2) {
        C1740300vO8.LIZ.getClass();
        C1740300vO8.LIZJ = null;
        C1740300vO8.LIZIZ = false;
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        C2211621BhA.LIZ.getClass();
        C2211621BhA.LJFF = null;
        InterfaceC824510WWb interfaceC824510WWb = this.LIZLLL;
        if (interfaceC824510WWb != null) {
            interfaceC824510WWb.LJFF(str, str2, false);
        }
        this.LJFF.onResume();
    }

    @Override // X.C0WWR
    public final void LIZJ(String str, String str2) {
        InterfaceC824510WWb interfaceC824510WWb = this.LIZLLL;
        if (interfaceC824510WWb != null) {
            interfaceC824510WWb.LIZLLL(str, str2, false);
        }
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.LJ(null, this.LJ);
        }
    }

    public C0WXV(InterfaceC824510WWb interfaceC824510WWb, String str, Fragment fragment) {
        this.LIZLLL = interfaceC824510WWb;
        this.LJ = str;
        this.LJFF = fragment;
    }
}
