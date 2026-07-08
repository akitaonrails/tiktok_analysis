package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder.playtools.header.playtools.ui.PlayToolListViewKt$PlayToolListView$2$1", f = "PlayToolListView.kt", l = {105}, m = "invokeSuspend")
public final class C05ZP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ C13ES<Integer> LLILLL;
    public final /* synthetic */ List<C941240abK> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZP(C1690080u58 c1690080u58, C13ES<Integer> c13es, List<C941240abK> list, InterfaceC1364105Vn<? super C05ZP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = c13es;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ZP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayToolListViewKt@1f10.PlayToolListView$2$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new C05ZO(this.LLILLJJLI)));
            final C13ES<Integer> c13es = this.LLILLL;
            final List<C941240abK> list = this.LLILZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ada
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C13ES<Integer> c13es2 = c13es;
                    List<C941240abK> list2 = list;
                    Iterator it2 = ((List) obj2).iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (!c13es2.contains(C2286608xc.LJ(iIntValue))) {
                            c13es2.add(C2286608xc.LJ(iIntValue));
                            C932160aMg.LJFF(((C941240abK) ListProtector.get(list2, iIntValue)).LIZ, "show", EnumC937290aUx.MULTI_TOOL, !((C941240abK) ListProtector.get(list2, iIntValue)).LJ, ((C941240abK) ListProtector.get(list2, iIntValue)).LJI ? 1 : 0);
                            if (((C941240abK) ListProtector.get(list2, iIntValue)).LIZ == EnumC936960aUQ.LETS_DANCE) {
                                C946950akX.LIZJ("playbook");
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PlayToolListViewKt@1f10.PlayToolListView$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayToolListViewKt@1f10.PlayToolListView$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
