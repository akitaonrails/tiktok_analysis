package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$groupShotFaceDetectAndHandClick$1", f = "MvChoosePhotoScene.kt", l = {8427}, m = "invokeSuspend")
public final class C098P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MvChoosePhotoScene LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098P(MvChoosePhotoScene mvChoosePhotoScene, MediaModel mediaModel, InterfaceC1364105Vn<? super C098P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mvChoosePhotoScene;
        this.LLILLL = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C098P(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Activity activity;
        EnumC23225098d enumC23225098dLIZ;
        boolean z;
        C1C7U.LIZ("MvChoosePhotoScene@c985.groupShotFaceDetectAndHandClick$1");
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
            C013C c013c = new C013C();
            c013c.element = true;
            MvChoosePhotoScene mvChoosePhotoScene = this.LLILLJJLI;
            if (mvChoosePhotoScene.isDMGroupShot && (activity = mvChoosePhotoScene.mActivity) != null && C1388190mED.LIZIZ(activity) != null) {
                C2497109qT c2497109qT = C2497109qT.LIZ;
                MediaModel mediaModel = this.LLILLL;
                c2497109qT.getClass();
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(C2471909mP.LJIJ(mediaModel), null);
                if (bitmapLIZLLL == null) {
                    enumC23225098dLIZ = EnumC23225098d.DECODE_FAIL;
                } else {
                    enumC23225098dLIZ = C2497109qT.LIZ(bitmapLIZLLL);
                }
                if (enumC23225098dLIZ == EnumC23225098d.HAS_FACE) {
                    z = true;
                } else {
                    z = false;
                }
                c013c.element = z;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C098O c098o = new C098O(this.LLILLJJLI, c013c, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c098o) == objLJFF) {
                C1C7U.LIZIZ("MvChoosePhotoScene@c985.groupShotFaceDetectAndHandClick$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.groupShotFaceDetectAndHandClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
