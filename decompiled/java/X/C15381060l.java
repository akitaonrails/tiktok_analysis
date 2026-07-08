package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.IMSmartReplyService$initWhenLogin$1", f = "IMSmartReplyService.kt", l = {}, m = "invokeSuspend")
public final class C15381060l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C15381060l(InterfaceC1364105Vn<? super C15381060l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15381060l(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyService@3112.initWhenLogin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15390060u c15390060u = C15390060u.LL;
        if (c15390060u.LJIIZILJ()) {
            C15408061m c15408061m = C15408061m.LIZ;
            int i = C15390060u.LLILLJJLI;
            EnumC1510605vk enumC1510605vk = EnumC1510605vk.NETWORK;
            c15408061m.getClass();
            C15408061m.LJII(i, enumC1510605vk);
            C06I1.LIZIZ.getClass();
            boolean zLIZJ = C06I1.LIZJ();
            if (C06I1.LIZLLL == null || !Intrinsics.LJFF(C06I1.LJ, Boolean.valueOf(zLIZJ))) {
                C23250099c.LIZLLL(C06I1.LJI, null, null, new C15382060m(null), 3);
            }
        }
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ(c15390060u);
        Keva keva = C1535905zp.LIZ;
        if (keva != null) {
            keva.clear();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyService@3112.initWhenLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C15381060l(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
