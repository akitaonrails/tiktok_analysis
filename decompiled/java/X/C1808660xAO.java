package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.viewmodel.IPhoto2StickerServiceHelper;

/* JADX INFO: renamed from: X.0xAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808660xAO {
    public static final /* synthetic */ C1808660xAO LIZ = new C1808660xAO();

    public static IPhoto2StickerServiceHelper LIZ() {
        if (!C457760HxG.LIZJ()) {
            return (IPhoto2StickerServiceHelper) PluggableExtentionKt.pluggableSpi$default(IPhoto2StickerServiceHelper.class, false, false, false, 14, null);
        }
        if (C457760HxG.LIZIZ(true)) {
            return (IPhoto2StickerServiceHelper) PluggableExtentionKt.pluggableSpiForReal(IPhoto2StickerServiceHelper.class);
        }
        return null;
    }
}
