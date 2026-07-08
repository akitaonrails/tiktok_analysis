package X;

import com.ss.android.ugc.gamora.editor.lyric.model.LyricEffectDependResource;
import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;

/* JADX INFO: renamed from: X.05Nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {471}, m = "downloadEffectInnerByResId-gIAlu-s")
public final class C1344105Nv extends AbstractC23140094w {
    public LyricEffectDependResource LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344105Nv(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C1344105Nv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectInnerByResId$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectInnerByResId$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectInnerByResId$1");
        return c189200o6M1boximpl;
    }
}
