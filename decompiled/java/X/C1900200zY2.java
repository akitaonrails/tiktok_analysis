package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900200zY2 {
    public static final C01GW<Keva> LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(497));
    public static final C01GW<HashMap<Integer, C1900200zY2>> LJFF = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(496));
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;

    public static String LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }

    public final void LIZIZ() {
        if (!Intrinsics.LJFF(LIZ(), C1900210zY3.LIZIZ().getString(C1894310zOX.LIZ(this.LIZ), ""))) {
            C1900210zY3.LIZIZ().storeInt(C1894310zOX.LIZ(this.LIZIZ), 0);
            C1900210zY3.LIZIZ().storeString(C1894310zOX.LIZ(this.LIZ), LIZ());
        }
        C1900210zY3.LIZIZ().storeInt(C1894310zOX.LIZ(this.LIZJ), 0);
    }

    public C1900200zY2(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextLinkManager");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("current_day_date_");
        sbLIZ2.append(i);
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("text_link_show_times_");
        sbLIZ3.append(i);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("text_link_dismiss_after_");
        sbLIZ4.append(i);
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ4);
        LIZIZ();
    }
}
