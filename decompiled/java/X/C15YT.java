package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.15YT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040E
public interface C15YT extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "family_max_use_duration_in_minutes", required = true)
    Number getFamilyMaxUseDurationInMinutes();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "family_restricted_mode", required = true)
    Number getFamilyRestrictedMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "family_role", required = true)
    Number getFamilyRole();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "family_screen_down_time_settings", nestedClassType = InterfaceC20538015Yc.class, required = false)
    InterfaceC20538015Yc getFamilyScreenDownTimeSettings();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "family_session_duration_reminder", required = true)
    Number getFamilySessionDurationReminder();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "family_session_duration_type", required = true)
    Number getFamilySessionDurationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "family_show_stm_break", required = true)
    Boolean getFamilyShowStmBreak();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "family_timelock", required = true)
    Number getFamilyTimelock();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "family_timelock_repeat_type", required = true)
    Number getFamilyTimelockRepeatType();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "family_timelock_type", required = true)
    Number getFamilyTimelockType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "family_timelock_week_settings", nestedClassType = InterfaceC20538415Yg.class, required = true)
    List<InterfaceC20538415Yg> getFamilyTimelockWeekSettings();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "max_use_duration_in_minutes", required = true)
    Number getMaxUseDurationInMinutes();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "restrict_mode_has_password", required = true)
    Boolean getRestrictModeHasPassword();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_restricted_mode", required = true)
    Number getSelfRestrictedMode();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_timelock", required = true)
    Number getSelfTimelock();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_timelock_repeat_type", required = true)
    Number getSelfTimelockRepeatType();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_timelock_type", required = true)
    Number getSelfTimelockType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "self_timelock_week_settings", nestedClassType = InterfaceC20538515Yh.class, required = true)
    List<InterfaceC20538515Yh> getSelfTimelockWeekSettings();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "self_weekly_update", required = true)
    Number getSelfWeeklyUpdate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "session_duration_reminder", required = true)
    Number getSessionDurationReminder();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "session_duration_type", required = true)
    Number getSessionDurationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_settings", nestedClassType = InterfaceC20538315Yf.class, required = false)
    InterfaceC20538315Yf getSleepTimeSettings();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user_details", nestedClassType = InterfaceC20539015Ym.class, required = true)
    InterfaceC20539015Ym getUserDetails();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "family_max_use_duration_in_minutes", required = true)
    void setFamilyMaxUseDurationInMinutes(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "family_restricted_mode", required = true)
    void setFamilyRestrictedMode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "family_role", required = true)
    void setFamilyRole(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "family_screen_down_time_settings", nestedClassType = InterfaceC20538015Yc.class, required = false)
    void setFamilyScreenDownTimeSettings(InterfaceC20538015Yc interfaceC20538015Yc);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "family_session_duration_reminder", required = true)
    void setFamilySessionDurationReminder(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "family_session_duration_type", required = true)
    void setFamilySessionDurationType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "family_show_stm_break", required = true)
    void setFamilyShowStmBreak(Boolean bool);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "family_timelock", required = true)
    void setFamilyTimelock(Number number);

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "family_timelock_repeat_type", required = true)
    void setFamilyTimelockRepeatType(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "family_timelock_type", required = true)
    void setFamilyTimelockType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "family_timelock_week_settings", nestedClassType = InterfaceC20538415Yg.class, required = true)
    void setFamilyTimelockWeekSettings(List<? extends InterfaceC20538415Yg> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "max_use_duration_in_minutes", required = true)
    void setMaxUseDurationInMinutes(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "restrict_mode_has_password", required = true)
    void setRestrictModeHasPassword(Boolean bool);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "self_restricted_mode", required = true)
    void setSelfRestrictedMode(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "self_timelock", required = true)
    void setSelfTimelock(Number number);

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "self_timelock_repeat_type", required = true)
    void setSelfTimelockRepeatType(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "self_timelock_type", required = true)
    void setSelfTimelockType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "self_timelock_week_settings", nestedClassType = InterfaceC20538515Yh.class, required = true)
    void setSelfTimelockWeekSettings(List<? extends InterfaceC20538515Yh> list);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "self_weekly_update", required = true)
    void setSelfWeeklyUpdate(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "session_duration_reminder", required = true)
    void setSessionDurationReminder(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "session_duration_type", required = true)
    void setSessionDurationType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sleep_time_settings", nestedClassType = InterfaceC20538315Yf.class, required = false)
    void setSleepTimeSettings(InterfaceC20538315Yf interfaceC20538315Yf);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "user_details", nestedClassType = InterfaceC20539015Ym.class, required = true)
    void setUserDetails(InterfaceC20539015Ym interfaceC20539015Ym);
}
