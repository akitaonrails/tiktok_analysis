package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.PreviewGoLiveCardFrequency;

/* JADX INFO: renamed from: X.180F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C180F {
    public static final PreviewGoLiveCardFrequency LIZ = new PreviewGoLiveCardFrequency(24, 2, 7);

    public static PreviewGoLiveCardFrequency LIZ() {
        return (PreviewGoLiveCardFrequency) SettingsManager.LIZLLL().LJIIIIZZ("ec_live_preview_go_live_card_frequency_control", PreviewGoLiveCardFrequency.class, LIZ);
    }
}
