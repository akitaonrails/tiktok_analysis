package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.CollectionSongsResponse;

/* JADX INFO: renamed from: X.0Tx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$loadMoreSongsById$data$1", f = "BGMSongListRepository.kt", l = {105}, m = "invokeSuspend")
public final class C763380Tx2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CollectionSongsResponse.PageSongs>, Object> {
    public int LL;
    public final /* synthetic */ C763390Tx3 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763380Tx2(C763390Tx3 c763390Tx3, long j, long j2, InterfaceC1364105Vn<? super C763380Tx2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763390Tx3;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763380Tx2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.loadMoreSongsById$data$1");
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
            AccompanimentApi accompanimentApi = (AccompanimentApi) this.LLILLJJLI.LIZIZ.getValue();
            long j = this.LLILLL;
            long j2 = this.LLILZ;
            this.LLILLJJLI.getClass();
            this.LL = 1;
            obj = accompanimentApi.loadMoreSongs(j, j2, 20L, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMSongListRepository@6a63.loadMoreSongsById$data$1");
                return objLJFF;
            }
        }
        T t = ((BaseResponse) obj).data;
        C1C7U.LIZIZ("BGMSongListRepository@6a63.loadMoreSongsById$data$1");
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CollectionSongsResponse.PageSongs> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
