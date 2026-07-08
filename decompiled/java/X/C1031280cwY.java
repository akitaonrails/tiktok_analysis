package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0cwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031280cwY {
    public static final void LIZ(C1031270cwX c1031270cwX) {
        Aweme aweme;
        c1031270cwX.LLILLL = false;
        for (C1031360cwg c1031360cwg : (ArrayList) c1031270cwX.LLILZ) {
            c1031270cwX.trackOMSDK(c1031360cwg.LIZ, c1031360cwg.LIZIZ, c1031360cwg.LIZJ);
        }
        for (Context context : (ArrayList) c1031270cwX.LLILZIL) {
            InterfaceC1019050ccp interfaceC1019050ccp = (InterfaceC1019050ccp) c1031270cwX.LLILZLL.getValue();
            if (interfaceC1019050ccp != null && interfaceC1019050ccp.LJIILIIL() != null && (aweme = interfaceC1019050ccp.getAweme()) != null) {
                interfaceC1019050ccp.LJJIII(context, aweme);
            }
        }
        ((ArrayList) c1031270cwX.LLILZ).clear();
        ((ArrayList) c1031270cwX.LLILZIL).clear();
    }
}
