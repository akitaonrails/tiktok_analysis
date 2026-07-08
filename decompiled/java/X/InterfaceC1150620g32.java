package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0g32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1150620g32 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coinAmount", required = true)
    Number getCoinAmount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enigmaParams", nestedClassType = InterfaceC1150670g37.class, required = false)
    InterfaceC1150670g37 getEnigmaParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "magicGiftParams", nestedClassType = InterfaceC1150660g36.class, required = false)
    InterfaceC1150660g36 getMagicGiftParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "retryTimes", required = true)
    Number getRetryTimes();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sceneSource", required = true)
    String getSceneSource();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "sceneType", required = true)
    @InterfaceC1909307dr(option = {"magic_gift_create", "join_enigma"})
    String getSceneType();
}
