package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0yrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873870yrZ extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dimension", required = false)
    String getDimension();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "group_channel_id", required = false)
    String getGroupChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "inner_channel_id", required = false)
    String getInnerChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "layout", required = false)
    String getLayout();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "dimension", required = false)
    void setDimension(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "group_channel_id", required = false)
    void setGroupChannelId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inner_channel_id", required = false)
    void setInnerChannelId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "layout", required = false)
    void setLayout(String str);
}
