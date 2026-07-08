package X;

import android.text.TextUtils;
import defpackage.c1;
import defpackage.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590390NDp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (C1ES5.LIZIZ()) {
            C590420NDs.LIZ.getClass();
            if (C590420NDs.LJIIIZ() > 0) {
                if (C590420NDs.LJIIIZ() == 1) {
                    x0.LIZ.getClass();
                    x0.LJIIIIZZ();
                }
                return false;
            }
        }
        if (C0NEU.LIZIZ() == null) {
            x0.LIZ.getClass();
            C590420NDs.LIZ.getClass();
            C590420NDs.LJIIZILJ("");
            return false;
        }
        C590420NDs.LIZ.getClass();
        boolean z = !TextUtils.isEmpty(C590440NDu.LIZJ(C0NEW.ORIGIN.getValue(), -1, C590420NDs.LJIIJ()));
        C1150504el.LIZ().LIZIZ(!z ? 1 : 0, "feed_origin_video_exit_when_used");
        return z;
    }

    public static boolean LIZIZ(int i, String str) {
        int i2;
        boolean zLJ;
        boolean zLIZ;
        int i3;
        if (str == null || str.length() == 0) {
            return false;
        }
        C0NFP c0nfp = C0NFP.LIZ;
        synchronized (c0nfp) {
            if (((Boolean) C279770Axr.LIZ.getValue()).booleanValue()) {
                boolean zContainsKey = C0NFP.LIZIZ.containsKey(str);
                if (zContainsKey) {
                    return c0nfp.LIZ(str);
                }
            }
        }
        List<String> listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
        if (listLJJLIIIJ != null && (!listLJJLIIIJ.isEmpty())) {
            if (((Boolean) c1.LIZ.getValue()).booleanValue()) {
                return true;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            for (String str2 : listLJJLIIIJ) {
                String strLIZJ = C0NFP.LIZJ(str2);
                if (!TextUtils.isEmpty(strLIZJ) && new C0VSJ(strLIZJ).exists()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C0NFP c0nfp2 = C0NFP.LIZ;
                if (!InterfaceC288420BSe.LIZ) {
                    zLJ = false;
                } else {
                    zLJ = C0NFP.LJ(C0NFP.LIZIZ(i, str2));
                }
                if (C294350BgH.LIZ()) {
                    zLIZ = C590370NDn.LIZ(str2, C590440NDu.LJII(str2));
                } else {
                    zLIZ = false;
                }
                C1150504el.LIZ().LIZIZ(i2, "feed_background_video_exit_when_used");
                C202099145x c202099145xLIZ = C1150504el.LIZ();
                if (!zLJ && !zLIZ) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                c202099145xLIZ.LIZIZ(i3, "feed_incomplete_video_exit_when_used");
                if (i2 == 0 && !zLJ && !zLIZ) {
                    C1150504el.LIZ().LIZIZ(0, "feed_video_exit_when_used");
                    c0nfp2.LJIIIIZZ(str, false);
                    return false;
                }
                arrayList.add(Unit.LIZ);
            }
            C1150504el.LIZ().LIZIZ(1, "feed_video_exit_when_used");
            C0NFP.LIZ.LJIIIIZZ(str, true);
            return true;
        }
        C1150504el.LIZ().LIZIZ(0, "feed_video_exit_when_used");
        c0nfp.LJIIIIZZ(str, false);
        return false;
    }
}
