package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19299510ev extends AbstractC19299610ew implements InterfaceC19258010Vu {
    public final Context LIZ;
    public final Date LIZIZ;
    public final Date LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final DateFormat LJII;

    @Override // X.InterfaceC19258010Vu
    public final void LIZ(C19301310fD c19301310fD) {
    }

    @Override // X.C10WT
    public final C19299010eq LJI() {
        String string;
        String string2 = this.LIZLLL;
        if (a0.LJJJIL(string2)) {
            string2 = this.LIZ.getString(2131827418);
        }
        String string3 = this.LIZ.getString(2131833184);
        String string4 = this.LJ;
        if (a0.LJJJIL(string4)) {
            string4 = this.LIZ.getString(2131857969);
        }
        String str = this.LJFF;
        if (this.LJI) {
            Date date = this.LIZIZ;
            string = date != null ? this.LJII.format(date) : null;
        } else {
            string = this.LIZ.getString(2131825278);
        }
        return new C19299010eq(null, string2, string3, string4, str, string, this.LIZIZ, C19301410fE.LIZ(this.LIZJ), null, EnumC19300610f6.DISPLAY, Collections.singletonList(new PNSNavButton(EnumC19300410f4.LEFT, EnumC19300210f2.BACK, null, "", "")), null, Boolean.TRUE, Boolean.valueOf(this.LJI));
    }

    @Override // X.C10WT
    public final Context getContext() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19258010Vu
    public final PNSFeedbackModel LJII(int i, String str) {
        String str2 = str;
        String strLJJIFFI = u.LJJIFFI(C786410Ut5.j4(this.LIZ.getString(2131833188), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), "{s_numericAge}", String.valueOf(i), false);
        if (str2 == null) {
            str2 = "";
        }
        return new PNSFeedbackModel(null, new PNSDialogModel(u.LJJIFFI(this.LIZ.getString(2131833185), "{s_mo/dy/year}", str2, false), strLJJIFFI, C1697810uHb.LJIIJJI(new PNSAgeConfirmOption(this.LIZ.getString(R.string.fte), null, EnumC19301010fA.CONTINUE.getType()), new PNSAgeConfirmOption(this.LIZ.getString(2131843193), null, EnumC19301010fA.DISMISS.getType())), Integer.valueOf(EnumC19298710en.ACTION.getValue()), -1, EnumC19301210fC.VERTICAL.getType(), false, false, false, Collections.singletonList(new PNSHyperlink(String.valueOf(i), "")), false), -1, null, false);
    }

    public C19299510ev(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, Date date, Date date2, String str, String str2, String str3, boolean z) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        String strLJIJJ;
        this.LIZ = i18nSettingManageMyAccountActivity;
        this.LIZIZ = date;
        this.LIZJ = date2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = z;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        this.LJII = DateFormat.getDateInstance(1, new Locale((i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(i18nSettingManageMyAccountActivity)) == null) ? C786410Ut5.t2(Locale.getDefault()) : strLJIJJ, C2222691Bz1.LIZ()));
    }
}
