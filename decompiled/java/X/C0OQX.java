package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0OQX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OQX extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "button_action", required = false)
    Number getButtonAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "button_schema_url", required = false)
    String getButtonSchemaUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "button_text", required = false)
    String getButtonText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    String getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "image", nestedClassType = C0OQZ.class, required = false)
    C0OQZ getImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scene_badge_url", nestedClassType = InterfaceC2400009ao.class, required = false)
    InterfaceC2400009ao getSceneBadgeUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scene_title", required = false)
    String getSceneTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();
}
