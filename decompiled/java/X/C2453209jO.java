package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.crypto.CryptoSdkConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2453209jO extends C09AY implements Function0<CryptoSdkConfigModel> {
    public C2453209jO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.crypto.CryptoSdkConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final CryptoSdkConfigModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CryptoSdkConfigModel cryptoSdkConfigModel = C2452909jL.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("pns_de_sdk_config", CryptoSdkConfigModel.class, cryptoSdkConfigModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : cryptoSdkConfigModel;
    }
}
