package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CU6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CU6 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "endAt", required = true)
    Number getEndAt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAt", required = true)
    Number getStartAt();
}
