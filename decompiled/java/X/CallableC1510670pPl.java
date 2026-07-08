package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class CallableC1510670pPl<V> implements Callable {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ MLCommonServiceImpl LLILZ;

    public CallableC1510670pPl(Aweme aweme, MLCommonServiceImpl mLCommonServiceImpl, String str, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = mLCommonServiceImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("MLCommonServiceImpl@9ab3.doEmergencyInit$1");
        C1510130pOt c1510130pOtLIZIZ = C1510150pOv.LIZIZ(this.LL, this.LLILLJJLI);
        String str = this.LLILLL;
        if (str != null) {
            c1510130pOtLIZIZ.LJ(str, "enter_from");
        }
        this.LLILZ.checkAndInit(1);
        this.LLILZ.onNotifyCommonEvent("play_prepare", c1510130pOtLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.doEmergencyInit$1");
        return unit;
    }
}
