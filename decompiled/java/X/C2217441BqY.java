package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2217441BqY extends AbstractC2217471Bqb implements C09B3, InterfaceC2217451BqZ {
    public final int arity;
    public final int flags;

    @Override // X.AbstractC2217471Bqb
    public InterfaceC2217491Bqd computeReflected() {
        C13LE.LIZ.getClass();
        return this;
    }

    @Override // X.AbstractC2217471Bqb
    public InterfaceC2217451BqZ getReflected() {
        return (InterfaceC2217451BqZ) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // X.InterfaceC2217451BqZ
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // X.InterfaceC2217451BqZ
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // X.InterfaceC2217451BqZ
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // X.InterfaceC2217451BqZ
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // X.AbstractC2217471Bqb, X.InterfaceC2217491Bqd, X.InterfaceC2217451BqZ
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2217491Bqd interfaceC2217491BqdCompute = compute();
        if (interfaceC2217491BqdCompute != this) {
            return interfaceC2217491BqdCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("function ");
        sbLIZ.append(getName());
        sbLIZ.append(" (Kotlin reflection is not available)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C09B3
    public int getArity() {
        return this.arity;
    }

    public C2217441BqY(int i) {
        this(i, AbstractC2217471Bqb.NO_RECEIVER, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2217441BqY) {
            C2217441BqY c2217441BqY = (C2217441BqY) obj;
            if (getName().equals(c2217441BqY.getName()) && getSignature().equals(c2217441BqY.getSignature()) && this.flags == c2217441BqY.flags && this.arity == c2217441BqY.arity && Intrinsics.LJFF(getBoundReceiver(), c2217441BqY.getBoundReceiver()) && Intrinsics.LJFF(getOwner(), c2217441BqY.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC2217451BqZ)) {
            return false;
        }
        return obj.equals(compute());
    }

    public C2217441BqY(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2217441BqY(int i, Object obj, Class cls, String str, String str2, int i2) {
        boolean z;
        if ((i2 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        super(obj, cls, str, str2, z);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
