package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0ulE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1716180ulE extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "frontImage", required = false)
    String getFrontImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frontImageMasked", required = false)
    String getFrontImageMasked();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "photocopyScore", required = false)
    Number getPhotocopyScore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screenScore", required = false)
    Number getScreenScore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isFraud", required = false)
    Boolean isFraud();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isPhotocopy", required = false)
    Boolean isPhotocopy();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isScreen", required = false)
    Boolean isScreen();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isFraud", required = false)
    void setFraud(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "frontImage", required = false)
    void setFrontImage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "frontImageMasked", required = false)
    void setFrontImageMasked(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isPhotocopy", required = false)
    void setPhotocopy(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "photocopyScore", required = false)
    void setPhotocopyScore(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isScreen", required = false)
    void setScreen(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screenScore", required = false)
    void setScreenScore(Number number);
}
