package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820930xUB implements InterfaceC1891350zJl, InterfaceC515600KJy {
    public final String LL;
    public final List<C1821010xUJ> LLILLJJLI;

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        return false;
    }

    @Override // X.InterfaceC515600KJy
    public final String LJJJ() {
        return "item_playbook";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) - 2027714615;
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
            if (!(obj instanceof C1820930xUB)) {
                return false;
            }
            C1820930xUB c1820930xUB = (C1820930xUB) obj;
            if (Intrinsics.LJFF(this.LL, c1820930xUB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1820930xUB.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1820930xUB(String str, List<C1821010xUJ> list) {
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
