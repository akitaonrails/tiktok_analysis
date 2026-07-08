package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.album.AIPortraitAlbumAspectRatioInterceptComponent$intercept$blockedModels$1", f = "AIPortraitAlbumAspectRatioInterceptComponent.kt", l = {}, m = "invokeSuspend")
public final class C2496009qI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TikTokMediaModel>>, Object> {
    public final /* synthetic */ C525700KjY LL;
    public final /* synthetic */ C2496209qK LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2496009qI(C525700KjY c525700KjY, C2496209qK c2496209qK, float f, InterfaceC1364105Vn<? super C2496009qI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c525700KjY;
        this.LLILLJJLI = c2496209qK;
        this.LLILLL = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2496009qI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitAlbumAspectRatioInterceptComponent@497a.intercept$blockedModels$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<TikTokMediaModel> list = this.LL.LIZ;
        C2496209qK c2496209qK = this.LLILLJJLI;
        float f = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : list) {
            if (c2496209qK.W1(tikTokMediaModel, f)) {
                arrayList.add(tikTokMediaModel);
            }
        }
        C1C7U.LIZIZ("AIPortraitAlbumAspectRatioInterceptComponent@497a.intercept$blockedModels$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TikTokMediaModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
