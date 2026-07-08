package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C161600je implements InterfaceC944203ma {
    public final CharSequence LIZ;
    public int LIZIZ = -1;

    @Override // X.InterfaceC944203ma
    public final String[] LIZ() {
        return new String[]{value().toString()};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C161600je) && Intrinsics.LJFF(this.LIZ, ((C161600je) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardNumberInputElement(textValue=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC944203ma
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final CharSequence value() {
        return u.LJJIFFI(this.LIZ.toString(), " ", "", false);
    }

    @Override // X.InterfaceC944203ma
    public final CharSequence LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC944203ma
    public final int getCursor() {
        return this.LIZIZ;
    }

    public C161600je(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
