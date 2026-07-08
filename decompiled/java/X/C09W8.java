package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.09W8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface C09W8 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dsl_content", required = false)
    String getDslContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dsl_id", required = true)
    String getDslId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dsl_is_used", required = true)
    String getDslIsUsed();
}
