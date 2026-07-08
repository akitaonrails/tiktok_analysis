package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qsz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC684430Qsz extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "buttons", required = false)
    Map<String, Object> getButtons();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cancelable", required = false)
    Boolean getCancelable();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = false)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();
}
