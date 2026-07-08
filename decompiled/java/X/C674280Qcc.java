package X;

import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.middle.ai.repo.EcSearchMiddleAICacheRepo$1", f = "EcSearchMiddleAICacheRepo.kt", l = {}, m = "invokeSuspend")
public final class C674280Qcc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C674270Qcb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C674280Qcc(C674270Qcb c674270Qcb, InterfaceC1364105Vn<? super C674280Qcc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c674270Qcb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C674280Qcc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<EcSearchAIHistoryWord> listLIZIZ;
        String strLIZ;
        C1C7U.LIZ("EcSearchMiddleAICacheRepo@3a42.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C674270Qcb c674270Qcb = this.LL;
        C674290Qcd c674290Qcd = c674270Qcb.LIZIZ;
        if (c674290Qcd == null || (listLIZIZ = c674290Qcd.LIZIZ()) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        c674270Qcb.LIZJ = listLIZIZ;
        C674270Qcb c674270Qcb2 = this.LL;
        C674290Qcd c674290Qcd2 = c674270Qcb2.LIZIZ;
        if (c674290Qcd2 != null) {
            strLIZ = c674290Qcd2.LIZ();
        } else {
            strLIZ = null;
        }
        c674270Qcb2.LIZLLL = strLIZ;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMiddleAICacheRepo@3a42.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
