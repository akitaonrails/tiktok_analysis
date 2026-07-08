package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0DPN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040E
public interface C0DPN extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemes", required = true)
    List<Object> getAwemes();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "awemes", required = true)
    void setAwemes(List<? extends Object> list);
}
