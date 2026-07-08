package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01VM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.preloader.FriendsSkylightStoryPreloader$observeFirstFrame$1$1$1$1", f = "GeneralSkylightStoryPreloader.kt", l = {}, m = "invokeSuspend")
public final class C01VM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Aweme> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01VM(List<? extends Aweme> list, InterfaceC1364105Vn<? super C01VM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01VM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsSkylightStoryPreloader@87ec.observeFirstFrame$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C312190CLp c312190CLp = C312190CLp.LIZ;
        List<Aweme> list = this.LL;
        c312190CLp.getClass();
        C0CX8.LIZIZ(c312190CLp, list);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsSkylightStoryPreloader@87ec.observeFirstFrame$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
