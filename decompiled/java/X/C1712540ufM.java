package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.giftcard.ab.FormConfigModel;
import com.ss.android.ugc.aweme.giftcard.ab.PipoGiftcardCheckoutConfigModel;
import com.ss.android.ugc.aweme.giftcard.ab.PipoGiftcardQueryGoodsStatusConfigModel;

/* JADX INFO: renamed from: X.0ufM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712540ufM {
    public static final PipoGiftcardCheckoutConfigModel LIZ = new PipoGiftcardCheckoutConfigModel(new PipoGiftcardQueryGoodsStatusConfigModel(1, 10), new FormConfigModel(255), false);

    public static final PipoGiftcardCheckoutConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoGiftcardCheckoutConfigModel pipoGiftcardCheckoutConfigModel = LIZ;
        PipoGiftcardCheckoutConfigModel pipoGiftcardCheckoutConfigModel2 = (PipoGiftcardCheckoutConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_giftcard_checkout_config", PipoGiftcardCheckoutConfigModel.class, pipoGiftcardCheckoutConfigModel);
        return pipoGiftcardCheckoutConfigModel2 != null ? pipoGiftcardCheckoutConfigModel2 : pipoGiftcardCheckoutConfigModel;
    }
}
