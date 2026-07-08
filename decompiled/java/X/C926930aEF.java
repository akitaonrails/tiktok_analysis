package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0aEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926930aEF {
    public static MultiLiveGuestUserInfoDialog LIZ(C926930aEF c926930aEF, DataChannel dataChannel, AbstractC929640aIc abstractC929640aIc, WeakReference weakReference, EnumC926600aDi enumC926600aDi, C925770aCN c925770aCN, String str, int i, boolean z, int i2) {
        if ((i2 & 32) != 0) {
            str = "invite";
        }
        if ((i2 & 128) != 0) {
            z = false;
        }
        c926930aEF.getClass();
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = new MultiLiveGuestUserInfoDialog();
        multiLiveGuestUserInfoDialog.dataChannel = dataChannel;
        multiLiveGuestUserInfoDialog.mApplyPresenter = abstractC929640aIc;
        multiLiveGuestUserInfoDialog.mGuestPresenter = weakReference;
        multiLiveGuestUserInfoDialog.mApplyType = enumC926600aDi;
        multiLiveGuestUserInfoDialog.mApplyInfo = c925770aCN;
        multiLiveGuestUserInfoDialog.mSource = str;
        multiLiveGuestUserInfoDialog.isPreviewDefault = z;
        multiLiveGuestUserInfoDialog.scene = i;
        return multiLiveGuestUserInfoDialog;
    }
}
