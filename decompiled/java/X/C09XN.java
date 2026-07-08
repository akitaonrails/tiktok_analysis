package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$updateSticker$isDownload$1", f = "DraftViewModel.kt", l = {783}, m = "invokeSuspend")
public final class C09XN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C19567911h7 LLILLJJLI;
    public final /* synthetic */ List<StickerItemModel> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09XN(C19567911h7 c19567911h7, List<? extends StickerItemModel> list, InterfaceC1364105Vn<? super C09XN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19567911h7;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.updateSticker$isDownload$1");
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
            C09XS c09xs = C19567911h7.LIZLLL;
            C19567911h7 c19567911h7 = this.LLILLJJLI;
            List<StickerItemModel> list = this.LLILLL;
            this.LL = 1;
            obj = c09xs.LIZIZ(c19567911h7, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftViewModel@38a5.updateSticker$isDownload$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DraftViewModel@38a5.updateSticker$isDownload$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
