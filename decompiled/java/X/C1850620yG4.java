package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.PhotoPickerEntrancePanelAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.PhotoPickerEntrancePanelAssem$initCarriedPhotoIfNeeded$1$2$1", f = "PhotoPickerEntrancePanelAssem.kt", l = {329, 330}, m = "invokeSuspend")
public final class C1850620yG4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ PhotoPickerEntrancePanelAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850620yG4(List<String> list, PhotoPickerEntrancePanelAssem photoPickerEntrancePanelAssem, InterfaceC1364105Vn<? super C1850620yG4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = photoPickerEntrancePanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1850620yG4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        BaseImage baseImage;
        C1854650yMZ c1854650yMZ;
        C1C7U.LIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    baseImage = (BaseImage) obj;
                    if (baseImage != null && (c1854650yMZ = this.LLILLL.LLJJJ) != null) {
                        c1854650yMZ.LIZ("feed_carried", baseImage, null);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = C339320DRy.LIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1");
                return objLJFF;
            }
        }
        C1DFB c1dfb = C0PEM.LIZJ;
        C1850610yG3 c1850610yG3 = new C1850610yG3(this.LLILLL, (Bitmap) obj, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, c1dfb, c1850610yG3);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1");
            return objLJFF;
        }
        baseImage = (BaseImage) obj;
        if (baseImage != null) {
            c1854650yMZ.LIZ("feed_carried", baseImage, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
