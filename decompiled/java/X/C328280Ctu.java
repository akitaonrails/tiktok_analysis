package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.minis.api.IMinisShareService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ctu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel$getUserFlag$1", f = "ShareMoreViewModel.kt", l = {310, 311}, m = "invokeSuspend")
public final class C328280Ctu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;
    public final /* synthetic */ ShareMoreViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328280Ctu(List<? extends IMContact> list, ShareMoreViewModel shareMoreViewModel, InterfaceC1364105Vn<? super C328280Ctu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = shareMoreViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328280Ctu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareMoreViewModel@e3f8.getUserFlag$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShareMoreViewModel@e3f8.getUserFlag$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMinisShareService iMinisShareService = (IMinisShareService) PluggableExtentionKt.pluggableSpi$default(IMinisShareService.class, false, false, false, 14, null);
            if (iMinisShareService == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ShareMoreViewModel@e3f8.getUserFlag$1");
                return unit2;
            }
            List<IMContact> list = this.LLILLJJLI;
            this.LL = 1;
            obj = iMinisShareService.LIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareMoreViewModel@e3f8.getUserFlag$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C328290Ctv c328290Ctv = new C328290Ctv(this.LLILLL, (String) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c328290Ctv) == objLJFF) {
            C1C7U.LIZIZ("ShareMoreViewModel@e3f8.getUserFlag$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ShareMoreViewModel@e3f8.getUserFlag$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
