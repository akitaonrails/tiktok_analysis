package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362100lY8 implements InterfaceC1361730lXX {
    public final C1363150lZp LL;
    public final int LLILLJJLI;
    public final EnumC994650bzT LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362100lY8)) {
            return false;
        }
        C1362100lY8 c1362100lY8 = (C1362100lY8) obj;
        return Intrinsics.LJFF(this.LL, c1362100lY8.LL) && this.LLILLJJLI == c1362100lY8.LLILLJJLI && this.LLILLL == c1362100lY8.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeMoreIMContactPowerItem(fakeMoreContact=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iconStyle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361730lXX
    public final IMContact LJLJJI() {
        return this.LL;
    }

    @Override // X.InterfaceC1361730lXX
    public final int getPosition() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1362100lY8(C1363150lZp c1363150lZp, int i) {
        EnumC994650bzT enumC994650bzT = EnumC994650bzT.NORMAL;
        this.LL = c1363150lZp;
        this.LLILLJJLI = i;
        this.LLILLL = enumC994650bzT;
        new C1362180lYG((C1362510lYn) null, false, 7);
    }
}
