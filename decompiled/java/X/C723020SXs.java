package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem$onViewFinishInflate$1$2$1$1", f = "PlayListBottomBarAssem.kt", l = {336, 338}, m = "invokeSuspend")
public final class C723020SXs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC723050SXv LLILLL;
    public final /* synthetic */ InteractPlayListBottomBarAssem LLILZ;
    public final /* synthetic */ C197039127h LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723020SXs(InterfaceC723050SXv interfaceC723050SXv, InteractPlayListBottomBarAssem interactPlayListBottomBarAssem, C197039127h c197039127h, InterfaceC1364105Vn<? super C723020SXs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC723050SXv;
        this.LLILZ = interactPlayListBottomBarAssem;
        this.LLILZIL = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C723020SXs c723020SXs = new C723020SXs(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c723020SXs.LLILLJJLI = obj;
        return c723020SXs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C723030SXt(this.LLILLL, this.LLILZ, null), 3);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if ((pair.getFirst() instanceof C1623606Xi) && (pair.getSecond() instanceof C1623606Xi)) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C723010SXr c723010SXr = new C723010SXr(this.LLILZ, this.LLILZIL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c723010SXr) == objLJFF) {
                C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InteractPlayListBottomBarAssem@6241.onViewFinishInflate$1$2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
