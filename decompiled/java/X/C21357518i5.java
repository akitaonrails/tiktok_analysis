package X;

import Y.ARunnableS74S0200000_5;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS647S0100000_33;
import njp.a;

/* JADX INFO: renamed from: X.18i5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.ui.UploadPicStickerMattingViewV2$showFoldedImagePicker$2", f = "UploadPicStickerMattingViewV2.kt", l = {}, m = "invokeSuspend")
public final class C21357518i5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21357418i4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21357518i5(C21357418i4 c21357418i4, InterfaceC1364105Vn<? super C21357518i5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21357418i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21357518i5(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPicStickerMattingViewV2@8d9.showFoldedImagePicker$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21357418i4 c21357418i4 = this.LL;
        if (c21357418i4.LJIIZILJ == C0N6I.PHOTO) {
            ComposeView composeView = c21357418i4.LJIJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(composeView);
            composeView.setAlpha(0.0f);
            C21357418i4 c21357418i42 = this.LL;
            c21357418i42.LJIJ.setContent(new C19719212De(1901108582, new AwS647S0100000_33(c21357418i42, 60), true));
            C786410Ut5.LLILZ(this.LL.LJIJ, 8);
            C21357418i4 c21357418i43 = this.LL;
            HandlerHook.viewPost(c21357418i43.LJJ, new ARunnableS74S0200000_5(c21357418i43.LIZ, c21357418i43.LJIJ, 60));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadPicStickerMattingViewV2@8d9.showFoldedImagePicker$2");
        return unit;
    }
}
