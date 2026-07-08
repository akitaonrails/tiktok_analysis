package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1877340yxA extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "music", required = true)
    String getMusic();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackInfo", nestedClassType = C15M5.class, required = false)
    C15M5 getTrackInfo();
}
