package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPHandlerGroup$processItemGroup$job$1", f = "PPHandlerGroup.kt", l = {}, m = "invokeSuspend")
public final class C19522811Zq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC19526511aR LLILLJJLI;
    public final /* synthetic */ AbstractC19524211a4 LLILLL;
    public final /* synthetic */ C11ZU LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19522811Zq(InterfaceC19526511aR interfaceC19526511aR, AbstractC19524211a4 abstractC19524211a4, C11ZU c11zu, InterfaceC1364105Vn<? super C19522811Zq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC19526511aR;
        this.LLILLL = abstractC19524211a4;
        this.LLILZ = c11zu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19522811Zq c19522811Zq = new C19522811Zq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c19522811Zq.LL = obj;
        return c19522811Zq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPHandlerGroup@c6a1.processItemGroup$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<InterfaceC19526611aS> listLLILIL = this.LLILLJJLI.LLILIL();
        AbstractC19524211a4 abstractC19524211a4 = this.LLILLL;
        InterfaceC19526511aR interfaceC19526511aR = this.LLILLJJLI;
        C11ZU c11zu = this.LLILZ;
        int i = 0;
        for (InterfaceC19526611aS interfaceC19526611aS : listLLILIL) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(abstractC19524211a4.getClass().getSimpleName());
                sbLIZ.append(' ');
                sbLIZ.append(i);
                sbLIZ.append(" start!");
                C2188811AlT.LIZIZ(sbLIZ);
                C19529611aw.LIZ();
                C23250099c.LIZIZ(interfaceC497601wk, null, null, new C19522711Zp(abstractC19524211a4, interfaceC19526511aR, interfaceC19526611aS, c11zu, null), 3);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PPHandlerGroup@c6a1.processItemGroup$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
