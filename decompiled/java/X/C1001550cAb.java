package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadServiceImpl$trySubmitAdStylePreloadTask$1", f = "CommerceIDLEPreloadServiceImpl.kt", l = {126}, m = "invokeSuspend")
public final class C1001550cAb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceIDLEPreloadServiceImpl LLILLJJLI;
    public final /* synthetic */ EnumC1001380cAK LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<Aweme> LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1001550cAb(CommerceIDLEPreloadServiceImpl commerceIDLEPreloadServiceImpl, EnumC1001380cAK enumC1001380cAK, int i, List<? extends Aweme> list, Context context, InterfaceC1364105Vn<? super C1001550cAb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceIDLEPreloadServiceImpl;
        this.LLILLL = enumC1001380cAK;
        this.LLILZ = i;
        this.LLILZIL = list;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001550cAb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceIDLEPreloadServiceImpl@f420.trySubmitAdStylePreloadTask$1");
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
            long j = this.LLILLJJLI.LJ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceIDLEPreloadServiceImpl@f420.trySubmitAdStylePreloadTask$1");
                return objLJFF;
            }
        }
        int i2 = C1001390cAL.LIZ[this.LLILLL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C811103Ev.LIZ("CommerceIDLEPreload");
                    C997450c3z c997450c3zLJIILLIIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIILLIIL();
                    Context context = this.LLILZLL;
                    int i3 = this.LLILZ;
                    List<Aweme> list = this.LLILZIL;
                    c997450c3zLJIILLIIL.LJ(i3, context, list);
                    c997450c3zLJIILLIIL.LJI(i3, context, list);
                }
            } else {
                C999880c7u c999880c7uLJIJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJ();
                int i4 = this.LLILZ;
                List<Aweme> list2 = this.LLILZIL;
                c999880c7uLJIJJ.getClass();
                C1000300c8a.LJI(i4, c999880c7uLJIJJ, list2);
                C1000300c8a.LIZJ(i4, c999880c7uLJIJJ, list2);
            }
        } else {
            C999710c7d c999710c7dLJFF = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJFF();
            int i5 = this.LLILZ;
            List<Aweme> list3 = this.LLILZIL;
            c999710c7dLJFF.getClass();
            C1000300c8a.LJI(i5, c999710c7dLJFF, list3);
            C1000300c8a.LIZJ(i5, c999710c7dLJFF, list3);
        }
        C811103Ev.LIZ("CommerceIDLEPreload");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceIDLEPreloadServiceImpl@f420.trySubmitAdStylePreloadTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
