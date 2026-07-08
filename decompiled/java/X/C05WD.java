package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;

/* JADX INFO: renamed from: X.05WD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {575}, m = "getEffectByResId-0E7RQCE")
public final class C05WD extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WD(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C05WD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.getEffectByResId$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(null, null, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.getEffectByResId$1");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.getEffectByResId$1");
        return c189200o6M1boximpl;
    }
}
