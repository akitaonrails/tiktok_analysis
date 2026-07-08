package X;

import Y.ARunnableS3S2000000_12;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerDataWrapper;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1Cit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238171Cit {
    public static final int LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final float LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final ViewGroup LIZ;
    public final MyProfileGuideViewModel LIZIZ;
    public final Lifecycle LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final Context LJFF;
    public boolean LJI;
    public C20514815Pe LJII;
    public OutreachBannerData LJIIIIZZ;
    public String LJIIIZ;

    public final void LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(this.LJFF, str).open();
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileOutreachBanner", "open route error. schema is null or empty");
        }
    }

    public final Object LIZLLL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        int i = C2187451AjH.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C637140Oyu(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e1, code lost:
    
        if (((java.lang.Boolean) r3).booleanValue() == false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2238171Cit.LJ(java.lang.String):void");
    }

    public static OutreachBannerDataWrapper LIZJ(n nVar, String str) {
        Object c098200Yq;
        try {
            c098200Yq = (OutreachBannerDataWrapper) C1250210idf.LIZ(nVar.toString(), OutreachBannerDataWrapper.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        OutreachBannerDataWrapper outreachBannerDataWrapper = (OutreachBannerDataWrapper) c098200Yq;
        if (outreachBannerDataWrapper == null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse json error: ");
            sbLIZ.append(outreachBannerDataWrapper);
            C1720106oR.LIZ("ProfileOutreachBanner", C2188811AlT.LIZIZ(sbLIZ));
            C20684815ws.LJFF().execute(new ARunnableS3S2000000_12(str, nVar.toString(), 1));
        }
        return outreachBannerDataWrapper;
    }

    public final void LIZ(FrameLayout frameLayout, UrlModel urlModel) {
        if (urlModel == null) {
            C786410Ut5.LJZ(8, frameLayout);
            return;
        }
        C786410Ut5.LJZ(0, frameLayout);
        SmartImageView smartImageView = new SmartImageView(this.LJFF);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float f = LJIIL;
        C462800ICw.LIZ(smartImageView, new float[]{f, f, f, f});
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.czk);
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.czj);
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LJIIJ(new C19LJ(0));
        frameLayout.addView(smartImageView, new FrameLayout.LayoutParams(LJIIJ, LJIIJJI));
    }

    public C2238171Cit(ViewGroup viewGroup, MyProfileGuideViewModel myProfileGuideViewModel, Lifecycle lifecycle, boolean z) {
        this.LIZ = viewGroup;
        this.LIZIZ = myProfileGuideViewModel;
        this.LIZJ = lifecycle;
        this.LIZLLL = z;
        this.LJFF = viewGroup.getContext();
    }
}
