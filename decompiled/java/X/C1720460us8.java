package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.stellar.base.ab.PipoTtpayShowTooltipOptionModel;

/* JADX INFO: renamed from: X.0us8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720460us8 {
    public static final PipoTtpayShowTooltipOptionModel LIZ = new PipoTtpayShowTooltipOptionModel(null, null);

    public static long LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtpayShowTooltipOptionModel pipoTtpayShowTooltipOptionModel = LIZ;
        PipoTtpayShowTooltipOptionModel pipoTtpayShowTooltipOptionModel2 = (PipoTtpayShowTooltipOptionModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttpay_show_tooltip_option", PipoTtpayShowTooltipOptionModel.class, pipoTtpayShowTooltipOptionModel);
        if (pipoTtpayShowTooltipOptionModel2 != null) {
            pipoTtpayShowTooltipOptionModel = pipoTtpayShowTooltipOptionModel2;
        }
        Long l = pipoTtpayShowTooltipOptionModel.delayTime;
        if (l != null) {
            return l.longValue();
        }
        return 550L;
    }
}
