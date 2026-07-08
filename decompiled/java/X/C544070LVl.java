package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0LVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.aigcbusiness.text2image.Text2ImageProgressTask", f = "Text2ImageProgressTask.kt", l = {51, 52, 55, 65, 68, 69, 70, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "run")
public final class C544070LVl extends AbstractC23140094w {
    public C09JG LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C544010LVf LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544070LVl(C544010LVf c544010LVf, InterfaceC1364105Vn<? super C544070LVl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c544010LVf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageProgressTask@31bc.run$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZLL.LJFF(null, this);
        C1C7U.LIZIZ("Text2ImageProgressTask@31bc.run$1");
        return objLJFF;
    }
}
