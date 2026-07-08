package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.flexible.FlexiblePanelVM;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleRootFragment;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: renamed from: X.14Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20248014Ko {
    public static final C20248014Ko LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C20248014Ko.class, "stateVM", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
        LIZ = new C20248014Ko();
    }

    public static final boolean LIZ(Fragment fragment, C0P0T c0p0t) {
        FlexibleRootFragment flexibleRootFragment;
        Fragment parentFragment = fragment;
        LIZ.getClass();
        while (true) {
            if (parentFragment != null) {
                if (parentFragment instanceof FlexibleRootFragment) {
                    flexibleRootFragment = (FlexibleRootFragment) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            } else {
                flexibleRootFragment = null;
                break;
            }
        }
        if (flexibleRootFragment == null) {
            c0p0t.show();
            return true;
        }
        LIZ.getClass();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FlexiblePanelVM.class);
        AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(flexibleRootFragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 201), new C452070Ho5(), C724750Sbp.LJII(flexibleRootFragment), C724750Sbp.LJIIIZ(flexibleRootFragment), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) flexibleRootFragment, 305), AFwS274S0000000_30.get$arr$(242));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
        int i = ((C20247714Kl) assemVMLazy.getValue().getState()).LLILLL;
        if (i != 3 && i != 6) {
            return false;
        }
        c0p0t.show();
        C736680Sv4.LJIIIIZZ(flexibleRootFragment, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.14Kp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20247714Kl) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(c0p0t, 56), 4);
        return true;
    }
}
