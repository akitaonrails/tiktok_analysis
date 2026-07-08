package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.profile.platform.base.data.DialogButtonAction;
import com.ss.android.ugc.profile.platform.base.data.DialogButtonModel;
import com.ss.android.ugc.profile.platform.base.data.DialogInfo;
import com.ss.android.ugc.profile.platform.base.data.DialogTextModel;
import java.util.List;
import kotlin.jvm.internal.AwS243S0300000_34;
import kotlin.jvm.internal.AwS400S0200000_34;

/* JADX INFO: renamed from: X.1BnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215381BnE {
    public static final C2215381BnE LIZ = new C2215381BnE();

    public static C1397580mTM LIZIZ(Context context, DialogInfo dialogInfo) {
        C1397580mTM c1397580mTM = null;
        if (context == null) {
            return null;
        }
        if (dialogInfo != null) {
            c1397580mTM = new C1397580mTM(context);
            Boolean cancelOnTouchOutside = dialogInfo.getCancelOnTouchOutside();
            if (cancelOnTouchOutside != null) {
                c1397580mTM.LJII = cancelOnTouchOutside.booleanValue();
            }
            DialogTextModel title = dialogInfo.getTitle();
            if (title != null) {
                c1397580mTM.LJI(new C444910HcX(title.getRemoteText()));
            }
            DialogTextModel message = dialogInfo.getMessage();
            if (message != null) {
                c1397580mTM.LIZIZ(new C444910HcX(message.getRemoteText()));
            }
            List<DialogButtonModel> buttons = dialogInfo.getButtons();
            if (buttons != null) {
                Integer groupVariant = dialogInfo.getGroupVariant();
                if (groupVariant != null && groupVariant.intValue() == 1) {
                    C1238130iKB.LIZ(c1397580mTM, new AwS400S0200000_34(context, buttons, 15));
                } else {
                    C985403tE.LIZ(c1397580mTM, new AwS243S0300000_34((List) buttons, (List<DialogButtonModel>) dialogInfo, (DialogInfo) context, (Context) 1));
                    return c1397580mTM;
                }
            }
        }
        return c1397580mTM;
    }

    public static void LIZ(C1397660mTU c1397660mTU, Context context, DialogButtonAction dialogButtonAction, Boolean bool) {
        if (bool != null) {
            c1397660mTU.LIZJ = bool.booleanValue();
        }
        if (dialogButtonAction != null) {
            String route = dialogButtonAction.getRoute();
            if (route != null) {
                SmartRouter.buildRoute(context, route).open();
            }
            String eventName = dialogButtonAction.getEventName();
            if (eventName != null) {
                C20684815ws.onEventV3(eventName);
            }
        }
    }
}
