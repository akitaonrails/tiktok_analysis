package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0zbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1902630zbx extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "completedTimes", required = true)
    Number getCompletedTimes();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "engagementType", required = false)
    Number getEngagementType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskId", required = true)
    String getTaskId();
}
