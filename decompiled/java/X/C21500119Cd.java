package X;

import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService;

/* JADX INFO: renamed from: X.19Cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21500119Cd extends C19D2 {
    public final C01GW LLILLL = C452501pT.LIZIZ(new C21500219Ce());

    public final IComplianceFeatureService LJIJ() {
        return (IComplianceFeatureService) this.LLILLL.getValue();
    }

    @Override // X.C19DE, X.InterfaceC21503119Dh
    public final void LJJIJL(BaseActivity baseActivity) {
        IComplianceFeatureService iComplianceFeatureServiceLJIJ;
        IComplianceFeatureService iComplianceFeatureServiceLJIJ2;
        View viewFindViewById = baseActivity.findViewById(R.id.content);
        if (viewFindViewById != null && (iComplianceFeatureServiceLJIJ2 = LJIJ()) != null) {
            iComplianceFeatureServiceLJIJ2.triggerComplianceCheck(viewFindViewById, "general_compliance_enforcement", baseActivity);
        }
        InterfaceC21500319Cf interfaceC21500319Cf = (InterfaceC21500319Cf) baseActivity.getClass().getAnnotation(InterfaceC21500319Cf.class);
        if (interfaceC21500319Cf != null) {
            String strFeatureKey = interfaceC21500319Cf.featureKey();
            if (C123100dR.LIZ(strFeatureKey)) {
                if (viewFindViewById != null && (iComplianceFeatureServiceLJIJ = LJIJ()) != null) {
                    iComplianceFeatureServiceLJIJ.triggerComplianceCheck(viewFindViewById, strFeatureKey, baseActivity);
                }
                C1440005kM.LIZ(new C1916770zyl(strFeatureKey));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
    public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
        super.LJJIIZI(baseActivity, bundle);
        baseActivity.getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.19Cc
            @Override // X.AbstractC813200VvC
            public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                AbstractC1387200mCc abstractC1387200mCcLJ;
                View viewLJI;
                View viewLJI2;
                IComplianceFeatureService iComplianceFeatureServiceLJIJ;
                super.onFragmentResumed(fragmentManager, fragment);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "compliance_check_on_fragment_resumed", true, false)) {
                    AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ2 != null && (viewLJI2 = abstractC1387200mCcLJ2.LJI()) != null && (iComplianceFeatureServiceLJIJ = this.LL.LJIJ()) != null) {
                        iComplianceFeatureServiceLJIJ.triggerComplianceCheck(viewLJI2, "general_compliance_enforcement", fragment);
                    }
                    InterfaceC21500319Cf interfaceC21500319Cf = (InterfaceC21500319Cf) fragment.getClass().getAnnotation(InterfaceC21500319Cf.class);
                    if (interfaceC21500319Cf != null) {
                        C21500119Cd c21500119Cd = this.LL;
                        String strFeatureKey = interfaceC21500319Cf.featureKey();
                        if (C123100dR.LIZ(strFeatureKey) && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (viewLJI = abstractC1387200mCcLJ.LJI()) != null) {
                            IComplianceFeatureService iComplianceFeatureServiceLJIJ2 = c21500119Cd.LJIJ();
                            if (iComplianceFeatureServiceLJIJ2 != null) {
                                iComplianceFeatureServiceLJIJ2.triggerComplianceCheck(viewLJI, strFeatureKey, fragment);
                            }
                            C1440005kM.LIZ(new C1916770zyl(strFeatureKey));
                        }
                    }
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle2) {
                super.onFragmentViewCreated(fragmentManager, fragment, view, bundle2);
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "compliance_check_on_fragment_resumed", true, false)) {
                    IComplianceFeatureService iComplianceFeatureServiceLJIJ = this.LL.LJIJ();
                    if (iComplianceFeatureServiceLJIJ != null) {
                        iComplianceFeatureServiceLJIJ.triggerComplianceCheck(view, "general_compliance_enforcement", fragment);
                    }
                    InterfaceC21500319Cf interfaceC21500319Cf = (InterfaceC21500319Cf) fragment.getClass().getAnnotation(InterfaceC21500319Cf.class);
                    if (interfaceC21500319Cf != null) {
                        C21500119Cd c21500119Cd = this.LL;
                        String strFeatureKey = interfaceC21500319Cf.featureKey();
                        if (C123100dR.LIZ(strFeatureKey)) {
                            IComplianceFeatureService iComplianceFeatureServiceLJIJ2 = c21500119Cd.LJIJ();
                            if (iComplianceFeatureServiceLJIJ2 != null) {
                                iComplianceFeatureServiceLJIJ2.triggerComplianceCheck(view, strFeatureKey, fragment);
                            }
                            C1440005kM.LIZ(new C1916770zyl(strFeatureKey));
                        }
                    }
                }
            }
        }, true);
        if (!C294780Bgy.LIZ() ? !(!(baseActivity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) baseActivity).getEnableSAF()) : (baseActivity instanceof InterfaceC214897198d)) {
            ((InterfaceC20622815ms) baseActivity).getAbility().LIZIZ(new C21499819Ca(baseActivity));
        }
        IComplianceFeatureService iComplianceFeatureServiceLJIJ = LJIJ();
        if (iComplianceFeatureServiceLJIJ != null) {
            iComplianceFeatureServiceLJIJ.LIZ();
        }
    }
}
