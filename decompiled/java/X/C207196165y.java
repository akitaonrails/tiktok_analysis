package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.165y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207196165y {
    public static final C207196165y LIZ = new C207196165y();

    public static int LIZ() {
        return C1570870qyr.LIZ().getInt("feed_ec_card_not_display_request_item_count", 0);
    }

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (((curUserId == null || a0.LJJJIL(curUserId)) && (curUserId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) == null) || a0.LJJJIL(curUserId)) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed_ec_card_no_interest_click_");
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Pair LIZJ() {
        List listLJJLIIIJILLIZJL;
        Long lLJIILIIL;
        Integer numLJIIJJI;
        String string = C1570870qyr.LIZ().getString(LIZIZ(), "");
        int iIntValue = 0;
        long jLongValue = 0;
        if (string != null && a0.LJJIIZI(string, "_", false) && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{"_"}, 0, 6)) != null) {
            String str = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
            if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                iIntValue = numLJIIJJI.intValue();
            }
            String str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
        }
        return new Pair(Integer.valueOf(iIntValue), Long.valueOf(jLongValue));
    }

    public static void LJ(int i, Function1 function1) {
        Object obj;
        Type type;
        ArrayList arrayList = new ArrayList();
        String[] strArrLIZ = C0NHX.LIZ(C1570870qyr.LIZ(), "feed_ec_card_subtype_info");
        int length = strArrLIZ.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 < length) {
                String str = strArrLIZ[i2];
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJ(n.class));
                    } else {
                        type = new TypeToken<n>() { // from class: X.165z
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                    if ((objFromJson instanceof n) && objFromJson != null) {
                        arrayList.add(objFromJson);
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                i2++;
            } else {
                try {
                    break;
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Integer numLIZIZ = C2399609ak.LIZIZ((n) next, "card_subtype");
            if (numLIZIZ != null && numLIZIZ.intValue() == i) {
                obj = next;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar == null) {
            nVar = new n();
            C2399609ak.LJFF(nVar, "card_subtype", Integer.valueOf(i));
            arrayList.add(nVar);
        }
        function1.invoke(nVar);
        Keva kevaLIZ = C1570870qyr.LIZ();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(String.valueOf((n) it3.next()));
        }
        kevaLIZ.storeStringArray("feed_ec_card_subtype_info", (String[]) arrayList2.toArray(new String[0]));
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public static void LIZLLL(C207196165y c207196165y, int i, boolean z, Integer num, Integer num2, int i2) {
        int iIntValue;
        Type type;
        int iIntValue2 = 0;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        c207196165y.getClass();
        if (!z) {
            if (i > 0) {
                ArrayList<n> arrayList = new ArrayList();
                for (String str : C0NHX.LIZ(C1570870qyr.LIZ(), "feed_ec_card_subtype_info")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJ(n.class));
                        } else {
                            type = new TypeToken<n>() { // from class: X.1664
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                        if ((objFromJson instanceof n) && objFromJson != null) {
                            arrayList.add(objFromJson);
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                try {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Integer numLIZIZ = C2399609ak.LIZIZ((n) it2.next(), "card_subtype");
                        if (numLIZIZ != null) {
                            arrayList2.add(numLIZIZ);
                        }
                    }
                    AnonymousClass1661.LJJ.getClass();
                    Integer[] numArr = AnonymousClass1660.LIZIZ;
                    int i3 = 0;
                    do {
                        int iIntValue3 = numArr[i3].intValue();
                        if (!arrayList2.contains(Integer.valueOf(iIntValue3))) {
                            n nVar = new n();
                            C2399609ak.LJFF(nVar, "card_subtype", Integer.valueOf(iIntValue3));
                            arrayList.add(nVar);
                        }
                        i3++;
                    } while (i3 < 3);
                    for (n nVar2 : arrayList) {
                        Integer numLIZIZ2 = C2399609ak.LIZIZ(nVar2, "not_display_request_item_count");
                        if (numLIZIZ2 != null) {
                            iIntValue = numLIZIZ2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C2399609ak.LJFF(nVar2, "not_display_request_item_count", Integer.valueOf(Math.max(0, iIntValue + i)));
                    }
                    Keva kevaLIZ = C1570870qyr.LIZ();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(String.valueOf((n) it3.next()));
                    }
                    kevaLIZ.storeStringArray("feed_ec_card_subtype_info", (String[]) arrayList3.toArray(new String[0]));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                int iLIZ = LIZ() + i;
                if (iLIZ >= 0) {
                    iIntValue2 = iLIZ;
                }
            } else {
                return;
            }
        } else {
            if (num != null) {
                LJ(num.intValue(), new AwS610S0100000_31(num2, 285));
            }
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
        }
        C1570870qyr.LIZ().storeInt("feed_ec_card_not_display_request_item_count", iIntValue2);
    }
}
