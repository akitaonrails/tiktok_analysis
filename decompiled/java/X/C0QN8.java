package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0QN8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0QN8 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_group_id", required = false)
    String getEnterGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "group_id", required = true)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "impr_id", required = true)
    String getImprId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "report_type", required = false)
    String getReportType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "search_position", required = true)
    String getSearchPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "words_content", required = true)
    String getWordsContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "words_position", required = true)
    Number getWordsPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "words_source", required = true)
    String getWordsSource();
}
