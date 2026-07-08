package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.098O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$groupShotFaceDetectAndHandClick$1$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C098O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MvChoosePhotoScene LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098O(MvChoosePhotoScene mvChoosePhotoScene, C013C c013c, MediaModel mediaModel, InterfaceC1364105Vn<? super C098O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mvChoosePhotoScene;
        this.LLILLJJLI = c013c;
        this.LLILLL = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C098O(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C19EG c19egLIZIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.groupShotFaceDetectAndHandClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.dismissFaceDetectLoading();
        if (!this.LLILLJJLI.element) {
            C2497109qT c2497109qT = C2497109qT.LIZ;
            Activity activity = this.LL.mActivity;
            if (activity != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(activity);
            } else {
                c19egLIZIZ = null;
            }
            c2497109qT.getClass();
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIIZ(2131830907);
                c1389890mGx.LJIIJJI();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MvChoosePhotoScene@c985.groupShotFaceDetectAndHandClick$1$1");
            return unit;
        }
        this.LL.onClickSingleImageInternal(this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.groupShotFaceDetectAndHandClick$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
