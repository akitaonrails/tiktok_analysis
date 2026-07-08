package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.promote.PromoteGdprResponse;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10Zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19268410Zu implements WeakHandler.IHandler {
    public static DialogC19307510gD LLILZ;
    public static SharedPreferences LLILZIL;
    public static C19268410Zu LLILZLL;
    public final WeakHandler LL = new WeakHandler(this);
    public PopupSetting LLILLJJLI;
    public WeakReference<Activity> LLILLL;

    public static SharedPreferences LIZ() {
        if (LLILZIL == null) {
            C844470XAv.LIZ.getClass();
            LLILZIL = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme-gdpr-dialog");
        }
        return LLILZIL;
    }

    public final void LIZIZ() {
        WeakReference<Activity> weakReference;
        if (this.LLILLJJLI == null || (weakReference = this.LLILLL) == null || weakReference.get() == null) {
            return;
        }
        this.LLILLJJLI = null;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        SharedPreferences sharedPreferencesLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_pop_time_");
        sbLIZ.append(curUserId);
        if (DateUtils.isToday(sharedPreferencesLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L))) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = LIZ().edit();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("last_pop_time_");
            sbLIZ2.append(curUserId);
            editorEdit.putLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
            editorEdit.apply();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        DialogC19307510gD dialogC19307510gD = new DialogC19307510gD(this.LLILLL.get(), this.LLILLJJLI);
        LLILZ = dialogC19307510gD;
        dialogC19307510gD.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.10Zw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C19268410Zu.LLILZ = null;
            }
        });
        DialogC19307510gD dialogC19307510gD2 = LLILZ;
        dialogC19307510gD2.show();
        C785410UrT.LIZIZ(dialogC19307510gD2);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC19307510gD2);
        C816490W1f.LIZ(dialogC19307510gD2);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        int i = message.what;
        if (messageObj instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) messageObj;
            Activity activity = this.LLILLL.get();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(c0xir.getErrorMsg());
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (messageObj instanceof Exception) {
            Activity activity2 = this.LLILLL.get();
            if (activity2 != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
                c1389890mGx2.LJIIIZ(2131837963);
                c1389890mGx2.LJIIJJI();
                return;
            }
            return;
        }
        if (messageObj instanceof PromoteGdprResponse) {
            boolean z = true;
            if (i == 1) {
                PromoteGdprResponse promoteGdprResponse = (PromoteGdprResponse) messageObj;
                if (promoteGdprResponse != null) {
                    Boolean bool = promoteGdprResponse.signed;
                    if (bool == null || !bool.booleanValue()) {
                        z = false;
                    }
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    SharedPreferences.Editor editorEdit = LIZ().edit();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("joined_");
                    sbLIZ.append(curUserId);
                    editorEdit.putBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
                    editorEdit.apply();
                    LIZIZ();
                    return;
                }
                return;
            }
        }
        if (i != 2) {
            return;
        }
        this.LLILLJJLI = C1E90.LIZIZ.LIZLLL("gdpr_popup");
        LIZIZ();
    }
}
