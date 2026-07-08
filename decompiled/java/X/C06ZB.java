package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.comment.TitleBarView$setAvatar$1", f = "TitleBarView.kt", l = {}, m = "invokeSuspend")
public final class C06ZB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C06ZF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZB(String str, C06ZF c06zf, InterfaceC1364105Vn<? super C06ZB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c06zf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitleBarView@42dc.setAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LL);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(32)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(32)));
        c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI.getAvatarIvFromXml());
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL("title_bar");
        c1331670kl3LJIIIZ.LJJIJL(this.LLILLJJLI.getContext());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TitleBarView@42dc.setAvatar$1");
        return unit;
    }
}
