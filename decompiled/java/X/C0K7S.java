package X;

import android.text.BidiFormatter;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.text.Normalizer;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0K7S, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7S {
    public static final C0K7S LIZ = new C0K7S();
    public static final Regex LIZIZ = new Regex("[\\r\\n\\t]+");

    public static C0K77 LIZLLL() {
        Object c098200Yq;
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            c098200Yq = iLiveOuterService != null ? iLiveOuterService.C3() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C0K77) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public static final String LIZ(User user) {
        if (user == null) {
            return "";
        }
        return LIZIZ(user.getUsername(), user.getNickName());
    }

    public static final String LIZJ(User user) {
        String nickName;
        C0K7S c0k7s = LIZ;
        if (user != null) {
            nickName = user.getNickName();
        } else {
            nickName = null;
        }
        c0k7s.getClass();
        String strLJ = LJ(nickName);
        if (TextUtils.isEmpty(strLJ)) {
            return "";
        }
        return BidiFormatter.getInstance().unicodeWrap(strLJ);
    }

    public static String LJ(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        String string = a0.LJLIIIL(LIZIZ.replace(u.LJJIFFI(Normalizer.normalize(charSequence.toString(), Normalizer.Form.NFKC), "\u0000", "", false), " ")).toString();
        if (string.length() == 0) {
            return "";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.CharSequence r4, java.lang.CharSequence r5) {
        /*
            X.0K7S r0 = X.C0K7S.LIZ
            r0.getClass()
            java.lang.String r3 = LJ(r4)
            java.lang.String r4 = LJ(r5)
            r5 = 0
            r1 = 1
            X.0K77 r0 = LIZLLL()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1d
            boolean r0 = r0.LJJ()     // Catch: java.lang.Throwable -> L26
            if (r0 != r1) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L26
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L32:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L3b
            r2 = r1
        L3b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L5a
            int r0 = r4.length()
            if (r0 != 0) goto L58
            r0 = 1
        L4a:
            if (r0 != 0) goto L5a
            r0 = 0
        L4d:
            java.lang.String r2 = ""
            if (r0 == 0) goto L88
            X.0K77 r0 = LIZLLL()
            if (r0 == 0) goto L87
            goto L5c
        L58:
            r0 = 0
            goto L4a
        L5a:
            r0 = 1
            goto L4d
        L5c:
            java.lang.String r0 = r0.LJJIJLIJ(r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = LJ(r0)     // Catch: java.lang.Throwable -> L68
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L68
            goto L74
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L74:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L7b
            r1 = r2
        L7b:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.length()
            if (r0 != 0) goto L84
            r5 = 1
        L84:
            if (r5 != 0) goto L87
            r3 = r1
        L87:
            r4 = r3
        L88:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L96
            android.text.BidiFormatter r0 = android.text.BidiFormatter.getInstance()
            java.lang.String r2 = r0.unicodeWrap(r4)
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K7S.LIZIZ(java.lang.CharSequence, java.lang.CharSequence):java.lang.String");
    }
}
