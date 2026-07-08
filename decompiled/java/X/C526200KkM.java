package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$preLoadUgcMusic$2", f = "MvChoosePhotoScene.kt", l = {3239}, m = "invokeSuspend")
public final class C526200KkM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MvChoosePhotoScene LLILLJJLI;
    public final /* synthetic */ ArrayList<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526200KkM(MvChoosePhotoScene mvChoosePhotoScene, ArrayList<String> arrayList, InterfaceC1364105Vn<? super C526200KkM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mvChoosePhotoScene;
        this.LLILLL = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526200KkM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvChoosePhotoScene@c985.preLoadUgcMusic$2");
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
            Activity activity = this.LLILLJJLI.mActivity;
            if (activity != null) {
                ArrayList<String> arrayList = this.LLILLL;
                ITemplateMusicService iTemplateMusicServiceLIZ = C524940KiK.LIZ();
                if (iTemplateMusicServiceLIZ != null) {
                    this.LL = 1;
                    if (iTemplateMusicServiceLIZ.LIZLLL(activity, arrayList, this) == objLJFF) {
                        C1C7U.LIZIZ("MvChoosePhotoScene@c985.preLoadUgcMusic$2");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.preLoadUgcMusic$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
