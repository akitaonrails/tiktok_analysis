package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC684220Qse extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = true)
    String getCid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    Map<String, Object> getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemId", required = false)
    String getItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = true)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ownerId", required = false)
    String getOwnerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reportFrom", required = true)
    String getReportFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reportObjectID", required = false)
    String getReportObjectID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomId", required = false)
    String getRoomId();
}
