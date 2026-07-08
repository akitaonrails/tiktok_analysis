package X;

import Y.ARunnableS134S0100000_34;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerDataWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.popup.outreach.ProfileOutreachBannerHelper$handleSignalCallback$1", f = "ProfileOutreachBannerHelper.kt", l = {184}, m = "invokeSuspend")
public final class C637110Oyr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2238171Cit LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20554115bn LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C2238171Cit LLILZIL;
    public final /* synthetic */ n LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637110Oyr(C20554115bn c20554115bn, String str, C2238171Cit c2238171Cit, n nVar, InterfaceC1364105Vn<? super C637110Oyr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20554115bn;
        this.LLILZ = str;
        this.LLILZIL = c2238171Cit;
        this.LLILZLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637110Oyr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2238171Cit c2238171Cit;
        C1C7U.LIZ("ProfileOutreachBannerHelper@7058.handleSignalCallback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c2238171Cit = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive from signal. result: ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", timing: ");
            sbLIZ.append(this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLL.LIZ != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("receive from signal result is fail. error code:");
                sbLIZ2.append(this.LLILLL.LIZ);
                C1720106oR.LIZ("ProfileOutreachBanner", C2188811AlT.LIZIZ(sbLIZ2));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.handleSignalCallback$1");
                return unit;
            }
            C2238171Cit c2238171Cit2 = this.LLILZIL;
            n nVar = this.LLILZLL;
            String str = this.LLILZ;
            c2238171Cit2.getClass();
            OutreachBannerDataWrapper outreachBannerDataWrapperLIZJ = C2238171Cit.LIZJ(nVar, str);
            if (outreachBannerDataWrapperLIZJ != null) {
                c2238171Cit = this.LLILZIL;
                C20554115bn c20554115bn = this.LLILLL;
                OutreachBannerData outreachBannerData = outreachBannerDataWrapperLIZJ.outreachBannerData;
                c2238171Cit.LJIIIIZZ = outreachBannerData;
                if (outreachBannerData != null) {
                    outreachBannerData.LIZ = c20554115bn.LIZJ;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C2238161Cis c2238161Cis = new C2238161Cis(c2238171Cit, null);
                this.LL = c2238171Cit;
                this.LLILLJJLI = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c2238161Cis) == objLJFF) {
                    C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.handleSignalCallback$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.handleSignalCallback$1");
            return unit2;
        }
        C20684815ws.LJFF().execute(new ARunnableS134S0100000_34(c2238171Cit.LJIIIIZZ, 65));
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.handleSignalCallback$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
