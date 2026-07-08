package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.PreviewLiveResumeRoomChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0acv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942230acv implements InterfaceC758000ToM {
    public static final C942230acv LIZ = new C942230acv();

    @Override // X.InterfaceC758000ToM
    public final void LIZ(FragmentManager fragmentManager, String str, DataChannel dataChannel) {
        Object objGg0;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(PreviewLiveResumeRoomChannel.class);
        } else {
            objGg0 = null;
        }
        if (Intrinsics.LJFF(objGg0, Boolean.FALSE)) {
            MultiGuestPreviewLiveSettingDialog multiGuestPreviewLiveSettingDialog = new MultiGuestPreviewLiveSettingDialog();
            multiGuestPreviewLiveSettingDialog.LLJZ = dataChannel;
            multiGuestPreviewLiveSettingDialog.LLJZIJLIL = str;
            C19322110iZ.LJFF(fragmentManager, multiGuestPreviewLiveSettingDialog, "MultiGuestPreviewLiveSettingDialog", null, 0);
            return;
        }
        C766270U4b.LIZLLL(2131852642);
    }
}
