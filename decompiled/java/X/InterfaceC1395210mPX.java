package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0mPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1395210mPX extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "preloadId", required = false)
    String getPreloadId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoUrls", nestedClassType = InterfaceC1395230mPZ.class, required = true)
    List<InterfaceC1395230mPZ> getVideoUrls();
}
