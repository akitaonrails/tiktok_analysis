package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0vCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1732920vCE extends XBaseParamModel {
    @InterfaceC1909207dq(option = {0, 1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "actionType", required = true)
    Number getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "billboard", required = true)
    String getBillboard();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bornTimeMs", required = true)
    Number getBornTimeMs();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "containerType", required = true)
    Number getContainerType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "daInfo", required = true)
    Map<String, Object> getDaInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needClear", required = true)
    boolean getNeedClear();
}
