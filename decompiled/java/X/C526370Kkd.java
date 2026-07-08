package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.AutoPickAlbumDependencyImpl$triggerAlbumRegularNextStep$2", f = "AutoPickAlbumDependencyImpl.kt", l = {}, m = "invokeSuspend")
public final class C526370Kkd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MvChoosePhotoScene LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C526370Kkd(MvChoosePhotoScene mvChoosePhotoScene, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C526370Kkd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mvChoosePhotoScene;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526370Kkd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("AutoPickAlbumDependencyImpl@a000.triggerAlbumRegularNextStep$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC522380KeC interfaceC522380KeC = this.LL.autoPickCoordinator;
        if (interfaceC522380KeC != null) {
            interfaceC522380KeC.x31(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("AutoPickAlbumDependencyImpl@a000.triggerAlbumRegularNextStep$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
