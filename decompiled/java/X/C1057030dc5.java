package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057030dc5 extends C09AY implements Function0<CommonDispatchConfigModel> {
    public C1057030dc5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final CommonDispatchConfigModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CommonDispatchConfigModel commonDispatchConfigModel = C1057040dc6.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("resource_common_dispatch_config", CommonDispatchConfigModel.class, commonDispatchConfigModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : commonDispatchConfigModel;
    }
}
