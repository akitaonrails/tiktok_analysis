package X;

import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: X.16HZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HZ implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    public static final void onError$0(C16HZ c16hz, Throwable th) {
    }

    public static final void onSubscribe$0(C16HZ c16hz, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C16HZ c16hz, InterfaceC420801kM interfaceC420801kM) {
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

    public C16HZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$1(C16HZ c16hz, Throwable th) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C151K.LIZ((File) c16hz.l0);
    }

    public static final void onSuccess$0(C16HZ c16hz, Object obj) {
        ((C207245167v) c16hz.l0).LJJI((InterfaceC2262081DgM) obj);
    }

    public static final void onSuccess$1(C16HZ c16hz, Object obj) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C151K.LIZ((File) c16hz.l0);
    }
}
