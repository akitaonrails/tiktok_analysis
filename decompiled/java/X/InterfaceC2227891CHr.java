package X;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1CHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2227891CHr {
    C201948140c LIZ(String str, Map map);

    void LIZIZ(JSONObject jSONObject);

    void enableDebug();

    void getCertFailRetryIntervalSeconds();

    Context getContext();

    void getIoExecutor();

    String getRemoteCertDownloadURL();

    String getTimeStampRequestHost();

    void monitorLogSend(String str, String str2);

    C201948140c onRemoteSign(byte[] bArr);
}
