package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistDataManager$getPlaylistData$1$2", f = "LiveReplayPlaylistDataManager.kt", l = {}, m = "invokeSuspend")
public final class C759830TrJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC759900TrQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759830TrJ(InterfaceC759900TrQ interfaceC759900TrQ, InterfaceC1364105Vn<? super C759830TrJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC759900TrQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759830TrJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayPlaylistDataManager@3a1a.getPlaylistData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onFailure();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.getPlaylistData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
