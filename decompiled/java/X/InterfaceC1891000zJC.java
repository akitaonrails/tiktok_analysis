package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0zJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1891000zJC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enable", required = true)
    boolean getEnable();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "settingsName", required = true)
    @InterfaceC1909307dr(option = {"AdAuthorization", "VideoSoundCopyright", "VideoInspiration", "AIStudioEntrance", "AutoDubbingAuthorization"})
    String getSettingsName();
}
