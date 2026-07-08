package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09BE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$loadAiContentAggregationGuideAsync$1", f = "MvChoosePhotoScene.kt", l = {6058}, m = "invokeSuspend")
public final class C09BE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MvChoosePhotoScene LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09BE(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C09BE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09BE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MvChoosePhotoScene@c985.loadAiContentAggregationGuideAsync$1");
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
            C09BF c09bf = new C09BF(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c09bf);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MvChoosePhotoScene@c985.loadAiContentAggregationGuideAsync$1");
                return objLJFF;
            }
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) obj;
        if (C12WG.LIZIZ(this.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MvChoosePhotoScene@c985.loadAiContentAggregationGuideAsync$1");
            return unit;
        }
        this.LLILLJJLI.applyAiContentAggregationGuide(tikTokMediaModel, true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.loadAiContentAggregationGuideAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
