package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UX0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UX0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, Context context, String str, String str2, Function1 function1) {
        if (str != null && str.length() != 0) {
            function1.invoke(str);
            return;
        }
        if (i == 2) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).jumpToAgsStatusPage(context, str2);
            return;
        }
        String value = LiveForbbidenDetailPageSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                value = "https://inapp-va.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
            } else {
                value = "https://inapp.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
            }
        }
        function1.invoke(value);
    }
}
