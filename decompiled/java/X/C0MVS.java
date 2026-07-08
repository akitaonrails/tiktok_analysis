package X;

import Y.ACallableS23S1000000_8;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0MVS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ() {
        C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJL());
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj.getPath();
    }

    public static final void LIZ(String str) {
        if (C0CHQ.LIZ().LJJIIJZLJL().LIZ() || TextUtils.isEmpty(str)) {
            return;
        }
        C15O7.LIZIZ(new ACallableS23S1000000_8(str, 2), C15O7.LJI, null);
    }

    public static String LIZIZ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJFF(creativeInfo);
    }

    public static String LIZLLL(String str) {
        String strLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_watermark.png");
        return new C0VSJ(strLIZJ, C2188811AlT.LIZIZ(sbLIZ)).getPath();
    }
}
