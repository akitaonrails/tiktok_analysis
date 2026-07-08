package X;

import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.eventtracking.SetPasswordClickNextEvent;
import com.ss.android.ugc.aweme.account.flow.step.bindings.consent.EmailConsentFlowStep;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.BindAccountTextRectifySettings;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.model.Block3pLogoutDetailDTO;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment;
import java.util.List;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853850XeZ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC1237470iJ7 LIZ(String str, final InterfaceC851850XbL interfaceC851850XbL) {
        switch (str.hashCode()) {
            case -1882268860:
                if (!str.equals("verify_password_for_change")) {
                    return null;
                }
                return new C853990Xen(interfaceC851850XbL);
            case -1836701698:
                if (!str.equals("unsafe_env_unbind_email")) {
                    return null;
                }
                return new AbstractC854320XfK(interfaceC851850XbL) { // from class: X.0XfB
                    public final InterfaceC851850XbL LIZ;

                    @Override // X.InterfaceC1237070iIT
                    public final /* bridge */ /* synthetic */ C1237010iIN LJFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "unsafe_env_unbind_email";
                    }

                    @Override // X.InterfaceC1237070iIT
                    public final Fragment getFragment() {
                        return new UnbindConfirmFragment();
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = interfaceC851850XbL;
                    }

                    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
                        int i;
                        if (interfaceC853790XeT instanceof UnbindConfirmFragment.UnbindConfirmActions.ClickContinueAction) {
                            Bundle data = this.LIZ.getData();
                            C854460XfY.LIZ.getClass();
                            List listLIZLLL = C854460XfY.LIZLLL(data);
                            if (listLIZLLL.contains(VerificationMethodType.EMAIL)) {
                                LJIIJ(((UnbindConfirmFragment.UnbindConfirmActions) interfaceC853790XeT).getFragment(), 25, c1237330iIt);
                                return;
                            }
                            VerificationMethodType verificationMethodType = (VerificationMethodType) C13LP.LJJJLL(listLIZLLL);
                            if (verificationMethodType == null) {
                                i = -1;
                            } else {
                                i = C854250XfD.LIZ[verificationMethodType.ordinal()];
                            }
                            if (i == 1) {
                                LJIIJJI(((UnbindConfirmFragment.UnbindConfirmActions) interfaceC853790XeT).getFragment(), c1237330iIt);
                            } else {
                                c1237330iIt.LIZIZ(null, true);
                            }
                        }
                    }
                };
            case -1826678320:
                if (!str.equals("unsafe_env_unbind_phone")) {
                    return null;
                }
                return new AbstractC854320XfK(interfaceC851850XbL) { // from class: X.0XfC
                    public final InterfaceC851850XbL LIZ;

                    @Override // X.InterfaceC1237070iIT
                    public final /* bridge */ /* synthetic */ C1237010iIN LJFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "unsafe_env_unbind_phone";
                    }

                    @Override // X.InterfaceC1237070iIT
                    public final Fragment getFragment() {
                        return new UnbindConfirmFragment();
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = interfaceC851850XbL;
                    }

                    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
                        int i;
                        if (interfaceC853790XeT instanceof UnbindConfirmFragment.UnbindConfirmActions.ClickContinueAction) {
                            Bundle data = this.LIZ.getData();
                            C854460XfY.LIZ.getClass();
                            List listLIZLLL = C854460XfY.LIZLLL(data);
                            if (listLIZLLL.contains(VerificationMethodType.MOBILE)) {
                                LJIIJJI(((UnbindConfirmFragment.UnbindConfirmActions) interfaceC853790XeT).getFragment(), c1237330iIt);
                                return;
                            }
                            VerificationMethodType verificationMethodType = (VerificationMethodType) C13LP.LJJJLL(listLIZLLL);
                            if (verificationMethodType == null) {
                                i = -1;
                            } else {
                                i = C854260XfE.LIZ[verificationMethodType.ordinal()];
                            }
                            if (i == 1) {
                                LJIIJ(((UnbindConfirmFragment.UnbindConfirmActions) interfaceC853790XeT).getFragment(), 25, c1237330iIt);
                            } else {
                                c1237330iIt.LIZIZ(null, true);
                            }
                        }
                    }
                };
            case -1790689093:
                if (!str.equals("pii_verify_phone_for_bind")) {
                    return null;
                }
                return new C853300Xdg(interfaceC851850XbL) { // from class: X.0Xdm
                    public final InterfaceC851850XbL LIZLLL;
                    public final boolean LJ;
                    public final EnumC853370Xdn LJFF;

                    @Override // X.C853300Xdg
                    public final boolean LJIJ() {
                        return false;
                    }

                    @Override // X.C853300Xdg, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_verify_phone_for_bind";
                    }

                    @Override // X.C853300Xdg, X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LJ() {
                        if (Intrinsics.LJFF(this.LIZLLL.getData().getString("origin_enter_flow"), "verify_1p_phone")) {
                            C786410Ut5.LJJJI("enter_flow", "verify_1p_phone", this.LIZLLL.getData());
                        }
                    }

                    @Override // X.C853300Xdg, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.C853300Xdg
                    public final boolean LJIILLIIL() {
                        return this.LJ;
                    }

                    @Override // X.C853300Xdg
                    public final EnumC853370Xdn LJIIZILJ() {
                        return this.LJFF;
                    }

                    {
                        EnumC853370Xdn enumC853370Xdn;
                        super(interfaceC851850XbL);
                        this.LIZLLL = interfaceC851850XbL;
                        this.LJ = true;
                        if (interfaceC851850XbL.getData().containsKey("non1p_binding_type")) {
                            enumC853370Xdn = EnumC853370Xdn.NON1P_BIND_TYPE;
                        } else {
                            enumC853370Xdn = EnumC853370Xdn.PASSPORT_TICKET;
                        }
                        this.LJFF = enumC853370Xdn;
                    }
                };
            case -1637757600:
                if (!str.equals("verify_phone_for_unbind_email")) {
                    return null;
                }
                return new C853840XeY(interfaceC851850XbL);
            case -1627734222:
                if (!str.equals("verify_phone_for_unbind_phone")) {
                    return null;
                }
                return new C853810XeV(interfaceC851850XbL);
            case -1563007925:
                if (!str.equals("input_email_for_bind")) {
                    return null;
                }
                return new C853210XdX(interfaceC851850XbL);
            case -1532972918:
                if (!str.equals("pii_input_phone")) {
                    return null;
                }
                return new C1237940iJs(interfaceC851850XbL);
            case -1189482425:
                if (!str.equals("verify_email_before_change")) {
                    return null;
                }
                return new C853490Xdz(interfaceC851850XbL);
            case -1129747349:
                if (!str.equals("pii_verify_email_code_for_bind_ppt_only")) {
                    return null;
                }
                return new C853280Xde(interfaceC851850XbL) { // from class: X.0Xdv
                    public final InterfaceC851850XbL LIZLLL;

                    @Override // X.C853280Xde
                    public final boolean LJI() {
                        return false;
                    }

                    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_verify_email_code_for_bind_ppt_only";
                    }

                    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
                    public final void LJ() {
                        if (Intrinsics.LJFF(this.LIZLLL.getData().getString("origin_enter_flow"), "verify_1p_email")) {
                            C786410Ut5.LJJJI("enter_flow", "verify_1p_email", this.LIZLLL.getData());
                        }
                    }

                    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZLLL;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZLLL = interfaceC851850XbL;
                    }
                };
            case -992345507:
                if (!str.equals("verify_phone_for_change")) {
                    return null;
                }
                return new C1237180iIe(interfaceC851850XbL);
            case -965795598:
                if (!str.equals("verify_email_for_unbind_email")) {
                    return null;
                }
                return new C853820XeW(interfaceC851850XbL);
            case -955772220:
                if (!str.equals("verify_email_for_unbind_phone")) {
                    return null;
                }
                return new C853830XeX(interfaceC851850XbL);
            case -597365513:
                if (!str.equals("safe_env_unbind_email")) {
                    return null;
                }
                return new AbstractC854320XfK(interfaceC851850XbL) { // from class: X.0Xf5
                    public final InterfaceC851850XbL LIZ;

                    @Override // X.InterfaceC1237070iIT
                    public final C1237010iIN LJFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "safe_env_unbind_email";
                    }

                    @Override // X.InterfaceC1237070iIT
                    public final Fragment getFragment() {
                        return new UnbindConfirmFragment();
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = interfaceC851850XbL;
                    }

                    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
                        if (interfaceC853790XeT instanceof UnbindConfirmFragment.UnbindConfirmActions.ClickContinueAction) {
                            C854460XfY c854460XfY = C854460XfY.LIZ;
                            BaseAccountFlowFragment fragment = ((UnbindConfirmFragment.UnbindConfirmActions) interfaceC853790XeT).getFragment();
                            AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13(this, c1237330iIt, 9);
                            c854460XfY.getClass();
                            C854460XfY.LIZIZ(fragment, awS379S0200000_13);
                        }
                    }
                };
            case -587342135:
                if (!str.equals("safe_env_unbind_phone")) {
                    return null;
                }
                return new AbstractC854320XfK(interfaceC851850XbL) { // from class: X.0Xf6
                    public final InterfaceC851850XbL LIZ;

                    @Override // X.InterfaceC1237070iIT
                    public final C1237010iIN LJFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "safe_env_unbind_phone";
                    }

                    @Override // X.InterfaceC1237070iIT
                    public final Fragment getFragment() {
                        return new UnbindConfirmFragment();
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = interfaceC851850XbL;
                    }

                    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
                        if (interfaceC853790XeT instanceof UnbindConfirmFragment.UnbindConfirmActions.ClickContinueAction) {
                            C854460XfY c854460XfY = C854460XfY.LIZ;
                            BaseAccountFlowFragment fragment = ((UnbindConfirmFragment.UnbindConfirmActions) interfaceC853790XeT).getFragment();
                            AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13(this, c1237330iIt, 10);
                            c854460XfY.getClass();
                            C854460XfY.LIZJ(fragment, awS379S0200000_13);
                        }
                    }
                };
            case -484489651:
                if (!str.equals("pii_verify_email_for_bind")) {
                    return null;
                }
                return new C853430Xdt(interfaceC851850XbL);
            case -84282901:
                if (!str.equals("enter_phone_for_bind")) {
                    return null;
                }
                return new C853580Xe8(interfaceC851850XbL);
            case 159832618:
                if (!str.equals("verify_phone_for_bind")) {
                    return null;
                }
                return new C853300Xdg(interfaceC851850XbL);
            case 163530718:
                if (!str.equals("pii_verify_email_code_for_change")) {
                    return null;
                }
                return new C853120XdO(interfaceC851850XbL) { // from class: X.0Xdw
                    public final InterfaceC851850XbL LIZIZ;

                    @Override // X.C853120XdO
                    public final void LIZJ() {
                    }

                    @Override // X.C853120XdO, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_verify_email_code_for_change";
                    }

                    @Override // X.C853120XdO, X.InterfaceC1237470iJ7
                    public final void LJ() {
                        if (Intrinsics.LJFF(this.LIZIZ.getData().getString("origin_enter_flow"), "verify_1p_email")) {
                            C786410Ut5.LJJJI("enter_flow", "change_email", this.LIZIZ.getData());
                        }
                    }

                    @Override // X.C853120XdO, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZIZ = interfaceC851850XbL;
                    }
                };
            case 238059484:
                if (!str.equals("verify_email_code_for_bind")) {
                    return null;
                }
                return new C853280Xde(interfaceC851850XbL);
            case 469491702:
                if (!str.equals("skippable_pii_input_phone")) {
                    return null;
                }
                return new C1237940iJs(interfaceC851850XbL) { // from class: X.0iJw
                    public final InterfaceC851850XbL LIZIZ;

                    @Override // X.C1237940iJs, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "skippable_pii_input_phone";
                    }

                    @Override // X.C1237940iJs, X.InterfaceC1237070iIT
                    public final C1237010iIN LJFF() {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        C1237010iIN c1237010iINLJFF = super.LJFF();
                        c1237010iINLJFF.LJIIIIZZ = contextLIZ.getString(2131830567);
                        c1237010iINLJFF.LJIIIZ = BindAccountTextRectifySettings.LIZ().loginAndLogoutRectify ? contextLIZ.getString(2131850230, AbstractC1237950iJt.LJI(contextLIZ)) : contextLIZ.getString(2131830560);
                        c1237010iINLJFF.LJIIZILJ = contextLIZ.getString(2131830565);
                        return c1237010iINLJFF;
                    }

                    @Override // X.C1237940iJs, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZIZ = interfaceC851850XbL;
                    }
                };
            case 541732413:
                if (!str.equals("skippable_pii_bind_email")) {
                    return null;
                }
                return new C1237920iJq(interfaceC851850XbL) { // from class: X.0iJx
                    public final InterfaceC851850XbL LIZIZ;

                    @Override // X.C1237920iJq, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "skippable_pii_bind_email";
                    }

                    @Override // X.C1237920iJq, X.InterfaceC1237070iIT
                    public final C1237010iIN LJFF() {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        C1237010iIN c1237010iINLJFF = super.LJFF();
                        c1237010iINLJFF.LJIIIZ = BindAccountTextRectifySettings.LIZ().loginAndLogoutRectify ? contextLIZ.getString(2131850230, AbstractC1237950iJt.LJI(contextLIZ)) : contextLIZ.getString(2131830563);
                        c1237010iINLJFF.LJIIZILJ = contextLIZ.getString(2131830565);
                        return c1237010iINLJFF;
                    }

                    @Override // X.C1237920iJq, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZIZ = interfaceC851850XbL;
                    }
                };
            case 551755791:
                if (!str.equals("skippable_pii_bind_phone")) {
                    return null;
                }
                return new C1237930iJr(interfaceC851850XbL) { // from class: X.0iJy
                    public final InterfaceC851850XbL LIZIZ;

                    @Override // X.C1237930iJr, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "skippable_pii_bind_phone";
                    }

                    @Override // X.C1237930iJr, X.InterfaceC1237070iIT
                    public final C1237010iIN LJFF() {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        C1237010iIN c1237010iINLJFF = super.LJFF();
                        c1237010iINLJFF.LJIIIZ = BindAccountTextRectifySettings.LIZ().loginAndLogoutRectify ? contextLIZ.getString(2131850230, AbstractC1237950iJt.LJI(contextLIZ)) : contextLIZ.getString(2131830566);
                        c1237010iINLJFF.LJIIZILJ = contextLIZ.getString(2131830565);
                        return c1237010iINLJFF;
                    }

                    @Override // X.C1237930iJr, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZIZ = interfaceC851850XbL;
                    }
                };
            case 729376666:
                if (!str.equals("pii_input_email_for_bind")) {
                    return null;
                }
                return new C853210XdX(interfaceC851850XbL) { // from class: X.0Xep
                    public final InterfaceC851850XbL LIZIZ;

                    @Override // X.C853210XdX
                    public final boolean LJIILL() {
                        return false;
                    }

                    @Override // X.C853210XdX, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_input_email_for_bind";
                    }

                    @Override // X.C853210XdX, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZIZ = interfaceC851850XbL;
                    }
                };
            case 878638029:
                if (!str.equals("pii_input_email_for_change")) {
                    return null;
                }
                return new C853150XdR(interfaceC851850XbL) { // from class: X.0Xeq
                    public final InterfaceC851850XbL LIZIZ;

                    @Override // X.C853150XdR
                    public final void LJIILLIIL() {
                    }

                    @Override // X.C853150XdR, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_input_email_for_change";
                    }

                    @Override // X.C853150XdR, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZIZ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZIZ = interfaceC851850XbL;
                    }
                };
            case 1169228687:
                if (!str.equals("verify_email_code_for_change")) {
                    return null;
                }
                return new C853120XdO(interfaceC851850XbL);
            case 1215268926:
                if (!str.equals("input_email_for_change")) {
                    return null;
                }
                return new C853150XdR(interfaceC851850XbL);
            case 1329682039:
                if (!str.equals("email_consent")) {
                    return null;
                }
                return new EmailConsentFlowStep(interfaceC851850XbL);
            case 1446968105:
                if (!str.equals("pii_bind_email")) {
                    return null;
                }
                return new C1237920iJq(interfaceC851850XbL);
            case 1448184811:
                if (!str.equals("pii_verify_email_code_for_bind")) {
                    return null;
                }
                return new C853280Xde(interfaceC851850XbL) { // from class: X.0Xdo
                    public final InterfaceC851850XbL LIZLLL;
                    public final EnumC853370Xdn LJ;

                    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_verify_email_code_for_bind";
                    }

                    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
                    public final void LJ() {
                        if (Intrinsics.LJFF(this.LIZLLL.getData().getString("origin_enter_flow"), "verify_1p_phone")) {
                            C786410Ut5.LJJJI("enter_flow", "switch_to_email", this.LIZLLL.getData());
                        }
                    }

                    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.C853280Xde
                    public final EnumC853370Xdn LIZJ() {
                        return this.LJ;
                    }

                    {
                        super(interfaceC851850XbL);
                        this.LIZLLL = interfaceC851850XbL;
                        this.LJ = EnumC853370Xdn.NONE;
                    }
                };
            case 1456991483:
                if (!str.equals("pii_bind_phone")) {
                    return null;
                }
                return new C1237930iJr(interfaceC851850XbL);
            case 1456998574:
                if (!str.equals("pii_verify_phone_for_change")) {
                    return null;
                }
                return new C853300Xdg(interfaceC851850XbL) { // from class: X.0Xdl
                    public final InterfaceC851850XbL LIZLLL;
                    public final boolean LJ;
                    public final boolean LJFF;
                    public final EnumC853370Xdn LJI;

                    @Override // X.C853300Xdg, X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "pii_verify_phone_for_change";
                    }

                    @Override // X.C853300Xdg, X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LJ() {
                        if (Intrinsics.LJFF(this.LIZLLL.getData().getString("origin_enter_flow"), "verify_1p_email")) {
                            C786410Ut5.LJJJI("enter_flow", "switch_to_phone", this.LIZLLL.getData());
                        } else if (Intrinsics.LJFF(this.LIZLLL.getData().getString("origin_enter_flow"), "verify_1p_phone")) {
                            C786410Ut5.LJJJI("enter_flow", "change_phone", this.LIZLLL.getData());
                        }
                    }

                    @Override // X.C853300Xdg, X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.C853300Xdg
                    public final boolean LJIILLIIL() {
                        return this.LJ;
                    }

                    @Override // X.C853300Xdg
                    public final EnumC853370Xdn LJIIZILJ() {
                        return this.LJI;
                    }

                    @Override // X.C853300Xdg
                    public final boolean LJIJ() {
                        return this.LJFF;
                    }

                    {
                        EnumC853370Xdn enumC853370Xdn;
                        super(interfaceC851850XbL);
                        this.LIZLLL = interfaceC851850XbL;
                        this.LJ = true;
                        this.LJFF = true;
                        if (interfaceC851850XbL.getData().getSerializable("pii_type") == Block3pLogoutDetailDTO.PiiType.MOBILE) {
                            enumC853370Xdn = EnumC853370Xdn.PASSPORT_TICKET;
                        } else {
                            enumC853370Xdn = EnumC853370Xdn.NONE;
                        }
                        this.LJI = enumC853370Xdn;
                    }
                };
            case 1611930887:
                if (!str.equals("verify_password_for_unbind_email")) {
                    return null;
                }
                return new C853970Xel(interfaceC851850XbL);
            case 1621954265:
                if (!str.equals("verify_password_for_unbind_phone")) {
                    return null;
                }
                return new C853980Xem(interfaceC851850XbL);
            case 2133370494:
                if (!str.equals("create_password")) {
                    return null;
                }
                return new AbstractC854320XfK(interfaceC851850XbL) { // from class: X.0XcJ
                    public final InterfaceC851850XbL LIZ;

                    @Override // X.InterfaceC1237470iJ7
                    public final String getId() {
                        return "create_password";
                    }

                    @Override // X.InterfaceC1237070iIT
                    public final C1237010iIN LJFF() {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
                        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131829354);
                        c1237010iIN.LIZ = " ";
                        c1237010iIN.LJIIL = false;
                        c1237010iIN.LJIIJ = true;
                        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
                        return c1237010iIN;
                    }

                    @Override // X.InterfaceC1237070iIT
                    public final Fragment getFragment() {
                        return new BaseUpdatePasswordFragment();
                    }

                    @Override // X.InterfaceC1237470iJ7
                    public final InterfaceC851850XbL LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = interfaceC851850XbL;
                    }

                    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
                    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
                        if (interfaceC853790XeT instanceof BaseUpdatePasswordFragment.CreatePasswordActions.CreatePasswordClickAction) {
                            SetPasswordClickNextEvent setPasswordClickNextEvent = new SetPasswordClickNextEvent();
                            BaseUpdatePasswordFragment.CreatePasswordActions.CreatePasswordClickAction createPasswordClickAction = (BaseUpdatePasswordFragment.CreatePasswordActions.CreatePasswordClickAction) interfaceC853790XeT;
                            setPasswordClickNextEvent.LJI(createPasswordClickAction.getFragment().RR(), "page");
                            setPasswordClickNextEvent.LJI(createPasswordClickAction.getFragment().getEnterFrom(), "enter_from");
                            setPasswordClickNextEvent.LJI(createPasswordClickAction.getFragment().getEnterMethod(), "enter_method");
                            setPasswordClickNextEvent.LJIIIIZZ();
                            C852460XcK params = createPasswordClickAction.getParams();
                            C0XZ4 c0xz4 = C0XZ4.LIZ;
                            BaseI18nLoginFragment fragment = createPasswordClickAction.getFragment();
                            BaseI18nLoginFragment fragment2 = createPasswordClickAction.getFragment();
                            String str2 = params.LIZ;
                            EnumC851500Xam.Companion.getClass();
                            String value = EnumC851500Xam.ruleStrategies$delegate.getValue();
                            c0xz4.getClass();
                            C0XZ4.LJJIJIL(fragment, fragment2, str2, value, null).LJIIIIZZ(new AfS149S0200000_13(c1237330iIt, params, 14)).LJII(new AfS182S0100000_13(c1237330iIt, 73)).LJIILL();
                        }
                    }
                };
            default:
                return null;
        }
    }
}
