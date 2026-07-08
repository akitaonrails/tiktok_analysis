package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0g2O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1150220g2O extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "customError", required = true)
    Map<String, Object> getCustomError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = true)
    Map<String, Object> getTrackParams();
}
