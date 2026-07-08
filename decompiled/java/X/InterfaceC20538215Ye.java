package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.15Ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20538215Ye extends XBaseModel {
    @InterfaceC1909207dq(option = {1, 2, 3, 4, 5, 6, 7, 0})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "day", required = true)
    Number getDay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "end_hour", required = true)
    Number getEndHour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "end_min", required = true)
    Number getEndMin();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "screen_down_time_status_day", required = true)
    Number getScreenDownTimeStatusDay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "start_hour", required = true)
    Number getStartHour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "start_min", required = true)
    Number getStartMin();

    @InterfaceC1909207dq(option = {1, 2, 3, 4, 5, 6, 7, 0})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "day", required = true)
    void setDay(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "end_hour", required = true)
    void setEndHour(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "end_min", required = true)
    void setEndMin(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "screen_down_time_status_day", required = true)
    void setScreenDownTimeStatusDay(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "start_hour", required = true)
    void setStartHour(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "start_min", required = true)
    void setStartMin(Number number);
}
