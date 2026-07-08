package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS247S0300000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.080W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080W {
    public static final String LIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6).iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                String str2 = (String) listLJJLIIIJILLIZJL.get(0);
                Object objValueOf = listLJJLIIIJILLIZJL.get(1);
                if (C2095008Iq.LJIIJJI(objValueOf.toString()) != null) {
                    objValueOf = Integer.valueOf(CastIntegerProtector.parseInt(objValueOf.toString()));
                }
                jSONObject.put(str2, objValueOf);
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR97, null, C2097608Jq.LJI(new Pair("exception_description", str), new Pair("exts", String.valueOf(e.getMessage()))));
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.retrofit2.mime.TypedOutput] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    public static final String LIZIZ(Request request) throws IOException {
        String string;
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                request.getBody().writeTo(byteArrayOutputStream);
                string = byteArrayOutputStream.toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = "";
            }
            byteArrayOutputStream.close();
            byteArrayOutputStream = new Regex("\\+").replace(new Regex("%(?![0-9a-fA-F]{2})").replace(string, "%25"), "%2B");
            return URLDecoder.decode((String) byteArrayOutputStream, StandardCharsets.UTF_8.name());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            byteArrayOutputStream.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    public static final String LIZJ(Request request) {
        String strMimeType;
        String strMimeType2;
        String strLIZ;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            TypedOutput body = request.getBody();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getParamFromBodyNew request mimeType = ");
            if (body == null) {
                strMimeType = null;
            } else {
                strMimeType = body.mimeType();
            }
            sbLIZ.append(strMimeType);
            C2188811AlT.LIZIZ(sbLIZ);
            if (body != null) {
                body.writeTo(byteArrayOutputStream);
            }
            C259800zU c259800zU = new C259800zU();
            C1743690vTb.LIZLLL(new AwS247S0300000_3(body, (TypedOutput) byteArrayOutputStream, (ByteArrayOutputStream) c259800zU, (C259800zU<String>) 4));
            if (c259800zU.element == 0) {
                c259800zU.element = byteArrayOutputStream.toString();
            }
            try {
                byteArrayOutputStream.close();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            TypedOutput body2 = request.getBody();
            if (body2 != null) {
                strMimeType2 = body2.mimeType();
            } else {
                strMimeType2 = null;
            }
            if (Intrinsics.LJFF(strMimeType2, "application/x-www-form-urlencoded")) {
                String str = (String) c259800zU.element;
                if (str == null) {
                    str = "";
                }
                strLIZ = LIZ(str);
            } else {
                strLIZ = (String) c259800zU.element;
                if (strLIZ == null) {
                    strLIZ = "";
                }
            }
            return URLDecoder.decode(new Regex("\\+").replace(new Regex("%(?![0-9a-fA-F]{2})").replace(strLIZ, "%25"), "%2B"), StandardCharsets.UTF_8.name());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            C1019103yf.LIZ(EnumC1014603xw.ERR96, null, C2097608Jq.LJI(new Pair("exception_description", request.getUrl())));
            return "";
        }
    }
}
