package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.08YY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08YY {
    public static final C08YY LIZ = new C08YY();
    public static final Pattern LIZIZ;

    static {
        Pattern patternCompile;
        try {
            C2217108mP c2217108mP = Regex.Companion;
            c2217108mP.getClass();
            String strQuote = Pattern.quote("tiktok.me");
            c2217108mP.getClass();
            String strQuote2 = Pattern.quote("/group/");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(https?://");
            sbLIZ.append(strQuote);
            sbLIZ.append(strQuote2);
            sbLIZ.append("[A-Za-z0-9]+/?)");
            patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("GROUP_LINK_PATTERN compile error: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            patternCompile = null;
        }
        LIZIZ = patternCompile;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn<? super X.AbstractC2030507xP> r12) {
        /*
            r9 = this;
            r5 = r10
            boolean r0 = r12 instanceof X.C08YX
            if (r0 == 0) goto L25
            r8 = r12
            X.08YX r8 = (X.C08YX) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r8.LLILZ = r2
        L13:
            java.lang.Object r2 = r8.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L2b
            java.lang.Object r5 = r8.LL
            java.lang.String r5 = (java.lang.String) r5
            goto L53
        L25:
            X.08YX r8 = new X.08YX
            r8.<init>(r9, r12)
            goto L13
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r2)
            X.1Dac r3 = X.C2258521Dac.LIZ     // Catch: java.lang.Exception -> Laa
            if (r11 == 0) goto L4f
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r11)     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L4f
            long r6 = r0.longValue()     // Catch: java.lang.Exception -> Laa
        L44:
            r8.LL = r5     // Catch: java.lang.Exception -> Laa
            r8.LLILZ = r4     // Catch: java.lang.Exception -> Laa
            java.lang.Object r2 = r3.LIZJ(r4, r5, r6, r8)     // Catch: java.lang.Exception -> Laa
            if (r2 != r1) goto L56
            goto L52
        L4f:
            r6 = 0
            goto L44
        L52:
            return r1
        L53:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> Laa
        L56:
            com.ss.android.ugc.aweme.network.model.GroupLinkPreviewResponse r2 = (com.ss.android.ugc.aweme.network.model.GroupLinkPreviewResponse) r2     // Catch: java.lang.Exception -> Laa
            com.ss.android.ugc.aweme.network.model.LinkPreviewError r4 = r2.error     // Catch: java.lang.Exception -> Laa
            if (r4 == 0) goto L8a
            int r0 = r4.errorCode     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L8a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = "biz error: "
            r1.append(r0)     // Catch: java.lang.Exception -> Laa
            int r0 = r4.errorCode     // Catch: java.lang.Exception -> Laa
            r1.append(r0)     // Catch: java.lang.Exception -> Laa
            r0 = 32
            r1.append(r0)     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = r4.errorMessage     // Catch: java.lang.Exception -> Laa
            r1.append(r0)     // Catch: java.lang.Exception -> Laa
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Laa
            X.07xN r3 = new X.07xN     // Catch: java.lang.Exception -> Laa
            X.08YZ r2 = new X.08YZ     // Catch: java.lang.Exception -> Laa
            int r1 = r4.errorCode     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = r4.errorMessage     // Catch: java.lang.Exception -> Laa
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> Laa
            r3.<init>(r2)     // Catch: java.lang.Exception -> Laa
            return r3
        L8a:
            com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview r0 = r2.group     // Catch: java.lang.Exception -> Laa
            if (r0 != 0) goto L9c
            X.07xN r3 = new X.07xN     // Catch: java.lang.Exception -> Laa
            X.08YZ r2 = new X.08YZ     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = "group info is null"
            r0 = 0
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> Laa
            r3.<init>(r2)     // Catch: java.lang.Exception -> Laa
            return r3
        L9c:
            X.07xQ r3 = new X.07xQ     // Catch: java.lang.Exception -> Laa
            long r1 = r0.convShortId     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = r0.groupName     // Catch: java.lang.Exception -> Laa
            if (r0 != 0) goto La6
            java.lang.String r0 = ""
        La6:
            r3.<init>(r5, r1, r0)     // Catch: java.lang.Exception -> Laa
            return r3
        Laa:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "network error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.07xN r3 = new X.07xN
            r3.<init>(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08YY.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
