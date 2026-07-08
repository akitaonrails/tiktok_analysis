package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.hybrid.container.prerender.AdHybridCarouselTagPreRender$onPreRender$1", f = "AdHybridCarouselTagPreRender.kt", l = {137}, m = "invokeSuspend")
public final class C1001560cAc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C998450c5b LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001560cAc(C998450c5b c998450c5b, Context context, Aweme aweme, InterfaceC1364105Vn<? super C1001560cAc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c998450c5b;
        this.LLILLL = context;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001560cAc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AdHybridCarouselTagPreRender@72ca.onPreRender$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C1001580cAe c1001580cAe = new C1001580cAe(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1001580cAe);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AdHybridCarouselTagPreRender@72ca.onPreRender$1");
                return objLJFF;
            }
        }
        C1051290dSp[] c1051290dSpArr = (C1051290dSp[]) obj;
        int length = this.LLILLJJLI.LIZJ.length;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC1028360crq[] abstractC1028360crqArr = this.LLILLJJLI.LIZJ;
            IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
            C1028380crs c1028380crsLIZJ = C1000490c8t.LIZJ(this.LLILLL, this.LLILZ);
            C1051290dSp c1051290dSpLIZIZ = c1051290dSpArr[i2];
            if (c1051290dSpLIZIZ == null) {
                c1051290dSpLIZIZ = C1000490c8t.LIZIZ(this.LLILLL, this.LLILZ, i2);
            }
            abstractC1028360crqArr[i2] = iAdHybridContainerManager.LIZIZ(c1028380crsLIZJ, c1051290dSpLIZIZ, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdHybridCarouselTagPreRender@72ca.onPreRender$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
