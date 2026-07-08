package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1799540wvg extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "consumeURL", required = false)
    String getConsumeURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = false)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "consumeURL", required = false)
    void setConsumeURL(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "content", required = false)
    void setContent(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "keyword", required = false)
    void setKeyword(String str);
}
