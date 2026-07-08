package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232104rv implements C0Z8A {
    public CharSequence LL;

    public final C1232104rv copy(CharSequence charSequence) {
        return new C1232104rv(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1232104rv) && Intrinsics.LJFF(this.LL, ((C1232104rv) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOThoughtBubbleContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public C1232104rv(CharSequence charSequence) {
        this.LL = charSequence;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }
}
