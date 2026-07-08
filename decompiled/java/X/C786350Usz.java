package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.model.RoomUpdateInfoResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Usz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786350Usz implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C786350Usz c786350Usz) {
    }

    public static final void onComplete$1(C786350Usz c786350Usz) {
    }

    public static final void onSubscribe$0(C786350Usz c786350Usz, InterfaceC420801kM interfaceC420801kM) {
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

    public C786350Usz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C786350Usz c786350Usz, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c786350Usz.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    public static final void onError$1(C786350Usz c786350Usz, Throwable th) {
        C20441214yg.LJ("LiveDefaultCoverController", th.toString());
    }

    public static final void onNext$0(C786350Usz c786350Usz, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c786350Usz.l0;
        Object obj2 = ((BaseResponse) obj).data;
        C189200o6.m2constructorimpl(obj2);
        interfaceC1364105Vn.resumeWith(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onNext$1(C786350Usz c786350Usz, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        C780870Uk9 c780870Uk9 = (C780870Uk9) c786350Usz.l0;
        c780870Uk9.getClass();
        if (baseResponse != null) {
            try {
                T t = baseResponse.data;
                if (t != 0 && ((RoomUpdateInfoResult) t).data.booleanValue()) {
                    if (C20441214yg.LIZJ()) {
                        C20441214yg.LIZIZ("LiveDefaultCoverController", "update room cover info");
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cover_pass_audit");
                    c474500IjALIZ.LJJIIZI(c780870Uk9.LIZIZ());
                    c474500IjALIZ.LIZ();
                    return;
                }
                C20441214yg.LJ("LiveDefaultCoverController", baseResponse.toString());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LiveDefaultCoverController", e.toString());
            }
        }
    }

    public static final void onSubscribe$1(C786350Usz c786350Usz, InterfaceC420801kM interfaceC420801kM) {
        ((C780870Uk9) c786350Usz.l0).LJFF.LIZ(interfaceC420801kM);
    }
}
