package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.14vS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040E
public interface InterfaceC20421214vS extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameplayData", nestedClassType = InterfaceC20421314vT.class, required = true)
    List<InterfaceC20421314vT> getGameplayData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gameplayData", nestedClassType = InterfaceC20421314vT.class, required = true)
    void setGameplayData(List<? extends InterfaceC20421314vT> list);
}
