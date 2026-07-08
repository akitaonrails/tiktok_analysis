package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.05pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1471105pN extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "leaderboard", nestedClassType = InterfaceC1471205pO.class, required = false)
    List<InterfaceC1471205pO> getLeaderboard();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "leaderboard", nestedClassType = InterfaceC1471205pO.class, required = false)
    void setLeaderboard(List<? extends InterfaceC1471205pO> list);
}
