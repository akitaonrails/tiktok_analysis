package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1849570yEN extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardID", required = false)
    String getCardID();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "dataType", required = true)
    @InterfaceC1909307dr(option = {"ORIGINAL", "COMMON"})
    String getDataType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventParams", required = false)
    String getEventParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyPath", required = true)
    String getKeyPath();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"GET", "SET", "EVENT"})
    String getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = false)
    String getValue();
}
