package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.experiment.RemindUserTurnActiveStatusFrequencyControl;

/* JADX INFO: renamed from: X.06jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1687706jD {
    public static final RemindUserTurnActiveStatusFrequencyControl LIZ = new RemindUserTurnActiveStatusFrequencyControl(7, 5, 14, 2, 1, 2, false);

    public static RemindUserTurnActiveStatusFrequencyControl LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        RemindUserTurnActiveStatusFrequencyControl remindUserTurnActiveStatusFrequencyControl = LIZ;
        RemindUserTurnActiveStatusFrequencyControl remindUserTurnActiveStatusFrequencyControl2 = (RemindUserTurnActiveStatusFrequencyControl) settingsManagerLIZLLL.LJIIIIZZ("tt_remind_user_active_status_config", RemindUserTurnActiveStatusFrequencyControl.class, remindUserTurnActiveStatusFrequencyControl);
        return remindUserTurnActiveStatusFrequencyControl2 != null ? remindUserTurnActiveStatusFrequencyControl2 : remindUserTurnActiveStatusFrequencyControl;
    }
}
