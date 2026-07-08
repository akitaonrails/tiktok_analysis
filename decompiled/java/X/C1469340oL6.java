package X;

import com.bytedance.vcloud.strategy.IPreciseExpService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469340oL6 implements IPreciseExpService {
    public final WeakReference<C1469160oKo> LIZ;

    public C1469340oL6(C1469160oKo c1469160oKo) {
        this.LIZ = new WeakReference<>(c1469160oKo);
    }

    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
    public final boolean getBooleanValue(String str) {
        IPreciseExpService iPreciseExpService;
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && (iPreciseExpService = c1469160oKo.LIZLLL) != null) {
            return iPreciseExpService.getBooleanValue(str);
        }
        return false;
    }

    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
    public final double getDoubleValue(String str) {
        IPreciseExpService iPreciseExpService;
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && (iPreciseExpService = c1469160oKo.LIZLLL) != null) {
            return iPreciseExpService.getDoubleValue(str);
        }
        return 0.0d;
    }

    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
    public final float getFloatValue(String str) {
        IPreciseExpService iPreciseExpService;
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && (iPreciseExpService = c1469160oKo.LIZLLL) != null) {
            return iPreciseExpService.getFloatValue(str);
        }
        return 0.0f;
    }

    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
    public final int getIntValue(String str) {
        IPreciseExpService iPreciseExpService;
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && (iPreciseExpService = c1469160oKo.LIZLLL) != null) {
            return iPreciseExpService.getIntValue(str);
        }
        return 0;
    }

    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
    public final long getLongValue(String str) {
        IPreciseExpService iPreciseExpService;
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && (iPreciseExpService = c1469160oKo.LIZLLL) != null) {
            return iPreciseExpService.getLongValue(str);
        }
        return 0L;
    }

    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
    public final String getStringValue(String str) {
        IPreciseExpService iPreciseExpService;
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && (iPreciseExpService = c1469160oKo.LIZLLL) != null) {
            return iPreciseExpService.getStringValue(str);
        }
        return "";
    }
}
