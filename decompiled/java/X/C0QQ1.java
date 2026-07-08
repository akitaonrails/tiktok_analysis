package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0QQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0QQ1 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "middleParam", nestedClassType = C0QPC.class, required = false)
    C0QPC getMiddleParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "preloadScene", required = true)
    String getPreloadScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recomParam", nestedClassType = C0QQ0.class, required = false)
    C0QQ0 getRecomParam();
}
