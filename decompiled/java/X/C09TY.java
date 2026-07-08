package X;

import com.google.gson.n;
import com.ss.android.ugc.gamora.editor.audioservice.service.memesong.MemeSongRequestApi;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.09TY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TY {
    public static C0X9S LIZ(MemeSongRequestApi.Api api, n nVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("passport-auth", "session");
        linkedHashMap.put("x-tt-token", C0CHQ.LIZ().getAccountService().getUserTTToken());
        C0CHQ.LIZ().getAccountService().getSDKVersion();
        linkedHashMap.put("sdk-version", "2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sessionid=");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).LJIIZILJ());
        linkedHashMap.put("cookie", C2188811AlT.LIZIZ(sbLIZ));
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LJIIIZ = true;
        return api.request("AIMemeSong", "XRJuNuaFGX", nVar, linkedHashMap, c1493620oyG);
    }
}
