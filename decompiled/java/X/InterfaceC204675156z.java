package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.156z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface InterfaceC204675156z extends XBaseParamModel {
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

    @InterfaceC1549470qQL(isGetter = true, keyPath = "strategyThreshold", required = false)
    Number getStrategyThreshold();
}
