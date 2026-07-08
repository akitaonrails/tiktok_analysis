package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment$onCreate$2", f = "PostedListFragment.kt", l = {}, m = "invokeSuspend")
public final class C1813340xHw extends C09AX implements Function2<EnumC1813400xI2, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PostedListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813340xHw(PostedListFragment postedListFragment, InterfaceC1364105Vn<? super C1813340xHw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = postedListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813340xHw c1813340xHw = new C1813340xHw(this.LLILLJJLI, interfaceC1364105Vn);
        c1813340xHw.LL = obj;
        return c1813340xHw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostedListFragment@99c4.onCreate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1813400xI2 enumC1813400xI2 = (EnumC1813400xI2) this.LL;
        PostedListFragment postedListFragment = this.LLILLJJLI;
        postedListFragment.getClass();
        if (C1813380xI0.LIZ[enumC1813400xI2.ordinal()] == 1) {
            C197039127h c197039127h = postedListFragment.LLIZLLLIL;
            if (c197039127h != null) {
                c197039127h.setLoading(true);
            }
        } else {
            C197039127h c197039127h2 = postedListFragment.LLIZLLLIL;
            if (c197039127h2 != null) {
                c197039127h2.setLoading(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostedListFragment@99c4.onCreate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC1813400xI2 enumC1813400xI2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC1813400xI2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
