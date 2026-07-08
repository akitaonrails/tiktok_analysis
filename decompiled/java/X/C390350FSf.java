package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerManager$getStickerAssist$1$showStickerGuide$1", f = "StickerManager.kt", l = {1007}, m = "invokeSuspend")
public final class C390350FSf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C390390FSj LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C0FSX LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ C0FSZ LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C390350FSf(C0FTJ<? extends StickerModel> c0ftj, boolean z, C390390FSj c390390FSj, String str, C0FSX c0fsx, Integer num, Integer num2, Integer num3, Integer num4, C0FSZ c0fsz, InterfaceC1364105Vn<? super C390350FSf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ftj;
        this.LLILLL = z;
        this.LLILZ = c390390FSj;
        this.LLILZIL = str;
        this.LLILZLL = c0fsx;
        this.LLIZ = num;
        this.LLIZLLLIL = num2;
        this.LLJ = num3;
        this.LLJI = num4;
        this.LLJIJIL = c0fsz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C390350FSf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerManager@19f6.getStickerAssist$1$showStickerGuide$1");
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
            C0FTJ<StickerModel> c0ftj = this.LLILLJJLI;
            this.LL = 1;
            if (c0ftj.LJIJJ(false, this) == objLJFF) {
                C1C7U.LIZIZ("StickerManager@19f6.getStickerAssist$1$showStickerGuide$1");
                return objLJFF;
            }
        }
        C390340FSe.LJIIJ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerManager@19f6.getStickerAssist$1$showStickerGuide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
