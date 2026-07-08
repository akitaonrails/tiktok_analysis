package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0OXY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface C0OXY extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeID", required = true)
    String getAwemeID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keys", primitiveClassType = String.class, required = true)
    List<String> getKeys();
}
