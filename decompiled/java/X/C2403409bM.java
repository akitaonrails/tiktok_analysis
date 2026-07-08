package X;

import android.text.TextUtils;
import com.bytedance.framwork.core.sdklib.apm6.http.DefaultTTNetImpl;
import com.bytedance.framwork.core.sdklib.apm6.http.RetrofitMonitorService;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2403409bM implements InterfaceC2403509bN {
    public final String LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, TypedOutput> LIZJ = new HashMap();

    @Override // X.InterfaceC2403509bN
    public final C2403609bO finish() {
        byte[] bytes;
        int i;
        String str = this.LIZ;
        Map<String, TypedOutput> map = this.LIZJ;
        Map<String, String> map2 = this.LIZIZ;
        RetrofitMonitorService retrofitMonitorService = (RetrofitMonitorService) C1515120pWw.LJIIIZ(RetrofitMonitorService.class, str);
        HashMap map3 = new HashMap();
        try {
            C0X52<TypedInput> c0x52Execute = retrofitMonitorService.uploadFiles(str, map, DefaultTTNetImpl.convertHeaderMap(map2)).execute();
            bytes = DefaultTTNetImpl.toByteArray(c0x52Execute.LIZIZ.in());
            List<C080U> list = c0x52Execute.LIZ.LIZLLL;
            if (list != null && list.size() > 0) {
                for (C080U c080u : list) {
                    map3.put(c080u.LIZ, c080u.LIZIZ);
                }
            }
            i = c0x52Execute.LIZ.LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            JSONObject jSONObject = new JSONObject();
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th.getMessage());
                sbLIZ.append(C0V2X.LIZ(th));
                jSONObject.put("exception", C2188811AlT.LIZIZ(sbLIZ));
                jSONObject.put("exception_object", th.toString());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            bytes = C786410Ut5.J3(jSONObject).getBytes();
            i = 100001;
        }
        return new C2403609bO(i, map3, bytes);
    }

    public C2403409bM(String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }

    @Override // X.InterfaceC2403509bN
    public final void LIZ(String str, String str2) {
        ((HashMap) this.LIZJ).put(str, new TypedString(str2));
    }

    @Override // X.InterfaceC2403509bN
    public final void LIZIZ(final String str, final String str2, final Map map) {
        ((HashMap) this.LIZJ).put(str, new TypedOutput(str, str2, map) { // from class: X.08JE
            public final String LIZ;
            public final Map<String, String> LIZIZ;
            public final String LIZJ;

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String md5Stub() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String mimeType() {
                return "text/plain";
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String fileName() {
                String str3 = this.LIZ;
                Map<String, String> map2 = this.LIZIZ;
                StringBuilder sb = new StringBuilder(str3);
                sb.append("\"");
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    sb.append("; ");
                    sb.append(key);
                    sb.append("=\"");
                    sb.append(value);
                    sb.append("\"");
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final long length() {
                return this.LIZJ.getBytes().length;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(this.LIZJ.getBytes());
            }

            {
                this.LIZ = str;
                this.LIZIZ = map;
                if (TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("defaultData", "none commonParams");
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    this.LIZJ = C786410Ut5.J3(jSONObject);
                    return;
                }
                this.LIZJ = str2;
            }
        });
    }

    @Override // X.InterfaceC2403509bN
    public final void LIZJ(File file, String str, final Map map) {
        Map<String, TypedOutput> map2 = this.LIZJ;
        final TypedFile typedFile = new TypedFile(null, file);
        ((HashMap) map2).put(str, new TypedOutput(map, typedFile) { // from class: X.09bK
            public final TypedFile LIZ;
            public final Map<String, String> LIZIZ;

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String fileName() {
                StringBuilder sb = new StringBuilder(this.LIZ.fileName());
                sb.append("\"");
                for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    sb.append("; ");
                    sb.append(key);
                    sb.append("=\"");
                    sb.append(value);
                    sb.append("\"");
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final long length() {
                return this.LIZ.length();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String md5Stub() {
                return this.LIZ.md5Stub();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String mimeType() {
                return this.LIZ.mimeType();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final void writeTo(OutputStream outputStream) throws IOException {
                this.LIZ.writeTo(outputStream);
            }

            {
                this.LIZIZ = map;
                this.LIZ = typedFile;
            }
        });
    }
}
