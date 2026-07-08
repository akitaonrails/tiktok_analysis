package X;

import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1574006Eg implements InterfaceC1548390qOb {
    public static final C1574006Eg LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final C054G LLILZ;
    public static final C1DEV LLILZIL;
    public static final ConcurrentHashMap<String, StreakJsEventHandler<?>> LLILZLL;
    public static final C01GW LLIZ;
    public volatile C1598406Nq LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1574006Eg.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1574006Eg c1574006Eg = new C1574006Eg();
        LLILLJJLI = c1574006Eg;
        C1598406Nq c1598406Nq = c1574006Eg.LL;
        if (c1598406Nq == null) {
            synchronized (c1574006Eg) {
                c1598406Nq = c1574006Eg.LL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1574006Eg.LL = c1598406Nq;
                }
            }
        }
        LLILZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LLILZIL = C2191201ApK.LIZ();
        LLILZLL = new ConcurrentHashMap<>();
        LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(907));
    }

    public static void LIZ(String str) {
        C23250099c.LIZLLL(LLILZ, null, null, new C1574306Ej(str, null), 3);
    }

    public static void LIZIZ(String str) {
        C23250099c.LIZLLL(LLILZ, null, null, new C1574406Ek(str, null), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1548390qOb
    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
        Map<String, Object> mapLJ;
        String string;
        Object c1573906Ef;
        String string2;
        String string3;
        if (interfaceC1107590evd == null || (mapLJ = interfaceC1107590evd.LIZ()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C01GW c01gw = C1574706En.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetJsEventManager receiveJsEvent: eventName = ");
        sbLIZ.append(str);
        sbLIZ.append(", params = ");
        sbLIZ.append(mapLJ);
        C1574706En.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        String string4 = null;
        if (interfaceC1107590evd != null) {
            string4 = interfaceC1107590evd.getString("cid");
        }
        if (interfaceC1107590evd == null || (string = interfaceC1107590evd.getString("local_pet_uuid")) == null) {
            string = "";
        }
        switch (str.hashCode()) {
            case -1731660011:
                if (!str.equals("streak_floating_widget_mounted")) {
                    return;
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C1573906Ef(string, string4, mapLJ);
                break;
                break;
            case -1063120458:
                if (!str.equals("im_streak_pet_logger")) {
                    return;
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C06E8(string4, mapLJ);
                break;
                break;
            case 554727172:
                if (!str.equals("streak_floating_widget_hidden_finished")) {
                    return;
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C1573706Ed(string, string4, mapLJ);
                break;
                break;
            case 737369374:
                if (!str.equals("edit_streak_pet_fe_data")) {
                    return;
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C06E1(string, string4, mapLJ);
                break;
                break;
            case 1352247748:
                if (!str.equals("streak_pet_open_card")) {
                    return;
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C06E2(string4, mapLJ);
                break;
                break;
            case 1728831818:
                if (!str.equals("streak_widget_campaign_guide_finished")) {
                    return;
                }
                if (interfaceC1107590evd == null || (string2 = interfaceC1107590evd.getString("campaign_id")) == null) {
                    string2 = "";
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C1574606Em(string, string4, string2, mapLJ);
                break;
                break;
            case 1995273380:
                if (!str.equals("streak_floating_widget_campaign_bubble_show")) {
                    return;
                }
                if (interfaceC1107590evd == null || (string3 = interfaceC1107590evd.getString("campaign_id")) == null) {
                    string3 = "";
                }
                if (string4 == null) {
                    string4 = "";
                }
                c1573906Ef = new C1574506El(string, string4, string3, mapLJ);
                break;
                break;
            default:
                return;
        }
        Iterator<Map.Entry<String, StreakJsEventHandler<?>>> it2 = LLILZLL.entrySet().iterator();
        while (it2.hasNext()) {
            StreakJsEventHandler<?> value = it2.next().getValue();
            if (value.LLILLJJLI.LIZIZ(c1573906Ef)) {
                C01GW c01gw2 = C1574706En.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("StreakPetJsEventHandler tag:");
                sbLIZ2.append(value.LL);
                sbLIZ2.append(" handleEvent: ");
                sbLIZ2.append(c1573906Ef);
                C1574706En.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                value.LLILLL.invoke((T) c1573906Ef);
            } else {
                C01GW c01gw3 = C1574706En.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("StreakPetJsEventHandler tag:");
                sbLIZ3.append(value.LL);
                sbLIZ3.append(" handleEvent: ");
                sbLIZ3.append(c1573906Ef);
                sbLIZ3.append(" not match");
                C1574706En.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }
}
