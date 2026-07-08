package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndApplyBitmaps$2", f = "LiveLottieUtils.kt", l = {}, m = "invokeSuspend")
public final class C06YK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Bitmap> LL;
    public final /* synthetic */ C1295960jpS LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YK(List<Bitmap> list, C1295960jpS c1295960jpS, boolean z, boolean z2, List<String> list2, InterfaceC1364105Vn<? super C06YK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1295960jpS;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveLottieUtils@f019.loadLottieAndApplyBitmaps$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Bitmap> list = this.LL;
        int i = 0;
        if (list != null) {
            C1295960jpS c1295960jpS = this.LLILLJJLI;
            List<String> list2 = this.LLILZIL;
            int i2 = 0;
            for (Bitmap bitmap : list) {
                int i3 = i2 + 1;
                String str = null;
                if (i2 >= 0) {
                    Bitmap bitmap2 = bitmap;
                    if (list2 != null) {
                        str = (String) C13LP.LJJJLZIJ(i2, list2);
                    }
                    c1295960jpS.updateBitmap(str, bitmap2);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C1295960jpS c1295960jpS2 = this.LLILLJJLI;
        if (this.LLILLL) {
            i = Integer.MAX_VALUE;
        }
        c1295960jpS2.setRepeatCount(i);
        if (this.LLILZ) {
            this.LLILLJJLI.playAnimation();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveLottieUtils@f019.loadLottieAndApplyBitmaps$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
