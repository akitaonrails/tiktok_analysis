package X;

import android.content.Context;
import android.text.SpannableString;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.livesdk.broadcast.ColdDownNotifyEvent;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0UPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771810UPj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, DataChannel dataChannel) {
        boolean z;
        int i;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        String modeFromServer = ((LiveMode) dataChannel.gg0(LiveModeChannel.class)).getModeFromServer();
        Map map = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class);
        if (map != null && (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(modeFromServer)) != null && permissionApplyInfo2.mApplyStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Map map2 = (Map) dataChannel.gg0(PermissionApplyInfoChannel.class);
            if (map2 != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map2.get(modeFromServer)) != null) {
                i = permissionApplyInfo.mForbiddenApplyDays;
            } else {
                i = 0;
            }
            SpannableString spannableString = new SpannableString(C497740JfY.LJIIL(2131755560, i, Integer.valueOf(i)));
            C786410Ut5.p2(spannableString, new C785770Us3(context, modeFromServer, dataChannel, 0), 0, spannableString.length(), 17);
            dataChannel.LC0(ColdDownNotifyEvent.class, new C771790UPh(0, EnumC771760UPe.COLD_DOWN_BLOCK, spannableString, 8));
            return;
        }
        dataChannel.LC0(ColdDownNotifyEvent.class, new C771790UPh(8, EnumC771760UPe.COLD_DOWN_BLOCK, "", 8));
    }
}
