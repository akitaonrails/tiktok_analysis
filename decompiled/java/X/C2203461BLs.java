package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IM2PlayerComboDFService;

/* JADX INFO: renamed from: X.1BLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203461BLs {
    public static final C2203461BLs LIZ = new C2203461BLs();

    public static void LIZ() {
        IPluginService iPluginService;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_df_m2_player_combo_init", true) != 1 || (iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null)) == null) {
            return;
        }
        if (!iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_m2_player_combo")) {
            iPluginService.LIZLLL();
            C1BLW.LIZJ("com.ss.android.ugc.aweme.df_m2_player_combo", new InterfaceC2203391BLl() { // from class: X.1BLt
                @Override // X.InterfaceC2203391BLl
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC2425409eu
                public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                    if (abstractC2457909k9.LJII() == 5) {
                        C2203461BLs.LIZ.getClass();
                        IM2PlayerComboDFService iM2PlayerComboDFService = (IM2PlayerComboDFService) PluggableExtentionKt.pluggableSpi$default(IM2PlayerComboDFService.class, false, false, false, 14, null);
                        if (iM2PlayerComboDFService != null) {
                            iM2PlayerComboDFService.init();
                        }
                    }
                }
            });
        } else {
            IM2PlayerComboDFService iM2PlayerComboDFService = (IM2PlayerComboDFService) PluggableExtentionKt.pluggableSpi$default(IM2PlayerComboDFService.class, false, false, false, 14, null);
            if (iM2PlayerComboDFService != null) {
                iM2PlayerComboDFService.init();
            }
        }
    }
}
