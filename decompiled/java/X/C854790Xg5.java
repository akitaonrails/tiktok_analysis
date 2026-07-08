package X;

import Y.ARunnableS1S0010000_13;

/* JADX INFO: renamed from: X.0Xg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854790Xg5 implements InterfaceC626120Oh8 {
    public final int $t;

    public static final void onComplete$0(C854790Xg5 c854790Xg5) {
    }

    public static final void onComplete$1(C854790Xg5 c854790Xg5) {
    }

    public static final void onError$0(C854790Xg5 c854790Xg5, Throwable th) {
    }

    public static final void onError$1(C854790Xg5 c854790Xg5, Throwable th) {
    }

    public static final void onSubscribe$0(C854790Xg5 c854790Xg5, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C854790Xg5 c854790Xg5, InterfaceC420801kM interfaceC420801kM) {
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

    public C854790Xg5(int i) {
        this.$t = i;
    }

    public static final void onNext$0(C854790Xg5 c854790Xg5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0X4T.LJJJ = !zBooleanValue;
        if (C0X4T.LJJJI) {
            C0X4T.LJJJI = false;
            return;
        }
        C0X4T.LJJJIL = true;
        if (!C308260C6m.LIZ()) {
            return;
        }
        C823050WQl.LIZIZ().execute(new ARunnableS1S0010000_13(zBooleanValue, 2));
    }

    public static final /* bridge */ /* synthetic */ void onNext$1(C854790Xg5 c854790Xg5, Object obj) {
    }
}
