package X;

/* JADX INFO: renamed from: X.0hZA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208980hZA implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
        }
    }

    public static final void dispose$0(C1208980hZA c1208980hZA) {
        InterfaceC1355580lNc interfaceC1355580lNc = (InterfaceC1355580lNc) c1208980hZA.l0;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
    }

    public static final void dispose$1(C1208980hZA c1208980hZA) {
        ((InterfaceC420801kM) c1208980hZA.l0).dispose();
    }

    public C1208980hZA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
