package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.component.basic.MatchStartAnimationComponent$show$1", f = "MatchStartAnimationComponent.kt", l = {227}, m = "invokeSuspend")
public final class C973240bQw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C978020bYe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C973240bQw(C978020bYe c978020bYe, InterfaceC1364105Vn<? super C973240bQw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c978020bYe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C973240bQw c973240bQw = new C973240bQw(this.LLILLL, interfaceC1364105Vn);
        c973240bQw.LLILLJJLI = obj;
        return c973240bQw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("MatchStartAnimationComponent@2dd0.show$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C20488215Ey<C973200bQs> c20488215Ey = this.LLILLL.LLIZ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = c20488215Ey.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.show$1");
                return objLJFF;
            }
        }
        C973200bQs c973200bQs = (C973200bQs) obj;
        if (c973200bQs == null) {
            C20441214yg.LIZIZ("MatchStartAnimationComponent", "team match rule execute returned null");
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C973250bQx(this.LLILLL, null), 2);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.show$1");
            return unit;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("team match content: geckoChannel=");
        sbLIZ.append(c973200bQs.LIZ);
        sbLIZ.append(", fileName=");
        sbLIZ.append(c973200bQs.LIZIZ);
        sbLIZ.append(", showBadge=");
        sbLIZ.append(c973200bQs.LJIIL);
        C20441214yg.LIZIZ("MatchStartAnimationComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C973230bQv(this.LLILLL, c973200bQs, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.show$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
