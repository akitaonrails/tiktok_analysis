package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* JADX INFO: renamed from: X.0nnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448730nnr {
    public static final boolean LIZ(InterfaceC1650230t2r interfaceC1650230t2r, Context context) {
        if (interfaceC1650230t2r.pw0().LIZJ() >= interfaceC1650230t2r.pw0().LIZLLL()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131858131);
            creativeToastBuilder.duration(3000L);
            C1390380mHk.LIZJ(context, 3024, creativeToastBuilder);
            return true;
        }
        return false;
    }
}
