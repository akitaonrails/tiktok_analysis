package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822110xW5 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "params", new PcsServicePlusOptinPageParams(pcsServicePlusOptinPageParams.getAnchorId(), pcsServicePlusOptinPageParams.getSecAnchorId(), pcsServicePlusOptinPageParams.getShowEntrance(), 0L, pcsServicePlusOptinPageParams.getPcsTrackContext(), pcsServicePlusOptinPageParams.getExtra()));
        return bundle;
    }

    public static Fragment LIZIZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        Fragment fragment;
        Class hostRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostRootFragment(8);
        if (hostRootFragment == null) {
            return null;
        }
        try {
            Object objNewInstance = hostRootFragment.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof Fragment) {
                fragment = (Fragment) objNewInstance;
            } else {
                fragment = null;
            }
            if (fragment == null) {
                return null;
            }
            fragment.setArguments(LIZ(pcsServicePlusOptinPageParams));
            return fragment;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
