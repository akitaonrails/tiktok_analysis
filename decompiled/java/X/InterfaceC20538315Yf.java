package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.15Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20538315Yf extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "skip_for_today", required = true)
    Boolean getSkipForToday();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_reminder_enabled", required = true)
    Boolean getSleepReminderEnabled();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_end_hour", required = true)
    Number getSleepTimeEndHour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_end_minute", required = true)
    Number getSleepTimeEndMinute();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_start_hour", required = true)
    Number getSleepTimeStartHour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_start_minute", required = true)
    Number getSleepTimeStartMinute();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "skip_for_today", required = true)
    void setSkipForToday(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sleep_reminder_enabled", required = true)
    void setSleepReminderEnabled(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sleep_time_end_hour", required = true)
    void setSleepTimeEndHour(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sleep_time_end_minute", required = true)
    void setSleepTimeEndMinute(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sleep_time_start_hour", required = true)
    void setSleepTimeStartHour(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sleep_time_start_minute", required = true)
    void setSleepTimeStartMinute(Number number);
}
