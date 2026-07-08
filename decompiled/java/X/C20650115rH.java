package X;

import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20650115rH {
    public static final void LIZ(OutreachModel outreachModel, C20650615rM c20650615rM, String str, EnumC20654715s1 enumC20654715s1, String str2, String str3) {
        C20650015rG c20650015rG = new C20650015rG(str, enumC20654715s1, str2, outreachModel.mustShow, outreachModel.forbidCount);
        C20648815r4.LIZ.getClass();
        C20648815r4.LIZ(str3, c20650015rG);
        if (c20650615rM.LIZIZ.get(str2) == null) {
            c20650615rM.LIZIZ.put(str2, new ArrayList());
        }
        List<C20650015rG> list = c20650615rM.LIZIZ.get(str2);
        if (list != null) {
            list.add(c20650015rG);
        }
    }
}
