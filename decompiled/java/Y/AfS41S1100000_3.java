package Y;

import X.C07YY;
import X.C093E;
import X.C098200Yq;
import X.C09JN;
import X.C0X52;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C1494690ozz;
import X.C1741890vQh;
import X.C189200o6;
import X.C1C7U;
import X.C20012313Rx;
import X.C201955140j;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C2380009Ug;
import X.C2381909Uz;
import X.C2479209na;
import X.C743550TEr;
import X.C934690aQl;
import android.graphics.Bitmap;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommercebase.network.StatusResponse;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS88S1200000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AfS41S1100000_3 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public AfS41S1100000_3(Map map, int i) {
        this.$t = i;
        this.s0 = "mall";
        this.l1 = map;
    }

    public static final void accept$0(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        C1C7U.LIZ("DualDeviceQRCodeHelper@3ef1.getQrCodeBitmap$2");
        Bitmap bitmap = (Bitmap) obj;
        C09JN c09jn = (C09JN) afS41S1100000_3.l1;
        if (c09jn != null) {
            c09jn.accept(bitmap);
        }
        C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "generate bitmap");
        C743550TEr.LIZIZ = afS41S1100000_3.s0;
        C743550TEr.LIZJ = bitmap;
        C1C7U.LIZIZ("DualDeviceQRCodeHelper@3ef1.getQrCodeBitmap$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        int code;
        C1C7U.LIZ("ResponseUtilsKt@ab1d.logApi$1");
        C0X52 c0x52 = (C0X52) obj;
        String str = afS41S1100000_3.s0;
        Map map = (Map) afS41S1100000_3.l1;
        String message = "unknown";
        if (c0x52 != null) {
            try {
                if (c0x52.LIZJ()) {
                    T t = c0x52.LIZIZ;
                    if (t instanceof String) {
                        Pair<Integer, String> pairLIZ = C2381909Uz.LIZ(new JSONObject((String) t));
                        code = pairLIZ.getFirst().intValue();
                        message = pairLIZ.getSecond();
                    } else if ((t instanceof TypedByteArray) && Intrinsics.LJFF(((TypedByteArray) t).mimeType(), "application/json; charset=utf-8")) {
                        Pair<Integer, String> pairLIZ2 = C2381909Uz.LIZ(new JSONObject(new String(((TypedByteArray) t).getBytes(), Charsets.UTF_8)));
                        code = pairLIZ2.getFirst().intValue();
                        message = pairLIZ2.getSecond();
                    } else if (t instanceof BaseResponse) {
                        code = ((BaseResponse) t).status_code;
                        message = ((BaseResponse) t).message;
                    } else if (t instanceof Response) {
                        code = ((Response) t).code;
                        String str2 = ((Response) t).message;
                        if (str2 != null) {
                            message = str2;
                        }
                    } else if (t instanceof com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) {
                        code = ((com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) t).getCode();
                        message = ((com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) t).getMessage();
                    } else if (t instanceof StatusResponse) {
                        code = ((StatusResponse) t).getCode();
                        message = ((StatusResponse) t).getMessage();
                    } else {
                        message = "not_adapted";
                        code = -3;
                    }
                } else {
                    code = c0x52.LIZ.LIZIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } else {
            code = -1;
        }
        C2381909Uz.LIZLLL(str, code, message, c0x52, null, map, 16);
        C189200o6.m2constructorimpl(Unit.LIZ);
        C1C7U.LIZIZ("ResponseUtilsKt@ab1d.logApi$1");
    }

    public static final void accept$2(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        C1C7U.LIZ("ResponseUtilsKt@ab1d.logApi$2");
        Throwable th = (Throwable) obj;
        String str = afS41S1100000_3.s0;
        Map map = (Map) afS41S1100000_3.l1;
        try {
            String message = th.getMessage();
            if (message == null) {
                message = "unknown";
            }
            if (th instanceof C1494690ozz) {
                C2381909Uz.LIZLLL(str, -2, message, null, (C1494690ozz) th, map, 8);
            } else {
                C2381909Uz.LIZLLL(str, -2, message, null, null, map, 24);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        C1C7U.LIZIZ("ResponseUtilsKt@ab1d.logApi$2");
    }

    public static final void accept$3(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        C1C7U.LIZ("LoggerUtils@44c3.logApi$1");
        try {
            C1018703yb.LIZLLL("rd_tiktokec_network", new AwS88S1200000_3((C0X52) obj, (C0X52<Response<Object>>) afS41S1100000_3.s0, (String) afS41S1100000_3.l1, (Pair<String, ? extends Object>[]) 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("LoggerUtils@44c3.logApi$1");
    }

    public static final void accept$4(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        Type type;
        n nVarLJJIJ;
        k kVarLJJIIZ;
        String strLJIL;
        C1C7U.LIZ("LoggerUtils@44c3.logApi$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C1494690ozz) {
            try {
                String requestLog = ((C1494690ozz) th).getRequestLog();
                String path = null;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(n.class));
                    } else {
                        type = new TypeToken<n>() { // from class: X.09Ra
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(requestLog, type);
                    if (!(objLJIIIIZZ instanceof n)) {
                        objLJIIIIZZ = null;
                    }
                    n nVar = (n) objLJIIIIZZ;
                    if (nVar != null && (nVarLJJIJ = nVar.LJJIJ("base")) != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("origin_url")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                        path = new URL(strLJIL).getPath();
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1018703yb.LIZLLL("rd_tiktokec_network", new C2380009Ug(th, path, afS41S1100000_3.s0, (Pair[]) afS41S1100000_3.l1));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C1C7U.LIZIZ("LoggerUtils@44c3.logApi$2");
    }

    public static final void accept$5(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        C1C7U.LIZ("LocalLottieBitmapAsset@1a0d.tryLoad$6");
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "saveBitmap roundBitmap");
        C934690aQl.LJ(afS41S1100000_3.s0, (Bitmap) obj);
        ((Function2) afS41S1100000_3.l1).invoke(Boolean.TRUE, null);
        C1C7U.LIZIZ("LocalLottieBitmapAsset@1a0d.tryLoad$6");
    }

    public static final void accept$6(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        C1C7U.LIZ("RecommendStickerViewModel@c855.fetchRecommendSticker$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Id ");
        sbLIZ.append(afS41S1100000_3.s0);
        sbLIZ.append(" music recommend fail response ");
        sbLIZ.append(((Throwable) obj).getMessage());
        Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ));
        C201955140j.LJIIJ(C20012313Rx.LIZIZ, "fetchRecommendSticker error", th);
        ((C093E) afS41S1100000_3.l1).LIZIZ.onNext(new C07YY(th));
        C1C7U.LIZIZ("RecommendStickerViewModel@c855.fetchRecommendSticker$2");
    }

    public static final void accept$7(AfS41S1100000_3 afS41S1100000_3, Object obj) {
        C1C7U.LIZ("LocalLottieBitmapAsset@d70b.tryLoad$4");
        C20441214yg.LIZIZ("LocalLottieBitmapAsset", "saveBitmap roundBitmap");
        C2479209na c2479209na = C2479209na.LIZ;
        String str = afS41S1100000_3.s0;
        synchronized (c2479209na) {
            if (!c2479209na.LIZ(str)) {
                C2479209na.LIZIZ.put(C2479209na.LIZIZ(str), obj);
            }
        }
        ((Function2) afS41S1100000_3.l1).invoke(Boolean.TRUE, null);
        C1C7U.LIZIZ("LocalLottieBitmapAsset@d70b.tryLoad$4");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:35|8)|33|19|22) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$8(Y.AfS41S1100000_3 r4, java.lang.Object r5) {
        /*
            java.lang.Object r3 = r4.l1
            X.09nV r3 = (X.C2478709nV) r3
            java.lang.String r1 = r4.s0
            byte[] r5 = (byte[]) r5
            r3.getClass()
            java.lang.String r0 = "RoomShareDiskCacheController@a2e7.put$1L"
            X.C1C7U.LIZ(r0)
            monitor-enter(r3)
            X.13TF r0 = r3.LIZ     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L16
            goto L49
        L16:
            r2 = 0
            X.13TG r0 = r0.LIZLLL(r1)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L2e
            java.io.OutputStream r2 = r0.LIZJ()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L2e
            r2.write(r5)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L2e
            r2.flush()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L2e
            r0.LIZIZ()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L2e
            goto L3f
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2e
            goto L3d
        L2e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L50
            goto L3c
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L50
        L3c:
            throw r1     // Catch: java.lang.Throwable -> L50
        L3d:
            if (r2 == 0) goto L47
        L3f:
            r2.close()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L50
            goto L47
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L50
        L47:
            monitor-exit(r3)
            goto L4a
        L49:
            monitor-exit(r3)
        L4a:
            java.lang.String r0 = "RoomShareDiskCacheController@a2e7.put$1L"
            X.C1C7U.LIZIZ(r0)
            return
        L50:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS41S1100000_3.accept$8(Y.AfS41S1100000_3, java.lang.Object):void");
    }

    public AfS41S1100000_3(AwS621S0100000_7 awS621S0100000_7, int i) {
        this.$t = i;
        this.s0 = "user_image";
        this.l1 = awS621S0100000_7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS41S1100000_3(Object obj, C09JN<Bitmap> c09jn, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = c09jn;
    }
}
