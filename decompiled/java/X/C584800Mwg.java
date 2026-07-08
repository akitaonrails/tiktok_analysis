package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584800Mwg implements InterfaceC582810MtT {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(487));
    public String LIZIZ;

    public final Aweme LIZ() {
        IAwemeService iAwemeService;
        String str = this.LIZIZ;
        if ((str == null || str.length() == 0) || (iAwemeService = (IAwemeService) this.LIZ.getValue()) == null) {
            return null;
        }
        return iAwemeService.Er(this.LIZIZ);
    }

    public final boolean LIZIZ(String str) {
        Aweme awemeLIZ;
        AwemeRawAd awemeRawAd;
        if (!Intrinsics.LJFF(str, "instant_page") || (awemeLIZ = LIZ()) == null || (awemeRawAd = awemeLIZ.getAwemeRawAd()) == null || awemeRawAd.getDetailBottomBanner() == null) {
            return false;
        }
        return true;
    }
}
