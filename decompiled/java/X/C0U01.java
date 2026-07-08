package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U01, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment$fetchMoreData$1", f = "KaraokeSongListFragment.kt", l = {}, m = "invokeSuspend")
public final class C0U01 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeSongListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U01(KaraokeSongListFragment karaokeSongListFragment, InterfaceC1364105Vn<? super C0U01> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeSongListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U01(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeSongListFragment@5cd4.fetchMoreData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeSongListFragment karaokeSongListFragment = this.LL;
        KaraokeViewModel karaokeViewModel = karaokeSongListFragment.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C0U0M(karaokeSongListFragment.LLILZLL, true, false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeSongListFragment@5cd4.fetchMoreData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
