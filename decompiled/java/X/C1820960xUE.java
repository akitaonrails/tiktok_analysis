package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820960xUE implements InterfaceC1891350zJl {
    public final ImageModel LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        if (!LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
            return super.hashCode();
        }
        int iHashCode = ((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZIL;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
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
            if (!(obj instanceof C1820960xUE)) {
                return false;
            }
            C1820960xUE c1820960xUE = (C1820960xUE) obj;
            if (Intrinsics.LJFF(this.LLILLJJLI, c1820960xUE.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1820960xUE.LLILLL) && Intrinsics.LJFF(this.LLILZIL, c1820960xUE.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1820960xUE.LLILZLL)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1820960xUE(ImageModel imageModel, String str, String str2, C1820980xUG c1820980xUG, String str3, String str4) {
        this.LL = imageModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1820980xUG;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }
}
