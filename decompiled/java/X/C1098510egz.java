package X;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0egz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098510egz implements InterfaceC499240Jhy {
    public final List<String> LIZ = new ArrayList();
    public final C1098500egy LIZIZ = new InterfaceC474670IjR() { // from class: X.0egy
        @Override // X.InterfaceC474670IjR
        public final void LIZ(String str, Map<String, String> map) {
            String str2 = map.get("banner_id");
            if (str2 != null) {
                C1098510egz c1098510egz = this.LIZ;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                if (lLJIILIIL != null) {
                    lLJIILIIL.longValue();
                }
                c1098510egz.getClass();
            }
        }
    };

    public final void LIZ(String str, String str2) {
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            str3 = LocalDateTime.now(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            str3 = simpleDateFormat.format(new Date());
        }
        List<String> list = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
    }
}
