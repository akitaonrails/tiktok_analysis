package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0vga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1751740vga extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "btm", required = false)
    String getBtm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clickArea", required = true)
    String getClickArea();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "entranceType", required = true)
    String getEntranceType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sellingPoints", required = false)
    String getSellingPoints();
}
