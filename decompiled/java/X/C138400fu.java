package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C138400fu implements InterfaceC944203ma {
    public final CharSequence LIZ;
    public int LIZIZ = -1;

    @Override // X.InterfaceC944203ma
    public final String[] LIZ() {
        return new String[]{this.LIZ.toString()};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138400fu) && Intrinsics.LJFF(this.LIZ, ((C138400fu) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StringInputElement(textValue=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC944203ma
    public final CharSequence LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC944203ma
    public final int getCursor() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC944203ma
    public final Object value() {
        return this.LIZ;
    }

    public C138400fu(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
