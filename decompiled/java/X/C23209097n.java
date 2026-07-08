package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$changeEPAIGCEntranceStatus$1$1", f = "MvChoosePhotoScene.kt", l = {9510}, m = "invokeSuspend")
public final class C23209097n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MvChoosePhotoScene LL;
    public int LLILLJJLI;
    public final /* synthetic */ MvChoosePhotoScene LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23209097n(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C23209097n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23209097n(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MvChoosePhotoScene mvChoosePhotoScene;
        C1C7U.LIZ("MvChoosePhotoScene@c985.changeEPAIGCEntranceStatus$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                mvChoosePhotoScene = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            mvChoosePhotoScene = this.LLILLL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C23208097m c23208097m = new C23208097m(mvChoosePhotoScene, null);
            this.LL = mvChoosePhotoScene;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c23208097m);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MvChoosePhotoScene@c985.changeEPAIGCEntranceStatus$1$1");
                return objLJFF;
            }
        }
        mvChoosePhotoScene.aigcMediaList = (ArrayList) obj;
        ArrayList<TikTokMediaModel> arrayList = this.LLILLL.aigcMediaList;
        if (arrayList != null && !arrayList.isEmpty()) {
            C379140Etk.LIZ.getClass();
            Keva kevaLIZLLL = C379140Etk.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("album_ai_create_shimmer_click_");
            sbLIZ.append(C379140Etk.LIZJ());
            kevaLIZLLL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            MvChoosePhotoScene.onFinish$default(this.LLILLL, true, null, 2, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.changeEPAIGCEntranceStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
