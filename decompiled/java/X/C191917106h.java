package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import java.util.Collections;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.106h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191917106h extends C191977108p {
    public static final C103L LLJILJILJ;

    static {
        C103N c103n = new C103N(2131824527);
        C107N c107n = new C107N("favorite", "favorite", 0);
        c107n.LIZ = "like_videos_options";
        c107n.LJ = new C103N(2131845144);
        C191975108n.LIZIZ(c107n, 0, AFwS271S0000000_28.get$arr$(9));
        C191975108n.LIZIZ(c107n, 1, AFwS271S0000000_28.get$arr$(10));
        LLJILJILJ = new C103L("liked_videos_permission", c103n, 0, "page", Collections.singletonList(C191853103v.LIZIZ(new C104A[]{c107n})), 36);
    }

    @Override // X.AbstractC191963108b, X.AbstractC191843103l
    public final void LJII() {
        super.LJII();
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iPrivacySettingsDepService.LJIL();
        }
        C191920106k.LIZ.getClass();
        C191920106k.LIZLLL("favorite", null);
    }

    @Override // X.AbstractC191963108b, X.AbstractC191843103l
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        C191920106k.LIZ.getClass();
        C191920106k.LIZJ("favorite");
    }

    public C191917106h(C191848103q c191848103q, C107N c107n) {
        super(c191848103q, c107n);
    }

    @Override // X.AbstractC191963108b
    public final boolean LJIL(int i, View view) {
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null && iPrivacySettingsDepService.LJIJI("privacy_settings_favorite_videos")) {
            return true;
        }
        return false;
    }

    @Override // X.C191977108p
    public final void LJJIJIIJIL(int i, int i2, BaseResponse baseResponse) {
        String str;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iPrivacySettingsDepService.LJIIZILJ(i2);
        }
        if (i2 == 0) {
            str = "Everyone";
        } else {
            str = "Only_me";
        }
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "liked_permission");
        c191969108h.LIZLLL("to_status", str);
        c1163504gr.onEventV3("change_liked_permission", c191969108h.LIZ);
    }
}
