package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.03jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C040E
public interface InterfaceC923803jI extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tokenizedData", required = true)
    Map<String, Object> getTokenizedData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tokenizedData", required = true)
    void setTokenizedData(Map<String, ? extends Object> map);
}
