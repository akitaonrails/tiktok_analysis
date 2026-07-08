package X;

import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0f7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114880f7O {
    public final QuickChatContent LIZ;
    public final DataChannel LIZIZ;
    public int LIZJ;
    public String LIZLLL = "";

    public final void LIZ(C474500IjA c474500IjA) {
        if (this.LIZ.text.length() > 0) {
            char cCharAt = this.LIZ.text.charAt(0);
            if (!C1110360f06.LIZIZ(cCharAt) && cCharAt != '[') {
                c474500IjA.LJJII(1, "content_type");
            } else {
                c474500IjA.LJJII(2, "content_type");
            }
        }
    }

    public C1114880f7O(QuickChatContent quickChatContent, DataChannel dataChannel) {
        this.LIZ = quickChatContent;
        this.LIZIZ = dataChannel;
    }
}
