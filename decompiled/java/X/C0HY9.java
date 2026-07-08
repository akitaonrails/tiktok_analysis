package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HY9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HY9 {
    public static final /* synthetic */ C0HY9 LIZ = new C0HY9();
    public static final C01GW<C0HY8> LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(351));

    public static IStickerStoreHelper LIZ() {
        if (!C457760HxG.LIZJ() || !C457760HxG.LIZIZ(true)) {
            IStickerStoreHelper iStickerStoreHelper = (IStickerStoreHelper) PluggableExtentionKt.pluggableSpi$default(IStickerStoreHelper.class, false, false, false, 14, null);
            return iStickerStoreHelper == null ? LIZIZ.getValue() : iStickerStoreHelper;
        }
        IStickerStoreHelper iStickerStoreHelper2 = (IStickerStoreHelper) PluggableExtentionKt.pluggableSpiForReal(IStickerStoreHelper.class);
        if (iStickerStoreHelper2 != null) {
            return iStickerStoreHelper2;
        }
        IStickerStoreHelper iStickerStoreHelper3 = (IStickerStoreHelper) PluggableExtentionKt.pluggableSpi$default(IStickerStoreHelper.class, false, false, false, 14, null);
        return iStickerStoreHelper3 == null ? LIZIZ.getValue() : iStickerStoreHelper3;
    }
}
