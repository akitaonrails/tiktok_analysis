package X;

import android.view.View;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ig1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251670ig1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(837));

    public static void LIZ(View view, String str) {
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            Integer tTMockResourceId = ((ITtmockService) LIZ.getValue()).getTTMockResourceId();
            if (view != null && tTMockResourceId != null && str != null) {
                view.setTag(tTMockResourceId.intValue(), str);
            }
        }
    }
}
