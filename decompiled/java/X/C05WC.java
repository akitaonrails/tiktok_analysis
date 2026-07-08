package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl$downloadEffectWithDepInternal$2", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {189}, m = "invokeSuspend")
public final class C05WC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C05WK>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZLL;
    public final /* synthetic */ C05WF LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WC(LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, C05WF c05wf, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = lyricStickerEffectDownloadServiceImpl;
        this.LLIZ = c05wf;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05WC c05wc = new C05WC(this.LLILZLL, this.LLIZ, this.LLILZIL, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c05wc.LLILZ = obj;
        return c05wc;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122 A[EDGE_INSN: B:105:0x0122->B:56:0x0122 BREAK  A[LOOP:2: B:73:0x018a->B:108:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[LOOP:2: B:73:0x018a->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[LOOP:4: B:40:0x00e3->B:42:0x00e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05WC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C05WK>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
