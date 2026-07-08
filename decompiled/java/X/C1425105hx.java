package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$innerLoadMiniDraft$2", f = "LyricStickerEffectDataLogicComponent.kt", l = {346, 356, 357, 406}, m = "invokeSuspend")
public final class C1425105hx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends C0EQL>, ? extends C05WK>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ ResourceItem LLILZLL;
    public final /* synthetic */ C0EQZ LLIZ;
    public final /* synthetic */ C1426205i8 LLIZLLLIL;
    public final /* synthetic */ List<AVMusic> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1425105hx(ResourceItem resourceItem, C0EQZ c0eqz, C1426205i8 c1426205i8, List<? extends AVMusic> list, InterfaceC1364105Vn<? super C1425105hx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = resourceItem;
        this.LLIZ = c0eqz;
        this.LLIZLLLIL = c1426205i8;
        this.LLJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1425105hx c1425105hx = new C1425105hx(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1425105hx.LLILZIL = obj;
        return c1425105hx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0221, code lost:
    
        if (X.C388300FKi.LIZJ().length() == 0) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1425105hx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends C0EQL>, ? extends C05WK>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
