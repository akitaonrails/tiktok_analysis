package X;

import android.app.Activity;
import android.view.ViewStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl$showFloatingNoticePhaseIII$1", f = "EducatePhotoModeServiceImpl.kt", l = {262, 268}, m = "invokeSuspend")
public final class C1260510iuH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EducatePhotoModeServiceImpl LLILLJJLI;
    public final /* synthetic */ ViewStub LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ C1257230ioz LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260510iuH(EducatePhotoModeServiceImpl educatePhotoModeServiceImpl, ViewStub viewStub, int i, Activity activity, C1257230ioz c1257230ioz, InterfaceC1364105Vn<? super C1260510iuH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = educatePhotoModeServiceImpl;
        this.LLILLL = viewStub;
        this.LLILZ = i;
        this.LLILZIL = activity;
        this.LLILZLL = c1257230ioz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1260510iuH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BannerDisplayInfo bannerDisplayInfo;
        Object objLIZIZ = obj;
        C1C7U.LIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bannerDisplayInfo = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1260520iuI c1260520iuI = C1260520iuI.LIZIZ;
            this.LL = 1;
            objLIZIZ = c1260520iuI.LIZIZ(this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1");
                return objLJFF;
            }
        }
        bannerDisplayInfo = (BannerDisplayInfo) objLIZIZ;
        if (bannerDisplayInfo == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1");
            return unit2;
        }
        String strLIZLLL = C1260520iuI.LIZIZ.LIZLLL();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1260500iuG c1260500iuG = new C1260500iuG(this.LLILLJJLI, bannerDisplayInfo, strLIZLLL, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1260500iuG) == objLJFF) {
            C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseIII$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
