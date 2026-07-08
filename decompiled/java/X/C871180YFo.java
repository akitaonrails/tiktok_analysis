package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.experiment.IMPullMsgOptSettingModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871180YFo extends C09AY implements Function0<IMPullMsgOptSettingModel> {
    public C871180YFo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.im.core.api.experiment.IMPullMsgOptSettingModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMPullMsgOptSettingModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IMPullMsgOptSettingModel iMPullMsgOptSettingModel = C871170YFn.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_opt_pull_msg_setting_android", IMPullMsgOptSettingModel.class, iMPullMsgOptSettingModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : iMPullMsgOptSettingModel;
    }
}
