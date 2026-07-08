package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525000pms {
    public final InterfaceC1525070pmz LIZ;
    public final C09BR LIZIZ;

    public static C1524700pmO LIZ(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("socketId", i);
        C1524700pmO c1524700pmO = new C1524700pmO("operateUDPSocket", "ok");
        c1524700pmO.LIZIZ = jSONObject;
        return c1524700pmO;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[PHI: r4
      0x0093: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v0 int), (r4v2 int) binds: [B:18:0x0078, B:20:0x0080, B:24:0x008a, B:28:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1525180pnA LIZIZ(org.json.JSONObject r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525000pms.LIZIZ(org.json.JSONObject):X.0pnA");
    }

    public C1525000pms(InterfaceC1525070pmz interfaceC1525070pmz, C1524990pmr c1524990pmr) {
        this.LIZ = interfaceC1525070pmz;
        this.LIZIZ = c1524990pmr;
    }

    public final C1525120pn4 LIZJ(String str, JSONObject jSONObject) throws JSONException {
        Object c098200Yq;
        String strLIZ;
        Integer numLIZJ;
        String str2;
        byte[] bArr;
        String strEncodeToString;
        byte[] bytes;
        byte[] bytes2;
        int iOptInt = jSONObject.optInt("socketId", 0);
        try {
            strLIZ = C1525010pmt.LIZ(jSONObject);
            numLIZJ = C1525010pmt.LIZJ(jSONObject);
            str2 = "string";
            if (Intrinsics.LJFF(jSONObject.optString("messageType", "string"), "arraybuffer")) {
                str2 = "arraybuffer";
            }
            Object objOpt = jSONObject.opt("message");
            Object objOpt2 = null;
            if (objOpt == null || !(!Intrinsics.LJFF(objOpt, JSONObject.NULL)) || (strEncodeToString = objOpt.toString()) == null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("__nativeBuffers__");
                if (jSONArrayOptJSONArray != null) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                    if (jSONObjectOptJSONObject != null) {
                        objOpt2 = jSONObjectOptJSONObject.opt("value");
                    }
                    if ((objOpt2 instanceof byte[]) && (bArr = (byte[]) objOpt2) != null) {
                        strEncodeToString = Base64.encodeToString(bArr, 2);
                    }
                }
                this.LIZIZ.onError(iOptInt, -1, "message is required");
                return LIZ(iOptInt).LIZIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (strEncodeToString != null) {
            if (Intrinsics.LJFF(str2, "arraybuffer")) {
                bytes = Base64.decode(strEncodeToString, 0);
            } else {
                bytes = strEncodeToString.getBytes(Charsets.UTF_8);
            }
            int iLJ = C13LZ.LJ(jSONObject.optInt("offset", 0), 0, bytes.length);
            if (Intrinsics.LJFF(str2, "arraybuffer")) {
                bytes2 = Base64.decode(strEncodeToString, 0);
            } else {
                bytes2 = strEncodeToString.getBytes(Charsets.UTF_8);
            }
            int length = bytes2.length - iLJ;
            int iLJ2 = C13LZ.LJ(jSONObject.optInt("length", length), 0, length);
            boolean zOptBoolean = jSONObject.optBoolean("setBroadcast", false);
            if (Intrinsics.LJFF(str, "write")) {
                this.LIZ.LJJLJ(iOptInt, strLIZ, numLIZJ, strEncodeToString, str2, iLJ, iLJ2, zOptBoolean);
            } else if (strLIZ != null) {
                if (numLIZJ != null) {
                    this.LIZ.LJJIFFI(strLIZ, iOptInt, zOptBoolean, strEncodeToString, str2, numLIZJ.intValue(), iLJ, iLJ2);
                } else {
                    this.LIZIZ.onError(iOptInt, 2, "port is invalid");
                    return LIZ(iOptInt).LIZIZ();
                }
            } else {
                this.LIZIZ.onError(iOptInt, 1, "address is invalid");
                return LIZ(iOptInt).LIZIZ();
            }
            C1524700pmO c1524700pmOLIZ = LIZ(iOptInt);
            c1524700pmOLIZ.LIZ(str, "operationType");
            c098200Yq = c1524700pmOLIZ.LIZIZ();
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C09BR c09br = this.LIZIZ;
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = str.concat(" failed");
                }
                c09br.onError(iOptInt, -1, message);
                c098200Yq = LIZ(iOptInt).LIZIZ();
            }
            return (C1525120pn4) c098200Yq;
        }
        this.LIZIZ.onError(iOptInt, -1, "message is required");
        return LIZ(iOptInt).LIZIZ();
    }
}
