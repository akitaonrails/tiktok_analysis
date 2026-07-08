package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.PlaylistDeleteResponse;

/* JADX INFO: renamed from: X.0TxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository$requestRemoveSong$data$1", f = "BGMPlaylistRepository.kt", l = {137}, m = "invokeSuspend")
public final class C763490TxD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<PlaylistDeleteResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ C763480TxC LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763490TxD(C763480TxC c763480TxC, long j, InterfaceC1364105Vn<? super C763490TxD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763480TxC;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763490TxD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistRepository@9667.requestRemoveSong$data$1");
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
            long j = this.LLILLL;
            this.LL = 1;
            obj = accompanimentApi.removePlaylistSong(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMPlaylistRepository@9667.requestRemoveSong$data$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.requestRemoveSong$data$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<PlaylistDeleteResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
