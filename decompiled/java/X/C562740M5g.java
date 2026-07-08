package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$getAIRemixDraftItemIfNeeded$hasRemixDraft$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {2172}, m = "invokeSuspend")
public final class C562740M5g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC562800M5m LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562740M5g(InterfaceC562800M5m interfaceC562800M5m, InterfaceC1364105Vn<? super C562740M5g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC562800M5m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562740M5g(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.getAIRemixDraftItemIfNeeded$hasRemixDraft$1");
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
            InterfaceC562800M5m interfaceC562800M5m = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC562800M5m.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.getAIRemixDraftItemIfNeeded$hasRemixDraft$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.getAIRemixDraftItemIfNeeded$hasRemixDraft$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
