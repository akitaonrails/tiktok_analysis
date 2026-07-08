package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.poi.PoiDefaultPrfTrackInterceptor;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0h2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188670h2P {
    public static final C1188670h2P LIZ = new C1188670h2P();

    static {
        C11QJ.LL.LJII(new InterfaceC781210Ukh() { // from class: X.0h2Q
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                SmartRouter.addInterceptor(new PoiDefaultPrfTrackInterceptor());
            }
        }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(90:0|2|(1:4)|5|(1:8)|9|(1:13)|14|(86:231|16|(1:18)|19|241|20|28|(1:30)|31|(1:33)|34|(1:36)(1:42)|37|(1:39)(1:41)|40|251|43|253|44|249|45|(1:47)|48|55|237|56|(1:58)|59|62|239|63|235|64|245|65|233|66|(1:68)|69|(2:71|80)|81|(3:83|(2:85|(0)(1:158))(1:157)|87)(0)|88|(2:90|(1:94))|95|(2:153|(1:155)(1:156))|(1:(1:104)(1:152))|105|(2:107|(1:111))|112|(2:150|151)(4:116|(2:117|(2:119|(2:260|258)(1:257))(2:255|149))|123|(0)(4:125|(1:148)(1:129)|130|(0)(3:134|(2:142|(0)(1:146))(0)|151)))|147|229|159|247|160|(1:162)|163|166|169|(1:171)|172|(1:176)|243|177|227|178|(1:180)|181|184|187|(1:189)|190|(1:(2:195|(1:197)(1:226)))(0)|198|(1:225)|202|(1:204)|205|(1:224)(1:209)|210|(4:212|(1:214)(1:223)|215|(1:217))|218|(1:220)|221|222)(1:23)|27|28|(0)|31|(0)|34|(0)(0)|37|(0)(0)|40|251|43|253|44|249|45|(0)|48|55|237|56|(0)|59|62|239|63|235|64|245|65|233|66|(0)|69|(0)|81|(0)(0)|88|(0)|95|(3:97|153|(0)(0))(0)|(2:100|(0)(0))(1:(0)(0))|105|(0)|112|(3:114|150|151)(0)|147|229|159|247|160|(0)|163|166|169|(0)|172|(2:174|176)(0)|243|177|227|178|(0)|181|184|187|(0)|190|(2:192|(0))(0)|198|(2:200|225)(0)|202|(0)|205|(2:207|224)(0)|210|(0)|218|(0)|221|222) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0440, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0441, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0449, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x044a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x048d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x048e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0496, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0497, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r4 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r4);
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0201, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0203, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0205, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0206, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02be, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041c A[PHI: r0
      0x041c: PHI (r0v67 java.lang.String) = (r0v66 java.lang.String), (r0v162 java.lang.String) binds: [B:82:0x02cc, B:86:0x02d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05cd A[PHI: r0
      0x05cd: PHI (r0v89 java.lang.String) = (r0v88 java.lang.String), (r0v114 java.lang.String) binds: [B:199:0x04cc, B:201:0x04d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05d1 A[PHI: r0
      0x05d1: PHI (r0v115 com.ss.android.ugc.aweme.poi_api.model.PoiLocation) = (r0v84 com.ss.android.ugc.aweme.poi_api.model.PoiLocation), (r0v116 com.ss.android.ugc.aweme.poi_api.model.PoiLocation) binds: [B:196:0x04bf, B:193:0x04b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e4  */
    /* JADX WARN: Type inference failed for: r1v53, types: [T, X.0h22] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.0h22] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe LIZIZ(java.lang.Object r81) {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188670h2P.LIZIZ(java.lang.Object):X.0HZe");
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZJ(Context context, Intent intent) {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Object c098200Yq;
        Bundle bundle;
        if (!C297550BlR.LIZ()) {
            return false;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (!C294780Bgy.LIZ() ? !(c19egLIZIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) c19egLIZIZ).getEnableSAF() : !(c19egLIZIZ instanceof InterfaceC214897198d)) {
            return false;
        }
        InterfaceC214902198i interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
        if (interfaceC214902198iLJIILLIIL == null || (sAFFragmentRootSceneIb = interfaceC214902198iLJIILLIIL.ib()) == null || C1447800nmM.LIZ(sAFFragmentRootSceneIb) == null || intent.getBooleanExtra("ignore_saf", false)) {
            return false;
        }
        C1188750h2X.LIZ.getClass();
        C1188750h2X.LIZJ(intent);
        try {
            AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(791);
            try {
                bundle = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            AnonymousClass1999.LIZLLL(interfaceC214902198iLJIILLIIL, aFwS206S0000000_18, PoiDetailSlashFragment.class, null, -1, bundle, new C199B(null, null, null, false, false, null, null, 119), null, new SAFContextThemeConfig(false, 0));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m8isSuccessimpl(c098200Yq);
    }

    public static void LIZLLL(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        Object obj;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://poi/detail");
        smartRouteBuildRoute.withParam("poi_id", str);
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.withParam("enter_method", str3);
        smartRouteBuildRoute.withParam("init_location", (Serializable) null);
        smartRouteBuildRoute.withParam("type_level", str5);
        smartRouteBuildRoute.withParam("ad_click_id", str4);
        smartRouteBuildRoute.withParam("source_btm_token", str6);
        if (map != null) {
            LIZ.getClass();
            for (Map.Entry entry : map.entrySet()) {
                String str7 = (String) entry.getKey();
                Object value = entry.getValue();
                try {
                    if (value instanceof Boolean) {
                        smartRouteBuildRoute.withParam(str7, ((Boolean) value).booleanValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Bundle) {
                        smartRouteBuildRoute.withParam(str7, (Bundle) value);
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Character) {
                        smartRouteBuildRoute.withParam(str7, ((Character) value).charValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Integer) {
                        smartRouteBuildRoute.withParam(str7, ((Number) value).intValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Long) {
                        smartRouteBuildRoute.withParam(str7, ((Number) value).longValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof String) {
                        smartRouteBuildRoute.withParam(str7, (String) value);
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Float) {
                        smartRouteBuildRoute.withParam(str7, ((Number) value).floatValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Double) {
                        smartRouteBuildRoute.withParam(str7, ((Number) value).doubleValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Short) {
                        smartRouteBuildRoute.withParam(str7, ((Number) value).shortValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Byte) {
                        smartRouteBuildRoute.withParam(str7, ((Number) value).byteValue());
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Parcelable) {
                        smartRouteBuildRoute.withParam(str7, (Parcelable) value);
                        obj = smartRouteBuildRoute;
                    } else if (value instanceof Serializable) {
                        smartRouteBuildRoute.withParam(str7, (Serializable) value);
                        obj = smartRouteBuildRoute;
                    } else {
                        obj = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(obj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        smartRouteBuildRoute.open();
    }
}
