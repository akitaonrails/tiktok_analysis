package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;

/* JADX INFO: renamed from: X.0qYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554460qYO implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C1554460qYO c1554460qYO) {
    }

    public static final void onComplete$1(C1554460qYO c1554460qYO) {
    }

    public static final void onError$0(C1554460qYO c1554460qYO, Throwable th) {
    }

    public static final void onError$1(C1554460qYO c1554460qYO, Throwable th) {
    }

    public static final void onSubscribe$0(C1554460qYO c1554460qYO, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C1554460qYO c1554460qYO, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
        }
    }

    public static final void onNext$0(C1554460qYO c1554460qYO, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GeckoCheckInRequest) c1554460qYO.l0).LIZ();
        }
    }

    public static final void onNext$1(C1554460qYO c1554460qYO, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GeckoLocalRequest) c1554460qYO.l0).getClass();
            try {
                C1552050qUV.LIZJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1383350m6P.LIZ(e);
            }
        }
    }

    public C1554460qYO(GeckoCheckInRequest geckoCheckInRequest, Context context, int i) {
        this.$t = i;
        this.l0 = geckoCheckInRequest;
    }

    public C1554460qYO(GeckoLocalRequest geckoLocalRequest, Context context, int i) {
        this.$t = i;
        this.l0 = geckoLocalRequest;
    }
}
