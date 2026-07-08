package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment$forceRefresh$1", f = "KaraokeRequestSongListFragment.kt", l = {}, m = "invokeSuspend")
public final class C765160Tzu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeRequestSongListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765160Tzu(KaraokeRequestSongListFragment karaokeRequestSongListFragment, InterfaceC1364105Vn<? super C765160Tzu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeRequestSongListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765160Tzu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeRequestSongListFragment@89ae.forceRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeRequestSongListFragment karaokeRequestSongListFragment = this.LL;
        KaraokeViewModel karaokeViewModel = karaokeRequestSongListFragment.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C0U0M(karaokeRequestSongListFragment.LLILZLL, false, true));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeRequestSongListFragment@89ae.forceRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
