package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714730uit {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"OTP", "PIN", "PI", "BIO", "ID-C", "FACE", "PAYPAL"});
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("OTP", "PIN", "PI", "BIO", "ID-C", "FACE", "PAYPAL");

    public static int LIZ(String str) {
        Iterator<String> it2 = LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (u.LJIJI(it2.next(), str, true)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            return numValueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC1714770uix LIZIZ(java.lang.String r11, boolean r12, boolean r13, int r14, java.util.List r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714730uit.LIZIZ(java.lang.String, boolean, boolean, int, java.util.List, boolean, boolean):X.0uix");
    }
}
