package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData;

/* JADX INFO: renamed from: X.0407, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0407 {
    public static final PreBizParserResponseData LIZ = new PreBizParserResponseData(C13BV.INSTANCE);

    public static final PreBizParserResponseData LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PreBizParserResponseData preBizParserResponseData = LIZ;
        PreBizParserResponseData preBizParserResponseData2 = (PreBizParserResponseData) settingsManagerLIZLLL.LJIIIIZZ("ecom_page_template_config", PreBizParserResponseData.class, preBizParserResponseData);
        return preBizParserResponseData2 != null ? preBizParserResponseData2 : preBizParserResponseData;
    }
}
