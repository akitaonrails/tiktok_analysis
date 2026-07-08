package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0KZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface InterfaceC519710KZt extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_params", required = false)
    Object getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "position", nestedClassType = InterfaceC519730KZv.class, required = false)
    InterfaceC519730KZv getPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_id", required = false)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "small_window_type", required = false)
    Number getSmallWindowType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stream_data", required = false)
    String getStreamData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_mute", required = false)
    Boolean isMute();
}
