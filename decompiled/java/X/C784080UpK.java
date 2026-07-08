package X;

import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import java.util.Map;

/* JADX INFO: renamed from: X.0UpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784080UpK implements InterfaceC472150IfN {
    public final /* synthetic */ InterfaceC784090UpL LIZ;

    public C784080UpK(InterfaceC784090UpL interfaceC784090UpL) {
        this.LIZ = interfaceC784090UpL;
    }

    @Override // X.InterfaceC472150IfN
    public final void onFailed(Throwable th) {
        this.LIZ.onFailed(th);
    }

    @Override // X.InterfaceC472150IfN
    public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
        LiveScenario liveScenario;
        boolean z;
        LivePermissionApply livePermissionApply = null;
        if (detailLivePermission != null) {
            liveScenario = new LiveScenario(detailLivePermission.videoPermission, detailLivePermission.screenPermission, detailLivePermission.obsPermission, detailLivePermission.enableLiveStudio, detailLivePermission.enableLiveVoice);
        } else {
            liveScenario = null;
        }
        if (applyLivePermission != null) {
            livePermissionApply = new LivePermissionApply(applyLivePermission.videoApplyPermission, applyLivePermission.screenApplyPermission, applyLivePermission.obsApplyPermission);
        }
        InterfaceC784090UpL interfaceC784090UpL = this.LIZ;
        if (c783980UpA.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC784090UpL.onSuccess(bool, liveScenario, livePermissionApply, bool2, Boolean.valueOf(z), map);
    }
}
