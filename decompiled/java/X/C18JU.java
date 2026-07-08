package X;

import ci3.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.msg.utils.WeakHandler;

/* JADX INFO: renamed from: X.18JU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JU extends a {
    public final /* synthetic */ C2222511Byj LL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public final void bpea_origin_onLooperPrepared() {
        super.onLooperPrepared();
        this.LL.LJI = new WeakHandler(getLooper(), this.LL);
        this.LL.LJII = new WeakHandler(getLooper(), this.LL);
        this.LL.LJIIIIZZ = new WeakHandler(getLooper(), this.LL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18JU(C2222511Byj c2222511Byj) {
        super("UplinkClient");
        this.LL = c2222511Byj;
    }
}
