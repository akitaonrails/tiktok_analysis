package X;

import Y.ARunnableS1S0211000_13;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814880Vxu {
    public static void LIZ(InterfaceC815060VyC interfaceC815060VyC, Context context, C814730Vxf c814730Vxf, List list, ARunnableS1S0211000_13 aRunnableS1S0211000_13) {
        boolean z;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C814920Vxy c814920Vxy = (C814920Vxy) it2.next();
            if (c814920Vxy != null && c814920Vxy.LIZIZ == c814730Vxf.revokeId) {
                it2.remove();
            }
        }
        C814920Vxy c814920Vxy2 = new C814920Vxy();
        c814920Vxy2.LIZ = c814730Vxf.id;
        c814920Vxy2.LIZIZ = c814730Vxf.revokeId;
        c814920Vxy2.LIZJ = c814730Vxf.revokeType;
        c814920Vxy2.LIZLLL = C0V4T.LIZ();
        Uri uri = UriProtector.parse(c814730Vxf.openUrl);
        if (uri != null) {
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"))) {
                c814920Vxy2.LJ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aggregate_num"))) {
                c814920Vxy2.LJFF = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aggregate_num");
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "itemid"))) {
                c814920Vxy2.LJI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "itemid");
            }
        }
        ArrayList<C814920Vxy> arrayList = (ArrayList) list;
        arrayList.add(c814920Vxy2);
        C815050VyB c815050VyBLIZ = C815050VyB.LIZ();
        Keva keva = c815050VyBLIZ.LIZIZ;
        if (keva != null) {
            c815050VyBLIZ.LIZ.getClass();
            JSONArray jSONArray = new JSONArray();
            for (C814920Vxy c814920Vxy3 : arrayList) {
                if (c814920Vxy3 != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("rid", c814920Vxy3.LIZ);
                        jSONObject.put("revoke_id", c814920Vxy3.LIZIZ);
                        jSONObject.put("revoke_type", c814920Vxy3.LIZJ);
                        jSONObject.put("ts", c814920Vxy3.LIZLLL);
                        jSONObject.put("push_label", c814920Vxy3.LJ);
                        jSONObject.put("aggregate_num", c814920Vxy3.LJFF);
                        jSONObject.put("itemid", c814920Vxy3.LJI);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            keva.storeString("revoke_rid_list", jSONArray.toString());
        }
        C20684815ws.LJIILLIIL("push_withdraw", C814920Vxy.LIZ(c814920Vxy2));
        boolean z2 = false;
        try {
            NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
            int shortMsgID = C814730Vxf.getShortMsgID(c814730Vxf.revokeId);
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications != null) {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification != null && statusBarNotification.getId() == shortMsgID) {
                        z = true;
                        break;
                    }
                }
                z = false;
                notificationManager.cancel("app_notify_ame", shortMsgID);
                z2 = z;
            } else {
                z = false;
                notificationManager.cancel("app_notify_ame", shortMsgID);
                z2 = z;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        interfaceC815060VyC.LIZ(z2, c814920Vxy2, aRunnableS1S0211000_13);
    }
}
