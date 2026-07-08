package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.PlaylistSongsResponse;

/* JADX INFO: renamed from: X.0TxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository$clearAndLoadTopServerSong$data$1", f = "BGMPlaylistRepository.kt", l = {105}, m = "invokeSuspend")
public final class C763500TxE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<PlaylistSongsResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ C763480TxC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763500TxE(C763480TxC c763480TxC, InterfaceC1364105Vn<? super C763500TxE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763480TxC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763500TxE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistRepository@9667.clearAndLoadTopServerSong$data$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AccompanimentApi accompanimentApi = (AccompanimentApi) this.LLILLJJLI.LJI.getValue();
            this.LL = 1;
            obj = accompanimentApi.fetchPlaylist(0L, 50L, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMPlaylistRepository@9667.clearAndLoadTopServerSong$data$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.clearAndLoadTopServerSong$data$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<PlaylistSongsResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
