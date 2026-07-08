package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.toolbanner.list.EditorToolsIconsAdapter$setList$2$2$1$1", f = "EditorToolsIconsAdapter.kt", l = {}, m = "invokeSuspend")
public final class C477301tT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C569680MVy LL;
    public final /* synthetic */ C1294720jnS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477301tT(C569680MVy c569680MVy, C1294720jnS c1294720jnS, InterfaceC1364105Vn<? super C477301tT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c569680MVy;
        this.LLILLJJLI = c1294720jnS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C477301tT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorToolsIconsAdapter@aec9.setList$2$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C569680MVy c569680MVy = this.LL;
        c569680MVy.LLJJ = this.LLILLJJLI;
        Iterator<C569570MVn> it2 = c569680MVy.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().LIZLLL, "end_of_year")) {
                if (i != -1) {
                    this.LL.notifyItemChanged(i);
                }
            } else {
                i++;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorToolsIconsAdapter@aec9.setList$2$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
