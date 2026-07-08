package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230550i7x extends AbstractC1230540i7w {
    public final C1230090i7D LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C1229500i6G LLILZ;
    public final EnumC1230500i7s LLILZIL;
    public final InterfaceC1229620i6S LLILZLL;

    public final C1230550i7x copy(C1230090i7D c1230090i7D, String str, String str2, C1229500i6G c1229500i6G, EnumC1230500i7s enumC1230500i7s, InterfaceC1229620i6S interfaceC1229620i6S) {
        return new C1230550i7x(c1230090i7D, str, str2, c1229500i6G, enumC1230500i7s, interfaceC1229620i6S);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230550i7x)) {
            return false;
        }
        C1230550i7x c1230550i7x = (C1230550i7x) obj;
        return Intrinsics.LJFF(this.LL, c1230550i7x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1230550i7x.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1230550i7x.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1230550i7x.LLILZ) && this.LLILZIL == c1230550i7x.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1230550i7x.LLILZLL);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        InterfaceC1229620i6S interfaceC1229620i6S = this.LLILZLL;
        return iHashCode + (interfaceC1229620i6S == null ? 0 : interfaceC1229620i6S.hashCode());
    }

    @Override // X.AbstractC1230540i7w
    public final boolean isInviteReflow() {
        return false;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveJoinGroupParams(groupMetaData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFromForMob=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethodForMob=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", joinGroupEnterChatParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", joinGroupSource=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1230540i7w
    public InterfaceC1229620i6S getCallback() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1230540i7w
    public String getEnterFromForMob() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1230540i7w
    public String getEnterMethodForMob() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1230540i7w
    public C1230090i7D getGroupMetaData() {
        return this.LL;
    }

    @Override // X.AbstractC1230540i7w
    public C1229500i6G getJoinGroupEnterChatParams() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1230540i7w
    public EnumC1230500i7s getJoinGroupSource() {
        return this.LLILZIL;
    }

    public C1230550i7x(C1230090i7D c1230090i7D, String str, String str2, C1229500i6G c1229500i6G, EnumC1230500i7s enumC1230500i7s, InterfaceC1229620i6S interfaceC1229620i6S) {
        this.LL = c1230090i7D;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1229500i6G;
        this.LLILZIL = enumC1230500i7s;
        this.LLILZLL = interfaceC1229620i6S;
    }
}
