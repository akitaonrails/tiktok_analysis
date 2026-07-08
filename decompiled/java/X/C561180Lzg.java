package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initHead$2$1", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561180Lzg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561180Lzg(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561180Lzg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561180Lzg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.initHead$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftBoxFragment draftBoxFragment = this.LL;
        draftBoxFragment.LLJLILLLLZIIL = draftBoxFragment.cS().LJIIIZ;
        AnonymousClass0880.LIZ(this.LL.dS().LL, C2286608xc.LJ(this.LL.cS().LJIIIZ));
        DraftBoxFragment draftBoxFragment2 = this.LL;
        if (draftBoxFragment2.LLJLILLLLZIIL <= 1) {
            C0M14 c0m14 = draftBoxFragment2.LLLFF;
            if (c0m14 != null) {
                c0m14.LIZIZ();
            }
            ((C561190Lzh) this.LL.LLLIIIIL.getValue()).LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(16)));
        } else if (C306790C0v.LIZ()) {
            ((C561190Lzh) this.LL.LLLIIIIL.getValue()).LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(0)));
        } else {
            ((C561190Lzh) this.LL.LLLIIIIL.getValue()).LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(16)));
        }
        this.LL.oS();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initHead$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
