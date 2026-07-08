package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuf.insert.guide.InsertVideoSwipeUpGuideManager$onPlayCompleted$1", f = "InsertVideoSwipeUpGuideManager.kt", l = {167}, m = "invokeSuspend")
public final class C591610NIh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C591610NIh(InterfaceC1364105Vn<? super C591610NIh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591610NIh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InsertVideoSwipeUpGuideManager@17e3.onPlayCompleted$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("InsertVideoSwipeUpGuideManager@17e3.onPlayCompleted$1");
                return objLJFF;
            }
        }
        C0TFW c0tfw = C0TFT.LJFF;
        if (c0tfw != null) {
            c0tfw.LJ(C20642515q3.LJI(2131847049));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InsertVideoSwipeUpGuideManager@17e3.onPlayCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C591610NIh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
