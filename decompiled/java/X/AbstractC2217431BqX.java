package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2217431BqX extends AbstractC2217471Bqb implements InterfaceC2217461Bqa {
    public final boolean syntheticJavaProperty;

    public abstract /* synthetic */ InterfaceC1221890htz getGetter();

    @Override // X.AbstractC2217471Bqb
    public InterfaceC2217491Bqd compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    @Override // X.AbstractC2217471Bqb
    public InterfaceC2217461Bqa getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC2217461Bqa) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // X.InterfaceC2217461Bqa
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // X.InterfaceC2217461Bqa
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC2217491Bqd interfaceC2217491BqdCompute = compute();
        if (interfaceC2217491BqdCompute != this) {
            return interfaceC2217491BqdCompute.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("property ");
        sbLIZ.append(getName());
        sbLIZ.append(" (Kotlin reflection is not available)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC2217431BqX() {
    }

    public AbstractC2217431BqX(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2217431BqX) {
            AbstractC2217471Bqb abstractC2217471Bqb = (AbstractC2217471Bqb) obj;
            if (getOwner().equals(abstractC2217471Bqb.getOwner()) && getName().equals(abstractC2217471Bqb.getName()) && getSignature().equals(abstractC2217471Bqb.getSignature()) && Intrinsics.LJFF(getBoundReceiver(), abstractC2217471Bqb.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC2217461Bqa)) {
            return false;
        }
        return obj.equals(compute());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2217431BqX(Object obj, Class cls, String str, String str2, int i) {
        boolean z;
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        super(obj, cls, str, str2, z);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
