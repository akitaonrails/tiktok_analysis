package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18JG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JG {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(PageFinder pageFinder) {
        JSONObject jSONObjectLIZ = null;
        if (!C255950A1h.LIZ()) {
            return null;
        }
        C18C6 bcmChainByFinder = C18BV.LIZ.getBcmChainByFinder(pageFinder, Collections.singletonList("ecom_entrance"), 30, false);
        if (bcmChainByFinder != null) {
            C1766980w5A.LIZ(bcmChainByFinder);
            jSONObjectLIZ = bcmChainByFinder.LIZ();
        }
        return String.valueOf(jSONObjectLIZ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x003a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LJFF(java.lang.String r5) {
        /*
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r4)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            r3.<init>(r1, r0)
            boolean r0 = r3 instanceof java.io.BufferedWriter
            if (r0 != 0) goto L21
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)
            r3 = r1
        L21:
            r2 = 0
            r3.write(r5)     // Catch: java.lang.Throwable -> L32
            X.C2107108Nh.LIZ(r3, r2)
            byte[] r1 = r4.toByteArray()
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            return r0
        L32:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            r2 = r1
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3a
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18JG.LJFF(java.lang.String):java.lang.String");
    }

    public static Map LIZIZ(String str, PageFinder pageFinder) {
        if (!C255950A1h.LIZ()) {
            return new LinkedHashMap();
        }
        return BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, pageFinder, null, 4, null);
    }

    public static String LJ(PageFinder pageFinder, String str) {
        String strLJFF = null;
        String strLIZLLL = LIZLLL(pageFinder, str, null);
        if (strLIZLLL != null) {
            try {
                strLJFF = LJFF(strLIZLLL);
                return strLJFF;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLJFF;
    }

    public static void LJIIIIZZ(PageFinder pageFinder, BcmParams bcmParams) {
        if (C255950A1h.LIZ()) {
            BtmSDK.INSTANCE.setBcmPageParams(pageFinder, bcmParams, false);
        }
    }

    public static String LIZ(String str, PageFinder pageFinder, BcmParams bcmParams) {
        if (!C255950A1h.LIZ()) {
            return null;
        }
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(str, pageFinder, bcmParams);
    }

    public static String LIZLLL(PageFinder pageFinder, String str, BcmParams bcmParams) {
        if (!C255950A1h.LIZ()) {
            return null;
        }
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = str;
        c21244318Bt.LIZIZ = pageFinder;
        c21244318Bt.LIZJ = bcmParams;
        C18C6 bcmChainByBtmModel = C18BV.LIZ.getBcmChainByBtmModel(c21244318Bt, Collections.singletonList("ecom_entrance"), 30, false);
        if (bcmChainByBtmModel == null) {
            return null;
        }
        C1766980w5A.LIZ(bcmChainByBtmModel);
        JSONObject jSONObjectLIZ = bcmChainByBtmModel.LIZ();
        if (jSONObjectLIZ == null) {
            return null;
        }
        return C786410Ut5.J3(jSONObjectLIZ);
    }

    public static void LJI(Activity activity, String str, String str2) {
        if (!C255950A1h.LIZ()) {
            return;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(activity, str, str2);
    }

    public static void LJII(Fragment fragment, String str, String str2) {
        if (!C255950A1h.LIZ()) {
            return;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(fragment, str, str2);
    }
}
