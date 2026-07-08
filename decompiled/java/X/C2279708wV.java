package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.08wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2279708wV {
    public static String LIZ() {
        String strLJIILIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.VOP_CLONE, "");
        if (!new C0VSJ(strLJIILIIL).exists()) {
            new C0VSJ(strLJIILIIL).mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(strLJIILIIL));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(simpleDateFormat.format(time));
        sbLIZ2.append(".mp3");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
