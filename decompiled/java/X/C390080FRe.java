package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerLayoutConnector$bindStickerFollow$1", f = "StickerLayoutConnector.kt", l = {42}, m = "invokeSuspend")
public final class C390080FRe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLJJLI;
    public final /* synthetic */ C390070FRd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C390080FRe(C0FTJ<? extends StickerModel> c0ftj, C390070FRd c390070FRd, InterfaceC1364105Vn<? super C390080FRe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ftj;
        this.LLILLL = c390070FRd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C390080FRe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0FFE c0ffe;
        C0FFP c0ffpLJJIL;
        C1C7U.LIZ("StickerLayoutConnector@883c.bindStickerFollow$1");
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
            if (c0ftj != null) {
                this.LL = 1;
                if (c0ftj.LJIJJ(true, this) == objLJFF) {
                    C1C7U.LIZIZ("StickerLayoutConnector@883c.bindStickerFollow$1");
                    return objLJFF;
                }
            }
        }
        C0FTJ<StickerModel> c0ftj2 = this.LLILLJJLI;
        if ((c0ftj2 instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj2) != null && (c0ffpLJJIL = c0ffe.LJJIL()) != null) {
            c0ffpLJJIL.LIZIZ();
        }
        this.LLILLL.LJJIJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerLayoutConnector@883c.bindStickerFollow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
