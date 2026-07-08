package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323780Cme {
    public static final void LIZ(Fragment fragment, MobileEffectViewModel mobileEffectViewModel, NewFaceStickerBean newFaceStickerBean, Function0 function0) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(fragment.getContext(), "StickerPropEditHelper", true)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C323770Cmd(mobileEffectViewModel, newFaceStickerBean, fragment, function0, null), 3);
        }
    }
}
