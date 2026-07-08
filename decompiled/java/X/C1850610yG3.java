package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.PhotoPickerEntrancePanelAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.PhotoPickerEntrancePanelAssem$initCarriedPhotoIfNeeded$1$2$1$baseImage$1", f = "PhotoPickerEntrancePanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C1850610yG3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseImage>, Object> {
    public final /* synthetic */ PhotoPickerEntrancePanelAssem LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850610yG3(PhotoPickerEntrancePanelAssem photoPickerEntrancePanelAssem, Bitmap bitmap, InterfaceC1364105Vn<? super C1850610yG3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoPickerEntrancePanelAssem;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1850610yG3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        String strLIZLLL;
        C1C7U.LIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1$baseImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContext();
        BaseImage baseImage = null;
        if (context != null && (bitmap = this.LLILLJJLI) != null && (strLIZLLL = C09NP.LIZLLL(context, bitmap, C09NP.LIZ(bitmap))) != null && strLIZLLL.length() != 0) {
            baseImage = new BaseImage(null, null, null, null, this.LLILLJJLI.getWidth(), this.LLILLJJLI.getHeight(), strLIZLLL, null, strLIZLLL, null, null, null, C2286608xc.LJ(1), C2286608xc.LJFF(new C0VSJ(strLIZLLL).length()), null, 0, 0, null, 249487, null);
        }
        C1C7U.LIZIZ("PhotoPickerEntrancePanelAssem@c4d3.initCarriedPhotoIfNeeded$1$2$1$baseImage$1");
        return baseImage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseImage> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
