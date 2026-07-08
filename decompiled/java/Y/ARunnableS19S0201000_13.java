package Y;

import X.C0W56;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C808680Vnu;
import X.C808750Vo1;
import X.C809030VoT;
import X.C809150Vof;
import X.C814730Vxf;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS19S0201000_13 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((PushBody) this.l0) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rule_id", ((PushBody) this.l0).id);
                jSONObject.put("rule_id64", ((PushBody) this.l0).rid64);
                jSONObject.put("sender", this.i2);
                jSONObject.put("push_sdk_version", String.valueOf(30204));
                jSONObject.put("push_sdk_version_name", "3.2.4-alpha.56.4-bugfix");
                jSONObject.put("ttpush_sec_target_uid", ((PushBody) this.l0).targetSecUid);
                ((C808680Vnu) this.l1).getClass();
                jSONObject.put("local_sec_uid", C808680Vnu.LIZLLL());
                C808680Vnu c808680Vnu = (C808680Vnu) this.l1;
                String str = ((PushBody) this.l0).targetSecUid;
                c808680Vnu.getClass();
                jSONObject.put("is_self", C808680Vnu.LJFF(str) ? "1" : CardStruct.IStatusCode.DEFAULT);
                jSONObject.put("client_time", System.currentTimeMillis());
                if (!TextUtils.isEmpty(((PushBody) this.l0).groupId)) {
                    jSONObject.put("ttpush_group_id", ((PushBody) this.l0).groupId);
                }
                ((C808750Vo1) ((C808680Vnu) this.l1).LIZIZ).LIZ("push_expire_time", jSONObject);
                C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push_expire_time:");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
                c809150Vof.getClass();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void run$0(ARunnableS19S0201000_13 aRunnableS19S0201000_13) {
        try {
            ((C0W56) aRunnableS19S0201000_13.l1).LLILLL.LIZLLL(aRunnableS19S0201000_13.i2, (Bundle) aRunnableS19S0201000_13.l0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS19S0201000_13 aRunnableS19S0201000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PushMsgHandler@69d4.onEventExpireTimeMsg$1");
        try {
            aRunnableS19S0201000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushMsgHandler@69d4.onEventExpireTimeMsg$1");
    }

    public static final void run$2(ARunnableS19S0201000_13 aRunnableS19S0201000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MessageReceiverService@4509.onStartCommand$1");
        try {
            ((MessageReceiverService) aRunnableS19S0201000_13.l1).onHandleIntent((Intent) aRunnableS19S0201000_13.l0);
            ((MessageReceiverService) aRunnableS19S0201000_13.l1).stopSelf(aRunnableS19S0201000_13.i2);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("MessageReceiverService@4509.onStartCommand$1");
    }

    public static final void run$3(ARunnableS19S0201000_13 aRunnableS19S0201000_13) {
        Context context = (Context) aRunnableS19S0201000_13.l0;
        int i = aRunnableS19S0201000_13.i2;
        C814730Vxf c814730Vxf = (C814730Vxf) aRunnableS19S0201000_13.l1;
        C1C7U.LIZ("MessageShowHandler@5daa.proxyShowWithPermissionCheck$1L");
        MessageShowHandler.LJIIIZ(i, context, c814730Vxf);
        C1C7U.LIZIZ("MessageShowHandler@5daa.proxyShowWithPermissionCheck$1L");
    }

    public static final void run$4(ARunnableS19S0201000_13 aRunnableS19S0201000_13) {
        try {
            ((SystemForegroundService) aRunnableS19S0201000_13.l1).LLILZ.notify(aRunnableS19S0201000_13.i2, (Notification) aRunnableS19S0201000_13.l0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS19S0201000_13(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
