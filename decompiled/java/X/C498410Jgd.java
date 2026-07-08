package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Jgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498410Jgd {
    public static final void LIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        String str;
        if (dataChannel != null) {
            Boolean bool = (Boolean) dataChannel.gg0(C1082860eHk.class);
            if (bool != null && bool.booleanValue()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjA.LJJII(str, "is_enter_from_trendinglive");
        }
    }

    public static final void LIZIZ(C474500IjA c474500IjA, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str, "is_enter_from_trendinglive");
    }
}
