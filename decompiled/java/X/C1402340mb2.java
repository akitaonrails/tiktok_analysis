package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;

/* JADX INFO: renamed from: X.0mb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402340mb2 implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C1402340mb2 c1402340mb2) {
    }

    public static final void onComplete$1(C1402340mb2 c1402340mb2) {
    }

    public static final void onError$0(C1402340mb2 c1402340mb2, Throwable th) {
    }

    public static final void onError$1(C1402340mb2 c1402340mb2, Throwable th) {
    }

    public static final void onSubscribe$0(C1402340mb2 c1402340mb2, InterfaceC420801kM interfaceC420801kM) {
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

    public C1402340mb2(C111Q c111q, int i) {
        this.$t = i;
        this.l0 = c111q;
    }

    public static final void onNext$0(C1402340mb2 c1402340mb2, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GeckoHighPriorityCheckInRequest) c1402340mb2.l0).getClass();
            try {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), RunnableC1052350dUX.LL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1383350m6P.LIZ(e);
            }
        }
    }

    public static final void onNext$1(C1402340mb2 c1402340mb2, Object obj) {
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(obj);
    }

    public static final void onSubscribe$1(C1402340mb2 c1402340mb2, InterfaceC420801kM interfaceC420801kM) {
        ((C111Q) c1402340mb2.l0).LLILZLL.LIZ(interfaceC420801kM);
    }

    public C1402340mb2(GeckoHighPriorityCheckInRequest geckoHighPriorityCheckInRequest, Context context, int i) {
        this.$t = i;
        this.l0 = geckoHighPriorityCheckInRequest;
    }
}
