package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.sync.SyncSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809830Vpl implements InterfaceC810750VrF {
    public static C809830Vpl LIZLLL;
    public InterfaceC809840Vpm LIZ;
    public final Context LIZIZ;
    public volatile AtomicBoolean LIZJ = new AtomicBoolean(false);

    public C809830Vpl(Context context) {
        new AtomicBoolean(false);
        this.LIZIZ = context;
    }

    public static C809830Vpl LIZIZ(Context context) {
        if (LIZLLL == null) {
            synchronized (C809830Vpl.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C809830Vpl(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC810750VrF
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        SyncSDK.onReceiveWsEvent(wsChannelMsg);
    }

    @Override // X.InterfaceC810750VrF
    public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
        boolean z;
        AtomicBoolean atomicBoolean = this.LIZJ;
        if (c821280WJq.LIZIZ == C0XE1.CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        throw null;
    }
}
