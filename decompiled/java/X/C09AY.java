package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.09AY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09AY<R> implements C09B3<R>, Serializable {
    public final int arity;

    public String toString() {
        C09R3 c09r3 = C13LE.LIZ;
        if (((Boolean) C1224004qc.LIZ.getValue()).booleanValue()) {
            return "";
        }
        C13LE.LIZ.getClass();
        return C09R3.LIZ(this);
    }

    @Override // X.C09B3
    public int getArity() {
        return this.arity;
    }

    public C09AY(int i) {
        this.arity = i;
    }
}
