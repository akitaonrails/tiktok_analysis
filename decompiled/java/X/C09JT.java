package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09JT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.ProTemplateEffectViewHolderV2$trySetupGradientBg$2", f = "ProTemplateEffectViewHolderV2.kt", l = {248, 253}, m = "invokeSuspend")
public final class C09JT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1636710sh3 LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JT(C1636710sh3 c1636710sh3, Effect effect, InterfaceC1364105Vn<? super C09JT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1636710sh3;
        this.LLILLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final C1636710sh3 c1636710sh3 = this.LLILLJJLI;
            UrlModel iconUrl = this.LLILLL.getIconUrl();
            this.LL = 1;
            c1636710sh3.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            if (iconUrl == null) {
                Integer numLJ = C2286608xc.LJ(0);
                C189200o6.m2constructorimpl(numLJ);
                c2252611DEt.resumeWith(numLJ);
            } else {
                com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
                urlModel.setUrlList(iconUrl.getUrlList());
                C1324750kZt.LJIJ(urlModel, 100, 100, new C092O() { // from class: X.09gs
                    @Override // X.C092O
                    public final void accept(Object obj2) {
                        Object c098200Yq;
                        int iIntValue;
                        Integer numLIZIZ;
                        Bitmap bitmap = (Bitmap) obj2;
                        InterfaceC20236714Gf<Integer> interfaceC20236714Gf = c2252611DEt;
                        c1636710sh3.getClass();
                        int iIntValue2 = 0;
                        if (bitmap != null) {
                            Object obj3 = null;
                            try {
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                if (width <= 0 || height <= 0 || (numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null)).LIZIZ()) == null) {
                                    iIntValue = 0;
                                } else {
                                    iIntValue = numLIZIZ.intValue();
                                }
                                C1319770kRr.LIZLLL(bitmap);
                                c098200Yq = Integer.valueOf(iIntValue);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                C1319770kRr.LIZLLL(bitmap);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                obj3 = c098200Yq;
                            }
                            Integer num = (Integer) obj3;
                            if (num != null) {
                                iIntValue2 = num.intValue();
                            }
                        }
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        C189200o6.m2constructorimpl(numValueOf);
                        interfaceC20236714Gf.resumeWith(numValueOf);
                    }
                });
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        C1636710sh3.LLJJIII.put(this.LLILLL.getEffectId(), C2286608xc.LJ(iIntValue));
        if (!Intrinsics.LJFF(this.LLILLJJLI.LLJILLL, this.LLILLL.getEffectId())) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C09JU c09ju = new C09JU(this.LLILLJJLI, iIntValue, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c09ju) == objLJFF) {
            C1C7U.LIZIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
