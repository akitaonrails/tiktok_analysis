package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U04, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment$fetchDataWhenResume$1", f = "KaraokeLibrarySongListFragment.kt", l = {}, m = "invokeSuspend")
public final class C0U04 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeLibrarySongListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U04(KaraokeLibrarySongListFragment karaokeLibrarySongListFragment, InterfaceC1364105Vn<? super C0U04> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeLibrarySongListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U04(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeLibrarySongListFragment@9afe.fetchDataWhenResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeLibrarySongListFragment karaokeLibrarySongListFragment = this.LL;
        KaraokeViewModel karaokeViewModel = karaokeLibrarySongListFragment.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C0U0M(karaokeLibrarySongListFragment.LLILZLL, false, false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeLibrarySongListFragment@9afe.fetchDataWhenResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
