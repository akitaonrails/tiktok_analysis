package X;

import Y.AgS200S0200000_9;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Opp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$unHighlight$1", f = "OriginMusicListViewModel.kt", l = {567, 567}, m = "invokeSuspend")
public final class C631510Opp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public final /* synthetic */ C632090Oql LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631510Opp(OriginMusicListViewModel originMusicListViewModel, C632090Oql c632090Oql, InterfaceC1364105Vn<? super C631510Opp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = originMusicListViewModel;
        this.LLILLL = c632090Oql;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631510Opp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.unHighlight$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unHighlight$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C632120Oqo.LIZ.getClass();
            C632120Oqo.LIZ("unHighlight");
            InterfaceC631520Opq interfaceC631520Opq = (InterfaceC631520Opq) this.LLILLJJLI.LL.getOperator();
            C631640Oq2 c631640Oq2 = this.LLILLJJLI.LLILLJJLI;
            if (c631640Oq2 == null || (str = c631640Oq2.LIZIZ) == null) {
                str = "";
            }
            this.LL = 1;
            obj = interfaceC631520Opq.LLJLILLLLZIIL(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unHighlight$1");
                return objLJFF;
            }
        }
        AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILLJJLI, this.LLILLL, 7);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS200S0200000_9, this) == objLJFF) {
            C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unHighlight$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.unHighlight$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
