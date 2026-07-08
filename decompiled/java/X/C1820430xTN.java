package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820430xTN extends AbstractC1820610xTf {
    public final ImageModel LIZ;
    public final String LIZIZ;
    public final C1820520xTW LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", header=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled() ? this.LIZIZ.hashCode() : super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1820430xTN)) {
                return false;
            }
            return Intrinsics.LJFF(this.LIZIZ, ((C1820430xTN) obj).LIZIZ);
        }
        return super.equals(obj);
    }

    public C1820430xTN(ImageModel imageModel, String str, C1820520xTW c1820520xTW) {
        this.LIZ = imageModel;
        this.LIZIZ = str;
        this.LIZJ = c1820520xTW;
    }
}
