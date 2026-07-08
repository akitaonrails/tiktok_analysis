package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC651490Pgx extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "query", required = true)
    String getQuery();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tabName", required = true)
    String getTabName();
}
