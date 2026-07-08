package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.15YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface C15YZ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "max_use_duration_in_minutes", required = false)
    Number getMaxUseDurationInMinutes();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next_sleep_reminder_check_timestamp", required = false)
    Number getNextSleepReminderCheckTimestamp();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "restrict_mode_has_password", required = false)
    Boolean getRestrictModeHasPassword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "self_restricted_mode_enable", required = false)
    Boolean getSelfRestrictedModeEnable();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "self_timelock_enable", required = false)
    Boolean getSelfTimelockEnable();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_timelock_repeat_type", required = false)
    Number getSelfTimelockRepeatType();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_timelock_type", required = false)
    Number getSelfTimelockType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "self_timelock_week_settings", nestedClassType = InterfaceC1799820ww8.class, required = false)
    List<InterfaceC1799820ww8> getSelfTimelockWeekSettings();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "self_weekly_update", required = false)
    Boolean getSelfWeeklyUpdate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "session_duration_reminder", required = false)
    Number getSessionDurationReminder();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "session_duration_type", required = false)
    Number getSessionDurationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_settings", nestedClassType = InterfaceC20538615Yi.class, required = false)
    InterfaceC20538615Yi getSleepTimeSettings();
}
