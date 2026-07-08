package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X0T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0T implements InterfaceC841910X0z, C0X0V {
    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LJFF(C841880X0w<Request, C0XLY> c841880X0w) {
        return c841880X0w;
    }

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LIZ(C841880X0w<Request, C0XLY> c841880X0w) {
        Request request;
        final boolean z;
        C0XLY c0xly = c841880X0w.LIZIZ;
        if (c0xly != null && (request = c0xly.LL) != null) {
            try {
                C0XLQ c0xlqUrl = request.url();
                if (c0xlqUrl != null) {
                    final String str = c0xlqUrl.LIZLLL;
                    final String strLJFF = c0xlqUrl.LJFF();
                    final boolean zEquals = c0xlqUrl.LIZ.equals("https");
                    if (request.header("cookie") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    final String strLIZ = c0xly.LIZ("content-type", null);
                    C15O7.LIZIZ(new Callable() { // from class: X.0WAi
                        public final /* synthetic */ String LLILZIL = "4";

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String str2 = strLIZ;
                            String str3 = str;
                            String str4 = strLJFF;
                            boolean z2 = zEquals;
                            String str5 = this.LLILZIL;
                            boolean z3 = z;
                            C1C7U.LIZ("ApiSecurityChecker@c555.send$1L");
                            boolean z4 = str2.contains("video") || str2.contains("audio") || str2.contains("image");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str3);
                            sbLIZ.append(str4);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (z2) {
                                if ((!z4 && str4 != null && !str4.contains("v1/play")) || (z3 && z4)) {
                                    C0X0T.LJ(str3, strLIZIZ, str2, str5, z3, z2);
                                }
                            } else if (!z4 || z3) {
                                C0X0T.LJ(str3, strLIZIZ, str2, str5, z3, z2);
                            }
                            C1C7U.LIZIZ("ApiSecurityChecker@c555.send$1L");
                            return null;
                        }
                    }, C823050WQl.LIZIZ(), null);
                    return c841880X0w;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c841880X0w;
    }

    public static void LJ(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("uri", str2);
            jSONObject.put("cookie", String.valueOf(z));
            jSONObject.put("item_type", str3);
            jSONObject.put("data_protocol", String.valueOf(z2));
            jSONObject.put("netClientType", str4);
            C793770VBv.LJ(EnumC841820X0q.NATIVE_NETWORK_API_LOG.getLogType(), jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
