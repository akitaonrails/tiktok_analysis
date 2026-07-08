package X;

import com.ss.android.ugc.aweme.setting.model.RestrictInfo;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0R5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class CallableC690080R5a implements Callable {
    public final /* synthetic */ String LL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("RestrictInfoModel@a22a.getRestrictInfo$1");
        RestrictInfo restrictInfoLIZ = C1380090m19.LIZ(this.LL);
        C1C7U.LIZIZ("RestrictInfoModel@a22a.getRestrictInfo$1");
        return restrictInfoLIZ;
    }

    public CallableC690080R5a(String str) {
        this.LL = str;
    }
}
