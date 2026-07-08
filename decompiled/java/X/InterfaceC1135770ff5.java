package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0ff5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1135770ff5 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "combo_count", required = false)
    Number getComboCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_id", required = false)
    Number getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_type", required = false)
    Number getGiftType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "group_count", required = false)
    Number getGroupCount();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "combo_count", required = false)
    void setComboCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gift_id", required = false)
    void setGiftId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gift_type", required = false)
    void setGiftType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "group_count", required = false)
    void setGroupCount(Number number);
}
