package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05T5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftRecordArtworkKt$AnimatedRecordArtwork$2$1$1", f = "MusicGiftRecordArtwork.kt", l = {152}, m = "invokeSuspend")
public final class C05T5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ C05P0<ImageModel> LLILLL;
    public final /* synthetic */ C05P0<ImageModel> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T5(C1677480tko<Float, C1677280tkU> c1677480tko, C05P0<ImageModel> c05p0, C05P0<ImageModel> c05p02, C05P0<Boolean> c05p03, InterfaceC1364105Vn<? super C05T5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c05p0;
        this.LLILZ = c05p02;
        this.LLILZIL = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05T5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftRecordArtworkKt@837d.AnimatedRecordArtwork$2$1$1");
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
            Float fLIZLLL = C2286608xc.LIZLLL(104.0f);
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(280, 0, C1681540trM.LIZIZ, 2);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftRecordArtworkKt@837d.AnimatedRecordArtwork$2$1$1");
                return objLJFF;
            }
        }
        C05P0<ImageModel> c05p0 = this.LLILLL;
        float f = C1682040tsA.LIZIZ;
        c05p0.setValue(null);
        this.LLILZ.setValue(null);
        this.LLILZIL.setValue(Boolean.FALSE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftRecordArtworkKt@837d.AnimatedRecordArtwork$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
