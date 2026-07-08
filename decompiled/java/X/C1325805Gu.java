package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter$dispatchStart$1", f = "SocialThoughtDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1325805Gu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1326005Gw LL;
    public final /* synthetic */ SocialThoughtDataCenter LLILLJJLI;
    public final /* synthetic */ ThoughtInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325805Gu(C1326005Gw c1326005Gw, SocialThoughtDataCenter socialThoughtDataCenter, ThoughtInfo thoughtInfo, InterfaceC1364105Vn<? super C1325805Gu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1326005Gw;
        this.LLILLJJLI = socialThoughtDataCenter;
        this.LLILLL = thoughtInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1325805Gu(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.dispatchStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1325705Gt interfaceC1325705Gt = this.LL.LIZIZ;
        if (interfaceC1325705Gt != null) {
            try {
                interfaceC1325705Gt.onStart();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        for (Map.Entry<String, InterfaceC1325705Gt> entry : SocialThoughtDataCenter.LJI.entrySet()) {
            entry.getKey();
            try {
                entry.getValue().onStart();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.dispatchStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
