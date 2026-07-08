package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS647S0100000_33;
import njp.a;

/* JADX INFO: renamed from: X.18i8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.ui.UploadPicStickerMattingView$hideFoldedImagePickerAndShowDefaultImagePicker$1", f = "UploadPicStickerMattingView.kt", l = {}, m = "invokeSuspend")
public final class C21357818i8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21357318i3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21357818i8(C21357318i3 c21357318i3, InterfaceC1364105Vn<? super C21357818i8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21357318i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21357818i8(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPicStickerMattingView@3a96.hideFoldedImagePickerAndShowDefaultImagePicker$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21357318i3 c21357318i3 = this.LL;
        View view = c21357318i3.LIZ;
        C786410Ut5.LJLLLLLL(8, c21357318i3.LJIIZILJ);
        C786410Ut5.LJLLLLLL(0, view);
        C21357318i3 c21357318i32 = this.LL;
        c21357318i32.LJIIZILJ.setContent(new C19719212De(488373285, new AwS647S0100000_33(c21357318i32, 56), true));
        View viewLJJ = this.LL.LJJ();
        if (viewLJJ != null) {
            C786410Ut5.LJLLLLLL(0, viewLJJ);
        }
        InterfaceC1624480sNK interfaceC1624480sNK = this.LL.LJIJ;
        if (interfaceC1624480sNK != null) {
            interfaceC1624480sNK.LJJ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadPicStickerMattingView@3a96.hideFoldedImagePickerAndShowDefaultImagePicker$1");
        return unit;
    }
}
