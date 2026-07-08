package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;

/* JADX INFO: renamed from: X.0ePN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1087590ePN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IMListenerType.values().length];
        try {
            iArr[IMListenerType.ASYNC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
