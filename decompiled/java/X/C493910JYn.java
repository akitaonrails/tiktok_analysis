package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493910JYn {
    public static void LIZ(DataChannel dataChannel, String str, LiveSubOnlyConfig liveSubOnlyConfig, String str2, boolean z, boolean z2) {
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            SubOnlyLiveSettingDialogNew.LLJLL.getClass();
            Iterator<Function1<Boolean, Unit>> it2 = SubOnlyLiveSettingDialogNew.LLJZ.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(Boolean.TRUE);
            }
            SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = new SubOnlyLiveSettingDialogNew();
            subOnlyLiveSettingDialogNew.LLJJJJ = str;
            subOnlyLiveSettingDialogNew.LLJJJJJIL = liveSubOnlyConfig;
            subOnlyLiveSettingDialogNew.LLJJJJLIIL = str2;
            subOnlyLiveSettingDialogNew.LLJLIL = z;
            subOnlyLiveSettingDialogNew.LLJJL = z2;
            subOnlyLiveSettingDialogNew.show(fragmentManager, "SubOnlyLiveSettingDialogNew");
        }
    }
}
