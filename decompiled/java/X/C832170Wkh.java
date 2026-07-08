package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: X.0Wkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832170Wkh {
    public static final C832180Wki LIZ;
    public static final C832010WkR<C831610Wjn> LIZIZ;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0WkN, X.0Wki] */
    static {
        C832160Wkg c832160Wkg = new C832160Wkg();
        C832160Wkg c832160Wkg2 = new C832160Wkg();
        ?? r4 = new AbstractC831970WkN<C832380Wl2, C831610Wjn>() { // from class: X.0Wki
            @Override // X.AbstractC831970WkN
            public final InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, C831610Wjn c831610Wjn, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
                Integer num = c831470WjZ.LJIIIIZZ;
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "com.google.android.gms.signin.internal.clientRequestedAccount", c831470WjZ.LIZ);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                C786410Ut5.LJJJI("com.google.android.gms.signin.internal.serverClientId", null, bundle);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                C786410Ut5.LJJJI("com.google.android.gms.signin.internal.hostedDomain", null, bundle);
                C786410Ut5.LJJJI("com.google.android.gms.signin.internal.logSessionId", null, bundle);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C832380Wl2(context, looper, c831470WjZ, bundle, interfaceC832260Wkq, interfaceC832270Wkr);
            }
        };
        LIZ = r4;
        AbstractC831970WkN<C832380Wl2, C831740Wk0> abstractC831970WkN = new AbstractC831970WkN<C832380Wl2, C831740Wk0>() { // from class: X.0Wkj
            @Override // X.AbstractC831970WkN
            public final /* bridge */ /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, C831740Wk0 c831740Wk0, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
                throw null;
            }
        };
        new Scope(1, "profile");
        new Scope(1, "email");
        LIZIZ = new C832010WkR<>("SignIn.API", r4, c832160Wkg);
        new C832010WkR("SignIn.INTERNAL_API", abstractC831970WkN, c832160Wkg2);
    }
}
