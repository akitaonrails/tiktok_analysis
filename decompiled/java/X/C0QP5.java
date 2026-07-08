package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0QP5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0QP5 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avoid_record_history", required = false)
    Number getAvoidRecordHistory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ecomSearchParams", required = false)
    Map<String, Object> getEcomSearchParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "event_id", required = false)
    String getEventId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "icon_type", required = false)
    String getIconType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "impr_id", required = false)
    String getImprId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = true)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "penetrate_info", required = false)
    String getPenetrateInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchFrom", required = false)
    Number getSearchFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchSourcePage", required = false)
    String getSearchSourcePage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tab_name", required = false)
    String getTabName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = false)
    String getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "words_type", required = false)
    String getWordsType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_sar_recall", required = false)
    String isSarRecall();
}
