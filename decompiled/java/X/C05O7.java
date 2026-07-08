package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05O7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.MusicPanelLyricsEffectComponent$startLoadDeferredLocked$deferred$1", f = "MusicPanelLyricsEffectComponent.kt", l = {342, 346}, m = "invokeSuspend")
public final class C05O7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1173304iR>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1465410oEl LLILLL;
    public final /* synthetic */ AVMusic LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05O7(C1465410oEl c1465410oEl, AVMusic aVMusic, long j, String str, InterfaceC1364105Vn<? super C05O7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1465410oEl;
        this.LLILZ = aVMusic;
        this.LLILZIL = j;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05O7 c05o7 = new C05O7(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05o7.LLILLJJLI = obj;
        return c05o7;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: CancellationException -> 0x00b5, all -> 0x00ca, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ca, blocks: (B:24:0x0077, B:25:0x007a, B:27:0x007e, B:30:0x0088, B:33:0x0092, B:34:0x009f, B:15:0x0044, B:16:0x0047, B:18:0x0056, B:19:0x0063, B:20:0x006c, B:11:0x0029), top: B:45:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: CancellationException -> 0x00b5, all -> 0x00ca, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ca, blocks: (B:24:0x0077, B:25:0x007a, B:27:0x007e, B:30:0x0088, B:33:0x0092, B:34:0x009f, B:15:0x0044, B:16:0x0047, B:18:0x0056, B:19:0x0063, B:20:0x006c, B:11:0x0029), top: B:45:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05O7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1173304iR> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
