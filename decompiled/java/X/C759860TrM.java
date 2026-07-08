package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistDataManager$createPlaylist$1$2", f = "LiveReplayPlaylistDataManager.kt", l = {}, m = "invokeSuspend")
public final class C759860TrM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC759880TrO LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759860TrM(InterfaceC759880TrO interfaceC759880TrO, Exception exc, InterfaceC1364105Vn<? super C759860TrM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC759880TrO;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759860TrM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC759880TrO interfaceC759880TrO = this.LL;
        String message = this.LLILLJJLI.getMessage();
        if (message == null) {
            message = "Failure";
        }
        interfaceC759880TrO.onFailure(new Throwable(message));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
