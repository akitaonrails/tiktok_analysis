package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231904rt implements C0Z8A {
    public CharSequence LL;

    public final C1231904rt copy(CharSequence charSequence) {
        return new C1231904rt(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1231904rt) && Intrinsics.LJFF(this.LL, ((C1231904rt) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOSayHiContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public C1231904rt(CharSequence charSequence) {
        this.LL = charSequence;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }
}
