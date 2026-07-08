package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0LVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask", f = "EditorProR2VTask.kt", l = {69, 70, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 73, 74, 75}, m = "run")
public final class C544100LVo extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543980LVc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544100LVo(C543980LVc c543980LVc, InterfaceC1364105Vn<? super C544100LVo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543980LVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("EditorProR2VTask@7046.run$1");
        return objLJFF;
    }
}
