package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H85, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchConcatFrameUtils$SearchConcatFrameHelper$updateRelatedTextStyle$1", f = "SearchConcatFrameUtils.kt", l = {352}, m = "invokeSuspend")
public final class C0H85 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0H86 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H85(C0H86 c0h86, InterfaceC1364105Vn<? super C0H85> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0h86;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H85(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchConcatFrameUtils$SearchConcatFrameHelper@26cc.updateRelatedTextStyle$1");
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
            C0H86 c0h86 = this.LLILLJJLI;
            this.LL = 1;
            obj = c0h86.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchConcatFrameUtils$SearchConcatFrameHelper@26cc.updateRelatedTextStyle$1");
                return objLJFF;
            }
        }
        C0H86.LJ = (C0H87) obj;
        C0H87 c0h87 = C0H86.LJ;
        if (c0h87 != null) {
            this.LLILLJJLI.LIZ(c0h87);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchConcatFrameUtils$SearchConcatFrameHelper@26cc.updateRelatedTextStyle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
