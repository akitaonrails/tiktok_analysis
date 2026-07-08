package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1546910qMD extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "convert_map", required = true)
    Map<String, Object> getConvertMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hash", required = false)
    String getHash();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lang_tags", primitiveClassType = String.class, required = true)
    List<String> getLangTags();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "public_path", required = true)
    String getPublicPath();
}
