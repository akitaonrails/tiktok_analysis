package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.14vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20421314vT extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameplayList", nestedClassType = InterfaceC20421414vU.class, required = true)
    List<InterfaceC20421414vU> getGameplayList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gameplayList", nestedClassType = InterfaceC20421414vU.class, required = true)
    void setGameplayList(List<? extends InterfaceC20421414vU> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name", required = true)
    void setName(String str);
}
