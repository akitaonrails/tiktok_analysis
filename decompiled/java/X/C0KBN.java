package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KBN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBN implements InterfaceC1891350zJl {
    public final CharSequence LL;
    public final CharSequence LLILLJJLI;
    public final String LLILLL;
    public final ImageModel LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KBN)) {
            return false;
        }
        C0KBN c0kbn = (C0KBN) obj;
        return Intrinsics.LJFF(this.LL, c0kbn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0kbn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0kbn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0kbn.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageModel imageModel = this.LLILZ;
        return iHashCode2 + (imageModel != null ? imageModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerItem(title=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append((Object) this.LLILLJJLI);
        sbLIZ.append(", geckoRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", imageRes=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0KBN) {
            C0KBN c0kbn = (C0KBN) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c0kbn.LL, this.LL) && Intrinsics.LJFF(c0kbn.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c0kbn.LLILLL, this.LLILLL) && Intrinsics.LJFF(c0kbn.LLILZ, this.LLILZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C0KBN;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0KBN) && !Intrinsics.LJFF(interfaceC1891350zJl, this)) {
            return interfaceC1891350zJl;
        }
        return null;
    }

    public C0KBN(CharSequence charSequence, CharSequence charSequence2, String str, ImageModel imageModel) {
        this.LL = charSequence;
        this.LLILLJJLI = charSequence2;
        this.LLILLL = str;
        this.LLILZ = imageModel;
    }
}
