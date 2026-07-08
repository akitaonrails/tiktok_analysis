package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.FavouritesSongsResponse;

/* JADX INFO: renamed from: X.0Tx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$loadMoreFavoriteSongs$data$1", f = "BGMSongListRepository.kt", l = {129}, m = "invokeSuspend")
public final class C763370Tx1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super FavouritesSongsResponse.ResponseData>, Object> {
    public int LL;
    public final /* synthetic */ C763390Tx3 LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763370Tx1(C763390Tx3 c763390Tx3, long j, InterfaceC1364105Vn<? super C763370Tx1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763390Tx3;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763370Tx1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.loadMoreFavoriteSongs$data$1");
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
            this.LLILLJJLI.getClass();
            this.LL = 1;
            obj = accompanimentApi.loadMoreFavoriteSongs(j, 50L, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMSongListRepository@6a63.loadMoreFavoriteSongs$data$1");
                return objLJFF;
            }
        }
        T t = ((BaseResponse) obj).data;
        C1C7U.LIZIZ("BGMSongListRepository@6a63.loadMoreFavoriteSongs$data$1");
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super FavouritesSongsResponse.ResponseData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
