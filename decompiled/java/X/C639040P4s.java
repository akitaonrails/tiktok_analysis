package X;

/* JADX INFO: renamed from: X.0P4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639040P4s implements InterfaceC626120Oh8 {
    public final int $t;

    public static final void onComplete$0(C639040P4s c639040P4s) {
    }

    public static final void onComplete$1(C639040P4s c639040P4s) {
    }

    public static final void onError$0(C639040P4s c639040P4s, Throwable th) {
    }

    public static final void onError$1(C639040P4s c639040P4s, Throwable th) {
    }

    public static final void onSubscribe$0(C639040P4s c639040P4s, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C639040P4s c639040P4s, InterfaceC420801kM interfaceC420801kM) {
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

    public C639040P4s(int i) {
        this.$t = i;
    }

    public static final void onNext$0(C639040P4s c639040P4s, Object obj) {
        C596990NbF.LIZIZ = null;
        C596990NbF.LIZJ = null;
    }

    public static final /* bridge */ /* synthetic */ void onNext$1(C639040P4s c639040P4s, Object obj) {
    }
}
