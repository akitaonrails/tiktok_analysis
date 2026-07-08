package X;

import Y.AfS150S0200000_14;
import com.ss.android.ugc.aweme.setting.ContentCheckPermissionApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.ContentCheckHelper$updateUsageCountTodayData$1", f = "ContentCheckHelper.kt", l = {}, m = "invokeSuspend")
public final class C858840Xmc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858840Xmc(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858840Xmc(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContentCheckHelper@fb13.updateUsageCountTodayData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ContentCheckPermissionApi.LIZ.getClass();
        ((ContentCheckPermissionApi) C0CHQ.LIZ().getNetworkService().createRetrofit("https://www.tiktok.com", true, ContentCheckPermissionApi.class)).getContentCheckPermission().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS150S0200000_14(this.LLILLJJLI, this.LL, 2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContentCheckHelper@fb13.updateUsageCountTodayData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
