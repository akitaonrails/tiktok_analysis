package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1851850yI3 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "address", required = true)
    String getAddress();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_id", required = true)
    String getAppId();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "asr_show_lang", required = false)
    boolean getAsrShowLang();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "auto_stop", required = false)
    boolean getAutoStop();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cluster", required = true)
    String getCluster();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = LivePreCreateNextRoomPlayer.ENABLE, type = DefaultType.INT), isGetter = true, keyPath = "connect_time_out", required = false)
    Number getConnectTimeOut();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lang", primitiveClassType = String.class, required = false)
    List<String> getLang();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = LivePreCreateNextRoomPlayer.ENABLE, type = DefaultType.INT), isGetter = true, keyPath = "receive_time_out", required = false)
    Number getReceiveTimeOut();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 5000, type = DefaultType.INT), isGetter = true, keyPath = "total_time_out", required = false)
    Number getTotalTimeOut();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = true)
    String getUri();
}
