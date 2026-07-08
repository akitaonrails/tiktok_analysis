package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1877580yxY extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeIds", primitiveClassType = String.class, required = true)
    List<String> getAwemeIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "interestId", required = true)
    Number getInterestId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "interestName", required = true)
    String getInterestName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isPinTopic", required = true)
    boolean isPinTopic();
}
