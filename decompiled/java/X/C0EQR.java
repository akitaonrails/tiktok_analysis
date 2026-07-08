package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EQR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.lyric.LyricStickerEditorProComponent$applyDefaultLyricEffect$4$onFinished$1$1", f = "LyricStickerEditorProComponent.kt", l = {}, m = "invokeSuspend")
public final class C0EQR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C365600EVa LL;
    public final /* synthetic */ C0EQI LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EQR(C365600EVa c365600EVa, C0EQI c0eqi, boolean z, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C0EQR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c365600EVa;
        this.LLILLJJLI = c0eqi;
        this.LLILLL = z;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EQR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        C0E55 player;
        C1C7U.LIZ("LyricStickerEditorProComponent@267e.applyDefaultLyricEffect$4$onFinished$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ();
        C214799194j c214799194j = this.LLILLJJLI.LLJJIJIIJIL;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
        C0EQI c0eqi = this.LLILLJJLI;
        c0eqi.LLJJIJIIJIL = null;
        if (this.LLILLL) {
            C0E48 c0e48W1 = c0eqi.W1();
            if (c0e48W1 != null && (player = c0e48W1.getPlayer()) != null) {
                lValueOf = Long.valueOf(player.Jh());
            } else {
                lValueOf = null;
            }
            c0eqi.K4(lValueOf, true, true);
            this.LLILZ.invoke();
        } else {
            InterfaceC366450EYh interfaceC366450EYhM3 = c0eqi.m3();
            if (interfaceC366450EYhM3 != null) {
                interfaceC366450EYhM3.yS(true);
            }
            this.LLILZIL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEditorProComponent@267e.applyDefaultLyricEffect$4$onFinished$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
