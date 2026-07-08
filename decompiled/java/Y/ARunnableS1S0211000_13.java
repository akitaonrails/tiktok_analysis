package Y;

import X.C1C7U;
import X.C2188811AlT;
import X.C808680Vnu;
import X.C808750Vo1;
import X.C809030VoT;
import X.C809150Vof;
import android.text.TextUtils;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS1S0211000_13 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S0211000_13 aRunnableS1S0211000_13) {
        Object obj;
        C808680Vnu c808680Vnu = (C808680Vnu) aRunnableS1S0211000_13.l0;
        PushBody pushBody = (PushBody) aRunnableS1S0211000_13.l1;
        int i = aRunnableS1S0211000_13.i3;
        boolean z = aRunnableS1S0211000_13.z2;
        c808680Vnu.getClass();
        C1C7U.LIZ("PushMsgHandler@69d4.onShowEvent$1L");
        if (pushBody != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rule_id", pushBody.id);
                jSONObject.put("rule_id64", pushBody.rid64);
                jSONObject.put("sender", i);
                jSONObject.put("push_sdk_version", String.valueOf(30204));
                jSONObject.put("push_sdk_version_name", "3.2.4-alpha.56.4-bugfix");
                jSONObject.put("ttpush_sec_target_uid", pushBody.targetSecUid);
                jSONObject.put("local_sec_uid", C808680Vnu.LIZLLL());
                String str = "1";
                if (C808680Vnu.LJFF(pushBody.targetSecUid)) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_self", obj);
                jSONObject.put("client_time", System.currentTimeMillis());
                if (!z) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("real_filter", str);
                if (!TextUtils.isEmpty(pushBody.groupId)) {
                    jSONObject.put("ttpush_group_id", pushBody.groupId);
                }
                ((C808750Vo1) c808680Vnu.LIZIZ).LIZ("push_show_ug", jSONObject);
                C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push_show_ug:");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
                c809150Vof.getClass();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            c808680Vnu.LJI(i, "", "", "PushBody is null");
        }
        C1C7U.LIZIZ("PushMsgHandler@69d4.onShowEvent$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS1S0211000_13 r16) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S0211000_13.run$1(Y.ARunnableS1S0211000_13):void");
    }

    public ARunnableS1S0211000_13(int i, Object obj, Object obj2, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
        this.i3 = i;
    }
}
