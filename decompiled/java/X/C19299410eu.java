package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.10eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19299410eu extends AbstractC19299810ey implements InterfaceC19258010Vu {
    public final Context LIZ;
    public C19301310fD LIZIZ;

    @Override // X.C10WT
    public final C19299010eq LJI() {
        Date time;
        Boolean bool;
        C19301310fD c19301310fD = this.LIZIZ;
        boolean zBooleanValue = false;
        String string = (c19301310fD == null || c19301310fD.type != 2) ? this.LIZ.getString(2131825280) : this.LIZ.getString(2131827418);
        String string2 = this.LIZ.getString(R.string.fte);
        C19301310fD c19301310fD2 = this.LIZIZ;
        String string3 = (c19301310fD2 == null || c19301310fD2.descType != 1) ? this.LIZ.getString(2131825279) : this.LIZ.getString(2131857969);
        String string4 = this.LIZ.getString(2131825278);
        C19301310fD c19301310fD3 = this.LIZIZ;
        if (c19301310fD3 == null || (time = c19301310fD3.defaultDate) == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, -1);
            time = calendar.getTime();
        }
        C19301310fD c19301310fD4 = this.LIZIZ;
        Date dateLIZ = C19301410fE.LIZ(c19301310fD4 != null ? c19301310fD4.upperBound : null);
        EnumC19300610f6 enumC19300610f6 = EnumC19300610f6.HIDE;
        List listSingletonList = Collections.singletonList(new PNSNavButton(EnumC19300410f4.LEFT, EnumC19300210f2.BACK, null, "", ""));
        Boolean bool2 = Boolean.TRUE;
        C19301310fD c19301310fD5 = this.LIZIZ;
        if (c19301310fD5 != null && (bool = c19301310fD5.hasAge) != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new C19299010eq(null, string, string2, string3, null, string4, time, dateLIZ, null, enumC19300610f6, listSingletonList, null, bool2, Boolean.valueOf(zBooleanValue));
    }

    @Override // X.C10WT
    public final Context getContext() {
        return this.LIZ;
    }

    public C19299410eu(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC19258010Vu
    public final void LIZ(C19301310fD c19301310fD) {
        this.LIZIZ = c19301310fD;
    }

    @Override // X.C10WT
    public final PNSFeedbackModel LIZLLL(C19249810Sq c19249810Sq) {
        if (C10WK.LIZ[c19249810Sq.LIZ.ordinal()] == 1) {
            return LJ();
        }
        return null;
    }

    @Override // X.InterfaceC19258010Vu
    public final PNSFeedbackModel LJII(int i, String str) {
        int i2;
        int i3;
        String string = this.LIZ.getString(2131825276, str);
        Locale locale = Locale.ROOT;
        Resources resources = this.LIZ.getResources();
        C19301310fD c19301310fD = this.LIZIZ;
        if (c19301310fD != null && c19301310fD.descType == 1) {
            i2 = 2131756056;
        } else {
            i2 = 2131755085;
        }
        StringBuilder sb = new StringBuilder(C786410Ut5.k4(locale, resources.getQuantityString(i2, i), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        sb.append("\n\n");
        Resources resources2 = this.LIZ.getResources();
        C19301310fD c19301310fD2 = this.LIZIZ;
        if (c19301310fD2 != null && c19301310fD2.descType == 1) {
            i3 = 2131857968;
        } else {
            i3 = 2131825275;
        }
        sb.append(resources2.getString(i3));
        return new PNSFeedbackModel(null, new PNSDialogModel(sb.toString(), string, C1697810uHb.LJIIJJI(new PNSAgeConfirmOption(this.LIZ.getString(R.string.fte), null, EnumC19301010fA.CONTINUE.getType()), new PNSAgeConfirmOption(this.LIZ.getString(2131833181), null, EnumC19301010fA.DISMISS.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), true, false, false, Collections.singletonList(new PNSHyperlink(String.valueOf(i), "")), false), -1, null, false);
    }
}
