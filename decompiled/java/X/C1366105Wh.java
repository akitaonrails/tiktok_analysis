package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1366105Wh {
    public static final Pair<Integer, String> LIZ(Throwable th) {
        if (th instanceof C1365905Wf) {
            C1365905Wf c1365905Wf = (C1365905Wf) th;
            return new Pair<>(Integer.valueOf(c1365905Wf.getErrorCode()), c1365905Wf.getMsg());
        }
        return new Pair<>(-999, "unknown_error");
    }

    public static final void LIZIZ(EnumC1366205Wi enumC1366205Wi, EnumC1366205Wi enumC1366205Wi2, long j, int i, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("use_cache", CardStruct.IStatusCode.DEFAULT);
        c0lab.LJ("error_code", String.valueOf((enumC1366205Wi2.getStep() * 100000) + i));
        c0lab.LJ("error_domain", str);
        C20684815ws.LJIILLIIL(enumC1366205Wi.getEventName(), c0lab.LIZ);
    }

    public static final void LIZJ(EnumC1366205Wi enumC1366205Wi, boolean z, long j, boolean z2, int i, String str) {
        String str2;
        C0LAB c0lab = new C0LAB();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c0lab.LIZIZ(j, "duration");
        if (z2) {
            str3 = "1";
        }
        c0lab.LJ("use_cache", str3);
        if (!z) {
            c0lab.LIZ(i, "error_code");
            c0lab.LJ("error_domain", str);
        }
        C20684815ws.LJIILLIIL(enumC1366205Wi.getEventName(), c0lab.LIZ);
    }
}
