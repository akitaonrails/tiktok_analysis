package X;

import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository", f = "BGMSongListRepository.kt", l = {180}, m = "deleteFavoriteSong$liveeffect_impl_release")
public final class C763410Tx5 extends AbstractC23140094w {
    public MusicSong LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C763390Tx3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763410Tx5(C763390Tx3 c763390Tx3, InterfaceC1364105Vn<? super C763410Tx5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c763390Tx3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.deleteFavoriteSong$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("BGMSongListRepository@6a63.deleteFavoriteSong$1");
        return objLIZIZ;
    }
}
