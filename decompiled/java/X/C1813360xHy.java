package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.UnPostListFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.UnPostListFragment$onViewCreated$1", f = "UnPostListFragment.kt", l = {}, m = "invokeSuspend")
public final class C1813360xHy extends C09AX implements Function2<C1813430xI5<List<? extends C1808830xAf>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UnPostListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813360xHy(UnPostListFragment unPostListFragment, InterfaceC1364105Vn<? super C1813360xHy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unPostListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813360xHy c1813360xHy = new C1813360xHy(this.LLILLJJLI, interfaceC1364105Vn);
        c1813360xHy.LL = obj;
        return c1813360xHy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnPostListFragment@291c.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1813430xI5 c1813430xI5 = (C1813430xI5) this.LL;
        int i = C1813410xI3.LIZ[c1813430xI5.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LLILLJJLI.S6();
            }
        } else {
            this.LLILLJJLI.SR((List) c1813430xI5.LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnPostListFragment@291c.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1813430xI5<List<? extends C1808830xAf>> c1813430xI5, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1813430xI5, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
