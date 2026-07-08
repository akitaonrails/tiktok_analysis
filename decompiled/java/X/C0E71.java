package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E71, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmap$1$1", f = "StickerItemView.kt", l = {}, m = "invokeSuspend")
public final class C0E71 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C367470Eav LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E71(C367470Eav c367470Eav, Bitmap bitmap, InterfaceC1364105Vn<? super C0E71> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c367470Eav;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E71(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerItemView@8b0e.getDrawBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C367470Eav c367470Eav = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        c367470Eav.LLJLLL = bitmap;
        if (bitmap != null) {
            c367470Eav.requestLayout();
            this.LL.invalidate();
            this.LL.LLJZIJLIL = false;
        } else {
            NLETrackSlot nleTrackSlot$editor_trackpanel_release = c367470Eav.getNleTrackSlot$editor_trackpanel_release();
            if (nleTrackSlot$editor_trackpanel_release != null && C351220Dpo.LLJL(nleTrackSlot$editor_trackpanel_release)) {
                this.LL.getDrawBitmapFromInfoStickerAsset();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
