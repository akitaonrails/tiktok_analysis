package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.14vU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20421414vU extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enable", required = true)
    Boolean getEnable();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameplayId", required = true)
    String getGameplayId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enable", required = true)
    void setEnable(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gameplayId", required = true)
    void setGameplayId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name", required = true)
    void setName(String str);
}
