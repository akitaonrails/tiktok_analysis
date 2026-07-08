package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1576, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface AnonymousClass1576 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "chromaForm", required = false)
    Number getChromaForm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "chromaTo", required = false)
    Number getChromaTo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "colorMergingTolerance", required = false)
    Number getColorMergingTolerance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageUrl", required = true)
    String getImageUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lightnessAddition", required = false)
    Number getLightnessAddition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lightnessFrom", required = false)
    Number getLightnessFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lightnessTo", required = false)
    Number getLightnessTo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "region", nestedClassType = AnonymousClass1578.class, required = false)
    AnonymousClass1578 getRegion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "strategyThreshold", required = false)
    Number getStrategyThreshold();
}
