package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

/* JADX INFO: renamed from: X.10es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19299210es extends AbstractC19299810ey implements C10WV {
    public final Context LIZ;

    @Override // X.C10WV
    public final PNSFeedbackModel LJFF() {
        return new PNSFeedbackModel(null, new PNSDialogModel(this.LIZ.getString(2131825270), this.LIZ.getString(2131825271), C1697810uHb.LJIIJJI(new PNSAgeConfirmOption(this.LIZ.getString(2131825268), null, EnumC19301010fA.CONTINUE.getType()), new PNSAgeConfirmOption(this.LIZ.getString(2131825269), null, EnumC19301010fA.DISMISS.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), true, false, false, null, false), -1, null, false);
    }

    @Override // X.C10WT
    public final C19299010eq LJI() {
        String string = this.LIZ.getString(2131829309);
        String string2 = this.LIZ.getString(2131827418);
        String string3 = this.LIZ.getString(R.string.epx);
        String string4 = this.LIZ.getString(2131837632);
        String string5 = this.LIZ.getString(2131837631);
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        return new C19299010eq(string, string2, string3, string4, null, string5, calendar.getTime(), AbstractC19299810ey.LJIIIZ(), null, EnumC19300610f6.HIDE, Collections.singletonList(new PNSNavButton(EnumC19300410f4.LEFT, EnumC19300210f2.BACK, null, "", "")), null, Boolean.TRUE, null);
    }

    @Override // X.C10WT
    public final Context getContext() {
        return this.LIZ;
    }

    public C19299210es(Context context) {
        this.LIZ = context;
    }

    @Override // X.C10WV
    public final PNSFeedbackModel LIZIZ(String str) {
        return new PNSFeedbackModel(null, new PNSDialogModel(this.LIZ.getString(2131847052, str), this.LIZ.getString(2131847053), Collections.singletonList(new PNSAgeConfirmOption(this.LIZ.getString(2131829429), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, Collections.singletonList(new PNSHyperlink(str, "")), false), -1, null, false);
    }

    @Override // X.C10WT
    public final PNSFeedbackModel LIZLLL(C19249810Sq c19249810Sq) {
        int i = C10WH.LIZ[c19249810Sq.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return LJIIIIZZ(c19249810Sq.LJ);
            }
            return new PNSFeedbackModel(null, new PNSDialogModel(C786410Ut5.j4("%s\n\n%s", Arrays.copyOf(new Object[]{this.LIZ.getString(2131827427), this.LIZ.getString(2131827428)}, 2)), null, Collections.singletonList(new PNSAgeConfirmOption(this.LIZ.getString(2131827426), null, EnumC19301010fA.CONTINUE.getType())), Integer.valueOf(EnumC19298710en.BUTTON.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, true, null, false), -1, null, false);
        }
        return null;
    }
}
