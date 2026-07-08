package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901310ZXl extends AbstractC901370ZXr {
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;
    public final CharSequence LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901310ZXl)) {
            return false;
        }
        C901310ZXl c901310ZXl = (C901310ZXl) obj;
        return Intrinsics.LJFF(this.LIZ, c901310ZXl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c901310ZXl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c901310ZXl.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translated(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", spannableText=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", translatedText=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC901370ZXr
    public final CharSequence LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC901370ZXr
    public final CharSequence LIZIZ() {
        return this.LIZ;
    }

    public C901310ZXl(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        super(charSequence, charSequence2);
        this.LIZ = charSequence;
        this.LIZIZ = charSequence2;
        this.LIZJ = charSequence3;
    }
}
