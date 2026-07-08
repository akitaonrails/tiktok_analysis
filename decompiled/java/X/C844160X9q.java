package X;

import android.util.Pair;
import com.benchmark.netUtils.BytebenchAPI;
import com.benchmark.network.ByteBenchRequest;
import com.benchmark.network.ByteBenchResponse;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0X9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844160X9q implements InterfaceC844170X9r {
    public final HashMap<String, String> LIZ = new HashMap<>();

    public final ByteArrayOutputStream LIZ(ByteBenchRequest byteBenchRequest, ByteBenchResponse byteBenchResponse) {
        ByteArrayOutputStream byteArrayOutputStream;
        C0X52<TypedInput> c0x52Execute;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map = new HashMap();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(byteBenchRequest.mUrl, linkedHashMap);
            String str = C21309718aN.LJIIZILJ.LJIILL;
            String str2 = (String) pairLIZJ.second;
            boolean z = byteBenchRequest.mUseCommonParams;
            BytebenchAPI bytebenchAPI = (BytebenchAPI) C1515120pWw.LJIILIIL(str).LIZ(BytebenchAPI.class);
            if (z) {
                linkedHashMap.putAll(this.LIZ);
            }
            HashMap<String, String> map2 = byteBenchRequest.mHeaders;
            if (map2 != null) {
                map.putAll(map2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request headers: ");
            sbLIZ.append(map.size());
            C2188811AlT.LIZIZ(sbLIZ);
            C806930Vl5.LIZ("ByteBenchNetWorkImp");
            if (1 == byteBenchRequest.mHttpMethod) {
                c0x52Execute = bytebenchAPI.doPost(str2, linkedHashMap, map, AbstractC842530X3j.LIZJ(C0X0P.LIZJ(byteBenchRequest.mContentType), byteBenchRequest.mRequestBody)).execute();
                for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                    if (c080u.LIZ.equalsIgnoreCase("X-Tt-Logid")) {
                        byteBenchResponse.mLogid = c080u.LIZIZ;
                        c080u.toString();
                        C806930Vl5.LIZ("ByteBenchNetWorkImp");
                    }
                }
            } else {
                c0x52Execute = bytebenchAPI.doGet(str2, linkedHashMap).execute();
            }
            if (c0x52Execute.LIZJ()) {
                InputStream inputStreamIn = c0x52Execute.LIZIZ.in();
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                byteArrayOutputStream = new ByteArrayOutputStream();
                do {
                    try {
                        i = inputStreamIn.read(bArr, 0, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                        if (i > 0) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        byteBenchResponse.mMessage = e.getMessage();
                        return byteArrayOutputStream;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        byteBenchResponse.mMessage = e.getMessage();
                        return byteArrayOutputStream;
                    }
                } while (i > 0);
                byteBenchResponse.mResponseLength = c0x52Execute.LIZIZ.length();
                byteArrayOutputStream2 = byteArrayOutputStream;
            }
            byteBenchResponse.mHttpCode = c0x52Execute.LIZ.LIZIZ;
            return byteArrayOutputStream2;
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = byteArrayOutputStream2;
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
    }
}
