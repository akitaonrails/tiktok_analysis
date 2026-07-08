package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftRemover$deleteSelectDrafts$1$1", f = "DraftRemover.kt", l = {80}, m = "invokeSuspend")
public final class C555440LqQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<C0M0P> LLILLL;
    public final /* synthetic */ C555490LqV LLILZ;
    public final /* synthetic */ C561130Lzb LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555440LqQ(C561130Lzb c561130Lzb, C555490LqV c555490LqV, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c555490LqV;
        this.LLILZIL = c561130Lzb;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<C0M0P> list = this.LLILLL;
        return new C555440LqQ(this.LLILZIL, this.LLILZ, this.LLILZLL, list, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<C0M0P> it2;
        C1C7U.LIZ("DraftRemover@581a.deleteSelectDrafts$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            it2 = this.LLILLL.iterator();
        }
        while (it2.hasNext()) {
            C0M0P next = it2.next();
            C555490LqV c555490LqV = this.LLILZ;
            C561130Lzb c561130Lzb = this.LLILZIL;
            String str = next.LJ;
            EnumC545550LaT enumC545550LaT = next.LJIILIIL;
            String str2 = this.LLILZLL;
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (c555490LqV.LIZ(c561130Lzb, str, next, enumC545550LaT, str2, this) == objLJFF) {
                C1C7U.LIZIZ("DraftRemover@581a.deleteSelectDrafts$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftRemover@581a.deleteSelectDrafts$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
