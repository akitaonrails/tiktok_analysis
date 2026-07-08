package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.167Y, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040E
public interface C167Y extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "uploadedImageList", nestedClassType = C167Z.class, required = true)
    List<C167Z> getUploadedImageList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uploadedImageList", nestedClassType = C167Z.class, required = true)
    void setUploadedImageList(List<? extends C167Z> list);
}
