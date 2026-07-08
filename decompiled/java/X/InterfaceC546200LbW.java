package X;

import com.ss.android.ugc.aweme.aikit.api.common.task.CommonResponse;
import com.ss.android.ugc.aweme.aikit.api.common.task.DeleteCameoDraftBody;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetDraftDetailResponse;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetTaskInfoResponse;

/* JADX INFO: renamed from: X.0LbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC546200LbW {
    @InterfaceC1501200pAU("/api/cameo/draft/detail")
    Object LIZ(@InterfaceC1501120pAM("draft_id") String str, InterfaceC1364105Vn<? super GetDraftDetailResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/api/ai_gen_lifecycle/detail")
    Object LIZIZ(@InterfaceC1501120pAM("task_id") String str, @InterfaceC1501120pAM("dm_client_msg_id") String str2, InterfaceC1364105Vn<? super GetTaskInfoResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/cameo/draft/delete")
    Object LIZJ(@C040I DeleteCameoDraftBody deleteCameoDraftBody, InterfaceC1364105Vn<? super CommonResponse> interfaceC1364105Vn);
}
