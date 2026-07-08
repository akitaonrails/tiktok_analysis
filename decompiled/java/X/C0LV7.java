package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LV7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask", f = "AICreationServerProgressTask.kt", l = {BaseNotice.CREATOR, 63, 66, 70, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 76, 84}, m = "run")
public final class C0LV7 extends AbstractC23140094w {
    public C09JG LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LV4 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LV7(C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LV7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, this);
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.run$1");
        return objLJFF;
    }
}
