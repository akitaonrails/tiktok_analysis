package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232004ru implements C0Z8A {
    public CharSequence LL;

    public final C1232004ru copy(CharSequence charSequence) {
        return new C1232004ru(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1232004ru) && Intrinsics.LJFF(this.LL, ((C1232004ru) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOStoryFriendAnniversaryContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public C1232004ru(CharSequence charSequence) {
        this.LL = charSequence;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }
}
