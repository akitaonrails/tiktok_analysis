package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618760OOs implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618760OOs)) {
            return false;
        }
        C618760OOs c618760OOs = (C618760OOs) obj;
        return Intrinsics.LJFF(this.LL, c618760OOs.LL) && this.LLILLJJLI == c618760OOs.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c618760OOs.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPopSelectEmojiItem(emoji=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C618760OOs) {
            C618760OOs c618760OOs = (C618760OOs) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c618760OOs.LL) && this.LLILLJJLI == c618760OOs.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C618760OOs) && Intrinsics.LJFF(this.LL, ((C618760OOs) interfaceC1891350zJl).LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C618760OOs) {
            C618760OOs c618760OOs = (C618760OOs) interfaceC1891350zJl;
            boolean z = true;
            boolean z2 = !Intrinsics.LJFF(c618760OOs.LL, this.LL);
            if (c618760OOs.LLILLJJLI == this.LLILLJJLI) {
                z = false;
            }
            return new C618780OOu(z2, z);
        }
        return null;
    }

    public C618760OOs(String str, int i, String str2, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? EnumC618770OOt.EMOJI.getType() : i;
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
    }
}
