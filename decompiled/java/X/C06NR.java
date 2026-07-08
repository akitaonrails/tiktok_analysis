package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigroupshot.IAIGroupShotService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.List;

/* JADX INFO: renamed from: X.06NR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06NR implements IAIGroupShotService {
    public static final C06NR LIZIZ = new C06NR();
    public static volatile IAIGroupShotService LIZJ;

    public final IAIGroupShotService LIZLLL() {
        C06NQ value = LIZJ;
        if (value == null) {
            synchronized (this) {
                try {
                    value = LIZJ;
                    if (value == null) {
                        value = (IAIGroupShotService) PluggableExtentionKt.pluggableSpiForReal(IAIGroupShotService.class);
                        if (value != null) {
                            LIZJ = value;
                        } else {
                            C2274381E0m.LIZIZ.LIZJ(true, false);
                            IAIGroupShotService.LIZ.getClass();
                            value = C06NS.LIZIZ.getValue();
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

    @Override // com.ss.android.ugc.aweme.aigroupshot.IAIGroupShotService
    public final Object LIZJ(InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        return LIZLLL().LIZJ(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aigroupshot.IAIGroupShotService
    public final void LIZ(Context context, SessionInfo sessionInfo) {
        LIZLLL().LIZ(context, sessionInfo);
    }

    @Override // com.ss.android.ugc.aweme.aigroupshot.IAIGroupShotService
    public final void LIZIZ(Context context, SessionInfo sessionInfo) {
        LIZLLL().LIZIZ(context, sessionInfo);
    }
}
