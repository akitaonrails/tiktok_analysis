package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1378500lya extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "activityScene", required = false)
    String getActivityScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizSceneTag", required = false)
    String getBizSceneTag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizTag", required = false)
    String getBizTag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinAccountInfo", required = false)
    Map<String, Object> getBulletinAccountInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinSharePolicy", required = false)
    Number getBulletinSharePolicy();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "customActionItems", primitiveClassType = String.class, required = false)
    List<String> getCustomActionItems();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "desc", required = false)
    String getDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableCopyLinkDesc", required = false)
    Number getEnableCopyLinkDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hideContacts", required = false)
    Number getHideContacts();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hideExternalShare", required = false)
    Number getHideExternalShare();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hideShareItems", required = false)
    Number getHideShareItems();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hidesPanelMask", required = false)
    Boolean getHidesPanelMask();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = false)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "image", required = false)
    String getImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageData", required = false)
    String getImageData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "image_path", required = false)
    String getImagePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "image_paths", primitiveClassType = String.class, required = false)
    List<String> getImagePaths();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "innerUrl", required = false)
    String getInnerUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "internalURL", required = false)
    String getInternalURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message_type", required = false)
    String getMessageType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needPanelFrameInfo", required = false)
    Boolean getNeedPanelFrameInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "organizer", required = false)
    Map<String, Object> getOrganizer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "platform", required = false)
    String getPlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "qrcode", required = false)
    Number getQrcode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareChannels", nestedClassType = InterfaceC1378630lyn.class, required = false)
    List<InterfaceC1378630lyn> getShareChannels();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareCustomChannels", nestedClassType = InterfaceC1378640lyo.class, required = false)
    List<InterfaceC1378640lyo> getShareCustomChannels();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareCustomPanel", required = false)
    Map<String, Object> getShareCustomPanel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "share_dm_info", required = false)
    Map<String, Object> getShareDmInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareEntriesForbidList", primitiveClassType = String.class, required = false)
    List<String> getShareEntriesForbidList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareJsbMode", required = false)
    Number getShareJsbMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "share_project", required = false)
    String getShareProject();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareURL", required = false)
    String getShareURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareitems", nestedClassType = InterfaceC1378650lyp.class, required = false)
    List<InterfaceC1378650lyp> getShareitems();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showDesc", required = false)
    Boolean getShowDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showsIMForActivity", required = false)
    Boolean getShowsIMForActivity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "start_time", required = false)
    String getStartTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tips", required = false)
    String getTips();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "track_info", required = false)
    Map<String, Object> getTrackInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = false)
    String getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "use_origin_link", required = false)
    Number getUseOriginLink();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAuthor", required = false)
    Number isAuthor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_popup", required = false)
    Boolean isPopup();
}
