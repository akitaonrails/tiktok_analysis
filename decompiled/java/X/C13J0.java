package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.13J0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "readObject")
public final class C13J0 extends AbstractC23140094w {
    public C13JB LL;
    public C19988713Iv LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C19988713Iv LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13J0(C19988713Iv c19988713Iv, InterfaceC1364105Vn<? super C13J0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c19988713Iv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        return this.LLILZLL.LIZJ(null, this);
    }
}
