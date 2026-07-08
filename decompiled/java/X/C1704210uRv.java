package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel$display$1$imageFilepath$1", f = "ImageListViewModel.kt", l = {412}, m = "invokeSuspend")
public final class C1704210uRv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ImageItem LLILZ;
    public final /* synthetic */ ImageListViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704210uRv(ImageItem imageItem, ImageListViewModel imageListViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = imageItem;
        this.LLILZIL = imageListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLJJLI;
        return new C1704210uRv(this.LLILZ, this.LLILZIL, this.LLILLL, interfaceC1364105Vn, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        C1C7U.LIZ("ImageListViewModel@65ae.display$1$imageFilepath$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL.zQ2(null, th.getMessage(), this.LLILLJJLI, false);
            strLIZ = "";
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI && C123100dR.LIZ(this.LLILLL)) {
                strLIZ = C1731360v9i.LIZ(this.LLILLL);
                C1C7U.LIZIZ("ImageListViewModel@65ae.display$1$imageFilepath$1");
                return strLIZ;
            }
            String str = this.LLILZ.imageUrl;
            this.LL = 1;
            obj = C1731360v9i.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageListViewModel@65ae.display$1$imageFilepath$1");
                return objLJFF;
            }
        }
        strLIZ = (String) obj;
        C1C7U.LIZIZ("ImageListViewModel@65ae.display$1$imageFilepath$1");
        return strLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
