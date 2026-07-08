package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.horizontal.StreamRootOuterItemDataConcatUtils$mergeChain$3", f = "StreamRootOuterItemDataConcatUtils.kt", l = {}, m = "invokeSuspend")
public final class C640990PCf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0PHX LL;
    public final /* synthetic */ C259800zU<C0PHW> LLILLJJLI;
    public final /* synthetic */ ArrayList<C0PHW> LLILLL;
    public final /* synthetic */ C259800zU<C0PHW> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640990PCf(C0PHX c0phx, C259800zU<C0PHW> c259800zU, ArrayList<C0PHW> arrayList, C259800zU<C0PHW> c259800zU2, InterfaceC1364105Vn<? super C640990PCf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0phx;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = arrayList;
        this.LLILZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640990PCf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0PHW c0phwLIZ;
        C0PHW c0phw;
        C1C7U.LIZ("StreamRootOuterItemDataConcatUtils@dd55.mergeChain$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0PHX c0phx = this.LL;
        c0phx.LJ();
        C0PHW c0phw2 = (C0PHW) C13LP.LJJLIIIJL(c0phx.LJIIJJI);
        Boolean boolValueOf = null;
        if (c0phw2 != null) {
            c0phwLIZ = c0phw2.LIZ();
        } else {
            c0phwLIZ = null;
        }
        C0PHW c0phw3 = this.LLILLJJLI.element;
        if (c0phw3 != null && c0phw2 != null) {
            c0phw2.LIZLLL = c0phw3;
            c0phw3.LJ = c0phw2;
        }
        if (c0phwLIZ != null && (c0phw = this.LLILZ.element) != null) {
            c0phw.LIZLLL = c0phwLIZ;
            c0phwLIZ.LJ = c0phw;
        }
        C0PHX c0phx2 = this.LL;
        c0phx2.LJ();
        List<C0PHW> list = c0phx2.LJIIJJI;
        if (C19719512Dh.LJI(list) && list != null) {
            boolValueOf = Boolean.valueOf(list.addAll(this.LLILLL));
        }
        C1C7U.LIZIZ("StreamRootOuterItemDataConcatUtils@dd55.mergeChain$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
