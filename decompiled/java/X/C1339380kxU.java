package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339380kxU implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
        }
    }

    public C1339380kxU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C1339380kxU c1339380kxU, Object obj) {
        ((C1295960jpS) c1339380kxU.l0).setComposition((C1294720jnS) obj);
    }

    public static final void onResult$1(C1339380kxU c1339380kxU, Object obj) {
        ((Function1) c1339380kxU.l0).invoke(obj);
    }

    public static final void onResult$2(C1339380kxU c1339380kxU, Object obj) {
        ((Function1) c1339380kxU.l0).invoke(obj);
    }
}
