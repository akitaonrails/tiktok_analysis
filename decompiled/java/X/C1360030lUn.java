package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.whitebar.RepostViewFlipper$mobBtn$2", f = "RepostViewFlipper.kt", l = {}, m = "invokeSuspend")
public final class C1360030lUn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1359990lUj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360030lUn(C1359990lUj c1359990lUj, InterfaceC1364105Vn<? super C1360030lUn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1359990lUj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360030lUn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostViewFlipper@a2ac.mobBtn$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getOnFollowRepostShow().invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostViewFlipper@a2ac.mobBtn$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
