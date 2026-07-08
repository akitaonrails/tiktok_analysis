package X;

import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository", f = "BGMSongListRepository.kt", l = {152}, m = "addFavoriteSong$liveeffect_impl_release")
public final class C763400Tx4 extends AbstractC23140094w {
    public MusicSong LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C763390Tx3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763400Tx4(C763390Tx3 c763390Tx3, InterfaceC1364105Vn<? super C763400Tx4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c763390Tx3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.addFavoriteSong$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("BGMSongListRepository@6a63.addFavoriteSong$1");
        return objLIZ;
    }
}
