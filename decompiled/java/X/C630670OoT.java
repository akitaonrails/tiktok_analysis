package X;

import com.ss.android.ugc.aweme.music.MusicExServiceImpl;

/* JADX INFO: renamed from: X.0OoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.MusicExServiceImpl", f = "MusicExServiceImpl.kt", l = {43}, m = "getMusicDetailPageStoryEntrance")
public final class C630670OoT extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MusicExServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C630670OoT(MusicExServiceImpl musicExServiceImpl, InterfaceC1364105Vn<? super C630670OoT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = musicExServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicExServiceImpl@5ad2.getMusicDetailPageStoryEntrance$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object musicDetailPageStoryEntrance = this.LLILZ.getMusicDetailPageStoryEntrance(null, null, null, 0, 0, this);
        C1C7U.LIZIZ("MusicExServiceImpl@5ad2.getMusicDetailPageStoryEntrance$1");
        return musicDetailPageStoryEntrance;
    }
}
