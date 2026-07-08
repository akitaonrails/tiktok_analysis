package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.14uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20415614uY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tag_translated_name", required = true)
    String getTagTranslatedName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tag_type", required = true)
    Number getTagType();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tag_translated_name", required = true)
    void setTagTranslatedName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tag_type", required = true)
    void setTagType(Number number);
}
