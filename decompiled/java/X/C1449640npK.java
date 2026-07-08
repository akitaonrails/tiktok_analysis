package X;

import Y.ACallableS28S1000000_22;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0npK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1449640npK {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;
    public static final String LJIIIZ;
    public static final String LJIIJ;
    public static final String LJIIJJI;
    public static final String LJIIL;
    public static final String LJIILIIL;
    public static final String LJIILJJIL;
    public static final String LJIILL;
    public static final String LJIILLIIL;

    static {
        String string;
        C0CHQ.LIZ().getApplicationService().getClass();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2286708xd.LJIILIIL(C0CHQ.LIZ));
            sbLIZ.append("/");
            string = C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getCreativeToolRootDir error exception:");
            sbLIZ2.append(e.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            string = new C1436840nUg(C0CHQ.LIZ).LIZJ().getString("creative_tools_root_path", "");
            if (string == null) {
                string = "";
            }
        }
        if (TextUtils.isEmpty(string)) {
            string = C0CHQ.LIZ.getFilesDir() + "/";
        }
        C15O7.LIZJ(new ACallableS28S1000000_22(string, 0));
        LIZ = string;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(string);
        sbLIZ3.append("tmp/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(string);
        sbLIZ4.append("draft/");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(string);
        sbLIZ5.append("import/");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(string);
        sbLIZ6.append("background_video/tmp/");
        LJ = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(string);
        sbLIZ7.append("background_video/draft/");
        LJFF = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(string);
        sbLIZ8.append("origin_sound/");
        LJI = C2188811AlT.LIZIZ(sbLIZ8);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(string);
        sbLIZ9.append("tmp_video/");
        LJII = C2188811AlT.LIZIZ(sbLIZ9);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(string);
        sbLIZ10.append("parallel_upload/");
        LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ10);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(string);
        sbLIZ11.append("record_work_space");
        LJIIIZ = C2188811AlT.LIZIZ(sbLIZ11);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append(string);
        sbLIZ12.append("cache/");
        LJIIJ = C2188811AlT.LIZIZ(sbLIZ12);
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append(string);
        sbLIZ13.append("filters/");
        LJIIJJI = C2188811AlT.LIZIZ(sbLIZ13);
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append(string);
        sbLIZ14.append("audio-effect/");
        LJIIL = C2188811AlT.LIZIZ(sbLIZ14);
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append(string);
        sbLIZ15.append("music/");
        LJIILIIL = C2188811AlT.LIZIZ(sbLIZ15);
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append(string);
        sbLIZ16.append("noCopyDraft/");
        LJIILJJIL = C2188811AlT.LIZIZ(sbLIZ16);
        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
        sbLIZ17.append(string);
        sbLIZ17.append("effect/download/");
        LJIILL = C2188811AlT.LIZIZ(sbLIZ17);
        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
        sbLIZ18.append(string);
        sbLIZ18.append("compat_draft_track/");
        LJIILLIIL = C2188811AlT.LIZIZ(sbLIZ18);
        C2286708xd.LJIIIZ(new C0VSJ(string));
    }

    public static String LIZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
