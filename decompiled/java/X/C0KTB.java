package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KTB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KTB extends XBaseParamModel {
    @InterfaceC1909207dq(option = {1, 2, 3, 4, 5, 6, 7})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "action", required = true)
    Number getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contractID", required = false)
    String getContractID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dialogInfo", nestedClassType = C0KTE.class, required = false)
    C0KTE getDialogInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    Map<String, Object> getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fans_club_main_page_is_open", required = false)
    Number getFansClubMainPageIsOpen();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomID", required = false)
    String getRoomID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toUID", required = true)
    String getToUID();
}
