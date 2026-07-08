package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(409));
    public static long LIZIZ;
    public static C0XFJ LIZJ;

    public static Gson LIZIZ() {
        return (Gson) LIZ.getValue();
    }

    public static String LIZ(String str) {
        String str2;
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        C845830XGb c845830XGbLIZ;
        String strOptString = null;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("device_unique_id", str);
            linkedHashMap.put("unique_id_type", "1");
            C0XFJ c0xfj = LIZJ;
            if (c0xfj != null && (c845830XGbLIZ = c0xfj.LIZ(linkedHashMap)) != null) {
                str2 = c845830XGbLIZ.LIZIZ;
            } else {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("data")) == null) {
                return null;
            }
            strOptString = jSONObjectOptJSONObject.optString("digest");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get digest from remote exception: ");
            sbLIZ.append(e.getMessage());
            C0XFF.LIZIZ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ));
            return strOptString;
        }
    }

    public static String LJI(String str) {
        return C08HM.LJ(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x003d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LJFF(android.content.Context r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            java.lang.Class<android.app.blob.BlobStoreManager> r0 = android.app.blob.BlobStoreManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.blob.BlobStoreManager r4 = (android.app.blob.BlobStoreManager) r4
            r0 = 2
            byte[] r3 = android.util.Base64.decode(r5, r0)
            java.lang.String r2 = "SOTLBlobStore"
            r0 = 0
            android.app.blob.BlobHandle r0 = android.app.blob.BlobHandle.createWithSha256(r3, r2, r0, r2)
            android.os.ParcelFileDescriptor r1 = r4.openBlob(r0)
            X.0VSP r4 = new X.0VSP
            java.io.FileDescriptor r0 = r1.getFileDescriptor()
            r4.<init>(r0)
            r3 = 0
            byte[] r2 = X.C2106208My.LIZIZ(r4)     // Catch: java.lang.Throwable -> L35
            X.C2107108Nh.LIZ(r4, r3)
            r1.close()
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            r1.<init>(r2, r0)
            return r1
        L35:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3d
            throw r1     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0 = move-exception
            r3 = r1
            goto L3e
        L3d:
            r0 = move-exception
        L3e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            X.C2107108Nh.LIZ(r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XFI.LJFF(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void LIZJ(int i, long j, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            if (str2 != null) {
                jSONObject.put("error_msg", str2);
            }
            jSONObject.put("version_id", str);
            jSONObject.put("account_num", i);
            jSONObject.put("duration", j);
            C0XFJ c0xfj = LIZJ;
            if (c0xfj != null) {
                c0xfj.sendEvent("oidc_get_token_from_blob_result", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Object LIZLLL(String str, String str2, long j, C0XFN c0xfn, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0XFL(function1, c0xfn, str, str2, j, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public static Object LJ(int i, String str, long j, C0XFN c0xfn, C0XFZ c0xfz, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0XFK(function1, c0xfz, i, str, j, c0xfn, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
