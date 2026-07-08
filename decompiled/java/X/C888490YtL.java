package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888490YtL {
    public static final C888490YtL LIZ = new C888490YtL();
    public static final Map<EnumC887810YsF, Map<InterfaceC879010Ye3, Set<String>>> LIZIZ = new LinkedHashMap();

    public static void LIZJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        if (interfaceC879010Ye3 == null) {
            LIZIZ.remove(EnumC887810YsF.TTSOCIAL_CHAT_CELL_SHOW);
            return;
        }
        Map<EnumC887810YsF, Map<InterfaceC879010Ye3, Set<String>>> map = LIZIZ;
        EnumC887810YsF enumC887810YsF = EnumC887810YsF.TTSOCIAL_CHAT_CELL_SHOW;
        Map map2 = (Map) ((LinkedHashMap) map).get(enumC887810YsF);
        if (map2 == null) {
            return;
        }
        map2.remove(interfaceC879010Ye3);
        if (map2.isEmpty()) {
            map.remove(enumC887810YsF);
        }
    }

    public static String LIZLLL(InterfaceC888500YtM interfaceC888500YtM) {
        int sessionType = interfaceC888500YtM.getSessionType();
        if (sessionType != 0) {
            if (sessionType != 3) {
                if (sessionType == 25) {
                    return "tcm";
                }
                return "private";
            }
            return C1229100i5c.LIZLLL(interfaceC888500YtM.getSessionId());
        }
        return "private";
    }

    public static Map LJ(InterfaceC888500YtM interfaceC888500YtM) {
        String str;
        String str2;
        String string;
        Pair[] pairArr = new Pair[6];
        if (interfaceC888500YtM.getSessionType() == 25) {
            str = "tcm";
        } else {
            str = "private";
        }
        pairArr[0] = new Pair("chat_type", str);
        pairArr[1] = new Pair("conversation_id", interfaceC888500YtM.getSessionId());
        pairArr[2] = new Pair("enter_from", C888510YtN.LIZ(interfaceC888500YtM));
        int priority = interfaceC888500YtM.getPriority();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (priority > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_top", str2);
        AbstractC884010Ym7 sessionUnreadViewState = interfaceC888500YtM.getSessionUnreadViewState();
        if ((sessionUnreadViewState instanceof C880340YgC) && sessionUnreadViewState != null && (string = Integer.valueOf(sessionUnreadViewState.getNum()).toString()) != null) {
            str3 = string;
        }
        pairArr[4] = new Pair("unread_cnt", str3);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        AbstractC884010Ym7 sessionUnreadViewState2 = interfaceC888500YtM.getSessionUnreadViewState();
        c885310YoD.getClass();
        pairArr[5] = new Pair("notice_type", C885310YoD.LJIJJLI(sessionUnreadViewState2));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(interfaceC888500YtM.getSessionId())));
        return mapLJIIJ;
    }

    public static Map LIZIZ(InterfaceC888500YtM interfaceC888500YtM, int i) {
        String string;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("enter_from", C888510YtN.LIZ(interfaceC888500YtM));
        pairArr[1] = new Pair("chat_type", LIZLLL(interfaceC888500YtM));
        pairArr[2] = new Pair("conversation_id", interfaceC888500YtM.getSessionId());
        AbstractC884010Ym7 sessionUnreadViewState = interfaceC888500YtM.getSessionUnreadViewState();
        if (!(sessionUnreadViewState instanceof C880340YgC)) {
            sessionUnreadViewState = null;
        }
        String str = CardStruct.IStatusCode.DEFAULT;
        if (sessionUnreadViewState == null || (string = Integer.valueOf(sessionUnreadViewState.getNum()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("unread_cnt", string);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        AbstractC884010Ym7 sessionUnreadViewState2 = interfaceC888500YtM.getSessionUnreadViewState();
        c885310YoD.getClass();
        pairArr[4] = new Pair("notice_type", C885310YoD.LJIJJLI(sessionUnreadViewState2));
        if (interfaceC888500YtM.getPriority() > 0) {
            str = "1";
        }
        pairArr[5] = new Pair("is_top", str);
        pairArr[6] = new Pair("cell_order", String.valueOf(i));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(interfaceC888500YtM.getSessionId())));
        return mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C888480YtK
            if (r0 == 0) goto L73
            r4 = r9
            X.0YtK r4 = (X.C888480YtK) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L42
            if (r0 != r3) goto L79
            java.lang.Object r8 = r4.LL
            java.util.Map r8 = (java.util.Map) r8
            X.C155000ia.LIZIZ(r1)
        L26:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            if (r1 == 0) goto L3f
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r1.getImUserBizInfo()
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()
            if (r0 == 0) goto L3f
            java.lang.String r1 = r0.userTags
            if (r1 == 0) goto L3f
            java.lang.String r0 = "group_owner_account_type"
            r8.put(r0, r1)
        L3f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L42:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = X.C1229100i5c.LJI(r7)
            int r0 = r1.length()
            if (r0 <= 0) goto L54
            java.lang.String r0 = "group_type"
            r8.put(r0, r1)
        L54:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r2 = r0.LJ()
            X.0ZFW r0 = X.C0ZFW.LIZ
            java.lang.String r1 = r0.LJJIFFI(r7)
            r4.LL = r8
            r4.LLILZ = r3
            r0 = 0
            java.lang.Object r1 = r2.LJIJ(r1, r0, r4)
            if (r1 != r5) goto L26
            return r5
        L73:
            X.0YtK r4 = new X.0YtK
            r4.<init>(r6, r9)
            goto L12
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888490YtL.LIZ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
