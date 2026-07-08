package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460220I2y implements InterfaceC1891350zJl {
    public final boolean LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final Drawable LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460220I2y)) {
            return false;
        }
        C460220I2y c460220I2y = (C460220I2y) obj;
        return this.LL == c460220I2y.LL && Intrinsics.LJFF(this.LLILLJJLI, c460220I2y.LLILLJJLI) && this.LLILLL == c460220I2y.LLILLL && Intrinsics.LJFF(this.LLILZ, c460220I2y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c460220I2y.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31;
        Drawable drawable = this.LLILZIL;
        return iZ2 + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleTypingIndicatorData(needAvatar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFirstInGroup=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", avatarBottomDrawable=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C460220I2y;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C460220I2y c460220I2y;
        if (!(interfaceC1891350zJl instanceof C460220I2y) || (c460220I2y = (C460220I2y) interfaceC1891350zJl) == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(this.LLILLJJLI, c460220I2y.LLILLJJLI);
        if (this.LLILLL == c460220I2y.LLILLL) {
            z = false;
        }
        return new C460230I2z(z2, z);
    }

    public C460220I2y(boolean z, String str, boolean z2, String str2, Drawable drawable) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = str2;
        this.LLILZIL = drawable;
    }
}
