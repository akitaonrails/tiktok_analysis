package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05T4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftRecordArtworkKt$AnimatedRecordArtwork$3$1", f = "MusicGiftRecordArtwork.kt", l = {}, m = "invokeSuspend")
public final class C05T4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ ImageModel LLILLJJLI;
    public final /* synthetic */ ImageModel LLILLL;
    public final /* synthetic */ C05P0<Long> LLILZ;
    public final /* synthetic */ C05P0<ImageModel> LLILZIL;
    public final /* synthetic */ C05P0<ImageModel> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T4(long j, ImageModel imageModel, ImageModel imageModel2, C05P0<Long> c05p0, C05P0<ImageModel> c05p02, C05P0<ImageModel> c05p03, InterfaceC1364105Vn<? super C05T4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = imageModel;
        this.LLILLL = imageModel2;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05T4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftRecordArtworkKt@837d.AnimatedRecordArtwork$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05P0<Long> c05p0 = this.LLILZ;
        float f = C1682040tsA.LIZIZ;
        if (c05p0.getValue().longValue() == this.LL) {
            this.LLILZIL.setValue(this.LLILLJJLI);
            this.LLILZLL.setValue(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftRecordArtworkKt@837d.AnimatedRecordArtwork$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
