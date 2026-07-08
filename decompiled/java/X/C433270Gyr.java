package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment$refreshHeaderView$1$1$1$finalBitmap$1", f = "SAEffectPopupFragment.kt", l = {266}, m = "invokeSuspend")
public final class C433270Gyr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SAEffectPopupFragment LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433270Gyr(SAEffectPopupFragment sAEffectPopupFragment, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C433270Gyr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sAEffectPopupFragment;
        this.LLILZ = bitmap;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C433270Gyr c433270Gyr = new C433270Gyr(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c433270Gyr.LLILLJJLI = obj;
        return c433270Gyr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1$finalBitmap$1");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C433260Gyq(this.LLILLL, this.LLILZIL, null), 3);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1$finalBitmap$1");
                return objLJFF;
            }
        }
        Bitmap bitmapMR = this.LLILLL.MR(this.LLILZ, (Bitmap) obj);
        C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1$finalBitmap$1");
        return bitmapMR;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
