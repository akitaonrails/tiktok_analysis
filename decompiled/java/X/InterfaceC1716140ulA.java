package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0ulA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1716140ulA extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "backImage", required = false)
    String getBackImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "backImageMasked", required = false)
    String getBackImageMasked();

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

    @InterfaceC1549470qQL(isGetter = false, keyPath = "backImage", required = false)
    void setBackImage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "backImageMasked", required = false)
    void setBackImageMasked(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isFraud", required = false)
    void setFraud(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isPhotocopy", required = false)
    void setPhotocopy(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "photocopyScore", required = false)
    void setPhotocopyScore(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isScreen", required = false)
    void setScreen(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screenScore", required = false)
    void setScreenScore(Number number);
}
