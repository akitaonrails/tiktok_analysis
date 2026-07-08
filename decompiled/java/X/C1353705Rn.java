package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtFlowBinder$bind$1$1", f = "SocialThoughtFlowBinder.kt", l = {78}, m = "invokeSuspend")
public final class C1353705Rn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C05YD<String> LLILLL;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILZ;
    public final /* synthetic */ Function1<ThoughtInfo, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1353705Rn(boolean z, C05YD<String> c05yd, ISocialThoughtDataCenterService iSocialThoughtDataCenterService, Function1<? super ThoughtInfo, Unit> function1, InterfaceC1364105Vn<? super C1353705Rn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c05yd;
        this.LLILZ = iSocialThoughtDataCenterService;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1353705Rn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa c05rh;
        C1C7U.LIZ("SocialThoughtFlowBinder@37d2.bind$1$1");
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
            if (this.LLILLJJLI) {
                c05rh = new C05RH(this.LLILLL);
            } else {
                c05rh = this.LLILLL;
            }
            C23123094f c23123094fLJJIZ = C09IC.LJJIZ(c05rh, new C1353805Ro(null, this.LLILZ));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILZIL, 70);
            this.LL = 1;
            if (c23123094fLJJIZ.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtFlowBinder@37d2.bind$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtFlowBinder@37d2.bind$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
