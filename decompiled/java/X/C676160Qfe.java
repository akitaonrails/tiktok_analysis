package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;

/* JADX INFO: renamed from: X.0Qfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676160Qfe {
    public static PhotoSearchBaseVM LIZIZ(C19EG c19eg) {
        return (PhotoSearchBaseVM) ViewModelProviders.of(c19eg).get(PhotoSearchBaseVM.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PhotoSearchBaseVM LIZJ(Fragment fragment) {
        Object obj;
        ViewModelProvider viewModelProviderOf;
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (fragment instanceof InterfaceC214902198i) {
            obj = (InterfaceC214902198i) fragment;
        } else {
            obj = null;
        }
        if (obj == null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                obj = null;
                break;
            }
            Fragment parentFragment = fragment;
            while (!(parentFragment instanceof InterfaceC214902198i)) {
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == 0) {
                    obj = null;
                    break;
                }
            }
            obj = (InterfaceC214902198i) parentFragment;
        }
        C19EG activity = fragment.getActivity();
        if (obj != null) {
            if (activity != null) {
                viewModelProviderOf = ViewModelProviders.of((Fragment) obj, (ViewModelProvider.Factory) null);
                return (PhotoSearchBaseVM) viewModelProviderOf.get(PhotoSearchBaseVM.class);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot crate ViewModelProvider for ");
            sbLIZ.append(fragment);
            sbLIZ.append(": fallbackToActivity: ");
            sbLIZ.append(true);
            sbLIZ.append(", fallbackToNewStore: ");
            sbLIZ.append(false);
            sbLIZ.append('.');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        if (activity != null) {
            viewModelProviderOf = ViewModelProviders.of(activity, (ViewModelProvider.Factory) null);
            return (PhotoSearchBaseVM) viewModelProviderOf.get(PhotoSearchBaseVM.class);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Cannot crate ViewModelProvider for ");
        sbLIZ2.append(fragment);
        sbLIZ2.append(": fallbackToActivity: ");
        sbLIZ2.append(true);
        sbLIZ2.append(", fallbackToNewStore: ");
        sbLIZ2.append(false);
        sbLIZ2.append('.');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalStateException(strLIZIZ2);
    }

    public static PhotoSearchBaseVM LIZ(Fragment fragment, C19EG c19eg) {
        return (PhotoSearchBaseVM) C679340Qkm.LIZIZ(fragment, c19eg).get(PhotoSearchBaseVM.class);
    }
}
