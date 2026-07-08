package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IMStickerFallbackProvider;

/* JADX INFO: renamed from: X.0HsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454640HsE {
    public static final /* synthetic */ C454640HsE LIZ = new C454640HsE();
    public static volatile IMStickerApi LIZIZ;

    public final IMStickerApi LIZ() {
        Object obj;
        IMStickerApi iMStickerApi;
        if (!C457760HxG.LIZJ()) {
            return (IMStickerApi) PluggableExtentionKt.pluggableSpi$default(IMStickerApi.class, false, false, false, 14, null);
        }
        IMStickerApi iMStickerApi2 = null;
        if (!C457760HxG.LIZIZ(true)) {
            IMStickerFallbackProvider iMStickerFallbackProvider = (IMStickerFallbackProvider) PluggableExtentionKt.pluggableSpiForReal(IMStickerFallbackProvider.class);
            if (iMStickerFallbackProvider != null) {
                return iMStickerFallbackProvider.getStickerApi();
            }
            return null;
        }
        IMStickerApi iMStickerApi3 = LIZIZ;
        if (iMStickerApi3 != null) {
            return iMStickerApi3;
        }
        synchronized (this) {
            try {
                boolean zLIZIZ = !C10UI.LIZ() ? C457760HxG.LIZIZ(true) : C457760HxG.LIZIZ(false);
                IMStickerApi iMStickerApi4 = LIZIZ;
                if (iMStickerApi4 != null) {
                    iMStickerApi2 = iMStickerApi4;
                } else if (zLIZIZ) {
                    try {
                        IMStickerApi iMStickerApi5 = (IMStickerApi) PluggableExtentionKt.pluggableSpiForReal(IMStickerApi.class);
                        if (iMStickerApi5 != null) {
                            LIZIZ = iMStickerApi5;
                            iMStickerApi = iMStickerApi5;
                        } else {
                            iMStickerApi = null;
                        }
                        C189200o6.m2constructorimpl(iMStickerApi);
                        obj = iMStickerApi;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        obj = c098200Yq;
                    }
                    iMStickerApi2 = (IMStickerApi) (C189200o6.m7isFailureimpl(obj) ? null : obj);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return iMStickerApi2;
    }

    public final IMStickerApi LIZIZ() {
        IMStickerApi iMStickerApiLIZ = LIZ();
        return iMStickerApiLIZ == null ? C453610HqZ.LIZIZ : iMStickerApiLIZ;
    }
}
