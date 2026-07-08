package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1BcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208671BcP {
    public final C01GW LIZ;
    public final C2208681BcQ LIZIZ;
    public final HashMap<String, Object> LIZJ = new HashMap<>();

    public static Map LIZLLL() {
        HashMap map = new HashMap();
        for (Map.Entry<String, VEConfigCenter.ValuePkt> entry : VEConfigCenter.getInstance().getConfigs().entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                map.put(entry.getKey(), new C2208711BcT(entry.getKey(), entry.getValue()));
            }
        }
        return map;
    }

    public final Map<String, Object> LIZJ() {
        HashMap map = new HashMap();
        for (String str : this.LIZIZ.LIZ.getAll().keySet()) {
            VEConfigCenter.ValuePkt valuePkt = VEConfigCenter.getInstance().getConfigs().get(str);
            if (valuePkt != null) {
                map.put(str, LIZIZ(this.LIZIZ, new C2208711BcT(str, valuePkt)));
            }
        }
        C0MZY.LIZ.getClass();
        C0MZY.LIZJ();
        return map;
    }

    public final C2208681BcQ LJ() {
        return (C2208681BcQ) this.LIZ.getValue();
    }

    public C2208671BcP(Context context) {
        boolean z;
        this.LIZ = C452501pT.LIZIZ(new C2208721BcU(context));
        boolean z2 = false;
        this.LIZIZ = new C2208681BcQ(C810670Vr7.LIZJ(context, 0, "av_ab_vesdk.xml"));
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_tools_mock_ab_online", true, false)) {
            C0MZY.LIZ.getClass();
            C0MZY.LIZJ();
        }
        VEConfigCenter.setIsLocalTest(false);
        C01GW c01gw = C289290BVn.LIZ;
        if (!C289290BVn.LIZIZ && ((Number) C289290BVn.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        VEConfigCenter.setEnableReadABFromJava(z);
        if (!C289290BVn.LIZIZ && ((Number) C289290BVn.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        }
        VEConfigCenter.setEnableReadABFromABManager(z2);
        if (((Boolean) C292730Bdf.LIZIZ.getValue()).booleanValue()) {
            VEConfigCenter.setExcludedEffectLicenses(C292730Bdf.LIZ);
        }
    }

    public final Pair<Object, Integer> LIZ(InterfaceC2208731BcV interfaceC2208731BcV) {
        boolean zContains;
        int i;
        C0MZY.LIZ.getClass();
        C0MZY.LIZJ();
        Object objLIZIZ = LIZIZ(this.LIZIZ, interfaceC2208731BcV);
        C2208681BcQ c2208681BcQ = this.LIZIZ;
        synchronized (c2208681BcQ) {
            zContains = c2208681BcQ.LIZ.contains(interfaceC2208731BcV.key());
        }
        if (zContains) {
            i = 1;
        } else {
            i = 2;
        }
        return new Pair<>(objLIZIZ, Integer.valueOf(i));
    }

    public static Object LIZIZ(C2208681BcQ c2208681BcQ, InterfaceC2208731BcV interfaceC2208731BcV) {
        int i;
        boolean zBooleanValue;
        EnumC2208691BcR enumC2208691BcRType = interfaceC2208731BcV.type();
        if (enumC2208691BcRType == null) {
            i = -1;
        } else {
            i = C2208701BcS.LIZ[enumC2208691BcRType.ordinal()];
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return c2208681BcQ.LIZLLL(interfaceC2208731BcV);
                        }
                        throw new C1954807lC();
                    }
                    return Float.valueOf(c2208681BcQ.LIZ(interfaceC2208731BcV));
                }
                return Long.valueOf(c2208681BcQ.LIZJ(interfaceC2208731BcV));
            }
            return Integer.valueOf(c2208681BcQ.LIZIZ(interfaceC2208731BcV));
        }
        synchronized (c2208681BcQ) {
            if (interfaceC2208731BcV.type() != EnumC2208691BcR.Boolean) {
                z = false;
            }
            C19864312np.LJ(z);
            Boolean boolValueOf = (Boolean) c2208681BcQ.LIZIZ.get(interfaceC2208731BcV.key());
            if (boolValueOf == null) {
                interfaceC2208731BcV.LIZIZ();
                boolValueOf = Boolean.valueOf(c2208681BcQ.LIZ.getBoolean(interfaceC2208731BcV.key(), ((Boolean) interfaceC2208731BcV.LIZ()).booleanValue()));
                c2208681BcQ.LIZIZ.put(interfaceC2208731BcV.key(), boolValueOf);
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
