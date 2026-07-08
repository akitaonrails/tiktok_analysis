package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.CategorySetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ow8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635420Ow8 implements InterfaceC1891350zJl {
    public final int LL;
    public final EnumC635330Ovz LLILLJJLI;
    public final CategorySetting LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635420Ow8)) {
            return false;
        }
        C635420Ow8 c635420Ow8 = (C635420Ow8) obj;
        return this.LL == c635420Ow8.LL && this.LLILLJJLI == c635420Ow8.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c635420Ow8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c635420Ow8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c635420Ow8.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeCategoryOptionItem(groupId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", categoryData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", accountType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C635420Ow8(int i, EnumC635330Ovz enumC635330Ovz, CategorySetting categorySetting, String str, String str2) {
        this.LL = i;
        this.LLILLJJLI = enumC635330Ovz;
        this.LLILLL = categorySetting;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }
}
