package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.AIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseAIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseGetAvatars;
import com.ss.android.ugc.aweme.aigc.ResponseQuickGenerate;
import com.ss.android.ugc.aweme.aigc.ResponseSlowGenerate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1Bn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215321Bn8 {
    public static String LIZLLL;
    public static final Map<EnumC1221320ht4, List<InterfaceC1221660htc>> LIZ = new LinkedHashMap();
    public static final Map<EnumC1221320ht4, String> LIZIZ = new LinkedHashMap();
    public static final Map<String, C2215331Bn9> LIZJ = new LinkedHashMap();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(37));

    public static boolean LIZ() {
        if (!o.LJIIZILJ.isLogin() || o.LJIIZILJ.getCurrentUserID().length() == 0) {
            return false;
        }
        String str = LIZLLL;
        if (str == null || !Intrinsics.LJFF(str, o.LJIIZILJ.getCurrentUserID())) {
            ((LinkedHashMap) LIZ).clear();
            ((LinkedHashMap) LIZIZ).clear();
            ((LinkedHashMap) LIZJ).clear();
            LIZLLL = o.LJIIZILJ.getCurrentUserID();
        }
        return true;
    }

    public static AIGCApi LIZJ() {
        return (AIGCApi) LJ.getValue();
    }

    public static C1221710hth LJ(ResponseAIGCTaskStatus responseAIGCTaskStatus, ResponseGetAvatars responseGetAvatars) {
        Integer num;
        int i;
        String str;
        String str2;
        AIGCTaskStatus aIGCTaskStatus;
        AIGCTaskStatus aIGCTaskStatus2;
        AIGCTaskStatus aIGCTaskStatus3;
        String str3;
        String str4;
        AIGCTaskStatus aIGCTaskStatus4;
        AIGCTaskStatus aIGCTaskStatus5;
        AIGCTaskStatus aIGCTaskStatus6;
        String str5;
        List<String> list;
        AIGCTaskStatus aIGCTaskStatus7;
        AIGCTaskStatus aIGCTaskStatus8;
        String str6;
        Integer numValueOf;
        AIGCTaskStatus aIGCTaskStatus9;
        AIGCTaskStatus aIGCTaskStatus10;
        Float f;
        AIGCTaskStatus aIGCTaskStatus11;
        String str7;
        String str8;
        AIGCTaskStatus aIGCTaskStatus12;
        AIGCTaskStatus aIGCTaskStatus13;
        AIGCTaskStatus aIGCTaskStatus14;
        List<AIGCTaskStatus> list2;
        AIGCTaskStatus aIGCTaskStatus15;
        String str9 = null;
        num = null;
        Integer num2 = null;
        str = null;
        String str10 = null;
        str = null;
        String str11 = null;
        str = null;
        String str12 = null;
        str9 = null;
        if (responseAIGCTaskStatus != null && (list2 = responseAIGCTaskStatus.tasks) != null && (aIGCTaskStatus15 = (AIGCTaskStatus) C13LP.LJJJLL(list2)) != null) {
            num = aIGCTaskStatus15.status;
        } else {
            num = null;
        }
        int status = EnumC2215361BnC.SUBMIT.getStatus();
        if (num != null && num.intValue() == status) {
            int i2 = responseAIGCTaskStatus.status_code;
            List<AIGCTaskStatus> list3 = responseAIGCTaskStatus.tasks;
            if (list3 != null && (aIGCTaskStatus14 = (AIGCTaskStatus) C13LP.LJJJLL(list3)) != null) {
                str7 = aIGCTaskStatus14.taskId;
            } else {
                str7 = null;
            }
            EnumC1221680hte enumC1221680hte = EnumC1221680hte.WAITING;
            List<AIGCTaskStatus> list4 = responseAIGCTaskStatus.tasks;
            if (list4 != null && (aIGCTaskStatus13 = (AIGCTaskStatus) C13LP.LJJJLL(list4)) != null) {
                str8 = aIGCTaskStatus13.jobType;
            } else {
                str8 = null;
            }
            List<AIGCTaskStatus> list5 = responseAIGCTaskStatus.tasks;
            if (list5 != null && (aIGCTaskStatus12 = (AIGCTaskStatus) C13LP.LJJJLL(list5)) != null) {
                num2 = aIGCTaskStatus12.waitingTime;
            }
            return new C1221710hth(enumC1221680hte, i2, str7, null, null, null, str8, num2, 112);
        }
        int status2 = EnumC2215361BnC.PROCESS.getStatus();
        if (num != null && num.intValue() == status2) {
            int i3 = responseAIGCTaskStatus.status_code;
            List<AIGCTaskStatus> list6 = responseAIGCTaskStatus.tasks;
            if (list6 != null && (aIGCTaskStatus11 = (AIGCTaskStatus) C13LP.LJJJLL(list6)) != null) {
                str6 = aIGCTaskStatus11.taskId;
            } else {
                str6 = null;
            }
            EnumC1221680hte enumC1221680hte2 = EnumC1221680hte.IN_PROGRESS;
            List<AIGCTaskStatus> list7 = responseAIGCTaskStatus.tasks;
            if (list7 != null && (aIGCTaskStatus10 = (AIGCTaskStatus) C13LP.LJJJLL(list7)) != null && (f = aIGCTaskStatus10.percentage) != null) {
                numValueOf = Integer.valueOf((int) (f.floatValue() * 100));
            } else {
                numValueOf = null;
            }
            List<AIGCTaskStatus> list8 = responseAIGCTaskStatus.tasks;
            if (list8 != null && (aIGCTaskStatus9 = (AIGCTaskStatus) C13LP.LJJJLL(list8)) != null) {
                str10 = aIGCTaskStatus9.jobType;
            }
            return new C1221710hth(enumC1221680hte2, i3, str6, null, numValueOf, null, str10, null, 336);
        }
        int status3 = EnumC2215361BnC.SUCCESS.getStatus();
        if (num != null && num.intValue() == status3) {
            int i4 = responseAIGCTaskStatus.status_code;
            List<AIGCTaskStatus> list9 = responseAIGCTaskStatus.tasks;
            if (list9 != null && (aIGCTaskStatus8 = (AIGCTaskStatus) C13LP.LJJJLL(list9)) != null) {
                str5 = aIGCTaskStatus8.taskId;
            } else {
                str5 = null;
            }
            EnumC1221680hte enumC1221680hte3 = EnumC1221680hte.SUCCESS;
            if (responseGetAvatars != null) {
                list = responseGetAvatars.avatarUrls;
            } else {
                list = null;
            }
            C1221640hta c1221640hta = new C1221640hta(list, null, null);
            List<AIGCTaskStatus> list10 = responseAIGCTaskStatus.tasks;
            if (list10 != null && (aIGCTaskStatus7 = (AIGCTaskStatus) C13LP.LJJJLL(list10)) != null) {
                str11 = aIGCTaskStatus7.jobType;
            }
            return new C1221710hth(enumC1221680hte3, i4, str5, null, null, c1221640hta, str11, null, 304);
        }
        int status4 = EnumC2215361BnC.FAILED.getStatus();
        if (num != null && num.intValue() == status4) {
            int i5 = responseAIGCTaskStatus.status_code;
            List<AIGCTaskStatus> list11 = responseAIGCTaskStatus.tasks;
            if (list11 != null && (aIGCTaskStatus6 = (AIGCTaskStatus) C13LP.LJJJLL(list11)) != null) {
                str3 = aIGCTaskStatus6.taskId;
            } else {
                str3 = null;
            }
            EnumC1221680hte enumC1221680hte4 = EnumC1221680hte.FAIL;
            List<AIGCTaskStatus> list12 = responseAIGCTaskStatus.tasks;
            if (list12 != null && (aIGCTaskStatus5 = (AIGCTaskStatus) C13LP.LJJJLL(list12)) != null) {
                str4 = aIGCTaskStatus5.statusMessage;
            } else {
                str4 = null;
            }
            List<AIGCTaskStatus> list13 = responseAIGCTaskStatus.tasks;
            if (list13 != null && (aIGCTaskStatus4 = (AIGCTaskStatus) C13LP.LJJJLL(list13)) != null) {
                str12 = aIGCTaskStatus4.jobType;
            }
            return new C1221710hth(enumC1221680hte4, i5, str3, str4, null, null, str12, null, 352);
        }
        if (responseAIGCTaskStatus != null && Integer.valueOf(responseAIGCTaskStatus.status_code) != null && (i = responseAIGCTaskStatus.status_code) != 0) {
            List<AIGCTaskStatus> list14 = responseAIGCTaskStatus.tasks;
            if (list14 != null && (aIGCTaskStatus3 = (AIGCTaskStatus) C13LP.LJJJLL(list14)) != null) {
                str = aIGCTaskStatus3.taskId;
            } else {
                str = null;
            }
            EnumC1221680hte enumC1221680hte5 = EnumC1221680hte.FAIL;
            List<AIGCTaskStatus> list15 = responseAIGCTaskStatus.tasks;
            if (list15 != null && (aIGCTaskStatus2 = (AIGCTaskStatus) C13LP.LJJJLL(list15)) != null) {
                str2 = aIGCTaskStatus2.statusMessage;
            } else {
                str2 = null;
            }
            List<AIGCTaskStatus> list16 = responseAIGCTaskStatus.tasks;
            if (list16 != null && (aIGCTaskStatus = (AIGCTaskStatus) C13LP.LJJJLL(list16)) != null) {
                str9 = aIGCTaskStatus.jobType;
            }
            return new C1221710hth(enumC1221680hte5, i, str, str2, null, null, str9, null, 352);
        }
        return new C1221710hth(EnumC1221680hte.NONE, -1, null, null, null, null, null, null, 508);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2215331Bn9 LIZLLL(EnumC1221320ht4 enumC1221320ht4, String str, C1221750htl c1221750htl) {
        String str2;
        if (!LIZ()) {
            return null;
        }
        C20175213ws c20175213ws = C20175213ws.LIZ;
        EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_GEN_MORE;
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LIZJ().getClass();
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) C2215311Bn7.LIZ().generateMore(str).LJL(C11S5.LIZ()).LIZLLL();
        if (responseQuickGenerate.status_code == 0 && (str2 = responseQuickGenerate.taskId) != null && str2.length() != 0) {
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
            String str3 = responseQuickGenerate.taskId;
            if (str3 != null) {
                if (c1221750htl != null) {
                    Map<EnumC1221320ht4, List<InterfaceC1221660htc>> map = LIZ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    if (linkedHashMap.get(enumC1221320ht4) == null) {
                        map.put(enumC1221320ht4, new ArrayList());
                    }
                    List list = (List) linkedHashMap.get(enumC1221320ht4);
                    if (list != null) {
                        list.add(c1221750htl);
                    }
                }
                LIZIZ.put(enumC1221320ht4, str3);
                C2215331Bn9 c2215331Bn9 = new C2215331Bn9(str3, LIZJ(), null);
                LIZJ.put(str3, c2215331Bn9);
                List list2 = (List) ((LinkedHashMap) LIZ).get(enumC1221320ht4);
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        c2215331Bn9.registerListener((InterfaceC1221660htc) it2.next());
                    }
                }
                c2215331Bn9.start();
                return c2215331Bn9;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, String.valueOf(Integer.valueOf(responseQuickGenerate.status_code)), responseQuickGenerate.status_msg, 8);
        return null;
    }

    public static C2215331Bn9 LIZIZ(EnumC1221320ht4 enumC1221320ht4, JSONArray jSONArray, JSONArray jSONArray2, C1221750htl c1221750htl) {
        String str;
        if (!LIZ()) {
            return null;
        }
        C20175213ws c20175213ws = C20175213ws.LIZ;
        EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_SLOW_GEN;
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LIZJ().getClass();
        ResponseSlowGenerate responseSlowGenerate = C2215311Bn7.LIZ().slowGenerate(jSONArray, jSONArray2).execute().LIZIZ;
        if (responseSlowGenerate.status_code == 0 && (str = responseSlowGenerate.taskId) != null && str.length() != 0) {
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
            String str2 = responseSlowGenerate.taskId;
            if (str2 != null) {
                if (c1221750htl != null) {
                    Map<EnumC1221320ht4, List<InterfaceC1221660htc>> map = LIZ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    if (linkedHashMap.get(enumC1221320ht4) == null) {
                        map.put(enumC1221320ht4, new ArrayList());
                    }
                    List list = (List) linkedHashMap.get(enumC1221320ht4);
                    if (list != null) {
                        list.add(c1221750htl);
                    }
                }
                LIZIZ.put(enumC1221320ht4, str2);
                C2215331Bn9 c2215331Bn9 = new C2215331Bn9(str2, LIZJ(), null);
                LIZJ.put(str2, c2215331Bn9);
                List list2 = (List) ((LinkedHashMap) LIZ).get(enumC1221320ht4);
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        c2215331Bn9.registerListener((InterfaceC1221660htc) it2.next());
                    }
                }
                c2215331Bn9.start();
                return c2215331Bn9;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, String.valueOf(responseSlowGenerate.status_code), responseSlowGenerate.status_msg, 8);
        return null;
    }
}
