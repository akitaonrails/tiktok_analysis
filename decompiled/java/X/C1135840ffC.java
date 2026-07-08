package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135840ffC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1135810ff9 c1135810ff9, boolean z) {
        Long lValueOf;
        Gift gift;
        int i;
        String str;
        boolean zLJJII = C1135800ff8.LJJII();
        boolean zLJJIII = C1135800ff8.LJJIII();
        boolean zLJJIIZ = C1135800ff8.LJJIIZ(c1135810ff9.LIZ);
        if (zLJJII) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LIZLLL) {
                C1138230fj3.LIZ("LiveGiftReceiveQueueMonitor", "onQueueGiftMessage, return by shouldDowngradeTrackingExcludeRendering");
                return;
            }
        } else if (!zLJJIII && !zLJJIIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQueueGiftMessage enqueue(");
        sbLIZ.append(z);
        sbLIZ.append(") id(");
        sbLIZ.append(c1135810ff9.LJJJJZ);
        sbLIZ.append(") isLocal(");
        sbLIZ.append(c1135810ff9.LJJJLIIL);
        sbLIZ.append(") from(");
        sbLIZ.append(c1135810ff9.LJJLI);
        sbLIZ.append(") to(");
        User user = c1135810ff9.LJJL;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(')');
        C1138230fj3.LIZJ("LiveGiftReceiveQueueMonitor", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject2, C158B.LIZ(), System.currentTimeMillis());
        GiftMessage giftMessage = c1135810ff9.LIZ;
        if (giftMessage == null || (gift = giftMessage.mGift) == null) {
            return;
        }
        C1135800ff8.LJ(gift, giftMessage.colorId, jSONObject, jSONObject2);
        C1135800ff8.LIZJ(giftMessage, jSONObject, jSONObject2);
        C1136080ffa.LIZJ(jSONObject2);
        c1135810ff9.LJJJJIZL.LIZ(jSONObject2);
        ConcurrentHashSet concurrentHashSet = c1135810ff9.LJJJJ;
        int i2 = 0;
        if ((concurrentHashSet instanceof Collection) && concurrentHashSet.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = concurrentHashSet.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((!((C1136650fgV) it2.next()).LIZJ) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        jSONObject2.put("msg_total", i);
        ConcurrentHashSet concurrentHashSet2 = c1135810ff9.LJJJJ;
        if (!(concurrentHashSet2 instanceof Collection) || !concurrentHashSet2.isEmpty()) {
            Iterator it3 = concurrentHashSet2.iterator();
            while (it3.hasNext()) {
                if (((C1136650fgV) it3.next()).LIZJ && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        jSONObject2.put("interrupted_msg_total", i2);
        if (!z && zLJJII) {
            long j = gift.id;
            long jLIZJ = C1135270feH.LIZJ(giftMessage);
            int i3 = gift.type;
            C1141930fp1.LIZIZ = j;
            C1141930fp1.LIZLLL = jLIZJ;
            C1141930fp1.LIZJ = i3;
        }
        if (zLJJIIZ) {
            if (z) {
                str = "gift_msg_enqueue_self";
            } else {
                str = "gift_msg_dequeue_self";
            }
        } else if (zLJJII) {
            if (z) {
                str = "gift_msg_enqueue_anchor";
            } else {
                str = "gift_msg_dequeue_anchor";
            }
        } else if (z) {
            str = "gift_msg_enqueue_guest";
        } else {
            str = "gift_msg_dequeue_guest";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        C1CC2.LJ(str, jSONObject, new JSONObject(), jSONObject2);
        C1138230fj3.LIZJ("LiveGiftReceiveQueueMonitor", "reported(" + str + ')');
    }
}
