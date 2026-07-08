package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0OZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC621660OZw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeID", required = true)
    String getAwemeID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keys", primitiveClassType = String.class, required = true)
    List<String> getKeys();
}
