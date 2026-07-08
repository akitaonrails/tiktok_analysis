package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0ww8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1799820ww8 extends XBaseModel {
    @InterfaceC1909207dq(option = {1, 2, 3, 4, 5, 6, 7})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "day", required = true)
    Number getDay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screen_time_limit", required = true)
    Number getScreenTimeLimit();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "screen_time_setting_type", required = true)
    Number getScreenTimeSettingType();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();
}
