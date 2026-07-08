package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Set;

/* JADX INFO: renamed from: X.10eE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19295210eE {
    public static final C19295210eE LIZ = new C19295210eE();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"FR", "CH", "SE", "ME", "RS", "SJ", "IT", "EE", "VA", "SM", "AD", "GG", "LU", "NO", "ES", "RO", "MT", "IE", "HR", "MC", "GI", "LT", "IS", "SI", "IM", "BG", "HU", "BE", "PT", "FO", "AL", "CZ", "NL", "LV", "AT", "JE", "LI", "MK", "BA", "BY", "MD", "GR", "SK", "UA", "XK", "DE", "DK", "PL", "FI", "RU", "GB"});

    public static void LIZIZ(Context context) {
        String strLJIIIIZZ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (strLJIIIIZZ = iAccountService.LJIIIIZZ()) == null) {
            strLJIIIIZZ = "";
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1511205vq(context, "signup_page", strLJIIIIZZ, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final android.content.Context r14, final java.lang.String r15, X.InterfaceC1364105Vn<? super android.text.SpannableString> r16) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19295210eE.LIZ(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }
}
