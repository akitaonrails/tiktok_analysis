package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;

/* JADX INFO: renamed from: X.05FC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {165}, m = "downloadEffectWithDep-yxL6bBk")
public final class C05FC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FC(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C05FC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectWithDep$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, null, null, null, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectWithDep$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadEffectWithDep$1");
        return c189200o6M1boximpl;
    }
}
