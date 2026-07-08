package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1930107hD {
    public static final C1930107hD LIZ = new C1930107hD();
    public static final boolean LIZIZ;

    static {
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"local_test", "daily_monkey_test", "monkey"});
        C844470XAv.LIZ.getClass();
        LIZIZ = setLJLIIL.contains(C844470XAv.LJIILL) || Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE);
    }
}
