package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$deleteFavoriteSong$2", f = "BGMSongListRepository.kt", l = {181}, m = "invokeSuspend")
public final class C763360Tx0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C763390Tx3 LLILLJJLI;
    public final /* synthetic */ MusicSong LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763360Tx0(C763390Tx3 c763390Tx3, MusicSong musicSong, InterfaceC1364105Vn<? super C763360Tx0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763390Tx3;
        this.LLILLL = musicSong;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763360Tx0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.deleteFavoriteSong$2");
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
            long j = this.LLILLL.id;
            this.LL = 1;
            obj = accompanimentApi.deleteFavoriteSong(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMSongListRepository@6a63.deleteFavoriteSong$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BGMSongListRepository@6a63.deleteFavoriteSong$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
