package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0KZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface InterfaceC519640KZm extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = false)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "only_hide", required = false)
    Boolean getOnlyHide();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "small_window_type", required = false)
    Number getSmallWindowType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_mute", required = false)
    Boolean isMute();
}
