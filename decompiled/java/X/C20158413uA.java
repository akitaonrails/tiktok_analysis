package X;

import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20158413uA {
    public static final ConcurrentHashMap<EcomImageAdaptSizeConfigModel, C20159013uG> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(7));

    public static final C20159013uG LIZIZ(EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel, Integer num) {
        return C20158713uD.LIZIZ(ecomImageAdaptSizeConfigModel.width, false, new C20159213uI(num, ecomImageAdaptSizeConfigModel.screenAdaptType, ecomImageAdaptSizeConfigModel.screenWidthStages, ecomImageAdaptSizeConfigModel.adaptTemplate, ecomImageAdaptSizeConfigModel.configScreenWidthStages), 4);
    }

    public static final Integer LIZLLL(EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel, C20159013uG c20159013uG) {
        EnumC20159313uJ value;
        EnumC20158513uB value2;
        int iLIZIZ;
        String str = ecomImageAdaptSizeConfigModel.adaptType;
        if (str != null) {
            EnumC20159313uJ.Companion.getClass();
            value = C20159513uL.LIZ(str);
        } else {
            value = null;
        }
        String str2 = ecomImageAdaptSizeConfigModel.adaptStrategy;
        if (str2 != null) {
            EnumC20158513uB.Companion.getClass();
            EnumC20158513uB[] enumC20158513uBArrValues = EnumC20158513uB.values();
            int length = enumC20158513uBArrValues.length;
            for (int i = 0; i < length; i++) {
                value2 = enumC20158513uBArrValues[i];
                if (Intrinsics.LJFF(value2.getValue(), str2)) {
                    break;
                }
            }
            value2 = null;
        } else {
            value2 = null;
        }
        Integer num = c20159013uG.LIZIZ;
        List<Integer> list = ecomImageAdaptSizeConfigModel.widthStages;
        Integer num2 = c20159013uG.LIZLLL;
        if (num == null) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            list = C20156813tu.LIZ.allStages;
        }
        if (value == null) {
            value = C20158613uC.LIZ.getValue();
        }
        if (num2 != null) {
            iLIZIZ = num2.intValue();
        } else {
            iLIZIZ = C20159213uI.LJII.LIZIZ();
        }
        if (value2 == null) {
            value2 = C20158613uC.LIZIZ.getValue();
        }
        return Integer.valueOf(C20158713uD.LIZ(value, num.intValue(), list, Integer.valueOf(iLIZIZ), value2));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20159013uG LIZ(com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel r4, java.lang.Integer r5, boolean r6) {
        /*
            java.lang.String r1 = r4.width
            if (r1 == 0) goto Lf
            X.13uH r0 = X.EnumC20158813uE.Companion
            r0.getClass()
            X.13uE r0 = X.C20159113uH.LIZ(r1)
            if (r0 != 0) goto L11
        Lf:
            X.13uE r0 = X.EnumC20158813uE.PIX
        L11:
            boolean r0 = r0.isAdaptive()
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeGlobalBean r3 = X.C20156813tu.LIZ
            java.util.List<java.lang.String> r2 = r4.keys
            r3.getClass()
            if (r2 == 0) goto L44
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L44
            java.lang.String r0 = r3.imageAdaptiveSizeWithMainTabBottom
            if (r0 == 0) goto L44
            int r0 = r0.length()
            if (r0 == 0) goto L44
            X.0w72 r1 = X.C1768120w70.LIZ
            if (r1 == 0) goto L44
            java.lang.String r0 = r3.imageAdaptiveSizeWithMainTabBottom
            boolean r0 = X.C13LP.LJJJJ(r0, r2)
            if (r0 == 0) goto L44
            boolean r0 = r1.shouldShowMallTab()
            if (r0 != 0) goto L44
            r0 = 0
            return r0
        L44:
            if (r6 != 0) goto L5c
            boolean r0 = X.C20156813tu.LIZIZ
            if (r0 != 0) goto L5c
            java.util.concurrent.ConcurrentHashMap<com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel, X.13uG> r1 = X.C20158413uA.LIZ
            java.lang.Object r0 = r1.get(r4)
            X.13uG r0 = (X.C20159013uG) r0
            if (r0 != 0) goto L5b
            X.13uG r0 = LIZIZ(r4, r5)
            r1.put(r4, r0)
        L5b:
            return r0
        L5c:
            X.13uG r0 = LIZIZ(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20158413uA.LIZ(com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel, java.lang.Integer, boolean):X.13uG");
    }

    public static final Integer LIZJ(EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel, Integer num, boolean z) {
        C20159013uG c20159013uGLIZ = LIZ(ecomImageAdaptSizeConfigModel, num, z);
        if (c20159013uGLIZ == null) {
            return null;
        }
        if (c20159013uGLIZ.LIZ == EnumC20158813uE.PIX) {
            return c20159013uGLIZ.LIZIZ;
        }
        if (!z && !C20156813tu.LIZIZ) {
            C01GW c01gw = LIZIZ;
            Integer num2 = (Integer) ((ConcurrentHashMap) c01gw.getValue()).get(ecomImageAdaptSizeConfigModel);
            if (num2 == null) {
                Integer numLIZLLL = LIZLLL(ecomImageAdaptSizeConfigModel, c20159013uGLIZ);
                ((ConcurrentHashMap) c01gw.getValue()).put(ecomImageAdaptSizeConfigModel, numLIZLLL);
                return numLIZLLL;
            }
            return num2;
        }
        return LIZLLL(ecomImageAdaptSizeConfigModel, c20159013uGLIZ);
    }
}
