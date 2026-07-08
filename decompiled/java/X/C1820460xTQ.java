package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;

/* JADX INFO: renamed from: X.0xTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820460xTQ {
    public final ImageModel LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final int hashCode() {
        if (!LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
            return super.hashCode();
        }
        ImageModel imageModel = this.LIZ;
        return ((((((((((imageModel != null ? imageModel.hashCode() : 0) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public C1820460xTQ(ImageModel imageModel, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = imageModel;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
