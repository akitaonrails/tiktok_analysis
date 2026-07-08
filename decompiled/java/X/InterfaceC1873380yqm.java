package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1873380yqm extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "alarmOffset", required = false)
    Number getAlarmOffset();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "allDay", required = false)
    Boolean getAllDay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "calendarName", required = false)
    String getCalendarName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "daysOfTheWeek", primitiveClassType = Number.class, required = false)
    List<Number> getDaysOfTheWeek();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "endDate", required = true)
    Number getEndDate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "identifier", required = true)
    String getIdentifier();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "location", required = false)
    String getLocation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "notes", required = false)
    String getNotes();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "repeatCount", required = true)
    Number getRepeatCount();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "repeatFrequency", required = true)
    @InterfaceC1909307dr(option = {"DAILY", "MONTHLY", "WEEKLY", "YEARLY", "daily", "monthly", "weekly", "yearly"})
    String getRepeatFrequency();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "repeatInterval", required = true)
    Number getRepeatInterval();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startDate", required = true)
    Number getStartDate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();
}
