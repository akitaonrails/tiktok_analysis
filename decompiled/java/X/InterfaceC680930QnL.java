package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0QnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC680930QnL extends XBaseParamModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "action", required = true)
    @InterfaceC1909307dr(option = {"update", "append", "clear", "get"})
    String getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionParams", required = false)
    String getActionParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionType", required = false)
    String getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = false)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = false)
    String getKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userActData", required = false)
    String getUserActData();
}
