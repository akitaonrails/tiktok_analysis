package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftHeaderLyricsKt$rememberLyricLineHighlightProgress$1$1$2", f = "MusicGiftHeaderLyrics.kt", l = {721, 731}, m = "invokeSuspend")
public final class C05SI extends C09AX implements Function2<C00EF, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SI(C1677480tko<Float, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05SI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05SI c05si = new C05SI(this.LLILLL, interfaceC1364105Vn);
        c05si.LLILLJJLI = obj;
        return c05si;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        C00EF c00ef = (C00EF) this.LLILLJJLI;
        if (c00ef.LIZIZ) {
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
            Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
            this.LL = 1;
            if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
            return unit22;
        }
        if (c00ef.LIZ > this.LLILLL.LIZLLL().floatValue()) {
            C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLL;
            Float fLIZLLL2 = C2286608xc.LIZLLL(c00ef.LIZ);
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(250, 0, C05Y0.LIZLLL, 2);
            this.LL = 2;
            if (C1677480tko.LIZJ(c1677480tko2, fLIZLLL2, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.rememberLyricLineHighlightProgress$1$1$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C00EF c00ef, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c00ef, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
