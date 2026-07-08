package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;

/* JADX INFO: renamed from: X.05FE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {425}, m = "downloadFallbackFontPath")
public final class C05FE extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FE(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C05FE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadFallbackFontPath$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadFallbackFontPath$1");
        return objLJFF;
    }
}
