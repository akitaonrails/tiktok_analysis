package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment$fetchMoreData$1", f = "KaraokeSearchSongListFragment.kt", l = {}, m = "invokeSuspend")
public final class C764930TzX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeSearchSongListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C764930TzX(KaraokeSearchSongListFragment karaokeSearchSongListFragment, InterfaceC1364105Vn<? super C764930TzX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeSearchSongListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C764930TzX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeSearchSongListFragment@e467.fetchMoreData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeSearchSongListFragment karaokeSearchSongListFragment = this.LL;
        KaraokeViewModel karaokeViewModel = karaokeSearchSongListFragment.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C764940TzY(karaokeSearchSongListFragment.LLJILJIL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeSearchSongListFragment@e467.fetchMoreData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
