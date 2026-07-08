package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1057660dd6 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = true)
    String getCid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "creativeId", required = true)
    String getCreativeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = true)
    Map<String, Object> getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupId", required = true)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemId", required = true)
    String getItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = true)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reqId", required = true)
    String getReqId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rit", required = true)
    String getRit();
}
