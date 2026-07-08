package X;

import com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl;

/* JADX INFO: renamed from: X.05hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl", f = "LyricEffectPreloadServiceImpl.kt", l = {166}, m = "awaitPreload")
public final class C1424805hu extends AbstractC23140094w {
    public Object LL;
    public C05WF LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LyricEffectPreloadServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424805hu(LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl, InterfaceC1364105Vn<? super C1424805hu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = lyricEffectPreloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.awaitPreload$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, this);
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.awaitPreload$1");
        return objLJ;
    }
}
