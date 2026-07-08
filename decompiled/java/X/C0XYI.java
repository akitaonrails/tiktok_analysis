package X;

import Y.ARunnableS113S0100000_13;
import Y.AfS145S0200000_9;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.KevaImpl;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.token.TTTokenUtils;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountApi;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XYI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XYI implements InterfaceC1850100yFE {
    public final ReactiveAccountActivity LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<PolicyBodyLinkList> LJ;
    public final int LJFF;

    @Override // X.InterfaceC1850100yFE
    public final Integer LJI() {
        return Integer.valueOf(this.LJFF);
    }

    @Override // X.InterfaceC1850100yFE
    public final boolean LJII() {
        return ComplianceServiceProvider.LJJI().LJJIIJZLJL() != 0;
    }

    public final void LJIIIZ() {
        Bundle extras;
        AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
        KevaImpl.getRepo("age_gate", 1).storeString("mixed_age_seen", CardStruct.IStatusCode.DEFAULT);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NJY(accountUserServiceLIZ, null), 3);
        User curUser = accountUserServiceLIZ.getCurUser();
        curUser.setUserCancelled(false);
        accountUserServiceLIZ.LJIL(curUser);
        try {
            extras = this.LIZ.getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String string = extras != null ? extras.getString("enter_from") : null;
        if (Intrinsics.LJFF("enter_from_login_ui_routine", string)) {
            CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
            C0XV8.LIZJ(null);
        }
        if (ComplianceServiceProvider.LJIL().LJFF()) {
            ComplianceServiceProvider.LJIL().LJ();
            ComplianceServiceProvider.LJIL().LJJIIJ();
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(2131836791);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        ComplianceServiceProvider.LJJI().LJIJJLI(null, ((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser() ? 1 : 0);
        PopupManager.LIZJ(ComplianceServiceProvider.LJI().LJJIJIIJIL());
        this.LIZ.finish();
    }

    @Override // X.InterfaceC1850100yFE
    public final Integer LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1850100yFE
    public final List<PolicyBodyLinkList> LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1850100yFE
    public final String LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1850100yFE
    public final String LJ() {
        return this.LIZJ;
    }

    public C0XYI(ReactiveAccountActivity reactiveAccountActivity) {
        Integer numValueOf;
        int i;
        this.LIZ = reactiveAccountActivity;
        AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
        if (accountUserServiceLIZ != null) {
            numValueOf = Integer.valueOf(accountUserServiceLIZ.getCurUser().cancelType);
        } else {
            numValueOf = null;
        }
        this.LIZIZ = numValueOf;
        this.LIZJ = ComplianceServiceProvider.LJJI().LJ();
        this.LIZLLL = ComplianceServiceProvider.LJJI().LIZLLL();
        this.LJ = ComplianceServiceProvider.LJJI().LIZIZ();
        if (C0XQ5.LIZ().getCurUser().isUserInactive()) {
            i = 2;
        } else {
            i = 1;
        }
        this.LJFF = i;
    }

    @Override // X.InterfaceC1850100yFE
    public final void LIZJ(ARunnableS113S0100000_13 aRunnableS113S0100000_13) {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new C854710Xfx(aRunnableS113S0100000_13, 2));
        C0XQ7.LIZJ().logout("recover_account", "user_logout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0NJd] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0NJc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1850100yFE
    public final void LJFF(final ARunnableS113S0100000_13 aRunnableS113S0100000_13) {
        if (C0XQ5.LIZ().getCurUser().isUserInactive()) {
            if (C131200ek.LIZ) {
                String strLIZ = C0XH1.LIZ("/passport/deactivation/do/");
                C0XYH c0xyh = ReactiveAccountApi.LIZ;
                final ReactiveAccountActivity reactiveAccountActivity = this.LIZ;
                String strLIZ2 = TTTokenUtils.LIZ(strLIZ);
                final ?? r4 = new AbstractC592960NNm() { // from class: X.0NJc
                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NJX(aRunnableS113S0100000_13, this, null), 3);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C591840NJe(aRunnableS113S0100000_13, this, (C0XYK) c0xga, null), 3);
                    }
                };
                c0xyh.getClass();
                C846070XGz c846070XGz = new C846070XGz();
                c846070XGz.LIZ = C0XH1.LIZ("/passport/deactivation/do/");
                if (!TextUtils.isEmpty("x-tt-passport-csrf-token") && !TextUtils.isEmpty(strLIZ2)) {
                    if (c846070XGz.LIZJ == null) {
                        c846070XGz.LIZJ = new ArrayList();
                    }
                    ((ArrayList) c846070XGz.LIZJ).add(new C845840XGc("x-tt-passport-csrf-token", strLIZ2));
                }
                final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
                new AbstractC845940XGm<C0XYK>(reactiveAccountActivity, c845960XGoLJFF, r4) { // from class: X.0XYJ
                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(final boolean z, C845980XGq c845980XGq) {
                        C0XGA c0xga = new C0XGA(z) { // from class: X.0XYK
                        };
                        if (!z && c845980XGq != null) {
                            c0xga.LIZLLL = c845980XGq.LIZIZ;
                            String str = c845980XGq.LIZJ;
                            if (str != null) {
                                c0xga.LJFF = str;
                            }
                        }
                        return c0xga;
                    }
                }.LJIIIZ();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Api.LIZ);
            sbLIZ.append("/passport/deactivation/do/");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ReactiveAccountApi.LIZ.getClass();
            C0XYH.LIZIZ.reactiveDeactivationAccount(TTTokenUtils.LIZ(strLIZIZ)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS145S0200000_9(aRunnableS113S0100000_13, this, 6), new AfS145S0200000_9(aRunnableS113S0100000_13, this, 7));
            return;
        }
        if (C131200ek.LIZ) {
            C0XYH c0xyh2 = ReactiveAccountApi.LIZ;
            ?? r1 = new AbstractC592950NNl() { // from class: X.0NJd
                @Override // X.C0XH7
                public final void LJI(C0XGA c0xga) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NJW(aRunnableS113S0100000_13, this, null), 3);
                }

                @Override // X.C0XH7
                public final void LJ(C0XGA c0xga, int i) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C591850NJf(aRunnableS113S0100000_13, this, (C850420XXs) c0xga, null), 3);
                }
            };
            c0xyh2.getClass();
            C0XYH.LIZJ.LJ(r1);
            return;
        }
        ReactiveAccountApi.LIZ.getClass();
        C0XYH.LIZIZ.reactiveDeletedAccount(0).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS145S0200000_9(aRunnableS113S0100000_13, this, 4), new AfS145S0200000_9(aRunnableS113S0100000_13, this, 5));
    }

    @Override // X.InterfaceC1850100yFE
    public final void LJIIIIZZ(View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C786410Ut5.N3(view.getContext()), "aweme://hyd_action/dyd_main");
        smartRouteBuildRoute.withParam("enter_from", "reactive_account");
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.open();
    }
}
