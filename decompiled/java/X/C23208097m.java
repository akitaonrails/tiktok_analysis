package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$changeEPAIGCEntranceStatus$1$1$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C23208097m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ArrayList<TikTokMediaModel>>, Object> {
    public final /* synthetic */ MvChoosePhotoScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23208097m(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C23208097m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23208097m(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TikTokMediaModel tikTokMediaModel;
        C1C7U.LIZ("MvChoosePhotoScene@c985.changeEPAIGCEntranceStatus$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<TikTokMediaModel> arrayListUpdateGreyImageToMediaList = this.LL.updateGreyImageToMediaList();
        MvChoosePhotoScene mvChoosePhotoScene = this.LL;
        if (arrayListUpdateGreyImageToMediaList != null) {
            tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJJZI(arrayListUpdateGreyImageToMediaList);
        } else {
            tikTokMediaModel = null;
        }
        mvChoosePhotoScene.preProcessFileForImageMode(tikTokMediaModel, true);
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.changeEPAIGCEntranceStatus$1$1$1");
        return arrayListUpdateGreyImageToMediaList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ArrayList<TikTokMediaModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
