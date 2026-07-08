package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQ8 implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public transient String LLILZLL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OQ8)) {
            return false;
        }
        C0OQ8 c0oq8 = (C0OQ8) obj;
        return this.LL == c0oq8.LL && this.LLILLJJLI == c0oq8.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0oq8.LLILLL) && this.LLILZ == c0oq8.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0oq8.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiNumItem(number=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emojiShowCnt=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", needAnimate=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", emoji=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0C64.LJIILLIIL().LJIJ(31744, 3, "bulletin_emoji_interaction_num_setting", true);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0OQ8) {
            C0OQ8 c0oq8 = (C0OQ8) interfaceC1891350zJl;
            if (c0oq8.LL == this.LL && c0oq8.LLILZ == this.LLILZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0OQ8) && Intrinsics.LJFF(((C0OQ8) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C0OQ8) {
            C0OQ8 c0oq8 = (C0OQ8) interfaceC1891350zJl;
            boolean z2 = true;
            if (c0oq8.LL != this.LL) {
                z = true;
            } else {
                z = false;
            }
            if (c0oq8.LLILZ == this.LLILZ) {
                z2 = false;
            }
            return new C0OQA(z, z2);
        }
        return null;
    }

    public C0OQ8(int i, int i2, String str, String str2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = str2;
    }
}
