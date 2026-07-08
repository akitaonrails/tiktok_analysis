package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$loadDefaultLyricsEffect$2", f = "LyricStickerEffectDataLogicComponent.kt", l = {303, 1076, 310, 1086}, m = "invokeSuspend")
public final class C1425805i4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends C0EQL>, ? extends C05WK>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public C0EQZ LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C0EQZ LLILZLL;
    public final /* synthetic */ List<AVMusic> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425805i4(C0EQZ c0eqz, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0eqz;
        this.LLIZ = list;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1425805i4(this.LLILZLL, this.LLIZLLLIL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1425805i4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends C0EQL>, ? extends C05WK>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
