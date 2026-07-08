package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl$downloadAndFillFallbackFonts$2$defaultFallbackFontDeferred$1", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {226}, m = "invokeSuspend")
public final class C05WJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WJ(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C05WJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadAndFillFallbackFonts$2$defaultFallbackFontDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl = this.LLILLJJLI;
            this.LL = 1;
            lyricStickerEffectDownloadServiceImpl.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C196909122h.LIZ().LJI("fallbackfont", true, new C1768106wB(c2252611DEt, 1));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadAndFillFallbackFonts$2$defaultFallbackFontDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.downloadAndFillFallbackFonts$2$defaultFallbackFontDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
