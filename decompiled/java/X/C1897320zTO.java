package X;

import com.bytedance.touchpoint.api.model.Animation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.touchpoint.core.feedbanner.manager.SpecialCardPictureManager$initLottie$1", f = "SpecialCardPictureManager.kt", l = {459}, m = "invokeSuspend")
public final class C1897320zTO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Animation LLILLJJLI;
    public final /* synthetic */ C1897290zTL LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1897320zTO(Animation animation, C1897290zTL c1897290zTL, int i, int i2, InterfaceC1364105Vn<? super C1897320zTO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = animation;
        this.LLILLL = c1897290zTL;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1897320zTO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c098200Yq;
        C1C7U.LIZ("SpecialCardPictureManager@8a59.initLottie$1");
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
            String str = this.LLILLJJLI.LIZ;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Animation animation = this.LLILLJJLI;
                C1897290zTL c1897290zTL = this.LLILLL;
                c1897290zTL.getClass();
                C1897250zTH c1897250zTHLIZJ = C0T82.LIZJ(c1897290zTL.LJJIIJZLJL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLJJLI.lottieMd5);
                sbLIZ.append(".zip");
                String strLJIILIIL = c1897250zTHLIZJ.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ), this.LLILLJJLI.lottieMd5);
                if (strLJIILIIL == null) {
                    strLJIILIIL = "";
                }
                animation.LIZ = strLJIILIIL;
            }
            if (!C801320Vc2.LIZIZ(this.LLILLJJLI.LIZ)) {
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                int i2 = this.LLILZ;
                int i3 = this.LLILZIL;
                c1893680zNW.getClass();
                C1893680zNW.LIZ(0, i2, i3, 2, "feed banner lottie file isn't exists");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SpecialCardPictureManager@8a59.initLottie$1");
                return unit;
            }
            try {
                c098200Yq = new C0VSP(this.LLILLJJLI.LIZ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            int i4 = this.LLILZ;
            int i5 = this.LLILZIL;
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                C1893680zNW.LIZ.getClass();
                C1893680zNW.LIZ(0, i4, i5, 2, "feed banner load fail");
                c098200Yq = null;
            }
            FileInputStream fileInputStream = (FileInputStream) c098200Yq;
            if (fileInputStream == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SpecialCardPictureManager@8a59.initLottie$1");
                return unit2;
            }
            C1893680zNW c1893680zNW2 = C1893680zNW.LIZ;
            int i6 = this.LLILZ;
            int i7 = this.LLILZIL;
            c1893680zNW2.getClass();
            C1893680zNW.LIZ(1, i6, i7, 2, "");
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1897330zTP c1897330zTP = new C1897330zTP(this.LLILLL, this.LLILLJJLI, fileInputStream, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1897330zTP) == objLJFF) {
                C1C7U.LIZIZ("SpecialCardPictureManager@8a59.initLottie$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.initLottie$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
