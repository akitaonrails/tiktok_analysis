package X;

import com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider;
import com.ss.android.ugc.aweme.live.LiveVersionCodeProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04T6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04T6 extends C09AY implements Function0<String> {
    public C04T6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ILiveVersionCodeProvider iLiveVersionCodeProvider;
        Object objLIZ = C04TD.LIZ(ILiveVersionCodeProvider.class, false);
        if (objLIZ != null) {
            iLiveVersionCodeProvider = (ILiveVersionCodeProvider) objLIZ;
        } else {
            if (C04TD.Y1 == null) {
                synchronized (ILiveVersionCodeProvider.class) {
                    if (C04TD.Y1 == null) {
                        C04TD.Y1 = new LiveVersionCodeProvider();
                    }
                }
            }
            iLiveVersionCodeProvider = C04TD.Y1;
        }
        iLiveVersionCodeProvider.LIZ();
        return "";
    }
}
