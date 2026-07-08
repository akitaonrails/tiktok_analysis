package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0c8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000060c8C {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.n LIZ(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1000060c8C.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):com.google.gson.n");
    }

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        String nativeSiteCustomData;
        Bundle bundle = new Bundle();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
        } else {
            nativeSiteCustomData = null;
        }
        C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
        InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
        if (interfaceC1000280c8YLIZ != null) {
            interfaceC1000280c8YLIZ.LJIJJ(context, bundle, aweme);
        }
        return bundle;
    }
}
