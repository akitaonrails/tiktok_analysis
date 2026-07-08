package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$initChooseListener$allChooseListener$1$invalidMediaPrivateAlbum$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C526160KkI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MvChoosePhotoScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526160KkI(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C526160KkI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526160KkI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvChoosePhotoScene@c985.initChooseListener$allChooseListener$1$invalidMediaPrivateAlbum$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC522120Kdm interfaceC522120Kdm = this.LL.videoImageMixedController;
        if (interfaceC522120Kdm != null) {
            interfaceC522120Kdm.LJIIJ();
        }
        C528320Knm c528320Knm = this.LL.chooseAllFragment;
        if (c528320Knm != null) {
            c528320Knm.LLZLI();
        }
        C0L0I.LIZ.getClass();
        C0L0I.LIZLLL = -1;
        C0L0I.LIZIZ.clear();
        this.LL.fullRefreshMediaSelectorData();
        this.LL.finishScene(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.initChooseListener$allChooseListener$1$invalidMediaPrivateAlbum$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
