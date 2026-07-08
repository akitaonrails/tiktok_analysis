package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E70, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmapFromInfoStickerAsset$1$2", f = "StickerItemView.kt", l = {764, 765}, m = "invokeSuspend")
public final class C0E70 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C367470Eav LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E70(C367470Eav c367470Eav, String str, InterfaceC1364105Vn<? super C0E70> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c367470Eav;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E70(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            NLETrackSlot nleTrackSlot$editor_trackpanel_release = this.LLILLJJLI.getNleTrackSlot$editor_trackpanel_release();
            boolean z = false;
            if (nleTrackSlot$editor_trackpanel_release != null && C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release)) {
                z = true;
            }
            C367470Eav c367470Eav = this.LLILLJJLI;
            if (z) {
                i = c367470Eav.LLLJIL;
            } else {
                i = c367470Eav.LLLIZZ;
            }
            C367470Eav c367470Eav2 = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c367470Eav2.LJIILL(i, i, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C359350E6z c359350E6z = new C359350E6z(this.LLILLJJLI, (Bitmap) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c359350E6z) == objLJFF) {
            C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
