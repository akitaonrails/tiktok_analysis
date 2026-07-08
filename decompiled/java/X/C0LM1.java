package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0LM1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationFakeDMMessageTask", f = "AICreationFakeDMMessageTask.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, 35, 40, 43}, m = "run")
public final class C0LM1 extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LM0 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LM1(C0LM0 c0lm0, InterfaceC1364105Vn<? super C0LM1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lm0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationFakeDMMessageTask@ca73.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("AICreationFakeDMMessageTask@ca73.run$1");
        return objLJFF;
    }
}
