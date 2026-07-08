package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM$fetchSysRecommendProducts$1$1", f = "EcPhotoSearchAlbumVM.kt", l = {}, m = "invokeSuspend")
public final class C1309520kBK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SysRecommendModel LL;
    public final /* synthetic */ Function1<SysRecommendModel, Unit> LLILLJJLI;
    public final /* synthetic */ EcPhotoSearchAlbumVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1309520kBK(SysRecommendModel sysRecommendModel, Function1<? super SysRecommendModel, Unit> function1, EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, InterfaceC1364105Vn<? super C1309520kBK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sysRecommendModel;
        this.LLILLJJLI = function1;
        this.LLILLL = ecPhotoSearchAlbumVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309520kBK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SysRecommendModel sysRecommendModel = this.LL;
        if (sysRecommendModel != null) {
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = this.LLILLL;
            ecPhotoSearchAlbumVM.LLILLL.setValue(sysRecommendModel);
            Boolean.valueOf(ecPhotoSearchAlbumVM.LLILLJJLI.add(sysRecommendModel));
        }
        this.LLILLJJLI.invoke(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
