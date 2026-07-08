package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment$onCreateView$1$1$1$finalBitmap$1", f = "SAEffectPopupFragment.kt", l = {168, 168}, m = "invokeSuspend")
public final class C433300Gyu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SAEffectPopupFragment LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433300Gyu(SAEffectPopupFragment sAEffectPopupFragment, String str, String str2, InterfaceC1364105Vn<? super C433300Gyu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sAEffectPopupFragment;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C433300Gyu c433300Gyu = new C433300Gyu(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c433300Gyu.LLILLJJLI = obj;
        return c433300Gyu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object obj2;
        C1C7U.LIZ("SAEffectPopupFragment@c7eb.onCreateView$1$1$1$finalBitmap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj2, obj);
                    Bitmap bitmapMR = this.LLILLL.MR((Bitmap) pair.getFirst(), (Bitmap) pair.getSecond());
                    C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.onCreateView$1$1$1$finalBitmap$1");
                    return bitmapMR;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C433290Gyt(this.LLILLL, this.LLILZ, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C433280Gys(this.LLILLL, this.LLILZIL, null), 3);
            this.LLILLJJLI = anonymousClass0957LIZIZ;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.onCreateView$1$1$1$finalBitmap$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI = obj;
        this.LL = 2;
        Object objLJLIIIL = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.onCreateView$1$1$1$finalBitmap$1");
            return objLJFF;
        }
        obj2 = obj;
        obj = objLJLIIIL;
        Pair pair2 = new Pair(obj2, obj);
        Bitmap bitmapMR2 = this.LLILLL.MR((Bitmap) pair2.getFirst(), (Bitmap) pair2.getSecond());
        C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.onCreateView$1$1$1$finalBitmap$1");
        return bitmapMR2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
