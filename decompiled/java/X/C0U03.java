package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U03, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment$fetchDataWhenResume$1", f = "KaraokeQueueSongListFragment.kt", l = {}, m = "invokeSuspend")
public final class C0U03 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeQueueSongListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U03(KaraokeQueueSongListFragment karaokeQueueSongListFragment, InterfaceC1364105Vn<? super C0U03> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeQueueSongListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U03(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeQueueSongListFragment@687b.fetchDataWhenResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeQueueSongListFragment karaokeQueueSongListFragment = this.LL;
        KaraokeViewModel karaokeViewModel = karaokeQueueSongListFragment.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C0U0M(karaokeQueueSongListFragment.LLILZLL, false, true));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeQueueSongListFragment@687b.fetchDataWhenResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
