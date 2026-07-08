package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0Lcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.resourcemanager.GlobalAsyncTaskHandlerWrapperHandle", f = "GlobalAsyncTaskHandlerWrapperHandle.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "release")
public final class C547040Lcs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C547020Lcq LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C547040Lcs(C547020Lcq c547020Lcq, InterfaceC1364105Vn<? super C547040Lcs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c547020Lcq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GlobalAsyncTaskHandlerWrapperHandle@aac5.release$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("GlobalAsyncTaskHandlerWrapperHandle@aac5.release$1");
        return objLIZIZ;
    }
}
