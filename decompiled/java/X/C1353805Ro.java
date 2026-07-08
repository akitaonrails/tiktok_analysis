package X;

import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05Ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtFlowBinder$bind$1$1$invokeSuspend$$inlined$flatMapLatest$1", f = "SocialThoughtFlowBinder.kt", l = {193}, m = "invokeSuspend")
public final class C1353805Ro extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super ThoughtInfo>, String, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353805Ro(InterfaceC1364105Vn interfaceC1364105Vn, ISocialThoughtDataCenterService iSocialThoughtDataCenterService) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = iSocialThoughtDataCenterService;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super ThoughtInfo> interfaceC346701Wf, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1353805Ro c1353805Ro = new C1353805Ro(interfaceC1364105Vn, this.LLILZ);
        c1353805Ro.LLILLJJLI = interfaceC346701Wf;
        c1353805Ro.LLILLL = str;
        return c1353805Ro.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa c516501zn;
        C1C7U.LIZ("SocialThoughtFlowBinder@37d2.bind$1$1$invokeSuspend$$inlined$flatMapLatest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            String str = (String) this.LLILLL;
            if (str != null && str.length() != 0) {
                c516501zn = this.LLILZ.LJI(str, false);
            } else {
                c516501zn = new C516501zn(null, 1);
            }
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, c516501zn, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtFlowBinder@37d2.bind$1$1$invokeSuspend$$inlined$flatMapLatest$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtFlowBinder@37d2.bind$1$1$invokeSuspend$$inlined$flatMapLatest$1");
        return unit;
    }
}
