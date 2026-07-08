package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230560i7y extends AbstractC1230690i8B {
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C1230090i7D LLILZLL;
    public final C1229500i6G LLIZ;
    public final EnumC1230500i7s LLIZLLLIL;
    public final C900560ZUo LLJ;
    public final long LLJI;
    public final String LLJIJIL;
    public final InterfaceC1229620i6S LLJILJIL;

    public final C1230560i7y copy(String str, String str2, String str3, String str4, C1230090i7D c1230090i7D, C1229500i6G c1229500i6G, EnumC1230500i7s enumC1230500i7s, C900560ZUo c900560ZUo, long j, String str5, InterfaceC1229620i6S interfaceC1229620i6S) {
        return new C1230560i7y(str, str2, str3, str4, c1230090i7D, c1229500i6G, enumC1230500i7s, c900560ZUo, j, str5, interfaceC1229620i6S);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230560i7y)) {
            return false;
        }
        C1230560i7y c1230560i7y = (C1230560i7y) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1230560i7y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1230560i7y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1230560i7y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1230560i7y.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1230560i7y.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1230560i7y.LLIZ) && this.LLIZLLLIL == c1230560i7y.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1230560i7y.LLJ) && this.LLJI == c1230560i7y.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1230560i7y.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1230560i7y.LLJILJIL);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Y2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31;
        InterfaceC1229620i6S interfaceC1229620i6S = this.LLJILJIL;
        return iHashCode + (interfaceC1229620i6S == null ? 0 : interfaceC1229620i6S.hashCode());
    }

    public String toString() {
        return "InAppParams(inviteId=" + this.LLILLJJLI + ", inviteSource=" + this.LLILLL + ", enterFromForMob=" + this.LLILZ + ", enterMethodForMob=" + this.LLILZIL + ", groupMetaData=" + this.LLILZLL + ", joinGroupEnterChatParams=" + this.LLIZ + ", joinGroupSource=" + this.LLIZLLLIL + ", inviteEventInfo=" + this.LLJ + ", sender=" + this.LLJI + ", convId=" + this.LLJIJIL + ", callback=" + this.LLJILJIL + ')';
    }

    @Override // X.AbstractC1230540i7w
    public InterfaceC1229620i6S getCallback() {
        return this.LLJILJIL;
    }

    public final String getConvId() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1230540i7w
    public String getEnterFromForMob() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1230540i7w
    public String getEnterMethodForMob() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1230540i7w
    public C1230090i7D getGroupMetaData() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1230690i8B
    public C900560ZUo getInviteEventInfo() {
        return this.LLJ;
    }

    @Override // X.AbstractC1230690i8B
    public String getInviteId() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1230690i8B
    public String getInviteSource() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1230540i7w
    public C1229500i6G getJoinGroupEnterChatParams() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1230540i7w
    public EnumC1230500i7s getJoinGroupSource() {
        return this.LLIZLLLIL;
    }

    public final long getSender() {
        return this.LLJI;
    }

    public C1230560i7y(String str, String str2, String str3, String str4, C1230090i7D c1230090i7D, C1229500i6G c1229500i6G, EnumC1230500i7s enumC1230500i7s, C900560ZUo c900560ZUo, long j, String str5, InterfaceC1229620i6S interfaceC1229620i6S) {
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = c1230090i7D;
        this.LLIZ = c1229500i6G;
        this.LLIZLLLIL = enumC1230500i7s;
        this.LLJ = c900560ZUo;
        this.LLJI = j;
        this.LLJIJIL = str5;
        this.LLJILJIL = interfaceC1229620i6S;
    }
}
