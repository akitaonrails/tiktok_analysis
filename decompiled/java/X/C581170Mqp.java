package X;

import Y.AgS166S0300000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Mqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581170Mqp implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 2:
                return collect$2(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object collect$0(C581170Mqp c581170Mqp, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c581170Mqp.l0).collect(new AgS166S0300000_8((ForwardMediaDownloader.DownloadConfig) c581170Mqp.l1, (CreativeInfo) c581170Mqp.l2, interfaceC346701Wf, 0), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C581170Mqp c581170Mqp, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c581170Mqp.l0).collect(new AgS166S0300000_8((ICreationAsyncTaskManager) c581170Mqp.l1, (AwemeDraft) c581170Mqp.l2, interfaceC346701Wf, 4), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C581170Mqp c581170Mqp, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c581170Mqp.l0).collect(new AgS166S0300000_8((AIGCWorkflowManagementApi) c581170Mqp.l1, (C552940LmO) c581170Mqp.l2, interfaceC346701Wf, 5), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public C581170Mqp(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
