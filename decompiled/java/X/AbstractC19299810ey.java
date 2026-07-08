package X;

import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

/* JADX INFO: renamed from: X.10ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19299810ey implements C10WT {
    @Override // X.C10WT
    public final PNSFeedbackModel LJ() {
        return new PNSFeedbackModel(null, new PNSDialogModel(getContext().getString(2131827415), getContext().getString(2131827416), Collections.singletonList(new PNSAgeConfirmOption(getContext().getString(2131829429), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false), -1, null, false);
    }

    public static Date LJIIIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        return calendar.getTime();
    }

    @Override // X.C10WT
    public final PNSFeedbackModel LJIIIIZZ(String str) {
        return new PNSFeedbackModel(null, new PNSDialogModel(str, null, Collections.singletonList(new PNSAgeConfirmOption(getContext().getString(2131821883), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false), -1, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    @Override // X.C10WT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel LIZJ(java.lang.Integer r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19299810ey.LIZJ(java.lang.Integer, java.lang.String):com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel");
    }
}
