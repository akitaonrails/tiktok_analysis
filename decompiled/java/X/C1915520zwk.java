package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915520zwk implements InterfaceC304970BxP {
    public static final C1915520zwk LL = new C1915520zwk();
    public static final Keva LLILLJJLI = Keva.getRepo("feeds_personalization");
    public static final C01GW LLILLL;
    public static final Keva LLILZ;
    public static final MutableLiveData<Boolean> LLILZIL;
    public static final MutableLiveData LLILZLL;
    public static final MutableLiveData<Boolean> LLIZ;
    public static final MutableLiveData LLIZLLLIL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1915550zwn());
        LLILLL = c01gwLIZIZ;
        boolean z = false;
        LLILZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_non_personalized_search_widget", false) == 1 && C288110BQz.LIZ() ? KevaImpl.getRepo("search_personalization", 1) : Keva.getRepo("search_personalization");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(LIZIZ()));
        LLILZIL = mutableLiveData;
        LLILZLL = mutableLiveData;
        if (C1915530zwl.LLILZIL || (C288110BQz.LIZ() && LIZJ())) {
            z = true;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.valueOf(z));
        LLIZ = mutableLiveData2;
        LLIZLLLIL = mutableLiveData2;
        ((IAccountService) c01gwLIZIZ.getValue()).LJIILL(new InterfaceC586170Myt() { // from class: X.0zwm
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z2, int i2, User user) {
                if (i != 1 && i != 2 && i != 3) {
                    return;
                }
                C0C5P.LIZJ().LJIIJJI("non_personalized_feeds", C1915520zwk.LL);
            }
        });
    }

    public static final boolean LIZIZ() {
        if (!C1915530zwl.LLILZIL) {
            C1902600zbu.LIZ.getClass();
            if (!C1902600zbu.LIZ()) {
                return false;
            }
            SettingsManager.LIZLLL().getClass();
            if (!LLILLJJLI.getBoolean("non_personalized_feeds_state_".concat(((IAccountService) LLILLL.getValue()).LJIIJ().getCurUserId()), SettingsManager.LIZ("non_personalized_feed_default_value", false))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZJ() {
        Keva keva = LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non_personalized_search_state_");
        sbLIZ.append(((IAccountService) LLILLL.getValue()).LJIIJ().getCurUserId());
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.InterfaceC304970BxP
    public final void LIZ() {
        LJ();
        C1915530zwl c1915530zwl = C1915530zwl.LL;
        C1915530zwl.LIZ();
        C0C5P.LIZJ().LJIJ("non_personalized_feeds", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r4 = this;
            boolean r3 = LIZIZ()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = X.C1915520zwk.LLILZIL
            java.lang.Object r0 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L32
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.setValue(r0)
            boolean r0 = X.C1915530zwl.LLILZIL
            if (r0 != 0) goto L2a
            X.0zbu r0 = X.C1902600zbu.LIZ
            r0.getClass()
            boolean r0 = X.C1902600zbu.LIZ()
            if (r0 == 0) goto L32
        L2a:
            X.0VjC r0 = new X.0VjC
            r0.<init>(r3)
            X.C15O7.LIZJ(r0)
        L32:
            boolean r0 = X.C1915530zwl.LLILZIL
            if (r0 != 0) goto L42
            boolean r0 = X.C288110BQz.LIZ()
            if (r0 == 0) goto L5b
            boolean r0 = LIZJ()
            if (r0 == 0) goto L5b
        L42:
            r3 = 1
        L43:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = X.C1915520zwk.LLIZ
            java.lang.Object r0 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L5a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.setValue(r0)
        L5a:
            return
        L5b:
            r3 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1915520zwk.LJ():void");
    }

    public static final boolean LJFF(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        MutableLiveData<Boolean> mutableLiveData = LLILZIL;
        if (!Intrinsics.LJFF(boolValueOf, mutableLiveData.getValue())) {
            Keva keva = LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("non_personalized_feeds_state_");
            sbLIZ.append(((IAccountService) LLILLL.getValue()).LJIIJ().getCurUserId());
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
            mutableLiveData.setValue(Boolean.valueOf(z));
            if (!C1915530zwl.LLILZIL) {
                C1902600zbu.LIZ.getClass();
                if (!C1902600zbu.LIZ()) {
                    return true;
                }
            }
            C15O7.LIZJ(new CallableC805760VjC(z));
            return true;
        }
        return false;
    }

    public static final boolean LJI(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        MutableLiveData<Boolean> mutableLiveData = LLIZ;
        if (!Intrinsics.LJFF(boolValueOf, mutableLiveData.getValue())) {
            Keva keva = LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("non_personalized_search_state_");
            sbLIZ.append(((IAccountService) LLILLL.getValue()).LJIIJ().getCurUserId());
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
            mutableLiveData.setValue(Boolean.valueOf(z));
            return true;
        }
        return false;
    }

    public final void LIZLLL(DecisionMakerNetworkApi.EligibilityModel eligibilityModel) {
        C1915530zwl c1915530zwl = C1915530zwl.LL;
        Keva keva = C1915530zwl.LLILZLL;
        boolean z = false;
        if (keva.contains("is_eligible") && keva.getBoolean("is_eligible", false)) {
            if (eligibilityModel != null) {
                if (!C1915530zwl.LIZJ(eligibilityModel)) {
                    c1915530zwl.LIZLLL();
                    if (eligibilityModel != null) {
                    }
                }
                if (C1915530zwl.LIZJ(eligibilityModel)) {
                    C1915530zwl.LIZ();
                }
            }
        } else if (eligibilityModel != null) {
            if (C1915530zwl.LIZJ(eligibilityModel) && !C1915530zwl.LLILZIL) {
                C1915530zwl.LIZ();
            }
        }
        if (eligibilityModel == null) {
            keva.clear();
        } else {
            keva.storeBoolean("is_eligible", C1915530zwl.LIZJ(eligibilityModel));
            keva.storeString("decision_code", eligibilityModel.decisionCode);
            keva.storeBoolean("action_list_urls_exist", !eligibilityModel.actionList.isEmpty());
        }
        C1915530zwl.LLILZIL = keva.getBoolean("is_eligible", false);
        boolean z2 = keva.getBoolean("action_list_urls_exist", false);
        if (C1915530zwl.LLILZIL && z2) {
            z = true;
        }
        C1915530zwl.LLILZ = z;
        if (C1915530zwl.LLILZIL && !C1915530zwl.LLIZLLLIL) {
            C1915530zwl.LLIZLLLIL = true;
            ((C2203431BLp) C1915530zwl.LLIZ.getValue()).LJI(67108951, 666666, c1915530zwl);
        }
        LJ();
        C1915530zwl.LIZ();
    }
}
