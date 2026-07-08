package X;

import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PD4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment$onResume$2", f = "ChooseSearchMusicFragment.kt", l = {}, m = "invokeSuspend")
public final class C0PD4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChooseSearchMusicFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PD4(ChooseSearchMusicFragment chooseSearchMusicFragment, InterfaceC1364105Vn<? super C0PD4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chooseSearchMusicFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PD4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseSearchMusicFragment@f8aa.onResume$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isViewValid()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChooseSearchMusicFragment@f8aa.onResume$2");
            return unit;
        }
        this.LL.cS();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChooseSearchMusicFragment@f8aa.onResume$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
