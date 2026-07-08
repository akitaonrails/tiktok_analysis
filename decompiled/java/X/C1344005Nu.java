package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;

/* JADX INFO: renamed from: X.05Nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {574}, m = "fetchEffectsBatch-0E7RQCE")
public final class C1344005Nu extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344005Nu(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C1344005Nu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.fetchEffectsBatch$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.fetchEffectsBatch$1");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.fetchEffectsBatch$1");
        return c189200o6M1boximpl;
    }
}
