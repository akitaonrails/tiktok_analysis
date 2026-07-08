package X;

import Y.ALAdapterS23S0100000_28;
import com.bytedance.touchpoint.api.model.Animation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zTP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.touchpoint.core.feedbanner.manager.SpecialCardPictureManager$initLottie$1$1", f = "SpecialCardPictureManager.kt", l = {}, m = "invokeSuspend")
public final class C1897330zTP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1897290zTL LL;
    public final /* synthetic */ Animation LLILLJJLI;
    public final /* synthetic */ FileInputStream LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1897330zTP(C1897290zTL c1897290zTL, Animation animation, FileInputStream fileInputStream, int i, int i2, InterfaceC1364105Vn<? super C1897330zTP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1897290zTL;
        this.LLILLJJLI = animation;
        this.LLILLL = fileInputStream;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1897330zTP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SpecialCardPictureManager@8a59.initLottie$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1897290zTL c1897290zTL = this.LL;
        Animation animation = this.LLILLJJLI;
        FileInputStream fileInputStream = this.LLILLL;
        try {
            C1295960jpS c1295960jpS = c1897290zTL.LJIIL;
            if (c1295960jpS != null) {
                C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(fileInputStream, animation.lottieMd5);
                c1292030jj7LJ.LIZIZ(new C19336010ko(c1295960jpS, 3));
                c1292030jj7LJ.LIZ(new InterfaceC1292040jj8() { // from class: X.0zTa
                    @Override // X.InterfaceC1292040jj8
                    public final /* bridge */ /* synthetic */ void onResult(Object obj2) {
                    }
                });
            }
            C1295960jpS c1295960jpS2 = c1897290zTL.LJIIL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setRepeatCount(0);
            }
            C1295960jpS c1295960jpS3 = c1897290zTL.LJIIL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setFrame(0);
            }
            C1295960jpS c1295960jpS4 = c1897290zTL.LJIIL;
            if (c1295960jpS4 != null) {
                c1295960jpS4.addAnimatorListener(new ALAdapterS23S0100000_28(c1897290zTL, 13));
            }
            C1295960jpS c1295960jpS5 = c1897290zTL.LJIIL;
            if (c1295960jpS5 != null) {
                c1295960jpS5.setFailureListener(new InterfaceC1292040jj8() { // from class: X.0zTY
                    @Override // X.InterfaceC1292040jj8
                    public final /* bridge */ /* synthetic */ void onResult(Object obj2) {
                    }
                });
            }
            C1295960jpS c1295960jpS6 = c1897290zTL.LJIIL;
            if (c1295960jpS6 != null) {
                c1295960jpS6.setImageAssetsFolder(animation.LIZ);
            }
            C1295960jpS c1295960jpS7 = c1897290zTL.LJIIL;
            if (c1295960jpS7 != null) {
                c1295960jpS7.playAnimation();
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        int i = this.LLILZ;
        int i2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init lottie crash: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1893680zNW.getClass();
            C1893680zNW.LIZ(0, i, i2, 2, strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.initLottie$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
