package X;

import android.content.Context;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem$observeStoryPublishStatus$3", f = "SocialPublishLandingAssem.kt", l = {207, 209}, m = "invokeSuspend")
public final class C313640CRe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialPublishLandingAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313640CRe(SocialPublishLandingAssem socialPublishLandingAssem, InterfaceC1364105Vn<? super C313640CRe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialPublishLandingAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313640CRe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C0AUA.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3");
                return objLJFF;
            }
        }
        Context context = this.LLILLJJLI.getContext();
        C1DFB c1dfb = C0PEM.LIZJ;
        C313650CRf c313650CRf = new C313650CRf(context, null);
        this.LL = 2;
        if (C23250099c.LJI(this, c1dfb, c313650CRf) == objLJFF) {
            C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
