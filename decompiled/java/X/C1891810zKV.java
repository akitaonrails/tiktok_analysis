package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zKV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.interactiveemoji.service.InteractiveEmojiViewerListManager$loadMore$1$1", f = "InteractiveEmojiViewerListManager.kt", l = {}, m = "invokeSuspend")
public final class C1891810zKV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1891820zKW LLILLJJLI;
    public final /* synthetic */ List<C737720Swk> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891810zKV(String str, C1891820zKW c1891820zKW, List<C737720Swk> list, InterfaceC1364105Vn<? super C1891810zKV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1891820zKW;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891810zKV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("InteractiveEmojiViewerListManager@4b28.loadMore$1$1");
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
            C1C7U.LIZIZ("InteractiveEmojiViewerListManager@4b28.loadMore$1$1");
            return unit;
        }
        C1891820zKW c1891820zKW = this.LLILLJJLI;
        if (!c1891820zKW.LJ) {
            c1891820zKW.LJ = true;
            Function1<? super Boolean, Unit> function1 = c1891820zKW.LIZLLL;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(!this.LLILLL.isEmpty()));
            }
        }
        if (this.LLILLL.isEmpty()) {
            C1891940zKi c1891940zKiLJ = this.LLILLJJLI.LJ();
            c1891940zKiLJ.LJJI(false);
            c1891940zKiLJ.LJJ(false);
        } else if (!this.LLILLJJLI.LJFF().LJFF) {
            C1891940zKi c1891940zKiLJ2 = this.LLILLJJLI.LJ();
            c1891940zKiLJ2.LJJI(true);
            c1891940zKiLJ2.LJJ(false);
        } else {
            C1891940zKi c1891940zKiLJ3 = this.LLILLJJLI.LJ();
            c1891940zKiLJ3.LJJI(true);
            c1891940zKiLJ3.LJJ(true);
        }
        this.LLILLJJLI.LJ().LLILZLL.LIZLLL(this.LLILLL, null);
        this.LLILLJJLI.LIZ = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InteractiveEmojiViewerListManager@4b28.loadMore$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
