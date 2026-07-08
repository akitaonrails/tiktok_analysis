package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455370nyZ {
    public static final C1455370nyZ LIZ = new C1455370nyZ();

    public static void LIZ(C0FQ0 c0fq0, InterfaceC1452170ntP interfaceC1452170ntP) {
        VideoPublishEditModel videoPublishEditModel;
        String first;
        if ((c0fq0 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) c0fq0) != null) {
            int iIntValue = 0;
            Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel, false, null, true, 2);
            if (pairLJJIIJZLJL != null) {
                first = pairLJJIIJZLJL.getFirst();
                iIntValue = pairLJJIIJZLJL.getSecond().intValue();
            } else {
                first = "";
            }
            String str = first;
            final C1456350o09 c1456350o09 = new C1456350o09(str, iIntValue, true);
            C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJIIIIZZ = interfaceC1452170ntP;
            c1457050o1H.LIZIZ = str;
            c1457050o1H.LJFF = iIntValue;
            c1457050o1H.LJIIJJI = true;
            c1457050o1H.LJIIL = true;
            c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0nyu
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str2) {
                    C2354709Kn.LJIJJLI(c1456350o09.LIZ);
                    C201955140j.LJIIIIZZ(C1632480saE.LIZIZ, "StreakNLE", str2);
                }
            };
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(videoPublishEditModel, 632);
            C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
            c1457050o1H2.LJIIIZ = awS601S0100000_22;
            C1457060o1I.LIZIZ(c1457050o1H2);
        }
    }
}
