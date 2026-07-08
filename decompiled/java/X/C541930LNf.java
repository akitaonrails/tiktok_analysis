package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationCheckCameoPermissionTask", f = "AICreationCheckCameoPermissionTask.kt", l = {37, 38, 43, 61, BaseNotice.CREATOR, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "run")
public final class C541930LNf extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541920LNe LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541930LNf(C541920LNe c541920LNe, InterfaceC1364105Vn<? super C541930LNf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c541920LNe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationCheckCameoPermissionTask@499.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("AICreationCheckCameoPermissionTask@499.run$1");
        return objLJFF;
    }
}
