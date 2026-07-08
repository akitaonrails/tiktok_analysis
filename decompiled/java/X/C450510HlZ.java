package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.util.IStickerCreationEntranceHelper;

/* JADX INFO: renamed from: X.0HlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450510HlZ {
    public static final /* synthetic */ C450510HlZ LIZ = new C450510HlZ();

    public static IStickerCreationEntranceHelper LIZ() {
        if (!C457760HxG.LIZJ()) {
            return (IStickerCreationEntranceHelper) PluggableExtentionKt.pluggableSpi$default(IStickerCreationEntranceHelper.class, false, false, false, 14, null);
        }
        if (C457760HxG.LIZIZ(true)) {
            return (IStickerCreationEntranceHelper) PluggableExtentionKt.pluggableSpiForReal(IStickerCreationEntranceHelper.class);
        }
        return null;
    }
}
