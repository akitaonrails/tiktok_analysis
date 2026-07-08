package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1905920zhG extends AbstractC1887130zCx {
    @Override // X.AbstractC1887130zCx
    public final void LIZ(InterfaceC251700yB interfaceC251700yB) {
    }

    @Override // X.AbstractC1887130zCx
    public String LIZJ() {
        return C1BWL.LIZJ().getString(2131821595);
    }

    @Override // X.AbstractC1887130zCx
    public final boolean LIZLLL() throws ParseException {
        String strLIZIZ;
        if (C13LQ.LJJIJIIJI(((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase(), new String[]{"US", "BR", "MX", "CA"}) >= 0 || (strLIZIZ = ComplianceServiceProvider.LIZLLL().LIZIZ()) == null || a0.LJJJIL(strLIZIZ)) {
            return false;
        }
        Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(strLIZIZ);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2);
        int i6 = calendar2.get(5);
        int i7 = i - i4;
        if (i2 < i5 || (i2 == i5 && i3 < i6)) {
            i7--;
        }
        return i7 >= 18;
    }
}
