package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05T6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftRecordArtworkKt$AnimatedRecordArtwork$2$1", f = "MusicGiftRecordArtwork.kt", l = {134, 138, 149, 150, 163, 164}, m = "invokeSuspend")
public final class C05T6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ ImageModel LLILZ;
    public final /* synthetic */ ImageModel LLILZIL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLIZ;
    public final /* synthetic */ C05P0<Boolean> LLIZLLLIL;
    public final /* synthetic */ C05P0<Long> LLJ;
    public final /* synthetic */ C05P0<ImageModel> LLJI;
    public final /* synthetic */ C05P0<ImageModel> LLJIJIL;
    public final /* synthetic */ C05P0<ImageModel> LLJILJIL;
    public final /* synthetic */ C05P0<ImageModel> LLJILJILJ;
    public final /* synthetic */ C05P0<Boolean> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T6(long j, C1677480tko c1677480tko, C1677480tko c1677480tko2, C05P0 c05p0, C05P0 c05p02, C05P0 c05p03, C05P0 c05p04, C05P0 c05p05, C05P0 c05p06, C05P0 c05p07, ImageModel imageModel, ImageModel imageModel2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = imageModel;
        this.LLILZIL = imageModel2;
        this.LLILZLL = c1677480tko;
        this.LLIZ = c1677480tko2;
        this.LLIZLLLIL = c05p0;
        this.LLJ = c05p02;
        this.LLJI = c05p03;
        this.LLJIJIL = c05p04;
        this.LLJILJIL = c05p05;
        this.LLJILJILJ = c05p06;
        this.LLJILLL = c05p07;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05T6 c05t6 = new C05T6(this.LLILLL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05t6.LLILLJJLI = obj;
        return c05t6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05T6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
