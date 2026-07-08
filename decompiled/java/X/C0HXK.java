package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HXK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXK implements InterfaceC1891350zJl {
    public final SpannableStringBuilder LL;
    public final String LLILLJJLI;
    public final Context LLILLL;
    public final LocationServicesVM LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HXK)) {
            return false;
        }
        C0HXK c0hxk = (C0HXK) obj;
        return Intrinsics.LJFF(this.LL, c0hxk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hxk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hxk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0hxk.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Context context = this.LLILLL;
        return ((iHashCode2 + (context != null ? context.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GPSPermissionItem(subtitle=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", vm=");
        sbLIZ.append(this.LLILZ);
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

    public C0HXK(SpannableStringBuilder spannableStringBuilder, String str, Context context, LocationServicesVM locationServicesVM) {
        this.LL = spannableStringBuilder;
        this.LLILLJJLI = str;
        this.LLILLL = context;
        this.LLILZ = locationServicesVM;
    }
}
