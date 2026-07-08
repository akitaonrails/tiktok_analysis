package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface InterfaceC2176331AFj extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", nestedClassType = InterfaceC2176341AFk.class, required = false)
    InterfaceC2176341AFk getContent();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "contentType", required = true)
    @InterfaceC1909307dr(option = {"common", "richText", "richTextList"})
    String getContentType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "richTextContent", nestedClassType = InterfaceC2176351AFl.class, required = false)
    InterfaceC2176351AFl getRichTextContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "richTextListContent", nestedClassType = InterfaceC2176361AFm.class, required = false)
    InterfaceC2176361AFm getRichTextListContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}
