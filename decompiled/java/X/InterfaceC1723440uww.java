package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0uww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1723440uww extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "jumpToPipo", required = true)
    Boolean getJumpToPipo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pipoSchema", required = true)
    String getPipoSchema();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "jumpToPipo", required = true)
    void setJumpToPipo(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pipoSchema", required = true)
    void setPipoSchema(String str);
}
