package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0CPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313180CPk {
    public static final InterfaceC313190CPl LIZ = (InterfaceC313190CPl) C09S2.LIZJ(InterfaceC313190CPl.class, Api.LIZ);

    public static BlackList LIZ(int i, int i2) {
        try {
            return LIZ.LIZ(i, i2).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
