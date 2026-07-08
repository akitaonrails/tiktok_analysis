package X;

import Y.AfS185S0100000_16;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS140S0201000_16;
import kotlin.jvm.internal.AwS3S0121000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072730e1P implements InterfaceC1074380e44 {
    public static final /* synthetic */ int LJII = 0;
    public final Fragment LIZ;
    public final Function0<String> LIZIZ;
    public final C11NJ LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public boolean LJFF;
    public final C01GW LJI;

    public static void LJ() {
        PopupManager.LIZJ(C1072740e1Q.class);
    }

    @Override // X.InterfaceC1074380e44
    public final void onDestroyView() {
        this.LIZJ.LJ();
    }

    public static EnumC1070340dxY LIZIZ(int i) throws Exception {
        if (i != 1) {
            if (i == 2) {
                return EnumC1070340dxY.FACEBOOK;
            }
            throw new Exception("wrong social platform");
        }
        return EnumC1070340dxY.CONTACT;
    }

    public static int LJI(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                "wrong social platform".toString();
                throw new IllegalStateException("wrong social platform");
            }
        }
        return i2;
    }

    public final void LIZJ(int i) {
        C1072640e1G c1072640e1G = C1072640e1G.LIZ;
        int iLJI = LJI(i);
        int value = EnumC1072920e1i.CONSENT.getValue();
        c1072640e1G.getClass();
        C1072640e1G.LJ(iLJI, value);
        C1076010e6h.LIZJ.LJFF().LIZIZ();
        C1620050sGB c1620050sGB = (C1620050sGB) this.LIZLLL.getValue();
        if (c1620050sGB != null) {
            c1620050sGB.LJIIJJI("permission_dialog", false, null);
        }
        String str = C1071790dzt.LIZIZ;
        C1071800dzu.LIZ().LIZ.storeLong("last_click_cancel_time", System.currentTimeMillis());
    }

    public C1072730e1P(Fragment fragment, C1590150rTx c1590150rTx) {
        this.LIZ = fragment;
        this.LIZIZ = c1590150rTx;
        C11NJ c11nj = new C11NJ();
        this.LIZJ = c11nj;
        this.LIZLLL = C452501pT.LIZIZ(new C1072800e1W(this));
        this.LJ = C452501pT.LIZIZ(new C1072850e1b());
        this.LJI = C452501pT.LIZIZ(new C1072810e1X());
        c11nj.LIZ(new C11LP<InterfaceC781210Ukh>() { // from class: X.11LQ
            public static final long serialVersionUID = -8219729196779211169L;

            {
                C0R59 c0r59 = new InterfaceC781210Ukh() { // from class: X.0R59
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C690090R5b.LIZ.getClass();
                        C690090R5b.LIZIZ = AFwS198S0000000_11.get$arr$(407);
                    }
                };
            }

            @Override // X.C11LP
            public final void LIZ(InterfaceC781210Ukh interfaceC781210Ukh) {
                try {
                    interfaceC781210Ukh.run();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw C11QG.LIZIZ(th);
                }
            }
        });
    }

    public final void LIZLLL(int i, Pair<Boolean, Boolean> pair) {
        String str;
        boolean zBooleanValue = pair.getFirst().booleanValue();
        boolean zBooleanValue2 = pair.getSecond().booleanValue();
        if (zBooleanValue) {
            if (C1073090e1z.LIZ()) {
                C1072640e1G.LIZ.getClass();
                if (C1072640e1G.LIZIZ()) {
                    C1589380rSi.LIZIZ.LIZ(false);
                    String str2 = C1071790dzt.LIZIZ;
                    if (System.currentTimeMillis() - C1071800dzu.LIZ().LIZ.getLong("last_show_contact_time", 0L) < TimeUnit.MINUTES.toMillis(1L)) {
                        ((InterfaceC1072840e1a) this.LJ.getValue()).LIZ(i, EnumC1073320e2M.FYP.getValue(), "Onboarding popup", false);
                        return;
                    }
                    C19EG activity = this.LIZ.getActivity();
                    if (activity == null || !(!activity.isFinishing())) {
                        return;
                    }
                    C1620050sGB c1620050sGB = (C1620050sGB) this.LIZLLL.getValue();
                    if (c1620050sGB != null) {
                        c1620050sGB.LJIIJJI("permission_dialog", true, null);
                    }
                    if (C849850XVn.LIZIZ.LIZJ().LJJ("424")) {
                        C10GR c10gr = new C10GR(activity, this.LIZIZ, new AwS140S0201000_16(this, activity, i, 2)) { // from class: X.0e1Q
                            public final C19EG LL;
                            public final Function0<String> LLILLJJLI;
                            public final Function0<Unit> LLILLL;
                            public final int LLILZ = 230;

                            @Override // X.AbstractC20656215sG
                            public final String getPopupEnterFrom() {
                                return this.LLILLJJLI.invoke();
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg = this.LL;
                                return new C688120Qyw(c19eg, c19eg, null);
                            }

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return this.LLILZ;
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                if (!C1253010iiB.LIZJ.LJJII()) {
                                    return;
                                }
                                this.LLILLL.invoke();
                            }

                            @Override // X.AbstractC20656215sG
                            public final void showPopupFailed(int i2, String str3) {
                                super.showPopupFailed(i2, str3);
                                C1071780dzs.LIZ.getClass();
                                C1071780dzs.LJFF(i2, str3);
                            }

                            {
                                this.LL = activity;
                                this.LLILLJJLI = function0;
                                this.LLILLL = function0;
                            }
                        };
                        int i2 = C1070330dxX.LIZ[LIZIZ(i).ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        str = "";
                                    } else {
                                        str = "424_email";
                                    }
                                } else {
                                    str = "424_mlbb";
                                }
                            } else {
                                str = "424_fb";
                            }
                        } else {
                            str = "424_contact";
                        }
                        PopupManager.LJIJ(c10gr, str, new C1668306g5("social_424_onboarding"));
                        return;
                    }
                    PopupManager.LJIJI(new C10GR(activity, this.LIZIZ, new AwS140S0201000_16(this, activity, i, 3)) { // from class: X.0e1Q
                        public final C19EG LL;
                        public final Function0<String> LLILLJJLI;
                        public final Function0<Unit> LLILLL;
                        public final int LLILZ = 230;

                        @Override // X.AbstractC20656215sG
                        public final String getPopupEnterFrom() {
                            return this.LLILLJJLI.invoke();
                        }

                        @Override // X.InterfaceC20660415sw
                        public final C688120Qyw i2() {
                            C19EG c19eg = this.LL;
                            return new C688120Qyw(c19eg, c19eg, null);
                        }

                        @Override // X.InterfaceC20660515sx
                        public final int getPriority() {
                            return this.LLILZ;
                        }

                        @Override // X.InterfaceC20659015si
                        public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                            if (!C1253010iiB.LIZJ.LJJII()) {
                                return;
                            }
                            this.LLILLL.invoke();
                        }

                        @Override // X.AbstractC20656215sG
                        public final void showPopupFailed(int i22, String str3) {
                            super.showPopupFailed(i22, str3);
                            C1071780dzs.LIZ.getClass();
                            C1071780dzs.LJFF(i22, str3);
                        }

                        {
                            this.LL = activity;
                            this.LLILLJJLI = function0;
                            this.LLILLL = function0;
                        }
                    }, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            if (!C1070450dxj.LIZ(EnumC1070340dxY.CONTACT)) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                C19EG c19egRequireActivity = this.LIZ.requireActivity();
                c19741112Lp.getClass();
                if (!C19741112Lp.LJI(c19egRequireActivity, "android.permission.READ_CONTACTS", false)) {
                    boolean zIsNewUser = ((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser();
                    C1620050sGB c1620050sGB2 = (C1620050sGB) this.LIZLLL.getValue();
                    if (c1620050sGB2 != null) {
                        c1620050sGB2.LJIIJJI("permission_dialog", true, null);
                    }
                    if (C849850XVn.LIZIZ.LIZJ().LJJ("424")) {
                        PopupManager.LJIJ(new C10GR(this.LIZ.requireActivity(), this.LIZIZ, new AwS3S0121000_16(this, zIsNewUser, i, zBooleanValue2, 0)) { // from class: X.0e1Q
                            public final C19EG LL;
                            public final Function0<String> LLILLJJLI;
                            public final Function0<Unit> LLILLL;
                            public final int LLILZ = 230;

                            @Override // X.AbstractC20656215sG
                            public final String getPopupEnterFrom() {
                                return this.LLILLJJLI.invoke();
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg = this.LL;
                                return new C688120Qyw(c19eg, c19eg, null);
                            }

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return this.LLILZ;
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                if (!C1253010iiB.LIZJ.LJJII()) {
                                    return;
                                }
                                this.LLILLL.invoke();
                            }

                            @Override // X.AbstractC20656215sG
                            public final void showPopupFailed(int i22, String str3) {
                                super.showPopupFailed(i22, str3);
                                C1071780dzs.LIZ.getClass();
                                C1071780dzs.LJFF(i22, str3);
                            }

                            {
                                this.LL = activity;
                                this.LLILLJJLI = function0;
                                this.LLILLL = function0;
                            }
                        }, "follow_your_friends_dialog", new C1668306g5("social_follow_your_friends_dialog_trigger"));
                        return;
                    } else {
                        PopupManager.LJIJI(new C10GR(this.LIZ.requireActivity(), this.LIZIZ, new AwS3S0121000_16(this, zIsNewUser, i, zBooleanValue2, 1)) { // from class: X.0e1Q
                            public final C19EG LL;
                            public final Function0<String> LLILLJJLI;
                            public final Function0<Unit> LLILLL;
                            public final int LLILZ = 230;

                            @Override // X.AbstractC20656215sG
                            public final String getPopupEnterFrom() {
                                return this.LLILLJJLI.invoke();
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg = this.LL;
                                return new C688120Qyw(c19eg, c19eg, null);
                            }

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return this.LLILZ;
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                if (!C1253010iiB.LIZJ.LJJII()) {
                                    return;
                                }
                                this.LLILLL.invoke();
                            }

                            @Override // X.AbstractC20656215sG
                            public final void showPopupFailed(int i22, String str3) {
                                super.showPopupFailed(i22, str3);
                                C1071780dzs.LIZ.getClass();
                                C1071780dzs.LJFF(i22, str3);
                            }

                            {
                                this.LL = activity;
                                this.LLILLJJLI = function0;
                                this.LLILLL = function0;
                            }
                        }, true);
                        return;
                    }
                }
            }
        } else if (i == 1) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C1056440db8(this, null), 2);
        }
        LJIIIZ(Collections.singletonList(Integer.valueOf(i)), zBooleanValue2);
    }

    public final void LJIIIIZZ(int i, C19EG c19eg) {
        if (c19eg.isFinishing()) {
            LJ();
        } else {
            LJII((String) this.LJI.getValue(), i, null, null, null);
            C849850XVn.LIZIZ.LIZJ().LJI();
        }
    }

    public final void LJIIIZ(List<Integer> list, boolean z) {
        C1072640e1G.LIZ.getClass();
        this.LIZJ.LIZ(C1072640e1G.LJI(list, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 47), new AfS185S0100000_16(this, 48)));
    }

    @Override // X.InterfaceC1074380e44
    public final void LIZ(int i, Pair<Boolean, Boolean> pair, boolean z) {
        int i2;
        if (z) {
            if (this.LIZ.getActivity() != null) {
                C0XQ7.LJ();
                int i3 = 2;
                if (Intrinsics.LJFF(C0XQ7.LIZ.LJIIL().getLatestLoginMethodName(), "facebook")) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                C1072640e1G.LIZ.getClass();
                InterfaceC1072760e1S interfaceC1072760e1SLIZ = C1072640e1G.LIZ(i2);
                if (interfaceC1072760e1SLIZ.LIZJ(this.LIZ.getActivity())) {
                    Pair<Boolean, Boolean> pairLIZIZ = interfaceC1072760e1SLIZ.LIZIZ();
                    if (interfaceC1072760e1SLIZ.LIZ() != 2) {
                        i3 = 1;
                    }
                    C690090R5b.LIZ.getClass();
                    C690110R5d.LIZ.getClass();
                    if (C690110R5d.LIZ().delaySocial && C1514430pVp.LIZLLL().booleanValue()) {
                        C690090R5b.LIZIZ = new AwS140S0201000_16(this, (C1072730e1P) i3, (int) pairLIZIZ, (Pair<Boolean, Boolean>) 4);
                        return;
                    } else {
                        LIZLLL(i3, pairLIZIZ);
                        return;
                    }
                }
                return;
            }
            return;
        }
        LIZLLL(i, pair);
    }

    public final void LJFF(C19EG c19eg, String str, String str2, List<Integer> list) {
        EnumC1070410dxf enumC1070410dxf;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().intValue() == 1) {
                enumC1070410dxf = EnumC1070410dxf.CONTACT;
            } else {
                enumC1070410dxf = EnumC1070410dxf.FACEBOOK;
            }
            arrayList.add(enumC1070410dxf);
        }
        InterfaceC1072780e1U interfaceC1072780e1ULIZJ = C2277891EDz.LIZIZ.LIZJ();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        C786410Ut5.LJJIZ(bundle, "auth_platform_key", arrayList);
        C786410Ut5.LJJIZ(bundle, "maf_scene_key", EnumC1262370ixH.LOGIN_POPUP);
        bundle.putBoolean("use_storage_key", true);
        bundle.putBoolean("is_after_auth", true);
        C786410Ut5.LJJJI("light_interaction_enter_method", "suggested_account", bundle);
        C786410Ut5.LJJJI("light_interaction_position", "pop_up", bundle);
        interfaceC1072780e1ULIZJ.LJIIJ(c19eg, bundle);
        interfaceC1072780e1ULIZJ.LJI();
        interfaceC1072780e1ULIZJ.LJIIJJI(new C1072770e1T(this, interfaceC1072780e1ULIZJ, list, c19eg, str));
    }

    public final void LJII(String str, int i, Function0 function0, Function0 function02, Function0 function03) {
        ((InterfaceC1072840e1a) this.LJ.getValue()).LIZ(i, EnumC1073320e2M.FYP.getValue(), "Onboarding popup", true);
        if (this.LIZ.getContext() != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1070240dxO(this, i, str, function0, function02, function03, null), 3);
            return;
        }
        C1620050sGB c1620050sGB = (C1620050sGB) this.LIZLLL.getValue();
        if (c1620050sGB != null) {
            c1620050sGB.LJIIJJI("permission_dialog", false, null);
        }
        LJ();
    }
}
