package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.helper.ClickDraftHelper$clickShootingI2v$frameworkType$1", f = "ClickDraftHelper.kt", l = {85}, m = "invokeSuspend")
public final class C2388009Xi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LZU>, Object> {
    public int LL;
    public final /* synthetic */ C0M0P LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2388009Xi(C0M0P c0m0p, InterfaceC1364105Vn<? super C2388009Xi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2388009Xi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClickDraftHelper@c135.clickShootingI2v$frameworkType$1");
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
            AIGCWorkflowCreationService aIGCWorkflowCreationServiceLIZ = C2387909Xh.LIZ();
            if (aIGCWorkflowCreationServiceLIZ != null) {
                String str = this.LLILLJJLI.LJ;
                this.LL = 1;
                obj = aIGCWorkflowCreationServiceLIZ.LJIILIIL(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ClickDraftHelper@c135.clickShootingI2v$frameworkType$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("ClickDraftHelper@c135.clickShootingI2v$frameworkType$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LZU> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
