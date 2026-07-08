package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1116710fAL extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoCohostRoomIDs", primitiveClassType = String.class, required = false)
    List<String> getAutoCohostRoomIDs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoCohostSourceType", required = false)
    Number getAutoCohostSourceType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoCohostUIDs", primitiveClassType = String.class, required = false)
    List<String> getAutoCohostUIDs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoMatchEntrance", required = false)
    Number getAutoMatchEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoMatchScene", required = false)
    Number getAutoMatchScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoQuickCohostInvite", required = false)
    Boolean getAutoQuickCohostInvite();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "notOpenPanelWhenAutoCohostFailure", required = false)
    Boolean getNotOpenPanelWhenAutoCohostFailure();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showAnimationForAutoCohostUser", required = false)
    Boolean getShowAnimationForAutoCohostUser();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = false)
    Map<String, Object> getTrackParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = false)
    String getUid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isFriend", required = false)
    Boolean isFriend();
}
