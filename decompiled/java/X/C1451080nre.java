package X;

import com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.preview.ImageEditItemScene$init$2$1", f = "ImageEditItemScene.kt", l = {450, 453}, m = "invokeSuspend")
public final class C1451080nre extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1450990nrV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451080nre(C1450990nrV c1450990nrV, InterfaceC1364105Vn<? super C1451080nre> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1450990nrV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1451080nre(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditItemScene@e4f8.init$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImageEditItemScene@e4f8.init$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C373801cm.LIZJ(Collections.singletonList(this.LLILLJJLI.LLJJIJIIJIL.getSrcImageInfo().getPath()));
            C1450990nrV c1450990nrV = this.LLILLJJLI;
            this.LL = 1;
            if (c1450990nrV.LLLLLLL(this) == objLJFF) {
                C1C7U.LIZIZ("ImageEditItemScene@e4f8.init$2$1");
                return objLJFF;
            }
        }
        if (C0BVX.LIZ()) {
            CameraPhotoInfo cameraPhotoInfo = this.LLILLJJLI.LLJJIJIIJIL.getCameraPhotoInfo();
            if (cameraPhotoInfo != null) {
                cameraPhotoInfo.setReceivedFirstFrame(true);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1451090nrf c1451090nrf = new C1451090nrf(this.LLILLJJLI, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1451090nrf) == objLJFF) {
                C1C7U.LIZIZ("ImageEditItemScene@e4f8.init$2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditItemScene@e4f8.init$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
