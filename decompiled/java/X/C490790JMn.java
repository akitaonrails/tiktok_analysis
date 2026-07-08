package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.controller.PcsVideoPlayerViewController$tryPreload$1", f = "PcsVideoPlayerViewController.kt", l = {}, m = "invokeSuspend")
public final class C490790JMn extends C09AX implements Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1479530obX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490790JMn(C1479530obX c1479530obX, InterfaceC1364105Vn<? super C490790JMn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1479530obX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C490790JMn c490790JMn = new C490790JMn(this.LLILLJJLI, interfaceC1364105Vn);
        c490790JMn.LL = obj;
        return c490790JMn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerViewController@65f8.tryPreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C0N0Y) this.LL).LJJJZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.tryPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0N0Y c0n0y, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0n0y, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
