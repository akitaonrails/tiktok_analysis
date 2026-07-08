package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectUnpublishedResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TemplateEffectsService;
import com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder$fetchUnpublishedEffect$2", f = "EffectProfileViewHolder.kt", l = {541}, m = "invokeSuspend")
public final class C318910Cen extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MobileEffect>, Object> {
    public int LL;
    public final /* synthetic */ EffectProfileViewHolder LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318910Cen(EffectProfileViewHolder effectProfileViewHolder, String str, InterfaceC1364105Vn<? super C318910Cen> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectProfileViewHolder;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318910Cen(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EffectProfileViewHolder@e064.fetchUnpublishedEffect$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                EffectProfileViewHolder effectProfileViewHolder = this.LLILLJJLI;
                String str = this.LLILLL;
                TemplateEffectsService templateEffectsService = (TemplateEffectsService) effectProfileViewHolder.LLJJIJI.getValue();
                this.LL = 1;
                obj = templateEffectsService.getUnpublishedEffect(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectProfileViewHolder@e064.fetchUnpublishedEffect$2");
                    return objLJFF;
                }
            }
            MobileEffectUnpublishedResponse mobileEffectUnpublishedResponse = (MobileEffectUnpublishedResponse) obj;
            mobileEffectUnpublishedResponse.checkValid();
            MobileEffect.Companion.getClass();
            c098200Yq = new MobileEffect(mobileEffectUnpublishedResponse.effect, mobileEffectUnpublishedResponse.moderationStatus, null, 4);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("EffectProfileViewHolder@e064.fetchUnpublishedEffect$2");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MobileEffect> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
