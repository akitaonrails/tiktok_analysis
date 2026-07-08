package X;

import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445400HdK implements InterfaceC1891350zJl {
    public final MixListResponse LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Unit> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C445400HdK)) {
            return false;
        }
        C445400HdK c445400HdK = (C445400HdK) obj;
        return Intrinsics.LJFF(this.LL, c445400HdK.LL) && Intrinsics.LJFF(this.LLILLJJLI, c445400HdK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c445400HdK.LLILLL) && Intrinsics.LJFF(this.LLILZ, c445400HdK.LLILZ) && this.LLILZIL == c445400HdK.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        MixListResponse mixListResponse = this.LL;
        int iHashCode = (mixListResponse == null ? 0 : mixListResponse.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistShowManageItem(mixListResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasDescription=");
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

    public C445400HdK(MixListResponse mixListResponse, String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        this.LL = mixListResponse;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }
}
