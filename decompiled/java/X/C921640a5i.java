package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0a5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921640a5i implements OnMessageListener {
    public static final Map<Long, String> LL = new LinkedHashMap();
    public static final Map<Long, String> LLILLJJLI = new LinkedHashMap();
    public static final Map<Long, Integer> LLILLL = new LinkedHashMap();
    public static final Set<Long> LLILZ = new CopyOnWriteArraySet();
    public static final Map<Long, Integer> LLILZIL = new LinkedHashMap();
    public static final Map<Long, String> LLILZLL = new LinkedHashMap();

    public static final void LIZLLL() {
        ((CopyOnWriteArraySet) LLILZ).clear();
        ((LinkedHashMap) LL).clear();
        ((LinkedHashMap) LLILLJJLI).clear();
        ((LinkedHashMap) LLILLL).clear();
    }

    public static final int LJ(long j) {
        Integer num = (Integer) ((LinkedHashMap) LLILLL).get(Long.valueOf(j));
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final String LJI(long j) {
        String str = (String) ((LinkedHashMap) LL).get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long id;
        if (!(iMessage instanceof MemberMessage)) {
            return;
        }
        User user = ((MemberMessage) iMessage).user;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        LJII(id, true);
    }

    public static final boolean LIZJ(long j, boolean z) {
        int iIntValue;
        Map<Long, Integer> map = LLILZIL;
        Integer num = (Integer) ((LinkedHashMap) map).get(Long.valueOf(j));
        boolean z2 = false;
        if (num != null && ((iIntValue = num.intValue()) == 2 || iIntValue == 3)) {
            z2 = true;
        }
        if (z) {
            map.remove(Long.valueOf(j));
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(long r3, boolean r5) {
        /*
            java.util.Map<java.lang.Long, java.lang.Integer> r2 = X.C921640a5i.LLILZIL
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0 = r2
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L30
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L2d
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 3
            if (r1 != r0) goto L30
            java.lang.String r1 = "panel_plus_guide"
        L20:
            if (r5 == 0) goto L29
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.remove(r0)
        L29:
            return r1
        L2a:
            java.lang.String r1 = "mutual_notice"
            goto L20
        L2d:
            java.lang.String r1 = "panel"
            goto L20
        L30:
            java.lang.String r1 = ""
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921640a5i.LJFF(long, boolean):java.lang.String");
    }

    public static final void LJII(long j, boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LLILZ;
        if (copyOnWriteArraySet.contains(Long.valueOf(j))) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                long id = room.getId();
                if (id != 0 && z) {
                    String strLIZ = C20632086k.LIZ.LIZ(j);
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                        JSONObject jSONObject = new JSONObject();
                        C0K04.LJ("guest_user_id", j, jSONObject);
                        C0K04.LJFF("guest_linkmic_id", strLIZ, jSONObject);
                        C924630aAX c924630aAX = C924630aAX.LIZ;
                        C924630aAX.LJIILL(Long.valueOf(j), strLIZ, jSONObject);
                        c924630aAX.LJJJLIIL(0, "cancel_invite", jSONObject, true);
                        C924630aAX.LJIILLIIL().LIZJ(strLIZ, "cancel_invite", null, null);
                    }
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL != null) {
                        interfaceC954180awCLLJLL.LJJJJLL(new C920400a3i(id, j, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), 28), new InterfaceC920680a4A<CancelInviteResult>() { // from class: X.0a0d
                            @Override // X.InterfaceC920680a4A
                            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                            }

                            @Override // X.InterfaceC920680a4A
                            public final /* bridge */ /* synthetic */ void onSuccess(CancelInviteResult cancelInviteResult) {
                            }
                        });
                    }
                }
            }
            copyOnWriteArraySet.remove(Long.valueOf(j));
            LL.remove(Long.valueOf(j));
            LLILLJJLI.remove(Long.valueOf(j));
            LLILLL.remove(Long.valueOf(j));
        }
    }

    public static final void LIZ(int i, String str, long j, String str2) {
        ((CopyOnWriteArraySet) LLILZ).add(Long.valueOf(j));
        LL.put(Long.valueOf(j), str);
        LLILLJJLI.put(Long.valueOf(j), str2);
        LLILLL.put(Long.valueOf(j), Integer.valueOf(i));
    }
}
