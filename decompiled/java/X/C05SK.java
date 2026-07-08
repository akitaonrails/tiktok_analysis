package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftHeaderLyricsKt$HeaderLyricText$1$1$1$2", f = "MusicGiftHeaderLyrics.kt", l = {141}, m = "invokeSuspend")
public final class C05SK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SK(C1677480tko<Float, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05SK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftHeaderLyricsKt@af5.HeaderLyricText$1$1$1$2");
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
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
            Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(280, 0, C05Y0.LIZLLL, 2);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.HeaderLyricText$1$1$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftHeaderLyricsKt@af5.HeaderLyricText$1$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
