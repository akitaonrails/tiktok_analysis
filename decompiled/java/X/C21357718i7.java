package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS647S0100000_33;
import njp.a;

/* JADX INFO: renamed from: X.18i7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.ui.UploadPicStickerMattingViewV2$hideFoldedImagePickerAndShowDefaultImagePicker$1", f = "UploadPicStickerMattingViewV2.kt", l = {}, m = "invokeSuspend")
public final class C21357718i7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21357418i4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21357718i7(C21357418i4 c21357418i4, InterfaceC1364105Vn<? super C21357718i7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21357418i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21357718i7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPicStickerMattingViewV2@8d9.hideFoldedImagePickerAndShowDefaultImagePicker$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21357418i4 c21357418i4 = this.LL;
        View view = c21357418i4.LIZ;
        C786410Ut5.LJLLLLLL(8, c21357418i4.LJIJ);
        C786410Ut5.LJLLLLLL(0, view);
        C21357418i4 c21357418i42 = this.LL;
        c21357418i42.LJIJ.setContent(new C19719212De(-2090537179, new AwS647S0100000_33(c21357418i42, 59), true));
        this.LL.LJJ().LIZ().LJIIJJI(false);
        InterfaceC1624480sNK interfaceC1624480sNK = this.LL.LJIJI;
        if (interfaceC1624480sNK != null) {
            interfaceC1624480sNK.LJJ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadPicStickerMattingViewV2@8d9.hideFoldedImagePickerAndShowDefaultImagePicker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
