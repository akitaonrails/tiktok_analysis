package X;

import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;

/* JADX INFO: renamed from: X.1D19, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D19 implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    public static final void onSubscribe$0(C1D19 c1d19, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C1D19 c1d19, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC19474811He
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

    @Override // X.InterfaceC19474811He
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

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
        }
    }

    public C1D19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C1D19 c1d19, Throwable th) {
        ((C1B3D) c1d19.l0).LIZ(new ScanCommonResponse("", null));
    }

    public static final void onError$1(C1D19 c1d19, Throwable th) {
        ((C1B3E) c1d19.l0).LIZ(new ScanCommonResponse("", null));
    }

    public static final void onSuccess$0(C1D19 c1d19, Object obj) {
        ((C1B3D) c1d19.l0).LIZ((ScanCommonResponse) obj);
    }

    public static final void onSuccess$1(C1D19 c1d19, Object obj) {
        ((C1B3E) c1d19.l0).LIZ((ScanCommonResponse) obj);
    }
}
