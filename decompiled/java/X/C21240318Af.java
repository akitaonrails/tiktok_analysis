package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmCheckGeckoData;
import com.bytedance.android.bcm.impl.model.BcmCheckParam;
import com.bytedance.android.bcm.impl.model.BcmUnit;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS25S2000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@InterfaceC1294060jmO
public final class C21240318Af {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(288));
    public static BcmCheckGeckoData LIZLLL = new BcmCheckGeckoData();
    public static final HashMap<String, C18AM> LJ = new HashMap<>();
    public static final HashMap<String, C18AM> LJFF = new HashMap<>();
    public static final HashMap<String, C18AM> LJI = new HashMap<>();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(286));
    public static final ArrayList<InterfaceC21241218Ao> LJIIIIZZ = new ArrayList<>();

    public static ReentrantLock LJI() {
        return (ReentrantLock) LIZJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII() {
        if (!LIZ && C18CS.LIZ.LIZJ().LJIIIZ()) {
            LJI().lock();
            try {
                if (!LIZ) {
                    LIZ = true;
                    if (C18CS.LIZ.LIZJ().LIZJ().LIZIZ() == 1 || !C18IP.LIZ.LIZLLL()) {
                        C18B2 c18b2 = C18B2.LIZ;
                        c18b2.getClass();
                        C18A3 c18a3 = (C18A3) C18B2.LIZJ.getValue(c18b2, C18B2.LIZIZ[0]);
                        if (c18a3 != null) {
                            c18a3.LIZ(new InterfaceC1530410pvb() { // from class: X.18Ah
                                @Override // X.InterfaceC1530410pvb
                                public final void LIZ(InputStream inputStream, String str) {
                                    if (inputStream != null) {
                                        try {
                                            C21240318Af.LJIIIIZZ(inputStream);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C18AE.LIZJ(4003, "convert json or parse model failed", null, null, null, null, null, e, null, 1532);
                                        }
                                    }
                                    boolean z = C21240318Af.LIZ;
                                    C21240318Af.LIZIZ = true;
                                }
                            });
                        }
                    } else {
                        C18B2.LIZ.getClass();
                    }
                    LIZIZ = true;
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJI().unlock();
        }
    }

    public static String LJ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() < 3) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        sbLIZ.append('.');
        sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        sbLIZ.append('.');
        sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJIIIIZZ(InputStream inputStream) {
        LIZLLL = (BcmCheckGeckoData) GsonProtectorUtils.fromJson(C21240218Ae.LJ.getValue(), (Reader) new InputStreamReader(inputStream), BcmCheckGeckoData.class);
        boolean z = false;
        C18CK.LIZJ("bcm_init", AFwS223S0000000_32.get$arr$(287), false);
        List<BcmCheckParam> list = LIZLLL.data.paramsList;
        if (list != null) {
            for (BcmCheckParam bcmCheckParam : list) {
                String str = bcmCheckParam.btmLevel;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 98:
                            if (str.equals("b")) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(bcmCheckParam.btmFullCode);
                                sbLIZ.append(".c0.d0");
                                bcmCheckParam.btmFullCode = C2188811AlT.LIZIZ(sbLIZ);
                                LIZLLL(bcmCheckParam, LJ);
                            }
                            break;
                        case 99:
                            if (str.equals("c")) {
                                LIZLLL(bcmCheckParam, LJI);
                            }
                            break;
                        case 100:
                            if (str.equals("d")) {
                                LIZLLL(bcmCheckParam, LJFF);
                            }
                            break;
                    }
                }
            }
        }
        HashMap<String, C18AM> map = LJI;
        HashMap<String, C18AM> map2 = LJFF;
        C18AL.LIZ(map, C18AL.LIZ);
        C18AL.LIZ(map2, C18AL.LIZIZ);
        if ((!r0.isEmpty()) || (!r1.isEmpty())) {
            z = true;
        }
        C18AL.LIZJ = z;
    }

    public static void LJIIIZ(C21240818Ak c21240818Ak) {
        if (c21240818Ak == null) {
            return;
        }
        try {
            String str = c21240818Ak.LIZJ;
            if (str == null) {
                C18AE.LIZJ(4001, "pageBtm is null", null, null, null, null, null, null, null, 2044);
                return;
            }
            LIZIZ(str, c21240818Ak);
            Regex regex = C18C3.LIZ;
            String strLJI = C18C3.LJI(c21240818Ak.LIZIZ);
            if (strLJI == null) {
                C18AE.LIZJ(4002, "btmId is null", null, null, null, null, null, null, null, 2044);
                return;
            }
            LIZJ(str, strLJI, c21240818Ak);
            Iterator<InterfaceC21241218Ao> it2 = LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().check();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18AE.LIZJ(4003, "innerCheck exception", null, null, null, null, null, e, null, 1532);
        }
    }

    public static String LJIIJ(String str) {
        if (a0.LJJIIZI(str, "_i", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_i"}, 0, 6);
            if (a0.LJJIIZI((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0), ".d", false)) {
                return (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
            }
            return str;
        }
        return str;
    }

    public static boolean LIZ(BcmUnit bcmUnit, Map map) {
        BcmParams bcmParams;
        Object objOpt;
        if (map == null || (bcmParams = (BcmParams) map.get(bcmUnit.bizType)) == null || (objOpt = bcmParams.opt(bcmUnit.bcmFieldName)) == null) {
            return false;
        }
        if (((!(objOpt instanceof String) && !(objOpt instanceof JSONObject)) || bcmUnit.valueType != EnumC21239918Ab.STRING) && (!(objOpt instanceof Integer) || bcmUnit.valueType != EnumC21239918Ab.INT)) {
            return false;
        }
        if (bcmUnit.paramType == EnumC21240118Ad.ENUM && !bcmUnit.enumValue.contains(objOpt)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, C21240818Ak c21240818Ak) {
        List<BcmUnit> list;
        Map<String, BcmParams> map = c21240818Ak.LIZLLL;
        C18AM c18am = LJ.get(str);
        if (c18am != null && (list = c18am.LIZ) != null) {
            for (BcmUnit bcmUnit : (ArrayList) list) {
                if (!LIZ(bcmUnit, map)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" page params error");
                    C18AE.LIZJ(3002, C2188811AlT.LIZIZ(sbLIZ), str, str, bcmUnit, map, c21240818Ak.LIZ, null, null, 1920);
                }
            }
        }
    }

    public static void LIZLLL(BcmCheckParam bcmCheckParam, HashMap map) {
        EnumC21240118Ad enumC21240118Ad;
        EnumC21239918Ab enumC21239918Ab;
        EnumC21240118Ad enumC21240118Ad2;
        String str = bcmCheckParam.btmFullCode;
        if (str != null) {
            String strLJIIJ = LJIIJ(str);
            C18AM c18am = (C18AM) map.get(strLJIIJ);
            if (c18am == null) {
                c18am = new C18AM();
            }
            List<BcmUnit> list = bcmCheckParam.btmSummaryList;
            if (list != null) {
                for (BcmUnit bcmUnit : list) {
                    if (!Intrinsics.LJFF(bcmUnit.bcmFieldName, "") && !Intrinsics.LJFF(bcmUnit.bizType, "") && (enumC21240118Ad = bcmUnit.paramType) != EnumC21240118Ad.UNDEFINED && (enumC21239918Ab = bcmUnit.valueType) != EnumC21239918Ab.UNDEFINED && (enumC21240118Ad != (enumC21240118Ad2 = EnumC21240118Ad.ENUM) || bcmUnit.enumValue != null)) {
                        if (enumC21240118Ad == enumC21240118Ad2 && enumC21239918Ab == EnumC21239918Ab.INT) {
                            ArrayList arrayList = new ArrayList();
                            List<? extends Object> list2 = bcmUnit.enumValue;
                            if (list2 != null) {
                                for (Object obj : list2) {
                                    if (obj instanceof Number) {
                                        arrayList.add(Integer.valueOf(((Number) obj).intValue()));
                                    }
                                }
                            }
                            bcmUnit.enumValue = arrayList;
                        }
                        ((ArrayList) c18am.LIZ).add(bcmUnit);
                    }
                    C18AE.LIZJ(LivePreCreateNextRoomPlayer.ENABLE, null, null, null, bcmUnit, null, null, null, null, 2030);
                }
            }
            map.put(strLJIIJ, c18am);
        }
    }

    public static void LIZJ(String str, String str2, C21240818Ak c21240818Ak) {
        Map<String, BcmParams> map;
        BcmParams bcmParams;
        List<BcmUnit> list;
        List<BcmUnit> list2;
        Map<String, BcmParams> map2 = c21240818Ak.LJ;
        C18AM c18am = LJFF.get(LJIIJ(str2));
        if (c18am != null && (list2 = c18am.LIZ) != null) {
            for (BcmUnit bcmUnit : (ArrayList) list2) {
                if (!LIZ(bcmUnit, map2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" unit params error");
                    C18AE.LIZJ(3001, C2188811AlT.LIZIZ(sbLIZ), str, str2, bcmUnit, map2, c21240818Ak.LIZ, null, null, 1920);
                }
            }
        }
        C18AM c18am2 = LJI.get(LJ(str2));
        if (c18am2 != null && (list = c18am2.LIZ) != null) {
            for (BcmUnit bcmUnit2 : (ArrayList) list) {
                if (!LIZ(bcmUnit2, map2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(" C params error");
                    C18AE.LIZJ(3001, C2188811AlT.LIZIZ(sbLIZ2), str, str2, bcmUnit2, map2, null, null, null, 1984);
                }
            }
        }
        if (C18AL.LIZJ && !u.LJIIZILJ(str2, ".c0.d0", false) && (map = c21240818Ak.LJ) != null && (bcmParams = map.get("ecom_entrance")) != null && bcmParams.opt("bst_group_type") != null) {
            String strLJII = C18C3.LJII(str2);
            if (strLJII != null) {
                if (C18AL.LIZ.contains(LJ(strLJII)) || C18AL.LIZIZ.contains(strLJII)) {
                    return;
                }
            }
            C18CE c18ce = C18CE.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PageParams: ");
            sbLIZ3.append(c21240818Ak.LIZLLL);
            sbLIZ3.append("\nUnitParams：");
            sbLIZ3.append(map);
            c18ce.LIZIZ(6005, C2188811AlT.LIZIZ(sbLIZ3), null, null, false, new AwS25S2000000_32(str, str2, 0));
        }
    }

    public static List LJFF(String str, String str2, HashMap map) {
        C18AM c18am = (C18AM) map.get(str);
        if (c18am == null) {
            c18am = new C18AM();
        }
        for (BcmUnit bcmUnit : (ArrayList) c18am.LIZ) {
            if (Intrinsics.LJFF(str2, bcmUnit.bcmFieldName)) {
                return bcmUnit.enumValue;
            }
        }
        return null;
    }
}
