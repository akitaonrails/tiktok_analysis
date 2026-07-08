package X;

import com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl;

/* JADX INFO: renamed from: X.05ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl", f = "LyricEffectPreloadServiceImpl.kt", l = {379, 415, 437, 485, 575}, m = "doPreload")
public final class C1424705ht extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ LyricEffectPreloadServiceImpl LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424705ht(LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl, InterfaceC1364105Vn<? super C1424705ht> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = lyricEffectPreloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.doPreload$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLIZ.LJII(null, null, null, this);
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.doPreload$1");
        return objLJII;
    }
}
