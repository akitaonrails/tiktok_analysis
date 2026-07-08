package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;

/* JADX INFO: renamed from: X.0ZpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911420ZpE {
    public static final void LIZ(String str, String str2) {
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZLLL(16);
        c1684506ih.LIZJ = str;
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            fakeMsgOperatorService.LIZ(str2, c1684506ih, null, null);
        }
    }
}
