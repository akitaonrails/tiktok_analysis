package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;

/* JADX INFO: renamed from: X.0Q5W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q5W {
    public static final C0Q5W LIZ = new C0Q5W();

    public static boolean LIZ() {
        ICaptionKevaService iCaptionKevaService;
        return C07H8.LIZIZ() && (iCaptionKevaService = (ICaptionKevaService) PluggableExtentionKt.pluggableSpi$default(ICaptionKevaService.class, false, false, false, 14, null)) != null && iCaptionKevaService.LJIIJJI() == 1;
    }

    public static boolean LIZIZ() {
        ITranslationKevaService iTranslationKevaService;
        return C07H8.LIZJ() && (iTranslationKevaService = (ITranslationKevaService) PluggableExtentionKt.pluggableSpi$default(ITranslationKevaService.class, false, false, false, 14, null)) != null && iTranslationKevaService.LIZ();
    }

    public static boolean LIZJ() {
        ITranslationKevaService iTranslationKevaService;
        if (C07H8.LIZ() && (iTranslationKevaService = (ITranslationKevaService) PluggableExtentionKt.pluggableSpi$default(ITranslationKevaService.class, false, false, false, 14, null)) != null) {
            return iTranslationKevaService.LIZ();
        }
        return false;
    }

    public static void LIZLLL(boolean z) {
        ICaptionKevaService iCaptionKevaService = (ICaptionKevaService) PluggableExtentionKt.pluggableSpi$default(ICaptionKevaService.class, false, false, false, 14, null);
        if (iCaptionKevaService != null) {
            iCaptionKevaService.LJLIIL(z ? 1 : 0);
        }
    }
}
