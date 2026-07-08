package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457750HxF {
    public static final /* synthetic */ C457750HxF LIZ = new C457750HxF();
    public static final C01GW<C457710HxB> LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(85));
    public static volatile IMMediaServiceInternalBridge LIZJ;

    public final IMMediaServiceInternalBridge LIZ() {
        C457710HxB value = LIZJ;
        if (value == null) {
            synchronized (this) {
                try {
                    value = LIZJ;
                    if (value == null) {
                        value = (IMMediaServiceInternalBridge) PluggableExtentionKt.pluggableSpiForReal(IMMediaServiceInternalBridge.class);
                        if (value != null) {
                            LIZJ = value;
                        } else {
                            C457750HxF c457750HxF = LIZ;
                            C2274381E0m.LIZIZ.LIZJ(true, false);
                            c457750HxF.getClass();
                            value = LIZIZ.getValue();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return value;
    }
}
