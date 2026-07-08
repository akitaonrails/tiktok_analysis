package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndApplyImageModels$avatarBitmaps$1$1", f = "LiveLottieUtils.kt", l = {42}, m = "invokeSuspend")
public final class C06YL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ ImageModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YL(ImageModel imageModel, InterfaceC1364105Vn<? super C06YL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveLottieUtils@f019.loadLottieAndApplyImageModels$avatarBitmaps$1$1");
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
            C0KZZ c0kzz = C0KZZ.LIZ;
            ImageModel imageModel = this.LLILLJJLI;
            this.LL = 1;
            obj = c0kzz.LIZ(imageModel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveLottieUtils@f019.loadLottieAndApplyImageModels$avatarBitmaps$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LiveLottieUtils@f019.loadLottieAndApplyImageModels$avatarBitmaps$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
