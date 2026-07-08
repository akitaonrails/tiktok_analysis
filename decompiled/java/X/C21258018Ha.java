package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18Ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21258018Ha {
    public static final List<C18EW> LIZ = new ArrayList();

    public static void LIZ(boolean z) {
        try {
            InitBtmSDKTask.LL.getClass();
            if (!InitBtmSDKTask.LLILLL) {
                synchronized (InitBtmSDKTask.class) {
                    try {
                        if (!InitBtmSDKTask.LLILLL) {
                            InitBtmSDKTask.LJIIIZ(true);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            List<C18EW> list = LIZ;
            if (((ArrayList) list).isEmpty()) {
                return;
            }
            BtmSDK.INSTANCE.getService().registerAndRunActivityCallbackIfNotInitOnLaunch(list, z);
            ((ArrayList) list).clear();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            BtmSDK.INSTANCE.getService().setInitStatus(3);
        }
    }
}
