package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0KYW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KYW extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coverUrl", required = true)
    String getCoverUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "desc", required = true)
    String getDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "descriptionStarlingKey", required = false)
    String getDescriptionStarlingKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "descriptionStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getDescriptionStarlingKeyArgs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "innerUrl", required = true)
    String getInnerUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "outerDescription", required = false)
    String getOuterDescription();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "outerTitle", required = false)
    String getOuterTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "outerUrl", required = true)
    String getOuterUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "quotePreviewText", required = true)
    String getQuotePreviewText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "quotePreviewTextStarlingKey", required = false)
    String getQuotePreviewTextStarlingKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "quotePreviewTextStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getQuotePreviewTextStarlingKeyArgs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "receiverPreviewText", required = true)
    String getReceiverPreviewText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "receiverPreviewTextStarlingKey", required = false)
    String getReceiverPreviewTextStarlingKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "receiverPreviewTextStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getReceiverPreviewTextStarlingKeyArgs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "senderPreviewText", required = true)
    String getSenderPreviewText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "senderPreviewTextStarlingKey", required = false)
    String getSenderPreviewTextStarlingKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "senderPreviewTextStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getSenderPreviewTextStarlingKeyArgs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "titleStarlingKey", required = false)
    String getTitleStarlingKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "titleStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getTitleStarlingKeyArgs();
}
