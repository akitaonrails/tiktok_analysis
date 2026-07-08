package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821010xUJ implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookItem(imageUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1821010xUJ)) {
                return false;
            }
            C1821010xUJ c1821010xUJ = (C1821010xUJ) obj;
            if (Intrinsics.LJFF(this.LL, c1821010xUJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1821010xUJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1821010xUJ.LLILLL)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1821010xUJ(String str, C1821090xUR c1821090xUR, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c1821090xUR;
    }
}
