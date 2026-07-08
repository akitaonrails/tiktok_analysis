package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerEditPageComponent$showLyricToolBarPromptIfNeed$1", f = "LyricStickerEditPageComponent.kt", l = {291}, m = "invokeSuspend")
public final class C391310FVx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Boolean> LLILLJJLI;
    public final /* synthetic */ InterfaceC1460000o62 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391310FVx(Function0<Boolean> function0, InterfaceC1460000o62 interfaceC1460000o62, InterfaceC1364105Vn<? super C391310FVx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = interfaceC1460000o62;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C391310FVx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEditPageComponent@aabc.showLyricToolBarPromptIfNeed$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEditPageComponent@aabc.showLyricToolBarPromptIfNeed$1");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.invoke().booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricStickerEditPageComponent@aabc.showLyricToolBarPromptIfNeed$1");
            return unit;
        }
        C0EZ7.LIZJ("edit_page_stikers");
        this.LLILLL.Ga0(4, new C1662100tM0(EnumC1651790t5N.EDIT_STICKER, "NEW", C555520LqY.LIZIZ(2131836936), true, 4300L, C2286608xc.LJ(R.raw.tux_lottie_common_creation_lyrics_icon_flipping), null, this.LLILLJJLI, null, EnumC1662090tLz.ROUNDED_STYLE, AFwS191S0000000_5.get$arr$(74), null, null, 6464));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEditPageComponent@aabc.showLyricToolBarPromptIfNeed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
