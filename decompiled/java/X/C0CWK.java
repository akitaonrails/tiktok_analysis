package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem$observeStoryPublishStatus$2", f = "SocialPublishLandingAssem.kt", l = {203}, m = "invokeSuspend")
public final class C0CWK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialPublishLandingAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWK(SocialPublishLandingAssem socialPublishLandingAssem, InterfaceC1364105Vn<? super C0CWK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialPublishLandingAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$2");
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
            if (AnonymousClass0958.LIZIZ(8000L, this) == objLJFF) {
                C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$2");
                return objLJFF;
            }
        }
        SocialPublishLandingAssem socialPublishLandingAssem = this.LLILLJJLI;
        if (!socialPublishLandingAssem.LLJIJIL) {
            socialPublishLandingAssem.LLJIJIL = true;
            C1618440sDa.LIZIZ.LJJIFFI().LJIIJJI(socialPublishLandingAssem.getContext(), LifecycleOwnerKt.getLifecycleScope(socialPublishLandingAssem));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
