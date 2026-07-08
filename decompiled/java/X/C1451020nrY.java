package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.preview.ImageEditItemScene$handleTakePhotoFailed$2", f = "ImageEditItemScene.kt", l = {}, m = "invokeSuspend")
public final class C1451020nrY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1450990nrV LL;
    public final /* synthetic */ File LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451020nrY(C1450990nrV c1450990nrV, File file, InterfaceC1364105Vn<? super C1451020nrY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1450990nrV;
        this.LLILLJJLI = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1451020nrY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ImageEditItemScene@e4f8.handleTakePhotoFailed$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1450990nrV c1450990nrV = this.LL;
        InterfaceC1441090nbX interfaceC1441090nbX = (InterfaceC1441090nbX) c1450990nrV.LLLLII.getValue(c1450990nrV, C1450990nrV.LLLLLLLLLL[9]);
        if (interfaceC1441090nbX != null) {
            interfaceC1441090nbX.f6(this.LL.LLLLJI, this.LLILLJJLI.getPath());
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ImageEditItemScene@e4f8.handleTakePhotoFailed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
