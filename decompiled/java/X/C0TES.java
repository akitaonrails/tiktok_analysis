package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0TES, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TES {
    public static String LIZ(DataChannel dataChannel) {
        String str;
        if (dataChannel == null || (str = (String) dataChannel.gg0(C0TZV.class)) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return str;
    }
}
