package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment$refreshHeaderView$1$1$1$finalBitmap$1$maskBitmapTask$1", f = "SAEffectPopupFragment.kt", l = {264}, m = "invokeSuspend")
public final class C433260Gyq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ SAEffectPopupFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433260Gyq(SAEffectPopupFragment sAEffectPopupFragment, String str, InterfaceC1364105Vn<? super C433260Gyq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sAEffectPopupFragment;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433260Gyq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1$finalBitmap$1$maskBitmapTask$1");
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
            SAEffectPopupFragment sAEffectPopupFragment = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            sAEffectPopupFragment.getClass();
            obj = SAEffectPopupFragment.PR(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1$finalBitmap$1$maskBitmapTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1$finalBitmap$1$maskBitmapTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
