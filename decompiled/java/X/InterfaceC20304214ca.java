package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.14ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface InterfaceC20304214ca extends XBaseParamModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "permission", required = true)
    @InterfaceC1909307dr(option = {"camera", "contacts", "microphone", "photoAlbum", "vibrate", "notification", "calendar", "read_calendar", "write_calendar"})
    String getPermission();
}
