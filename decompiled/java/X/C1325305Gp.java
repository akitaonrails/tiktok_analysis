package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter$writeThought$2", f = "SocialThoughtDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1325305Gp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialThoughtDataCenter LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ThoughtInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325305Gp(SocialThoughtDataCenter socialThoughtDataCenter, String str, ThoughtInfo thoughtInfo, InterfaceC1364105Vn<? super C1325305Gp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialThoughtDataCenter;
        this.LLILLL = str;
        this.LLILZ = thoughtInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1325305Gp c1325305Gp = new C1325305Gp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1325305Gp.LL = obj;
        return c1325305Gp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.writeThought$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SocialThoughtDataCenter socialThoughtDataCenter = this.LLILLJJLI;
        String str = this.LLILLL;
        ThoughtInfo thoughtInfo = this.LLILZ;
        try {
            socialThoughtDataCenter.getClass();
            Keva kevaLJIIL = SocialThoughtDataCenter.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("thought_");
            sbLIZ.append(str);
            kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), SocialThoughtDataCenter.LIZ.getValue().LJIILL(thoughtInfo));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.writeThought$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
