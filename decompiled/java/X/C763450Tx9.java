package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.PlaylistAddReq;
import tikcast.api.anchor.PlaylistAddResponse;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository$addSongs$data$1", f = "BGMPlaylistRepository.kt", l = {75}, m = "invokeSuspend")
public final class C763450Tx9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<PlaylistAddResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ C763480TxC LLILLJJLI;
    public final /* synthetic */ List<Long> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763450Tx9(C763480TxC c763480TxC, List<Long> list, InterfaceC1364105Vn<? super C763450Tx9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c763480TxC;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763450Tx9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long jLongValue;
        Long lValueOf;
        C1C7U.LIZ("BGMPlaylistRepository@9667.addSongs$data$1");
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
            PlaylistAddReq playlistAddReq = new PlaylistAddReq();
            C763480TxC c763480TxC = this.LLILLJJLI;
            List<Long> list = this.LLILLL;
            MusicSong musicSong = c763480TxC.LJ;
            if (musicSong == null && (musicSong = (MusicSong) C13LP.LJJLIIIJL(c763480TxC.LIZIZ)) == null) {
                j = 0;
            } else {
                j = musicSong.id;
            }
            playlistAddReq.lastSongId = j;
            MusicSong musicSong2 = c763480TxC.LJ;
            if (musicSong2 == null) {
                musicSong2 = (MusicSong) C13LP.LJJLIIIJL(c763480TxC.LIZIZ);
            }
            Integer numLIZJ = c763480TxC.LIZJ(musicSong2);
            if (numLIZJ != null && (lValueOf = Long.valueOf(((long) numLIZJ.intValue()) + c763480TxC.LIZ)) != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = -1;
            }
            playlistAddReq.lastSongOffset = jLongValue;
            playlistAddReq.songIds.addAll(list);
            this.LL = 1;
            obj = accompanimentApi.addPlaylistSong(playlistAddReq, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BGMPlaylistRepository@9667.addSongs$data$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.addSongs$data$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<PlaylistAddResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
