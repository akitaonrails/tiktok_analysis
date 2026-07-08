package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerViewModelFactoryService;

/* JADX INFO: renamed from: X.0Zbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903080Zbm {
    public static final IStickerViewModelFactoryService LIZ() {
        if (!C457760HxG.LIZJ()) {
            return (IStickerViewModelFactoryService) PluggableExtentionKt.pluggableSpi$default(IStickerViewModelFactoryService.class, false, false, false, 14, null);
        }
        if (C457760HxG.LIZIZ(true)) {
            return (IStickerViewModelFactoryService) PluggableExtentionKt.pluggableSpiForReal(IStickerViewModelFactoryService.class);
        }
        return null;
    }
}
