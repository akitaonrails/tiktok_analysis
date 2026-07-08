package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoBottomHeightAssem;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoBottomHeightAssem$onViewCreated$1", f = "TakoAIVideoFeedVideoBottomHeightAssem.kt", l = {51}, m = "invokeSuspend")
public final class C448810Hip extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAIVideoFeedVideoBottomHeightAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448810Hip(TakoAIVideoFeedVideoBottomHeightAssem takoAIVideoFeedVideoBottomHeightAssem, InterfaceC1364105Vn<? super C448810Hip> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAIVideoFeedVideoBottomHeightAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448810Hip(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.onViewCreated$1");
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
            TakoAIVideoFeedVideoBottomHeightAssem takoAIVideoFeedVideoBottomHeightAssem = this.LLILLJJLI;
            C2252321DDq c2252321DDq = takoAIVideoFeedVideoBottomHeightAssem.LLJJJJ;
            InterfaceC448830Hir interfaceC448830Hir = takoAIVideoFeedVideoBottomHeightAssem.LLJJL;
            if (interfaceC448830Hir == null) {
                synchronized (takoAIVideoFeedVideoBottomHeightAssem) {
                    interfaceC448830Hir = takoAIVideoFeedVideoBottomHeightAssem.LLJJL;
                    if (interfaceC448830Hir == null) {
                        C0QSJ c0qsjLIZLLL = takoAIVideoFeedVideoBottomHeightAssem.LLJLIL;
                        if (c0qsjLIZLLL == null) {
                            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = takoAIVideoFeedVideoBottomHeightAssem.LLJJLIIIJLLLLLLLZ;
                            if (interfaceC665370Q7zLJIIIZ == null) {
                                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(takoAIVideoFeedVideoBottomHeightAssem);
                                takoAIVideoFeedVideoBottomHeightAssem.LLJJLIIIJLLLLLLLZ = interfaceC665370Q7zLJIIIZ;
                            }
                            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{VideoCellScope.class});
                            takoAIVideoFeedVideoBottomHeightAssem.LLJLIL = c0qsjLIZLLL;
                        }
                        if (c0qsjLIZLLL == null) {
                            interfaceC448830Hir = null;
                        } else {
                            interfaceC448830Hir = (InterfaceC448830Hir) c0qsjLIZLLL.getAbility(InterfaceC448830Hir.class);
                            C687700QyG.LJ(interfaceC448830Hir, InterfaceC448830Hir.class);
                        }
                        takoAIVideoFeedVideoBottomHeightAssem.LLJJL = interfaceC448830Hir;
                    }
                }
            }
            C463000IDq c463000IDq = new C463000IDq(new C414301jJ(c2252321DDq, interfaceC448830Hir.LJJJZ(), new C01UA(null)), 38);
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 98);
            this.LL = 1;
            if (c463000IDq.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.onViewCreated$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
