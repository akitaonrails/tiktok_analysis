package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0wyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1801450wyl extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "delay", required = false)
    Number getDelay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "position", required = false)
    Number getPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "show_top", required = false)
    Boolean getShowTop();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = false)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = false)
    String getText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = false)
    String getType();
}
