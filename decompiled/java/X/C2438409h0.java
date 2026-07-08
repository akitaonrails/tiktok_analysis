package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService$getStoryStickerBgColor$2", f = "LiveEventService.kt", l = {105}, m = "invokeSuspend")
public final class C2438409h0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ ImageModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438409h0(ImageModel imageModel, InterfaceC1364105Vn<? super C2438409h0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2438409h0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("LiveEventService@c236.getStoryStickerBgColor$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19482711Kf c19482711KfLJ = C1121670fIL.LJ(this.LLILLJJLI);
            this.LL = 1;
            obj = C11UD.LIZJ(c19482711KfLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveEventService@c236.getStoryStickerBgColor$2");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        int iIntValue2 = 0;
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight())));
        c204674156yLIZ.LJFF(40.0f);
        c204674156yLIZ.LJ(0.0f, 0.34f, 0.8f, 1.0f, 0.0f);
        c204674156yLIZ.LJI(0.0f);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLJ = C2286608xc.LJ(iIntValue);
        Integer numLIZJ = c204674156yLIZ.LIZJ();
        if (numLIZJ != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        Pair pair = new Pair(numLJ, C2286608xc.LJ(iIntValue2));
        C1C7U.LIZIZ("LiveEventService@c236.getStoryStickerBgColor$2");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
