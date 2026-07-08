package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0yAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1847280yAg extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content1", required = false)
    String getContent1();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content2", required = false)
    String getContent2();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content3", required = false)
    String getContent3();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content4", required = false)
    String getContent4();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxHeight", required = false)
    Number getMaxHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxWidth", required = false)
    Number getMaxWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "resourceId", required = false)
    String getResourceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stickerId", required = false)
    Number getStickerId();

    @InterfaceC1909207dq(option = {BdTuring.TYPE_ECAF, BdTuring.TYPE_SMS_VOICE})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    Number getType();
}
