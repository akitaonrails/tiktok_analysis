package X;

/* JADX INFO: renamed from: X.10ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336010ko implements InterfaceC1292040jj8 {
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
            case 3:
                onResult$3(this, obj);
                break;
            case 4:
                onResult$4(this, obj);
                break;
        }
    }

    public C19336010ko(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C19336010ko c19336010ko, Object obj) {
        Throwable th = (Throwable) obj;
        if (!((C09AJ) c19336010ko.l0).isDisposed()) {
            ((C09AJ) c19336010ko.l0).onError(th);
        }
    }

    public static final void onResult$1(C19336010ko c19336010ko, Object obj) {
        Throwable th = (Throwable) obj;
        if (!((C09AJ) c19336010ko.l0).isDisposed()) {
            ((C09AJ) c19336010ko.l0).onError(th);
        }
    }

    public static final void onResult$2(C19336010ko c19336010ko, Object obj) {
        ((C1295960jpS) c19336010ko.l0).setComposition((C1294720jnS) obj);
    }

    public static final void onResult$3(C19336010ko c19336010ko, Object obj) {
        ((C1295960jpS) c19336010ko.l0).setComposition((C1294720jnS) obj);
    }

    public static final void onResult$4(C19336010ko c19336010ko, Object obj) {
        InterfaceC1898930zVz interfaceC1898930zVz = (InterfaceC1898930zVz) c19336010ko.l0;
        if (interfaceC1898930zVz != null) {
            interfaceC1898930zVz.onFail();
        }
    }
}
