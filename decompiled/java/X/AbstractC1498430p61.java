package X;

import com.ttnet.org.chromium.net.k0;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1498430p61 {
    public abstract void onConnectionError(k0 k0Var, int i, String str, String str2);

    public abstract void onConnectionStateChanged(k0 k0Var, int i, String str);

    public void onFeedbackLog(k0 k0Var, String str) {
    }

    public abstract void onMessageReceived(k0 k0Var, ByteBuffer byteBuffer, int i);

    public void onTrafficChanged(k0 k0Var, String str, long j, long j2, boolean z) {
    }
}
