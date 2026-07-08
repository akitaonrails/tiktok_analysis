package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.15Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20538015Yc extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "permission_review_status", required = true)
    Number getPermissionReviewStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screen_down_time_day_setting", nestedClassType = InterfaceC20538215Ye.class, required = true)
    List<InterfaceC20538215Ye> getScreenDownTimeDaySetting();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "screen_down_time_status", required = true)
    Number getScreenDownTimeStatus();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "screen_down_time_type", required = true)
    Number getScreenDownTimeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "show_stm_down_time", required = true)
    Boolean getShowStmDownTime();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "permission_review_status", required = true)
    void setPermissionReviewStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screen_down_time_day_setting", nestedClassType = InterfaceC20538215Ye.class, required = true)
    void setScreenDownTimeDaySetting(List<? extends InterfaceC20538215Ye> list);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "screen_down_time_status", required = true)
    void setScreenDownTimeStatus(Number number);

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "screen_down_time_type", required = true)
    void setScreenDownTimeType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "show_stm_down_time", required = true)
    void setShowStmDownTime(Boolean bool);
}
