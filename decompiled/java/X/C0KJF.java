package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KJF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJF implements InterfaceC1891350zJl, InterfaceC515600KJy {
    public final String LL;
    public final String LLILLJJLI;
    public final FlashDataProvider LLILLL;

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KJF)) {
            return false;
        }
        C0KJF c0kjf = (C0KJF) obj;
        return Intrinsics.LJFF(this.LL, c0kjf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0kjf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0kjf.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        FlashDataProvider flashDataProvider = this.LLILLL;
        return iHashCode + (flashDataProvider == null ? 0 : flashDataProvider.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkFlashPowerItem(url=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", componentId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", flashDataProvider=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC515600KJy
    public final String LJJJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0KJF(String str, String str2, FlashDataProvider flashDataProvider) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = flashDataProvider;
    }
}
