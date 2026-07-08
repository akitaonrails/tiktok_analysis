package X;

import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricFailbackFont;
import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl$downloadAndFillFallbackFonts$2", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {233, 243, 245}, m = "invokeSuspend")
public final class C05WI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<LyricFailbackFont> LLILZ;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WI(List<LyricFailbackFont> list, LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C05WI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05WI c05wi = new C05WI(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05wi.LLILLL = obj;
        return c05wi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05WI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
