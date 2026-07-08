package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJAgeGateRemoveLoginService;
import com.ss.android.ugc.aweme.journey.INUJAgeRangeService;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: X.10et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19299310et implements C10WV {
    public final Context LIZ;
    public final AgeGateSdkRegistrationFlow LIZIZ;
    public final INUJRevampService LIZJ = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null);
    public final INUJAgeRangeService LIZLLL = (INUJAgeRangeService) PluggableExtentionKt.pluggableSpi$default(INUJAgeRangeService.class, false, false, false, 14, null);
    public final INUJAgeGateRemoveLoginService LJ = (INUJAgeGateRemoveLoginService) PluggableExtentionKt.pluggableSpi$default(INUJAgeGateRemoveLoginService.class, false, false, false, 14, null);

    @Override // X.C10WT
    public final PNSFeedbackModel LJ() {
        return new PNSFeedbackModel(null, new PNSDialogModel(this.LIZ.getString(2131827415), this.LIZ.getString(2131827416), Collections.singletonList(new PNSAgeConfirmOption(this.LIZ.getString(2131829429), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false), -1, null, false);
    }

    @Override // X.C10WV
    public final PNSFeedbackModel LJFF() {
        return new PNSFeedbackModel(null, new PNSDialogModel(this.LIZ.getString(2131825270), this.LIZ.getString(2131825271), C1697810uHb.LJIIJJI(new PNSAgeConfirmOption(this.LIZ.getString(2131825268), null, EnumC19301010fA.DISMISS.getType()), new PNSAgeConfirmOption(this.LIZ.getString(2131825269), null, EnumC19301010fA.EXIT.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), true, false, false, null, false), -1, "quit_popup", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    @Override // X.C10WT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19299010eq LJI() {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19299310et.LJI():X.10eq");
    }

    @Override // X.C10WT
    public final Context getContext() {
        return this.LIZ;
    }

    public static EnumC1153540g7k LJIIIZ(AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow) {
        int i = C10WE.LIZ[ageGateSdkRegistrationFlow.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return EnumC1153540g7k.OTHER;
            }
            return EnumC1153540g7k.LOGIN_CONSENT;
        }
        return EnumC1153540g7k.NUJ_COMPONENT;
    }

    public static boolean LJIIJ(AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow) {
        if (ageGateSdkRegistrationFlow == AgeGateSdkRegistrationFlow.NEW_COMPONENT || ageGateSdkRegistrationFlow == AgeGateSdkRegistrationFlow.LOGIN_CONSENT) {
            return true;
        }
        return false;
    }

    @Override // X.C10WV
    public final PNSFeedbackModel LIZIZ(String str) {
        return new PNSFeedbackModel(null, new PNSDialogModel(this.LIZ.getString(2131847052, str), this.LIZ.getString(2131847053), Collections.singletonList(new PNSAgeConfirmOption(this.LIZ.getString(2131829429), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, Collections.singletonList(new PNSHyperlink(str, "")), false), -1, null, false);
    }

    @Override // X.C10WT
    public final PNSFeedbackModel LIZLLL(C19249810Sq c19249810Sq) {
        int i = C10WE.LIZIZ[c19249810Sq.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return LJIIIIZZ(c19249810Sq.LJ);
            }
            return new PNSFeedbackModel(null, new PNSDialogModel(C786410Ut5.j4("%s\n\n%s", Arrays.copyOf(new Object[]{this.LIZ.getString(2131827427), this.LIZ.getString(2131827428)}, 2)), null, Collections.singletonList(new PNSAgeConfirmOption(this.LIZ.getString(2131827426), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.BUTTON.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false), -1, null, false);
        }
        return null;
    }

    @Override // X.C10WT
    public final PNSFeedbackModel LJIIIIZZ(String str) {
        return new PNSFeedbackModel(null, new PNSDialogModel(str, null, Collections.singletonList(new PNSAgeConfirmOption(this.LIZ.getString(2131821883), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false), -1, null, false);
    }

    public C19299310et(Context context, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow) {
        this.LIZ = context;
        this.LIZIZ = ageGateSdkRegistrationFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    @Override // X.C10WT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel LIZJ(java.lang.Integer r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19299310et.LIZJ(java.lang.Integer, java.lang.String):com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel");
    }
}
