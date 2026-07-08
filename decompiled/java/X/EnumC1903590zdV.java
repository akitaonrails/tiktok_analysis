package X;

import Y.ACallableS429S0100000_24;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class EnumC1903590zdV {
    public static final EnumC1903590zdV CONTACTS;
    public static final C1903640zda Companion;
    public static final /* synthetic */ EnumC1903590zdV[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C01GW<String> REPO_PREFIX$delegate;
    public final String LL;
    public C1903580zdU LLILLJJLI;

    public EnumC1903590zdV() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1903590zdV> getEntries() {
        return LLILZ;
    }

    public abstract EnumC1903600zdW decideDisplay(Context context, Fragment fragment);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0zda] */
    static {
        EnumC1903590zdV enumC1903590zdV = new EnumC1903590zdV() { // from class: X.0zJA
            @Override // X.EnumC1903590zdV
            public final EnumC1903600zdW decideDisplay(Context context, Fragment fragment) {
                boolean z;
                if (C19212010Ec.LIZJ.LIZJ() == C05RV.BUSINESS_INBOX) {
                    return EnumC1903600zdW.GONE;
                }
                if (context != null && !(context instanceof InterfaceC1603190roz)) {
                    return EnumC1903600zdW.GONE;
                }
                boolean zLIZJ = C1076010e6h.LIZJ.LJIIJ().LIZJ();
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser != null && curUser.isPhoneBinded()) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Number) C296520Bjm.LIZ.getValue()).intValue() == 1) {
                    if (z && !zLIZJ) {
                        return LIZJ().LIZIZ();
                    }
                    return EnumC1903600zdW.GONE;
                }
                if (C296520Bjm.LIZ()) {
                    if (!zLIZJ) {
                        return LIZJ().LIZIZ();
                    }
                    return EnumC1903600zdW.GONE;
                }
                if (!zLIZJ) {
                    return LIZJ().LIZIZ();
                }
                return EnumC1903600zdW.GONE;
            }
        };
        CONTACTS = enumC1903590zdV;
        EnumC1903590zdV[] enumC1903590zdVArr = {enumC1903590zdV};
        LLILLL = enumC1903590zdVArr;
        LLILZ = new C2254308sP(enumC1903590zdVArr);
        Companion = new Object() { // from class: X.0zda
        };
        REPO_PREFIX$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(692));
    }

    public static EnumC1903590zdV[] values() {
        return (EnumC1903590zdV[]) LLILLL.clone();
    }

    public final void markEnterInbox() {
        C15O7.LIZJ(new ACallableS429S0100000_24(new AwS572S0100000_28(this, 985), (Function0<Object>) 8));
    }

    public final C1903580zdU LIZJ() {
        String uid;
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        C1903580zdU c1903580zdU = this.LLILLJJLI;
        if (!Intrinsics.LJFF(c1903580zdU != null ? c1903580zdU.LIZIZ : null, uid)) {
            this.LLILLJJLI = new C1903580zdU(this, uid);
        }
        return this.LLILLJJLI;
    }

    public final void markDelete() {
        C1903580zdU c1903580zdULIZJ = LIZJ();
        c1903580zdULIZJ.LIZLLL().storeLong(c1903580zdULIZJ.LIZ("del_time_"), System.currentTimeMillis());
        String strLIZ = c1903580zdULIZJ.LIZ("del_times_");
        c1903580zdULIZJ.LIZLLL().storeInt(strLIZ, c1903580zdULIZJ.LIZLLL().getInt(strLIZ, 0) + 1);
        c1903580zdULIZJ.LIZLLL().storeBoolean(c1903580zdULIZJ.LIZ("bottom_by_del_"), true);
        C1903130zcl c1903130zcl = (C1903130zcl) c1903580zdULIZJ.LIZLLL.getValue();
        EnumC1903600zdW enumC1903600zdWLIZJ = c1903580zdULIZJ.LIZJ();
        int i = c1903130zcl.LIZ().getInt("num_exposures", 0);
        C1903610zdX.LIZ.getClass();
        if (i >= C1903610zdX.LIZIZ().numExposuresLowerThreshold && C1903610zdX.LIZ()) {
            c1903130zcl.LIZ().storeInt("num_exposures", C1903610zdX.LIZIZ().numExposuresUpperThreshold + 1);
        }
        if (enumC1903600zdWLIZJ == EnumC1903600zdW.BOTTOM) {
            c1903130zcl.LIZ().storeBoolean("has_inbox_bottom_dismissed", true);
        }
    }

    public final void markExposure() {
        C1903580zdU c1903580zdULIZJ = LIZJ();
        if (c1903580zdULIZJ.LJ != EnumC1903600zdW.GONE) {
            C1903130zcl c1903130zcl = (C1903130zcl) c1903580zdULIZJ.LIZLLL.getValue();
            c1903130zcl.getClass();
            C1903610zdX.LIZ.getClass();
            if (C1903610zdX.LIZ()) {
                c1903130zcl.LIZ().storeInt("num_exposures", c1903130zcl.LIZ().getInt("num_exposures", 0) + 1);
            }
            if (C1903610zdX.LIZ()) {
                c1903130zcl.LIZ().storeLong("last_exposure_timestamp", System.currentTimeMillis());
            }
        }
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1903590zdV valueOf(String str) {
        return (EnumC1903590zdV) C08FF.LIZ(EnumC1903590zdV.class, str);
    }

    public final String asRepoKey(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void markAction(boolean z) {
        C1903580zdU c1903580zdULIZJ = LIZJ();
        c1903580zdULIZJ.LIZLLL().storeInt(c1903580zdULIZJ.LIZ("enter_inbox_times_"), 0);
        c1903580zdULIZJ.LIZLLL().storeBoolean(c1903580zdULIZJ.LIZ("bottom_by_del_"), false);
        C1903610zdX.LIZ.getClass();
        if (C1903610zdX.LIZ() && z) {
            C1903130zcl c1903130zcl = (C1903130zcl) c1903580zdULIZJ.LIZLLL.getValue();
            c1903130zcl.getClass();
            if (C1903610zdX.LIZ()) {
                c1903130zcl.LIZ().storeLong("last_exposure_timestamp", 0L);
            }
            if (C1903610zdX.LIZ()) {
                c1903130zcl.LIZ().storeInt("num_exposures", 0);
            }
        }
    }

    public EnumC1903590zdV(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = str2;
    }

    public static /* synthetic */ void markAction$default(EnumC1903590zdV enumC1903590zdV, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            enumC1903590zdV.markAction(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAction");
    }

    public static /* synthetic */ EnumC1903600zdW decideDisplay$default(EnumC1903590zdV enumC1903590zdV, Context context, Fragment fragment, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                context = null;
            }
            if ((i & 2) != 0) {
                fragment = null;
            }
            return enumC1903590zdV.decideDisplay(context, fragment);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decideDisplay");
    }
}
