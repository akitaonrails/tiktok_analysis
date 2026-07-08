package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12HC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$loadFromLocalDefault$1$1$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
public final class C12HC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C12HN LL;
    public final /* synthetic */ List<BeautyCategory> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12HC(C12HN c12hn, List<BeautyCategory> list, InterfaceC1364105Vn<? super C12HC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c12hn;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12HC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BeautySource@786f.loadFromLocalDefault$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19570511hX.LIZIZ("assign allData from generateFromLocalSource");
        this.LL.LJJ(this.LLILLJJLI);
        this.LL.LJJIII = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BeautySource@786f.loadFromLocalDefault$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
