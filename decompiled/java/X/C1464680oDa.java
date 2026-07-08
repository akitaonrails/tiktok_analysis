package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.AiLiveStoryToolbarHandler$updateAILivePhotoState$1", f = "AiLiveStoryToolbarHandler.kt", l = {216}, m = "invokeSuspend")
public final class C1464680oDa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1464660oDY LLILLJJLI;
    public final /* synthetic */ C1464810oDn LLILLL;
    public final /* synthetic */ C1464760oDi LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464680oDa(C1464660oDY c1464660oDY, C1464810oDn c1464810oDn, C1464760oDi c1464760oDi, InterfaceC1364105Vn<? super C1464680oDa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1464660oDY;
        this.LLILLL = c1464810oDn;
        this.LLILZ = c1464760oDi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1464680oDa(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiLiveStoryToolbarHandler@db9d.updateAILivePhotoState$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.updateAILivePhotoState$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLJ.setValue(C1464810oDn.LIZ(this.LLILLL, null, null, null, false, !C1460090o6B.LIZ(), null, false, null, 959));
        C1464660oDY.LJIIJJI(this.LLILLJJLI, this.LLILZ, this.LLILLL);
        if (C1460090o6B.LIZ()) {
            this.LLILLJJLI.LJIIIIZZ(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.updateAILivePhotoState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
