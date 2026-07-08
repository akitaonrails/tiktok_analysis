package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.game.LiveGameMsgView2$onProfileListChange$2", f = "LiveGameMsgView2.kt", l = {}, m = "invokeSuspend")
public final class C2171108ez extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C784630UqD LL;
    public final /* synthetic */ List<C1105460esC> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2171108ez(C784630UqD c784630UqD, List<C1105460esC> list, InterfaceC1364105Vn<? super C2171108ez> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c784630UqD;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2171108ez(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC21673619ry adapter;
        C1C7U.LIZ("LiveGameMsgView2@4005.onProfileListChange$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL.getCurrentRankProfileItems(), this.LLILLJJLI)) {
            RecyclerView recyclerView = this.LL.LLLFZ;
            C1117360fBO c1117360fBO = null;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof C1117360fBO) {
                c1117360fBO = (C1117360fBO) adapter;
            }
            if (c1117360fBO != null) {
                C784630UqD c784630UqD = this.LL;
                List<C1105460esC> list = this.LLILLJJLI;
                RecyclerView recyclerView2 = c784630UqD.LLLFZ;
                if (recyclerView2 == null || !recyclerView2.isComputingLayout()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    c1117360fBO.LLLII(arrayList);
                    c1117360fBO.notifyDataSetChanged();
                }
            }
            RecyclerView recyclerView3 = this.LL.LLLFZ;
            if (recyclerView3 == null || !recyclerView3.isComputingLayout()) {
                this.LL.getCurrentRankProfileItems().clear();
                this.LL.getCurrentRankProfileItems().addAll(this.LLILLJJLI);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveGameMsgView2@4005.onProfileListChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
