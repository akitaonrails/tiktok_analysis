package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0LSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 73, 80, 85, 86, 87, 88, 89, 90}, m = "run")
public final class C543240LSg extends AbstractC23140094w {
    public C09JG LL;
    public C0LTA LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543210LSd LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543240LSg(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C543240LSg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VTask@a318.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, this);
        C1C7U.LIZIZ("I2VTask@a318.run$1");
        return objLJFF;
    }
}
