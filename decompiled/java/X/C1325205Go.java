package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter$clearInternal$1", f = "SocialThoughtDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1325205Go extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialThoughtDataCenter LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325205Go(SocialThoughtDataCenter socialThoughtDataCenter, String str, InterfaceC1364105Vn<? super C1325205Go> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialThoughtDataCenter;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1325205Go c1325205Go = new C1325205Go(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1325205Go.LL = obj;
        return c1325205Go;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.clearInternal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SocialThoughtDataCenter socialThoughtDataCenter = this.LLILLJJLI;
        String str = this.LLILLL;
        try {
            socialThoughtDataCenter.getClass();
            Keva kevaLJIIL = SocialThoughtDataCenter.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("thought_");
            sbLIZ.append(str);
            kevaLJIIL.erase(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.clearInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
