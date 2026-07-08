package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0qFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542800qFa implements InterfaceC1542880qFi {
    public static final C1542800qFa LIZ = new C1542800qFa();
    public static int LIZIZ;

    @Override // X.InterfaceC1542880qFi
    public final C1542830qFd LIZ() {
        return new C1542830qFd(this);
    }

    @Override // X.InterfaceC1542880qFi
    public final String W2() {
        C1535830q4L c1535830q4LLJJLIIIJL;
        String str;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return (iSparkHostApi == null || (c1535830q4LLJJLIIIJL = iSparkHostApi.LJJLIIIJL()) == null || (str = c1535830q4LLJJLIIIJL.LIZIZ) == null) ? "" : str;
    }

    @Override // X.InterfaceC1542880qFi
    public final Executor LIZIZ() {
        return C823050WQl.LIZJ();
    }
}
