package X;

import Y.AfS155S0200000_19;
import Y.AfS188S0100000_19;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.model.LogoutPopupConfig;
import com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0iJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1237930iJr extends AbstractC1237950iJt {
    public final InterfaceC851850XbL LIZ;

    @Override // X.InterfaceC1237470iJ7
    public final void LJ() {
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return "pii_bind_phone";
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZLLL() {
        LJIIIIZZ(EnumC1237960iJu.VERIFY_PHONE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // X.InterfaceC1237070iIT
    public C1237010iIN LJFF() {
        LogoutPopupConfig logoutPopupConfig;
        String string;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = LIZ().getData();
        if (Build.VERSION.SDK_INT >= 33) {
            logoutPopupConfig = (LogoutPopupConfig) data.getSerializable("popup_config", LogoutPopupConfig.class);
        } else {
            Serializable serializable = data.getSerializable("popup_config");
            logoutPopupConfig = serializable instanceof LogoutPopupConfig ? (LogoutPopupConfig) serializable : null;
        }
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJFF = true;
        c1237010iIN.LJFF = !LIZ().getData().getBoolean("prevent_back");
        c1237010iIN.LIZ = " ";
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        if (ThirdPartyDeprecationExperiment5.LJ()) {
            if (!data.getBoolean("from_logout")) {
                string = contextLIZ.getString(2131836813);
            } else if (logoutPopupConfig == null || (string = logoutPopupConfig.title) == null) {
                string = contextLIZ.getString(2131836820);
            }
        } else if (logoutPopupConfig == null || (string = logoutPopupConfig.title) == null) {
            string = contextLIZ.getString(2131830567);
        }
        c1237010iIN.LJIIIIZZ = string;
        String string2 = ThirdPartyDeprecationExperiment5.LJ() ? contextLIZ.getString(2131836802, AbstractC1237950iJt.LJI(contextLIZ), LIZJ(contextLIZ)) : contextLIZ.getString(2131830566);
        String str = logoutPopupConfig != null ? logoutPopupConfig.description : null;
        ?? LIZIZ = string2;
        LIZIZ = string2;
        if (C123100dR.LIZ(str) && str != null) {
            LIZIZ = str;
        }
        if (logoutPopupConfig != null && logoutPopupConfig.shouldShowLearnMore) {
            LIZIZ = C1239020iLc.LIZIZ(contextLIZ, LIZIZ, 0, null, 28);
        }
        c1237010iIN.LJIIIZ = LIZIZ;
        c1237010iIN.LJIILLIIL = Integer.valueOf(R.drawable.rc);
        c1237010iIN.LJIIZILJ = ThirdPartyDeprecationExperiment5.LJ() ? contextLIZ.getString(2131836811) : contextLIZ.getString(2131830565);
        c1237010iIN.LJIIL = ThirdPartyDeprecationExperiment5.LJ();
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new PIIBindPromptFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public C1237930iJr(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof PIIBindPromptFragment.PIIBindPromptActions.PrimaryButtonClickAction) {
            LJII(EnumC1237960iJu.VERIFY_PHONE, EnumC1237970iJv.CONTINUE);
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            PIIBindPromptFragment.PIIBindPromptActions pIIBindPromptActions = (PIIBindPromptFragment.PIIBindPromptActions) interfaceC853790XeT;
            BaseI18nLoginFragment fragment = pIIBindPromptActions.getFragment();
            BaseI18nLoginFragment fragment2 = pIIBindPromptActions.getFragment();
            EnumC852660Xce enumC852660XceSR = pIIBindPromptActions.getFragment().SR();
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.INPUT_PHONE_BIND;
            String strRR = pIIBindPromptActions.getFragment().RR();
            C854460XfY c854460XfY = C854460XfY.LIZ;
            BaseI18nLoginFragment fragment3 = pIIBindPromptActions.getFragment();
            c854460XfY.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C854460XfY.LJIIIZ(fragment3));
            linkedHashMap.putAll(C854460XfY.LJIIJJI(pIIBindPromptActions.getFragment()));
            C0XZ4.LJJ(c0xz4, fragment, fragment2, "", enumC852660XceSR, enumC852910Xd3, "", "", "user_click", "phone", strRR, 8, linkedHashMap, 256).LJIIIIZZ(new AfS155S0200000_19(this, c1237330iIt, 13)).LJII(new AfS188S0100000_19(c1237330iIt, 67)).LJIILL();
            return;
        }
        if (interfaceC853790XeT instanceof PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction) {
            LJII(EnumC1237960iJu.VERIFY_PHONE, EnumC1237970iJv.CHANGE);
            c1237330iIt.LIZIZ(null, true);
        } else {
            if (!(interfaceC853790XeT instanceof PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction)) {
                return;
            }
            LJII(EnumC1237960iJu.VERIFY_PHONE, EnumC1237970iJv.CHANGE);
            c1237330iIt.LIZIZ(null, true);
        }
    }
}
