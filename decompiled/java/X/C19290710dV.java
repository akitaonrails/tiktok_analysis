package X;

import android.app.Activity;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19290710dV implements WeakHandler.IHandler {
    public static WeakReference<Activity> LLILLJJLI;
    public static final C19290710dV LL = new C19290710dV();
    public static final WeakHandler LLILLL = new WeakHandler(LL);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        PopupSetting popupSettingLIZLLL;
        WeakReference<Activity> weakReference = LLILLJJLI;
        if (weakReference == null) {
            weakReference = null;
        }
        Activity activity = weakReference.get();
        if (activity == null || activity.isFinishing() || message.what != 3 || (popupSettingLIZLLL = C1E90.LIZIZ.LIZLLL("ugc_permission_v2")) == null) {
            return;
        }
        DialogC19307610gE dialogC19307610gE = new DialogC19307610gE(activity, popupSettingLIZLLL);
        dialogC19307610gE.show();
        C785410UrT.LIZIZ(dialogC19307610gE);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC19307610gE);
        C816490W1f.LIZ(dialogC19307610gE);
    }
}
