package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$updateFileInfoCache$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C09OG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<TikTokMediaModel> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09OG(List<? extends TikTokMediaModel> list, InterfaceC1364105Vn<? super C09OG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvChoosePhotoScene@c985.updateFileInfoCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2471909mP.LIZ.getClass();
        C2471909mP.LJJIJIIJIL(false);
        C2471909mP.LJJIJIIJIL(true);
        for (TikTokMediaModel tikTokMediaModel : this.LL) {
            C140D.LIZ.getClass();
            C140D.LJIJJ(tikTokMediaModel);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.updateFileInfoCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
