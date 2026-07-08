package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FFU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.BaseSticker$getRealStickerModelAfterViewReady$2$1", f = "BaseSticker.kt", l = {253}, m = "invokeSuspend")
public final class C0FFU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1364105Vn<StickerModel> LLILLJJLI;
    public final /* synthetic */ C0FFE<StickerModel> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FFU(C0FFE c0ffe, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1364105Vn interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = interfaceC1364105Vn;
        this.LLILLL = c0ffe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FFU(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSticker@10fa.getRealStickerModelAfterViewReady$2$1");
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
            C0FFV c0ffv = new C0FFV(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C099A.LIZJ(1000L, c0ffv, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseSticker@10fa.getRealStickerModelAfterViewReady$2$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            InterfaceC1364105Vn<StickerModel> interfaceC1364105Vn = this.LLILLJJLI;
            StickerModel stickerModelLJLI = this.LLILLL.LJLI();
            C189200o6.m2constructorimpl(stickerModelLJLI);
            interfaceC1364105Vn.resumeWith(stickerModelLJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSticker@10fa.getRealStickerModelAfterViewReady$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
