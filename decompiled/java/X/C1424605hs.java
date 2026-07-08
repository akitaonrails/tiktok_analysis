package X;

import com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService;
import com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl;

/* JADX INFO: renamed from: X.05hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl", f = "LyricEffectPreloadServiceImpl.kt", l = {258, 281, 298}, m = "doPreloadAllPanelEffects")
public final class C1424605hs extends AbstractC23140094w {
    public ILyricStickerEffectDownloadService LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LyricEffectPreloadServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424605hs(LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl, InterfaceC1364105Vn<? super C1424605hs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = lyricEffectPreloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZIL.LJIIIIZZ(this);
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$1");
        return objLJIIIIZZ;
    }
}
