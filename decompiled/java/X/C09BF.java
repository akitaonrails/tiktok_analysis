package X;

import Y.AComparatorS22S0000000_3;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09BF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$loadAiContentAggregationGuideAsync$1$guideModel$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C09BF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TikTokMediaModel>, Object> {
    public final /* synthetic */ MvChoosePhotoScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09BF(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C09BF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09BF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C1C7U.LIZ("MvChoosePhotoScene@c985.loadAiContentAggregationGuideAsync$1$guideModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator it2 = C13LP.LJLLLL(new AComparatorS22S0000000_3(7), C527460KmO.LIZJ(this.LL.getAiContentDataManager())).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (System.currentTimeMillis() - ((MediaModel) next).modify < 86400000) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.loadAiContentAggregationGuideAsync$1$guideModel$1");
        return next;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TikTokMediaModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
