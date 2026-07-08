package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1801560wyw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardSubtype", required = true)
    Number getCardSubtype();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dislikeClickCount", required = false)
    Number getDislikeClickCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dislikeClickTime", required = false)
    Number getDislikeClickTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "notDisplayCount", required = false)
    Number getNotDisplayCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showTime", required = false)
    Number getShowTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "triggerCondition", required = true)
    Number getTriggerCondition();
}
