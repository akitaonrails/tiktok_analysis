package X;

/* JADX INFO: renamed from: X.09AX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09AX extends AbstractC23140094w implements C09B3<Object>, InterfaceC842703Qz {
    public final int arity;

    @Override // njp.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        C13LE.LIZ.getClass();
        return C09R3.LIZ(this);
    }

    @Override // X.C09B3
    public int getArity() {
        return this.arity;
    }

    public C09AX(int i) {
        this(i, null);
    }

    public C09AX(int i, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.arity = i;
    }
}
