package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSessionLegacy$maybeSwitchToSpeakerOnCallStart$1", f = "CallSessionLegacy.kt", l = {276}, m = "invokeSuspend")
public final class C1302240jza extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1302410jzr> LLILLJJLI;
    public final /* synthetic */ C1302260jzc LLILLL;
    public final /* synthetic */ C1302410jzr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302240jza(List<C1302410jzr> list, C1302260jzc c1302260jzc, C1302410jzr c1302410jzr, InterfaceC1364105Vn<? super C1302240jza> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1302260jzc;
        this.LLILZ = c1302410jzr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302240jza(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            Iterator<C1302410jzr> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                if (it2.next().LLILLJJLI == 2) {
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                        return objLJFF;
                    }
                }
            }
            this.LLILLL.LJI(this.LLILZ);
            return Unit.LIZ;
        }
        C1302260jzc c1302260jzc = this.LLILLL;
        C1302410jzr c1302410jzr = c1302260jzc.LLJJIJIIJIL;
        if (c1302410jzr == null || c1302410jzr.LLILLJJLI != 2) {
            c1302260jzc.LJI(this.LLILZ);
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
