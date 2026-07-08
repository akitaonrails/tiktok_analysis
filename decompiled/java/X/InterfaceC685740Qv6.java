package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Qv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC685740Qv6 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeInfo", required = false)
    Object getAwemeInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_log_params", required = false)
    String getExtraLogParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_params", required = false)
    Object getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "feedback_type", required = true)
    String getFeedbackType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "img_cover", required = false)
    String getImgCover();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "multiple_choices", required = false)
    Object getMultipleChoices();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needMarkdownParse", required = false)
    Boolean getNeedMarkdownParse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}
