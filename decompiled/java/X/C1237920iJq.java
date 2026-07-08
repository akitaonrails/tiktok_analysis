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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1237920iJq extends AbstractC1237950iJt {
    public final InterfaceC851850XbL LIZ;

    @Override // X.InterfaceC1237470iJ7
    public final void LJ() {
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return "pii_bind_email";
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZLLL() {
        LJIIIIZZ(EnumC1237960iJu.VERIFY_EMAIL);
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
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJFF = !LIZ().getData().getBoolean("prevent_back");
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        if (ThirdPartyDeprecationExperiment5.LJ()) {
            if (!data.getBoolean("from_logout")) {
                string = contextLIZ.getString(2131836808);
            } else if (logoutPopupConfig == null || (string = logoutPopupConfig.title) == null) {
                string = contextLIZ.getString(2131836819);
            }
        } else if (logoutPopupConfig == null || (string = logoutPopupConfig.title) == null) {
            string = contextLIZ.getString(2131830564);
        }
        c1237010iIN.LJIIIIZZ = string;
        String string2 = ThirdPartyDeprecationExperiment5.LJ() ? contextLIZ.getString(2131836803, AbstractC1237950iJt.LJI(contextLIZ), LIZJ(contextLIZ)) : contextLIZ.getString(2131830563);
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
        c1237010iIN.LJIILLIIL = Integer.valueOf(R.drawable.pc);
        c1237010iIN.LJIIZILJ = ThirdPartyDeprecationExperiment5.LJ() ? contextLIZ.getString(2131836809) : contextLIZ.getString(2131830565);
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

    public C1237920iJq(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        int i;
        if (interfaceC853790XeT instanceof PIIBindPromptFragment.PIIBindPromptActions.PrimaryButtonClickAction) {
            LJII(EnumC1237960iJu.VERIFY_EMAIL, EnumC1237970iJv.CONTINUE);
            if (Intrinsics.LJFF(LIZ().getData().getString("source"), "unverified_1p")) {
                i = 6;
            } else {
                i = 8;
            }
            C854460XfY c854460XfY = C854460XfY.LIZ;
            PIIBindPromptFragment.PIIBindPromptActions pIIBindPromptActions = (PIIBindPromptFragment.PIIBindPromptActions) interfaceC853790XeT;
            BaseI18nLoginFragment fragment = pIIBindPromptActions.getFragment();
            c854460XfY.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C854460XfY.LJIIIZ(fragment));
            linkedHashMap.putAll(C854460XfY.LJIIJJI(pIIBindPromptActions.getFragment()));
            C0XZ4.LJJIII(C0XZ4.LIZ, pIIBindPromptActions.getFragment(), pIIBindPromptActions.getFragment(), "", i, "user_click", linkedHashMap, null, null, null, null, 960).LJIIIIZZ(new AfS155S0200000_19(this, c1237330iIt, 12)).LJII(new AfS188S0100000_19(c1237330iIt, 66)).LJIILL();
            return;
        }
        if (interfaceC853790XeT instanceof PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction) {
            LJII(EnumC1237960iJu.VERIFY_EMAIL, EnumC1237970iJv.CHANGE);
            LIZ().getData().remove("args_email");
            c1237330iIt.LIZIZ(null, true);
        } else {
            if (!(interfaceC853790XeT instanceof PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction)) {
                return;
            }
            LJII(EnumC1237960iJu.VERIFY_EMAIL, EnumC1237970iJv.CHANGE);
            LIZ().getData().remove("args_email");
            c1237330iIt.LIZIZ(null, true);
        }
    }
}
