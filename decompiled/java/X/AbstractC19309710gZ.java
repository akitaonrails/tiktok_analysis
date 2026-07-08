package X;

import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.IUnifiedAccountSdkConfigService;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.InlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import u4.q0;

/* JADX INFO: renamed from: X.10gZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19309710gZ {
    public final InterfaceC19312510h1 LIZ;
    public final BaseActivity LIZIZ;
    public final View LIZJ;
    public final List<C1687890u1b> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1116));
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public C19310510gh LJIIJ;
    public boolean LJIIJJI;
    public C19309810ga LJIIL;

    public final C19310510gh LIZ() {
        C19310510gh c19310510gh = this.LJIIJ;
        if (c19310510gh != null) {
            return c19310510gh;
        }
        return null;
    }

    public final RecyclerView LIZIZ() {
        return (RecyclerView) this.LJII.getValue();
    }

    public final SignupViewModel LIZJ() {
        return (SignupViewModel) this.LJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0uQo, X.10ga] */
    public final void LIZLLL() {
        LiveData<? extends C1238730iL9> liveDataLJI;
        TextView textView = (TextView) this.LJIIIZ.getValue();
        q0.LJ(textView);
        textView.setMovementMethod(C431300Gvg.LIZ());
        LJII();
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        if (C1207404nw.LIZ()) {
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService == null || (liveDataLJI = iPNSChangeRegionService.LJI()) == null) {
                return;
            }
            liveDataLJI.observe(this.LIZIZ, new AObserverS230S0100000_28((ViewPagerLoginView) this, 117));
            return;
        }
        final ViewPagerLoginView viewPagerLoginView = (ViewPagerLoginView) this;
        ?? r1 = new InterfaceC1703520uQo() { // from class: X.10ga
            @Override // X.InterfaceC1703520uQo
            public final void LIZ(Country country) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewPagerLoginView.LIZIZ), null, null, new C13062059g(viewPagerLoginView, null), 3);
            }
        };
        this.LJIIL = r1;
        IPNSChangeRegionService iPNSChangeRegionService2 = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        if (iPNSChangeRegionService2 != 0) {
            iPNSChangeRegionService2.LJIIIIZZ(r1);
        }
    }

    public final void LJII() {
        int iLJFF;
        IUnifiedAccountSdkConfigService iUnifiedAccountSdkConfigService;
        C1868550yiz unifiedLoginPanelConfig;
        C1868540yiy c1868540yiy;
        String str;
        IUnifiedAccountSdkConfigService iUnifiedAccountSdkConfigService2;
        C1868550yiz unifiedLoginPanelConfig2;
        C1868540yiy c1868540yiy2;
        TextWithInlineLink textWithInlineLinkLJIIIIZZ;
        String strLJFF;
        TextView textView = (TextView) this.LJIIIZ.getValue();
        String str2 = "";
        if (C294580Bge.LIZ()) {
            IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
            CharSequence charSequenceLIZ = null;
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                if (iPNSChangeRegionService == null || !iPNSChangeRegionService.LJIIJJI()) {
                    textWithInlineLinkLJIIIIZZ = iPNSConsentConfigServiceLJIIIZ.LJIIIIZZ();
                } else {
                    textWithInlineLinkLJIIIIZZ = iPNSConsentConfigServiceLJIIIZ.LIZIZ();
                    if (textWithInlineLinkLJIIIIZZ != null) {
                        if (iPNSChangeRegionService == null || (strLJFF = iPNSChangeRegionService.LJFF()) == null) {
                            strLJFF = "";
                        }
                        if (strLJFF.length() != 0) {
                            List listSingletonList = Collections.singletonList(new InlineLink(strLJFF, "aweme://change_region"));
                            Iterable iterable = textWithInlineLinkLJIIIIZZ.links;
                            if (iterable == null) {
                                iterable = C13BV.INSTANCE;
                            }
                            textWithInlineLinkLJIIIIZZ = textWithInlineLinkLJIIIIZZ.copy(textWithInlineLinkLJIIIIZZ.text, C13LP.LJLIL(iterable, listSingletonList));
                        }
                        charSequenceLIZ = iPNSConsentConfigServiceLJIIIZ.LIZ(this.LIZIZ, textWithInlineLinkLJIIIIZZ, EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue(), C960203pA.LIZ(R.attr.a1n, this.LIZIZ), 0);
                    }
                }
                if (textWithInlineLinkLJIIIIZZ != null) {
                    charSequenceLIZ = iPNSConsentConfigServiceLJIIIZ.LIZ(this.LIZIZ, textWithInlineLinkLJIIIIZZ, EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue(), C960203pA.LIZ(R.attr.a1n, this.LIZIZ), 0);
                }
            }
            if (charSequenceLIZ != null) {
                if (iPNSConsentConfigServiceLJIIIZ != null) {
                    iPNSConsentConfigServiceLJIIIZ.LIZLLL("consent_label");
                }
                textView.setText(charSequenceLIZ);
                textView.setMovementMethod(C431300Gvg.LIZ());
                q0.LJ(textView);
                return;
            }
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                iPNSConsentConfigServiceLJIIIZ.LJIIIZ("consent_label");
            }
        }
        BaseActivity baseActivity = this.LIZIZ;
        ACListenerS162S0100000_28 aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 219);
        ACListenerS162S0100000_28 aCListenerS162S0100000_282 = new ACListenerS162S0100000_28(this, 220);
        ACListenerS162S0100000_28 aCListenerS162S0100000_283 = new ACListenerS162S0100000_28(this, 221);
        if (!C294020Bfk.LIZ() || (iUnifiedAccountSdkConfigService2 = (IUnifiedAccountSdkConfigService) PluggableExtentionKt.pluggableSpi$default(IUnifiedAccountSdkConfigService.class, false, false, false, 14, null)) == null || (unifiedLoginPanelConfig2 = iUnifiedAccountSdkConfigService2.getUnifiedLoginPanelConfig(this.LIZIZ)) == null || (c1868540yiy2 = unifiedLoginPanelConfig2.LIZ) == null || (iLJFF = c1868540yiy2.LIZ) == 0) {
            if (C19293810e0.LJIIL()) {
                iLJFF = 2131857295;
            } else {
                IPNSChangeRegionService iPNSChangeRegionService2 = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                iLJFF = ((iPNSChangeRegionService2 == null || !iPNSChangeRegionService2.LJIIJJI()) && LIZJ().xQ2()) ? C19293810e0.LJIIIZ() ? 2131850089 : 2131850090 : C19293810e0.LJFF();
            }
        }
        String value = EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue();
        boolean zPQ2 = LIZJ().PQ2();
        if (C294020Bfk.LIZ() && (iUnifiedAccountSdkConfigService = (IUnifiedAccountSdkConfigService) PluggableExtentionKt.pluggableSpi$default(IUnifiedAccountSdkConfigService.class, false, false, false, 14, null)) != null && (unifiedLoginPanelConfig = iUnifiedAccountSdkConfigService.getUnifiedLoginPanelConfig(this.LIZIZ)) != null && (c1868540yiy = unifiedLoginPanelConfig.LIZ) != null && (str = c1868540yiy.LIZJ) != null) {
            str2 = str;
        }
        C19293810e0.LIZ(baseActivity, textView, aCListenerS162S0100000_28, aCListenerS162S0100000_282, aCListenerS162S0100000_283, iLJFF, value, zPQ2, str2);
        q0.LJ(textView);
    }

    public final void LJFF() {
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
        if (!C294580Bge.LIZ() || iPNSConsentConfigServiceLJIIIZ == null) {
            LJII();
        } else {
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            iPNSConsentConfigServiceLJIIIZ.LJ(iPNSChangeRegionService != null ? iPNSChangeRegionService.getStoreRegion() : null, new AwS607S0100000_28(this, 406));
        }
    }

    public void LJI() {
        LIZIZ().scrollToPosition(0);
    }

    public final void LJ(String str) {
        String upperCase;
        String storeRegion;
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            String value = EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue();
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService != null && (storeRegion = iPNSChangeRegionService.getStoreRegion()) != null) {
                upperCase = storeRegion.toUpperCase(Locale.ROOT);
            } else {
                upperCase = null;
            }
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(value, str, false, true, true, upperCase, C960203pA.LIZIZ(this.LIZIZ), 4), new InterfaceC1913620ztg() { // from class: X.10gb
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC19309710gZ(InterfaceC19312510h1 interfaceC19312510h1, BaseActivity baseActivity, View view, List<? extends C1687890u1b> list) {
        this.LIZ = interfaceC19312510h1;
        this.LIZIZ = baseActivity;
        this.LIZJ = view;
        this.LIZLLL = list;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 1118));
        this.LJI = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 1117));
        this.LJII = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 1115));
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 1120));
        this.LJIIIZ = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 1119));
    }
}
