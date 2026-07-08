package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.UnPostListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.UnPostListFragment$onViewCreated$2", f = "UnPostListFragment.kt", l = {}, m = "invokeSuspend")
public final class C1813370xHz extends C09AX implements Function2<EnumC1813400xI2, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UnPostListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813370xHz(UnPostListFragment unPostListFragment, InterfaceC1364105Vn<? super C1813370xHz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unPostListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813370xHz c1813370xHz = new C1813370xHz(this.LLILLJJLI, interfaceC1364105Vn);
        c1813370xHz.LL = obj;
        return c1813370xHz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnPostListFragment@291c.onViewCreated$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1813400xI2 enumC1813400xI2 = (EnumC1813400xI2) this.LL;
        UnPostListFragment unPostListFragment = this.LLILLJJLI;
        unPostListFragment.getClass();
        if (C1813380xI0.LIZ[enumC1813400xI2.ordinal()] == 1) {
            C197039127h c197039127h = unPostListFragment.LLIZLLLIL;
            if (c197039127h != null) {
                c197039127h.setLoading(true);
            }
        } else {
            C197039127h c197039127h2 = unPostListFragment.LLIZLLLIL;
            if (c197039127h2 != null) {
                c197039127h2.setLoading(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnPostListFragment@291c.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC1813400xI2 enumC1813400xI2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC1813400xI2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
