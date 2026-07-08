package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0vwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1761850vwt extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "galleryList", nestedClassType = InterfaceC1761840vws.class, required = true)
    List<InterfaceC1761840vws> getGalleryList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "index", required = true)
    Number getIndex();
}
