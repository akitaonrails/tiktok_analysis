package X;

import Y.AgS295S0100000_14;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.EditToolbarAutoCutHandler$7", f = "AutoCut.kt", l = {223}, m = "invokeSuspend")
public final class C861310Xqb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1459980o60 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861310Xqb(C1459980o60 c1459980o60, InterfaceC1364105Vn<? super C861310Xqb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1459980o60;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861310Xqb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<Map<String, C559050LwF>> c05ydHR0;
        C1C7U.LIZ("EditToolbarAutoCutHandler@4f8f.<init>$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1459980o60 c1459980o60 = this.LLILLJJLI;
            InterfaceC1417440mzO interfaceC1417440mzO = (InterfaceC1417440mzO) c1459980o60.LLJ.getValue(c1459980o60, C1459980o60.LLJILJIL[6]);
            if (interfaceC1417440mzO != null && (c05ydHR0 = interfaceC1417440mzO.HR0()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 74);
                this.LL = 1;
                if (c05ydHR0.collect(agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("EditToolbarAutoCutHandler@4f8f.<init>$7");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditToolbarAutoCutHandler@4f8f.<init>$7");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
