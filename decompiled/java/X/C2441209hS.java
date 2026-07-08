package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09hS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.utils.ImageColorHelper$Companion$processIndicatorDarkness$2", f = "ImageColorHelper.kt", l = {286, 228}, m = "invokeSuspend")
public final class C2441209hS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Image LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ float LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441209hS(float f, float f2, float f3, float f4, Image image, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = image;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = f3;
        this.LLIZ = f4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLJJLI;
        return new C2441209hS(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLL, interfaceC1364105Vn, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageColorHelper$Companion@66ea.processIndicatorDarkness$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                Image image = this.LLILLL;
                float f = this.LLILZ;
                float f2 = this.LLILZIL;
                float f3 = this.LLILZLL;
                float f4 = this.LLIZ;
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c2252611DEt.LJJII(new AwS582S0100000_3(C0H1J.LIZJ(image, f, f2, f3, f4, c2252611DEt), 112));
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ImageColorHelper$Companion@66ea.processIndicatorDarkness$2");
                    return objLJFF;
                }
            } else {
                Image image2 = this.LLILLL;
                float f5 = this.LLILZ;
                float f6 = this.LLILZIL;
                float f7 = this.LLILZLL;
                float f8 = this.LLIZ;
                this.LL = 2;
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C0H1J.LIZJ(image2, f5, f6, f7, f8, c23260099m);
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ImageColorHelper$Companion@66ea.processIndicatorDarkness$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("ImageColorHelper$Companion@66ea.processIndicatorDarkness$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
