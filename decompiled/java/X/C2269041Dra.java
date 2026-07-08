package X;

import com.ss.android.ugc.aweme.services.external.IAnchorService;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269041Dra extends C09AY implements Function0<C1429460nIm> {
    public C2269041Dra() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nIm] */
    @Override // kotlin.jvm.functions.Function0
    public final C1429460nIm invoke() {
        return new IAnchorService() { // from class: X.0nIm
            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean enableCameraLayoutAnchor() {
                C579430Mo1.LIZ.getClass();
                return C579430Mo1.LIZIZ(false);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean enableGreenScreenAnchor() {
                return ((Boolean) C278670Aw5.LIZ.getValue()).booleanValue();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isCaptionAnchorLandingPageShown() {
                C391040FUw.LIZ.getClass();
                return C391040FUw.LIZIZ.getBoolean("text_caption_landing_page_show", false);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean enableLyricEffectAnchor() {
                if (!C0CHQ.LIZ().getAccountService().isLogin() || C0CHQ.LIZ().getAccountService().LIZ()) {
                    return false;
                }
                C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser == null || currentUser.LIZLLL() != 3) {
                    return C291180BbA.LIZ();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isEditorProCaptionNewFuncEnabled() {
                if (C338630DPh.LIZ()) {
                    return ((Boolean) C277970Aux.LIZ.getValue()).booleanValue() || C295900Bim.LIZ() || C295900Bim.LIZ();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isEditorProEffectEnabled() {
                return C0C0J.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isEditorProEnabled() {
                return C338630DPh.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isMagicAsyncInEditorProEnabled() {
                return C357620E0i.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final String getRealTitleString(String str) {
                C1429510nIr.LIZ.getClass();
                C1455810nzH.LIZ.getClass();
                return C786410Ut5.k4(Locale.US, str, Arrays.copyOf(new Object[]{C1455810nzH.LIZ()}, 1));
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isFunctionEnabled(Integer num) {
                int value = C0EG8.GENERAL.getValue();
                if (num != null && num.intValue() == value) {
                    return true;
                }
                int value2 = C0EG8.EFFECT.getValue();
                if (num != null && num.intValue() == value2) {
                    return C0C0J.LIZ();
                }
                int value3 = C0EG8.CAPTION.getValue();
                if (num != null && num.intValue() == value3) {
                    return isEditorProCaptionNewFuncEnabled();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean needShowAnchorInFYP(boolean z) {
                if (!C0EIT.LIZ()) {
                    return false;
                }
                if (z) {
                    return C1429490nIp.LIZ();
                }
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_video_tool_anchor_type", true) <= 0) {
                    return false;
                }
                return true;
            }
        };
    }
}
