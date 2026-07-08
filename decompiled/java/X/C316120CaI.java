package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder$goToCameraWithUnpublishedEffect$1$correspondingDraftId$1", f = "EffectProfileViewHolder.kt", l = {443}, m = "invokeSuspend")
public final class C316120CaI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ EffectProfileViewHolder LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316120CaI(EffectProfileViewHolder effectProfileViewHolder, String str, InterfaceC1364105Vn<? super C316120CaI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectProfileViewHolder;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316120CaI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        Object objLJI = obj;
        C1C7U.LIZ("EffectProfileViewHolder@e064.goToCameraWithUnpublishedEffect$1$correspondingDraftId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            EffectProfileViewHolder effectProfileViewHolder = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            effectProfileViewHolder.getClass();
            objLJI = null;
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null && (interfaceC318260CdkDraftService = iEffectCreatorService.draftService()) != null) {
                objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C316040CaA(interfaceC318260CdkDraftService, str, null));
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EffectProfileViewHolder@e064.goToCameraWithUnpublishedEffect$1$correspondingDraftId$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectProfileViewHolder@e064.goToCameraWithUnpublishedEffect$1$correspondingDraftId$1");
        return objLJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
