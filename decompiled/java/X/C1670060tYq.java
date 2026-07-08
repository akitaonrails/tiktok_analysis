package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftSelectUIKt$MatchOnlyGiftSelectUI$2$1", f = "MatchOnlyGiftSelectUI.kt", l = {83}, m = "invokeSuspend")
public final class C1670060tYq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ C05P1<C978560bZW> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670060tYq(boolean z, C1690080u58 c1690080u58, C05P1<C978560bZW> c05p1, InterfaceC1364105Vn<? super C1670060tYq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1690080u58;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1670060tYq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchOnlyGiftSelectUIKt@9454.MatchOnlyGiftSelectUI$2$1");
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
            if (!this.LLILLJJLI && (!C1670050tYp.LIZLLL(this.LLILZ).LIZIZ.isEmpty()) && C1670050tYp.LIZLLL(this.LLILZ).LIZLLL >= 0) {
                List<AbstractC1557520qdK> list = C1670050tYp.LIZLLL(this.LLILZ).LIZIZ;
                C05P1<C978560bZW> c05p1 = this.LLILZ;
                Iterator<AbstractC1557520qdK> it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC1557520qdK next = it2.next();
                    if ((next instanceof C1557530qdL) && ((C1557530qdL) next).LIZLLL == C1670050tYp.LIZLLL(c05p1).LIZLLL) {
                        if (i2 >= 0) {
                            C1690080u58 c1690080u58 = this.LLILLL;
                            this.LL = 1;
                            C1687100u0K c1687100u0K = C1690080u58.LJIL;
                            if (c1690080u58.LJIIJ(i2, 0, this) == objLJFF) {
                                C1C7U.LIZIZ("MatchOnlyGiftSelectUIKt@9454.MatchOnlyGiftSelectUI$2$1");
                                return objLJFF;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchOnlyGiftSelectUIKt@9454.MatchOnlyGiftSelectUI$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
