package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.15Yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20538615Yi extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_reminder_enabled", required = true)
    boolean getSleepReminderEnabled();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_end_hour", required = true)
    Number getSleepTimeEndHour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_end_minute", required = true)
    Number getSleepTimeEndMinute();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_start_hour", required = true)
    Number getSleepTimeStartHour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sleep_time_start_minute", required = true)
    Number getSleepTimeStartMinute();
}
