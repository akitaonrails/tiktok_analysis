package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1873790yrR extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "link_page", required = false)
    String getLinkPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user_id_list", primitiveClassType = String.class, required = true)
    List<String> getUserIdList();
}
