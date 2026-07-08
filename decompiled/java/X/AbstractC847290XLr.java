package X;

import com.ttnet.org.chromium.net.impl.TTFrontierConnection;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: X.0XLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC847290XLr {
    public abstract void onAllServiceReady(TTFrontierConnection tTFrontierConnection, boolean z);

    public abstract void onConnectionError(TTFrontierConnection tTFrontierConnection, int i, String str, String str2);

    public abstract void onConnectionMode(TTFrontierConnection tTFrontierConnection, int i);

    public abstract void onConnectionStateChanged(TTFrontierConnection tTFrontierConnection, int i, String str, String str2);

    public void onFeedbackLog(TTFrontierConnection tTFrontierConnection, String str) {
    }

    public abstract void onMessageReceived(TTFrontierConnection tTFrontierConnection, int i, ByteBuffer byteBuffer, Map<String, String> map, boolean z);

    public void onTrafficChanged(TTFrontierConnection tTFrontierConnection, String str, long j, long j2, boolean z) {
    }
}
