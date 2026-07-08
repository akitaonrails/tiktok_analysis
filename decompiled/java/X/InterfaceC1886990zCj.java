package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0zCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1886990zCj extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameplayId", required = true)
    String getGameplayId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "payload", required = true)
    Map<String, Object> getPayload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pspStrategyKey", required = true)
    String getPspStrategyKey();
}
