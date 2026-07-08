package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C040D
public interface InterfaceC342500Dbk extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeId", required = true)
    String getAwemeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeType", required = true)
    String getAwemeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "drawAuthorId", required = false)
    String getDrawAuthorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "drawRoomId", required = false)
    String getDrawRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "drawVideoId", required = false)
    String getDrawVideoId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "relatedLiveTag", required = true)
    String getRelatedLiveTag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reqFrom", required = true)
    String getReqFrom();
}
