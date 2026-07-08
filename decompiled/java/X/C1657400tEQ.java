package X;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0tEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.component.CameraGuideComponent$state$1", f = "CameraGuideComponent.kt", l = {}, m = "invokeSuspend")
public final class C1657400tEQ extends C09AX implements InterfaceC1631620sYq<C443120HZe<? extends Integer, ? extends Integer, ? extends C1657390tEP>, Set<? extends Pair<? extends Integer, ? extends Integer>>, InterfaceC1364105Vn<? super AbstractC1665600tRe>, Object> {
    public /* synthetic */ C443120HZe LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1657410tER LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657400tEQ(C1657410tER c1657410tER, InterfaceC1364105Vn<? super C1657400tEQ> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1657410tER;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraGuideComponent@b034.state$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = this.LL;
        Set set = (Set) this.LLILLJJLI;
        int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
        int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
        C1657390tEP c1657390tEP = (C1657390tEP) c443120HZe.getThird();
        Pair pair = new Pair(C2286608xc.LJ(iIntValue), C2286608xc.LJ(iIntValue2));
        AbstractC1665600tRe abstractC1665600tRe = c1657390tEP.LIZJ;
        AbstractC1665600tRe abstractC1665600tRe2 = null;
        if (abstractC1665600tRe != null && (!set.contains(new Pair(C2286608xc.LJ(iIntValue), C2286608xc.LJ(iIntValue2))))) {
            abstractC1665600tRe.LIZ = new AwS426S0200000_25(this.LLILLL, (C1657410tER) pair, (Pair<Integer, Integer>) 69);
            abstractC1665600tRe2 = abstractC1665600tRe;
        }
        C1C7U.LIZIZ("CameraGuideComponent@b034.state$1");
        return abstractC1665600tRe2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C443120HZe<? extends Integer, ? extends Integer, ? extends C1657390tEP> c443120HZe, Set<? extends Pair<? extends Integer, ? extends Integer>> set, InterfaceC1364105Vn<? super AbstractC1665600tRe> interfaceC1364105Vn) {
        C1657400tEQ c1657400tEQ = new C1657400tEQ(this.LLILLL, interfaceC1364105Vn);
        c1657400tEQ.LL = c443120HZe;
        c1657400tEQ.LLILLJJLI = set;
        return c1657400tEQ.invokeSuspend(Unit.LIZ);
    }
}
