package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0LFI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LFI {
    public static int LJ;
    public String LIZ;
    public final String LIZIZ;
    public Bitmap.CompressFormat LIZJ = Bitmap.CompressFormat.PNG;
    public final SimpleDateFormat LIZLLL;

    public final String LIZ() {
        String str = this.LIZJ == Bitmap.CompressFormat.JPEG ? ".jpeg" : ".png";
        Locale locale = Locale.getDefault();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("%s/IMG_%s");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZLLL.format(new Date()));
        sbLIZ2.append("_");
        int i = LJ + 1;
        LJ = i;
        sbLIZ2.append(i);
        return C786410Ut5.k4(locale, strLIZIZ, new Object[]{this.LIZ, C2188811AlT.LIZIZ(sbLIZ2)});
    }

    public final String LIZIZ() {
        String str = this.LIZJ == Bitmap.CompressFormat.JPEG ? ".jpeg" : ".png";
        Locale locale = Locale.getDefault();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("%s/IMG_%s");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZLLL.format(new Date()));
        sbLIZ2.append("_");
        int i = LJ + 1;
        LJ = i;
        sbLIZ2.append(i);
        sbLIZ2.append("_frame");
        return C786410Ut5.k4(locale, strLIZIZ, new Object[]{this.LIZIZ, C2188811AlT.LIZIZ(sbLIZ2)});
    }

    public C0LFI(CreativeInfo creativeInfo) {
        C0VSJ c0vsj = new C0VSJ(((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).photoDir(creativeInfo));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        this.LIZ = c0vsj.getAbsolutePath();
        this.LIZIZ = c0vsj.getAbsolutePath();
        this.LIZLLL = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }
}
