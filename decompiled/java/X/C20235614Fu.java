package X;

import com.ss.android.ugc.aweme.tako.personalization.AwemeConsumeSignal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.14Fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20235614Fu {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C20235614Fu LIZ = new C20235614Fu();
    public static final Map<String, List<String>> LIZLLL = new LinkedHashMap();
    public static final List<String> LJ = new ArrayList();

    public final void LIZJ() {
        if (LIZIZ) {
            return;
        }
        if (C20235814Fw.LIZ()) {
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            C20235714Fv c20235714Fv = new C20235714Fv(this);
            c1863980ybc.getClass();
            C1863980ybc.LIZIZ = c20235714Fv;
        }
        LIZIZ = true;
    }

    public static AwemeConsumeSignal LIZ(C2252061DCq c2252061DCq) {
        AwemeConsumeSignal awemeConsumeSignal = new AwemeConsumeSignal(c2252061DCq.LIZ, c2252061DCq.LIZIZ, c2252061DCq.LJJIIZI, c2252061DCq.LJIJ, c2252061DCq.LJJIFFI, c2252061DCq.LJIL, c2252061DCq.LJIJJ, c2252061DCq.LJIJJLI, c2252061DCq.LJIILL, c2252061DCq.LJIILLIIL, c2252061DCq.LJJIJIIJI, c2252061DCq.LJJIJIIJIL, c2252061DCq.LJIIZILJ, c2252061DCq.LJJIJ, null, null);
        Integer num = awemeConsumeSignal.awemeType;
        Long l = null;
        boolean z = true;
        if (num != null && num.intValue() == 0) {
            Long lValueOf = Long.valueOf(C14F7.LIZIZ(awemeConsumeSignal.awemeId));
            if (lValueOf.longValue() <= 0) {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                l = lValueOf;
            }
            awemeConsumeSignal.playEndTime = l;
        } else {
            Integer num2 = awemeConsumeSignal.awemeType;
            if (num2 != null && num2.intValue() == 150) {
                Long lValueOf2 = Long.valueOf(C14F7.LIZ(awemeConsumeSignal.awemeId));
                if (lValueOf2.longValue() <= 0) {
                    z = false;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    l = lValueOf2;
                }
                awemeConsumeSignal.playEndIndex = l;
                return awemeConsumeSignal;
            }
        }
        return awemeConsumeSignal;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.tako.personalization.TakoProfile LIZIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20235614Fu.LIZIZ(java.lang.String):com.ss.android.ugc.aweme.tako.personalization.TakoProfile");
    }
}
