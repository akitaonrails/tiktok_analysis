package X;

import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0LnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553670LnZ {
    public static final InterfaceC553510LnJ LIZ(AIGCWorkflowManagementApi aIGCWorkflowManagementApi) {
        WorkflowAutoLifecycleControllerProvider workflowAutoLifecycleControllerProvider = (WorkflowAutoLifecycleControllerProvider) PluggableExtentionKt.pluggableSpi$default(WorkflowAutoLifecycleControllerProvider.class, false, false, false, 14, null);
        if (workflowAutoLifecycleControllerProvider != null) {
            return workflowAutoLifecycleControllerProvider.LIZ(aIGCWorkflowManagementApi);
        }
        return null;
    }
}
