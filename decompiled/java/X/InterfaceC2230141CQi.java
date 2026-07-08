package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2230141CQi extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "endAt", required = true)
    Number getEndAt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    Number getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "startAt", required = true)
    Number getStartAt();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "endAt", required = true)
    void setEndAt(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
    void setId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "startAt", required = true)
    void setStartAt(Number number);
}
