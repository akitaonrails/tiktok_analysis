package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ypa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1872640ypa extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "customIcon", required = false)
    String getCustomIcon();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "delay", required = false)
    Number getDelay();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = LivePreCreateNextRoomPlayer.ENABLE, type = DefaultType.INT), isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "icon", required = false)
    @InterfaceC1909307dr(option = {"error", "info", "success", "warn"})
    String getIcon();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = false)
    @InterfaceC1909307dr(option = {"error", "success", "warn"})
    String getType();
}
