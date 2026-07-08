package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput;

/* JADX INFO: renamed from: X.0LSU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VQuotaTask", f = "GeneralI2VQuotaTask.kt", l = {31, 32, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "run")
public final class C0LSU extends AbstractC23140094w {
    public CommonAigcQuotaInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LST LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LSU(C0LST c0lst, InterfaceC1364105Vn<? super C0LSU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lst;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GeneralI2VQuotaTask@92be.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("GeneralI2VQuotaTask@92be.run$1");
        return objLJFF;
    }
}
