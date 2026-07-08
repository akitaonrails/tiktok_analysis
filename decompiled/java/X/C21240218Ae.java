package X;

import com.bytedance.android.bcm.impl.model.BcmCheckGeckoData;
import com.bytedance.android.bcm.impl.model.BcmCheckParam;
import com.bytedance.android.bcm.impl.model.BcmUnit;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21240218Ae {
    public static final C01GW<Gson> LJ = C452501pT.LIZIZ(new C09H8());
    public static final C01GW<C18AY> LJFF = C452501pT.LIZIZ(new C21240018Ac());
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public final HashMap<String, C18AY> LIZIZ = new HashMap<>();
    public final List<String> LIZJ = new ArrayList();
    public final Regex LIZLLL = new Regex("[>=]");

    public final void LIZIZ() {
        if (C18CS.LIZ.LIZJ().LJIIIZ() && this.LIZ.compareAndSet(0, 1)) {
            C18CK.LIZ("ParamsChecker_RuleStore", new C21240918Al(), false);
            if (C18CS.LIZ.LIZJ().LIZJ().LIZIZ() == 1 || !C18IP.LIZ.LIZLLL()) {
                C18B2 c18b2 = C18B2.LIZ;
                c18b2.getClass();
                C18A3 c18a3 = (C18A3) C18B2.LIZJ.getValue(c18b2, C18B2.LIZIZ[0]);
                if (c18a3 != null) {
                    try {
                        C18CK.LIZ("ParamsChecker_RuleStore", new C21240718Aj(c18a3), false);
                        c18a3.LIZ(new InterfaceC1530410pvb() { // from class: X.18Ag
                            @Override // X.InterfaceC1530410pvb
                            public final void LIZ(InputStream inputStream, String str) {
                                if (this.LIZ.LIZ.compareAndSet(1, 2)) {
                                    C18CK.LIZ("ParamsChecker_RuleStore", new AwS572S0100000_28(inputStream, 25), false);
                                    if (inputStream != null) {
                                        try {
                                            this.LIZ.LIZJ(inputStream);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C18AE.LIZJ(4003, "convert json or parse model failed", null, null, null, null, null, th, null, 1532);
                                        }
                                    }
                                }
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C18AE.LIZJ(4003, "init BcmParamsChecker failed", null, null, null, null, null, th, null, 1532);
                        return;
                    }
                }
            } else {
                C18B2.LIZ.getClass();
            }
            C18CK.LIZ("ParamsChecker_RuleStore", AFwS223S0000000_32.get$arr$(27), false);
            this.LIZ.set(2);
        }
    }

    public final C18AY LIZ(String str) {
        String strReplace = null;
        if (this.LIZ.get() == 3) {
            List<String> list = this.LIZJ;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                        return null;
                    }
                }
            }
            HashMap<String, C18AY> map = this.LIZIZ;
            Regex regex = C18C3.LIZ;
            if (str != null) {
                strReplace = C18C3.LIZ.replace(str, "");
            }
            C18AY c18ay = map.get(strReplace);
            if (c18ay != null) {
                return c18ay;
            }
            HashMap<String, C18AY> map2 = this.LIZIZ;
            if (str.length() == 0) {
                str = "";
            } else {
                int iLJFF = C18C3.LJFF(3, str);
                if (iLJFF > 0) {
                    str = str.substring(0, iLJFF);
                }
            }
            C18AY c18ay2 = map2.get(str);
            if (c18ay2 == null) {
                return LJFF.getValue();
            }
            return c18ay2;
        }
        LIZIZ();
        return null;
    }

    public final void LIZJ(InputStream inputStream) {
        String strReplace;
        EnumC21240118Ad enumC21240118Ad;
        int iLJI;
        int iIntValue;
        List<? extends Object> list;
        ArrayList arrayList;
        String str;
        Integer numLJIIJJI;
        BcmCheckGeckoData bcmCheckGeckoData = (BcmCheckGeckoData) GsonProtectorUtils.fromJson(LJ.getValue(), (Reader) new InputStreamReader(inputStream), BcmCheckGeckoData.class);
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        List<BcmCheckParam> list2 = bcmCheckGeckoData.data.paramsList;
        int i = 1;
        if (list2 != null) {
            for (BcmCheckParam bcmCheckParam : list2) {
                Regex regex = C18C3.LIZ;
                String str2 = bcmCheckParam.btmFullCode;
                if (str2 != null && (strReplace = C18C3.LIZ.replace(str2, "")) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    List<BcmUnit> list3 = bcmCheckParam.btmSummaryList;
                    if (list3 != null) {
                        for (BcmUnit bcmUnit : list3) {
                            if (bcmUnit.paramType == EnumC21240118Ad.ENUM && bcmUnit.valueType == EnumC21239918Ab.INT) {
                                List<? extends Object> list4 = bcmUnit.enumValue;
                                if (list4 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj : list4) {
                                        if ((obj instanceof String) && (str = (String) obj) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                                            arrayList.add(numLJIIJJI);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                bcmUnit.enumValue = arrayList;
                            }
                            if (!Intrinsics.LJFF(bcmUnit.bcmFieldName, "") && (enumC21240118Ad = bcmUnit.paramType) != EnumC21240118Ad.UNDEFINED && bcmUnit.valueType != EnumC21239918Ab.UNDEFINED && ((enumC21240118Ad != EnumC21240118Ad.ENUM || ((list = bcmUnit.enumValue) != null && !list.isEmpty())) && bcmUnit.androidFlag == i)) {
                                C18IP c18ip = C18IP.LIZ;
                                c18ip.getClass();
                                String str3 = (String) C18IP.LJIJJ.getValue(c18ip, C18IP.LIZIZ[17]);
                                for (String str4 : bcmUnit.version) {
                                    if (!(a0.LJJIIZI(str4, "=", false) & u.LJIIZILJ(str4, str3, false))) {
                                        if (a0.LJJIIZI(str4, ">", false)) {
                                            String strReplace2 = this.LIZLLL.replace(str4, "");
                                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{e3.d}, 0, 6);
                                            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strReplace2, new String[]{e3.d}, 0, 6);
                                            int size = listLJJLIIIJILLIZJL.size();
                                            int size2 = listLJJLIIIJILLIZJL2.size();
                                            int iMin = Math.min(size, size2);
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 < iMin) {
                                                    Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, i2));
                                                    int iIntValue2 = -1;
                                                    if (numLJIIJJI2 != null) {
                                                        iIntValue = numLJIIJJI2.intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    Integer numLJIIJJI3 = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL2, i2));
                                                    if (numLJIIJJI3 != null) {
                                                        iIntValue2 = numLJIIJJI3.intValue();
                                                    }
                                                    iLJI = Intrinsics.LJI(iIntValue, iIntValue2);
                                                    if (iLJI != 0) {
                                                        break;
                                                    } else {
                                                        i2++;
                                                    }
                                                } else {
                                                    iLJI = Intrinsics.LJI(size, size2);
                                                    break;
                                                }
                                            }
                                            if (iLJI > 0) {
                                            }
                                        }
                                    }
                                    arrayList2.add(bcmUnit);
                                }
                            }
                            i = 1;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        c118300cf.element++;
                        this.LIZIZ.put(strReplace, new C18AY(arrayList2, bcmCheckParam.extraRules));
                    } else {
                        c118300cf2.element++;
                    }
                }
                i = 1;
            }
        }
        ((ArrayList) this.LIZJ).addAll(bcmCheckGeckoData.data.ignoreCheckBtm);
        C18AS.LIZ = bcmCheckGeckoData.data.ignoreCheckParamsType;
        if (!this.LIZIZ.isEmpty()) {
            this.LIZ.set(3);
            C18CK.LIZ("ParamsChecker_RuleStore", new AwS159S0400000_32(bcmCheckGeckoData, this, c118300cf, c118300cf2, 1), false);
        }
    }
}
