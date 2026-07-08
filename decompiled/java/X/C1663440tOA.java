package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.channel.download.DownloadRequest;
import com.ss.android.ugc.aweme.sticker.channel.download.DownloadResult;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.text.a0;
import lth.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663440tOA implements InterfaceC1411260mpQ {
    public final InterfaceC1650230t2r LIZ;
    public final boolean LIZIZ = ((Boolean) C264770AZf.LIZ.getValue()).booleanValue();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(542));

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "download";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    public C1663440tOA(InterfaceC1650230t2r interfaceC1650230t2r) {
        this.LIZ = interfaceC1650230t2r;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap = new LinkedHashMap<>();
        Type type = new TypeToken<List<? extends DownloadRequest>>() { // from class: X.0tOC
        }.getType();
        if (!this.LIZIZ) {
            for (DownloadRequest downloadRequest : (Iterable) GsonProtectorUtils.fromJson(o.LIZIZ, jSONArrayOptJSONArray.toString(), type)) {
                linkedHashMap.put(downloadRequest, null);
                LJFF(i, downloadRequest, 0, linkedHashMap);
            }
            return;
        }
        for (DownloadRequest downloadRequest2 : (Iterable) GsonProtectorUtils.fromJson(o.LIZIZ, jSONArrayOptJSONArray.toString(), type)) {
            linkedHashMap.put(downloadRequest2, null);
            if (!downloadRequest2.url.isEmpty()) {
                String str2 = (String) ListProtector.get(downloadRequest2.url, 0);
                if (((IAVEffectService) this.LIZJ.getValue()).checkUrlValid(str2) == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EffectFileDownloadHandler, perform download, url=");
                    sbLIZ.append(str2);
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                    LJFF(i, downloadRequest2, 0, linkedHashMap);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("EffectFileDownloadHandler, download intercepted, url=");
                    sbLIZ2.append(str2);
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ2));
                    linkedHashMap.put(downloadRequest2, new DownloadResult("", 2));
                    LJ(i, linkedHashMap);
                }
            }
        }
    }

    public final void LJ(int i, LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<DownloadRequest, DownloadResult> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == null) {
                return;
            }
            DownloadResult value = entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", value.path);
            jSONObject.put("success", value.success);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interface", "download");
        jSONObject2.put("file_paths", jSONArray);
        C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(jSONObject2));
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }

    public final void LJFF(final int i, final DownloadRequest downloadRequest, final int i2, final LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap) {
        String str;
        Object c098200Yq;
        if (i2 >= downloadRequest.url.size() || (str = (String) ListProtector.get(downloadRequest.url, i2)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1449640npK.LJIILL);
        sbLIZ.append((int) ((short) str.hashCode()));
        sbLIZ.append(File.separator);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            c098200Yq = (String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(new URL(str).getPath(), new String[]{"/"}, 0, 6));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String string = (String) c098200Yq;
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        C0CHQ.LIZ().LIZLLL().downloadFile(str, strLIZIZ, string, 1, new C13UW() { // from class: X.0tOB
            @Override // X.C13UW
            public final void LIZLLL(String str2, String str3) throws JSONException {
                DownloadRequest downloadRequest2 = downloadRequest;
                if (downloadRequest2.needUpzip == 1) {
                    LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap2 = linkedHashMap;
                    this.getClass();
                    String strLJJZ = a0.LJJZ(str3, ".zip", str3);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLJJZ);
                    sbLIZ2.append("_unzip");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                    c2137908Zd.LIZLLL(strLIZIZ2);
                    C08SA.LIZJ(new C0VSJ(str3), new C0VSJ(strLIZIZ2));
                    c2137908Zd.LIZLLL(str3);
                    linkedHashMap2.put(downloadRequest2, new DownloadResult(strLIZIZ2, 1));
                } else {
                    linkedHashMap.put(downloadRequest2, new DownloadResult(str3, 1));
                }
                this.LJ(i, linkedHashMap);
            }

            @Override // X.C13UW
            public final void LIZ(Exception exc, Integer num, String str2) throws JSONException {
                if (i2 < downloadRequest.url.size() - 1) {
                    this.LJFF(i, downloadRequest, i2 + 1, linkedHashMap);
                } else {
                    linkedHashMap.put(downloadRequest, new DownloadResult("", 0));
                    this.LJ(i, linkedHashMap);
                }
            }
        });
    }
}
