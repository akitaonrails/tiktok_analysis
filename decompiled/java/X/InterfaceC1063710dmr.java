package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1063710dmr {
    EnumC1063530dmZ getAccess();

    EnumC1063610dmh getCompatibility();

    String getName();

    Class<? extends XBaseParamModel> provideParamModel();

    Class<? extends XBaseResultModel> provideResultModel();

    void realHandle(Map<String, ? extends Object> map, InterfaceC801410VcB interfaceC801410VcB, EnumC1063300dmC enumC1063300dmC);

    void release();

    void setBridgeContext(InterfaceC634840OvC interfaceC634840OvC);
}
