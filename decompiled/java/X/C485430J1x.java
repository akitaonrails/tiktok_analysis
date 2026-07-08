package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0J1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485430J1x implements InterfaceC451590HnJ {
    public static final C485430J1x LIZ = new C485430J1x();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC451590HnJ
    public final C451600HnK LIZ(LifecycleOwner lifecycleOwner) {
        Fragment fragmentLJI = C724240Sb0.LJI(lifecycleOwner);
        ComponentCallbacks2 componentCallbacks2LJFF = null;
        if (fragmentLJI != 0) {
            Context context = fragmentLJI.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragmentLJI instanceof InterfaceC214902198i) {
                        Object obj = (InterfaceC214902198i) fragmentLJI;
                        if (obj != null) {
                            if (obj instanceof Fragment) {
                                Fragment fragment = (Fragment) obj;
                                return new C451600HnK((LifecycleOwner) obj, fragment.getViewModelStore(), new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C338520DOw(fragment));
                            }
                            "Failed requirement.".toString();
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    } else {
                        fragmentLJI = fragmentLJI.getParentFragment();
                        if (fragmentLJI == 0) {
                            break;
                        }
                    }
                }
            }
        }
        LifecycleOwner lifecycleOwnerLIZ = C724240Sb0.LIZ(lifecycleOwner);
        if (lifecycleOwnerLIZ == null) {
            lifecycleOwnerLIZ = lifecycleOwner;
        }
        if (lifecycleOwnerLIZ instanceof C19EG) {
            return new C451600HnK(lifecycleOwnerLIZ, ((ComponentActivity) lifecycleOwnerLIZ).getViewModelStore(), new AwS551S0100000_7(lifecycleOwnerLIZ, 805), new AwS551S0100000_7(lifecycleOwnerLIZ, 807), new AwS551S0100000_7(lifecycleOwnerLIZ, 806));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFVMScope falls back to using ");
        sbLIZ.append(lifecycleOwnerLIZ);
        sbLIZ.append(" as a VMScope.Activity, which is not a FragmentActivity");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
