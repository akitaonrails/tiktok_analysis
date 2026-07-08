package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.MusicResponse;

/* JADX INFO: renamed from: X.0Twy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$initAllData$data$1", f = "BGMSongListRepository.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C763340Twy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MusicResponse.Packs>, Object> {
    public int LL;
    public final /* synthetic */ C763390Tx3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763340Twy(C763390Tx3 c763390Tx3, InterfaceC1364105Vn<? super C763340Twy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763390Tx3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763340Twy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.initAllData$data$1");
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
            long jMax = Math.max(InterfaceC766480U4w.LJJIJLIJ.LIZIZ().longValue(), 0L);
            this.LL = 1;
            obj = accompanimentApi.initData(jMax, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMSongListRepository@6a63.initAllData$data$1");
                return objLJFF;
            }
        }
        Object obj2 = ((BaseResponse) obj).data;
        if (obj2 == null) {
            obj2 = null;
        }
        C1C7U.LIZIZ("BGMSongListRepository@6a63.initAllData$data$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MusicResponse.Packs> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
