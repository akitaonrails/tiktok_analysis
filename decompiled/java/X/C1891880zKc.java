package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.emojislider.service.EmojiSliderViewerListManager$loadMore$1$1", f = "EmojiSliderViewerListManager.kt", l = {}, m = "invokeSuspend")
public final class C1891880zKc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1891870zKb LLILLJJLI;
    public final /* synthetic */ List<C737730Swl> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891880zKc(String str, C1891870zKb c1891870zKb, List<C737730Swl> list, InterfaceC1364105Vn<? super C1891880zKc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1891870zKb;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891880zKc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("EmojiSliderViewerListManager@d74f.loadMore$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        Aweme aweme = this.LLILLJJLI.LJFF().LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EmojiSliderViewerListManager@d74f.loadMore$1$1");
            return unit;
        }
        C1891870zKb c1891870zKb = this.LLILLJJLI;
        if (!c1891870zKb.LJ) {
            c1891870zKb.LJ = true;
            Function1<? super Boolean, Unit> function1 = c1891870zKb.LIZLLL;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(!this.LLILLL.isEmpty()));
            }
        }
        if (this.LLILLL.isEmpty()) {
            C1891910zKf c1891910zKfLJ = this.LLILLJJLI.LJ();
            c1891910zKfLJ.LJJI(false);
            c1891910zKfLJ.LJJ(false);
            c1891910zKfLJ.LJIIJ().LIZLLL();
            c1891910zKfLJ.LJIIJ().LJI();
        } else if (!this.LLILLJJLI.LJFF().LJFF) {
            C1891910zKf c1891910zKfLJ2 = this.LLILLJJLI.LJ();
            c1891910zKfLJ2.LJJI(true);
            c1891910zKfLJ2.LJJ(false);
        } else {
            C1891910zKf c1891910zKfLJ3 = this.LLILLJJLI.LJ();
            c1891910zKfLJ3.LJJI(true);
            c1891910zKfLJ3.LJJ(true);
        }
        this.LLILLJJLI.LJ().LLILZLL.LIZLLL(this.LLILLL, null);
        this.LLILLJJLI.LJFF = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EmojiSliderViewerListManager@d74f.loadMore$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
