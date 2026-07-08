package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupResponse;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0CPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313080CPa implements WeakHandler.IHandler {
    public static final InterfaceC313090CPb LLILZIL = (InterfaceC313090CPb) C09S2.LIZJ(InterfaceC313090CPb.class, Api.LIZ);
    public final Map<WeakHandler, Integer> LLILLJJLI = new ConcurrentHashMap();
    public volatile boolean LLILZ = false;
    public final WeakHandler LL = new WeakHandler(this);
    public final Map<String, PopupSetting> LLILLL = new HashMap();

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        List<PopupSetting> list;
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        int i = message.what;
        this.LLILZ = false;
        if (messageObj instanceof C0XIR) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZJ(((C0XIR) messageObj).getErrorMsg());
            c1233040iBy.LIZLLL();
            return;
        }
        if (messageObj instanceof Exception) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy2 = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy2.LIZJ(C844470XAv.LIZ().getResources().getString(2131837963));
            c1233040iBy2.LIZLLL();
            return;
        }
        if (!(messageObj instanceof PopupResponse) || i != 1 || (list = ((PopupResponse) messageObj).popups) == null) {
            return;
        }
        for (PopupSetting popupSetting : list) {
            if (popupSetting != null) {
                try {
                    String str = popupSetting.id;
                    if (!TextUtils.isEmpty(str)) {
                        ((HashMap) this.LLILLL).put(str, popupSetting);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        Iterator it2 = ((ConcurrentHashMap) this.LLILLJJLI).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ((Handler) entry.getKey()).sendEmptyMessage(((Integer) entry.getValue()).intValue());
            it2.remove();
        }
    }
}
