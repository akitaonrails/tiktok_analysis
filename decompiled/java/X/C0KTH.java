package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.tunnel.TunnelViewModel;

/* JADX INFO: renamed from: X.0KTH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KTH {
    @InterfaceC1294060jmO
    public static TunnelViewModel LIZ(C19EG c19eg, Class cls) {
        return (TunnelViewModel) ViewModelProviders.of(c19eg).get(cls);
    }

    public static TunnelViewModel LIZIZ(Class cls, Fragment fragment) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        ViewModelProvider viewModelProviderLJIIIZ;
        if (fragment != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragment)) != null && (viewModelProviderLJIIIZ = abstractC1387200mCcLIZIZ.LJIIIZ()) != null) {
            return (TunnelViewModel) viewModelProviderLJIIIZ.get(cls);
        }
        return null;
    }
}
