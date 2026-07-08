package X;

import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19207110Cf implements InterfaceC1891350zJl {
    public final UnifiedAuthPopupConfig LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19207110Cf)) {
            return false;
        }
        C19207110Cf c19207110Cf = (C19207110Cf) obj;
        return Intrinsics.LJFF(this.LL, c19207110Cf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c19207110Cf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c19207110Cf.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserGuideSettingsItem(param=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", settingName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", field=");
        sbLIZ.append(this.LLILLL);
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

    public C19207110Cf(UnifiedAuthPopupConfig unifiedAuthPopupConfig, String str, String str2) {
        this.LL = unifiedAuthPopupConfig;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
