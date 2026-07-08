package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973670bRd {
    public static final void LIZ(int i, boolean z, List list) {
        String str;
        long jLongValue;
        String strLJJLIIIJ;
        List listLJJLIIIJILLIZJL;
        List<Long> list2;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        C973660bRc.LJIL(c973660bRc, linkedHashMap, z, 12);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (i == 0) {
            str = "disconnect_pk";
        } else {
            str = "disconnect_punish";
        }
        linkedHashMap.put("request_type", str);
        C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        C973660bRc.LJII(linkedHashMap, false);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        String str2 = C973660bRc.LJJIIZI;
        Object obj = ((LinkedHashMap) C973660bRc.LJLJLLL).get(str2);
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put(str2, obj);
        C973710bRh.LIZ(linkedHashMap);
        if (z) {
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    TeamUsersInfo teamUsersInfo = (TeamUsersInfo) it2.next();
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null && teamUsersInfo.teamId == interfaceC973730bRjYf2.LJJJJJ() && (list2 = teamUsersInfo.userIds) != null) {
                        for (Long l : list2) {
                            C973660bRc c973660bRc2 = C973660bRc.LIZ;
                            long jLJJIJLIJ = C973660bRc.LJJIJLIJ();
                            if (l != null && l.longValue() == jLJJIJLIJ) {
                                linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
                            } else {
                                linkedHashMap.put(C973660bRc.LJJI, l.toString());
                            }
                        }
                    }
                }
            }
            C973660bRc.LJJIJ(list, linkedHashMap);
            if (!C955400ayA.LJJIJL) {
                C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            }
            Map<String, String> map = C973660bRc.LJLJLLL;
            String str3 = C973660bRc.LJJ;
            String str4 = (String) ((LinkedHashMap) map).get(str3);
            if (str4 == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put(str3, str4);
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str4);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            String str5 = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get(C973660bRc.LJJIFFI);
            if (str5 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str5, new String[]{","}, 0, 6)) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                while (it3.hasNext()) {
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) it3.next());
                    if (lLJIILIIL2 != null) {
                        arrayList.add(lLJIILIIL2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((Number) obj3).longValue() != jLongValue) {
                        arrayList2.add(obj3);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(600), 30);
            } else {
                strLJJLIIIJ = null;
            }
            String str6 = C973660bRc.LJJIFFI;
            if (strLJJLIIIJ != null) {
                obj2 = strLJJLIIIJ;
            }
            linkedHashMap.put(str6, obj2);
            String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
            if (strLIZIZ == null) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            C973660bRc.LJZ(c973660bRc, "livesdk_pk_disconnect_show", linkedHashMap, strLIZIZ);
            return;
        }
        String str7 = C973660bRc.LJJ;
        Object obj4 = ((LinkedHashMap) C973660bRc.LJLJLLL).get(str7);
        if (obj4 == null) {
            obj4 = "";
        }
        linkedHashMap.put(str7, obj4);
        String str8 = C973660bRc.LJJI;
        Object obj5 = ((LinkedHashMap) C973660bRc.LJLJLLL).get(str8);
        if (obj5 != null) {
            obj2 = obj5;
        }
        linkedHashMap.put(str8, obj2);
        if (!C955400ayA.LJJIJL) {
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        }
        C973710bRh.LIZ(linkedHashMap);
        C973660bRc.LJZI(c973660bRc, "livesdk_pk_disconnect_show", linkedHashMap, "1v1");
    }
}
