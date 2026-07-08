package X;

import com.bytedance.android.livesdk.chatroom.model.CreatePlaylistData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistDataManager$createPlaylist$1$1", f = "LiveReplayPlaylistDataManager.kt", l = {}, m = "invokeSuspend")
public final class C759850TrL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C470590Icr<CreatePlaylistData> LLILLJJLI;
    public final /* synthetic */ InterfaceC759880TrO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759850TrL(C470590Icr<CreatePlaylistData> c470590Icr, InterfaceC759880TrO interfaceC759880TrO, InterfaceC1364105Vn<? super C759850TrL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c470590Icr;
        this.LLILLL = interfaceC759880TrO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C759850TrL c759850TrL = new C759850TrL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c759850TrL.LL = obj;
        return c759850TrL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CreatePlaylistData createPlaylistData = this.LLILLJJLI.data;
        if (createPlaylistData != null) {
            InterfaceC759880TrO interfaceC759880TrO = this.LLILLL;
            C1440005kM.LIZ(new IEvent() { // from class: X.0TrN
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            interfaceC759880TrO.onSuccess(String.valueOf(createPlaylistData.playlistId));
        } else {
            this.LLILLL.onFailure(new Throwable("Failure"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayPlaylistDataManager@3a1a.createPlaylist$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
