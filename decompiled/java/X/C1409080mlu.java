package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0mlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskExecutor", f = "TaskExecutor.kt", l = {58, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "executeTask")
public final class C1409080mlu extends AbstractC23140094w {
    public AbstractC1420120n3i LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1420100n3g LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409080mlu(C1420100n3g c1420100n3g, InterfaceC1364105Vn<? super C1409080mlu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1420100n3g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskExecutor@b82a.executeTask$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, null, this);
        C1C7U.LIZIZ("TaskExecutor@b82a.executeTask$1");
        return objLIZ;
    }
}
