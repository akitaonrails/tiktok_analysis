package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0mFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1389260mFw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizLine", required = true)
    String getBizLine();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizScene", required = true)
    String getBizScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "confirmButtonText", required = false)
    String getConfirmButtonText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "defaultSelectedIdList", primitiveClassType = String.class, required = false)
    List<String> getDefaultSelectedIdList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterChatRoomAfterCreatedSuccess", required = false)
    Boolean getEnterChatRoomAfterCreatedSuccess();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraETParams", required = false)
    Map<String, Object> getExtraETParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupType", required = false)
    String getGroupType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "headerList", primitiveClassType = String.class, required = false)
    List<String> getHeaderList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showActiveStatus", required = false)
    Boolean getShowActiveStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stickyTopText", required = false)
    String getStickyTopText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stickyTopUidList", primitiveClassType = String.class, required = false)
    List<String> getStickyTopUidList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isFullScreen", required = false)
    Boolean isFullScreen();
}
