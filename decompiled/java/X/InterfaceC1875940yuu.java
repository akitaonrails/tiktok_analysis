package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1875940yuu extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "API", required = true)
    String getAPI();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel", required = true)
    String getChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needIntercept", required = true)
    boolean getNeedIntercept();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "payload", required = false)
    Map<String, Object> getPayload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "service", required = true)
    String getService();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = true)
    String getSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "target", required = true)
    String getTarget();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timeCost", required = true)
    Number getTimeCost();
}
