package X;

import com.ss.android.ugc.aweme.experiment.TextStickerFollowAppLanguageConfig;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0FJL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJL {
    public static final TextStickerFollowAppLanguageConfig LIZ = new TextStickerFollowAppLanguageConfig(Boolean.FALSE, "");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(35));

    public static boolean LIZ() {
        Boolean bool;
        return C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && (bool = ((TextStickerFollowAppLanguageConfig) LIZIZ.getValue()).enable) != null && bool.booleanValue();
    }
}
