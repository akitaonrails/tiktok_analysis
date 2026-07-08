package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Wmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833530Wmt {
    public static final C832010WkR<C833910WnV> LIZ;
    public static final C832010WkR<GoogleSignInOptions> LIZIZ;
    public static final C833680Wn8 LIZJ;
    public static final C833670Wn7 LIZLLL;
    public static final C832160Wkg LJ;
    public static final C832160Wkg LJFF;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Wn8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Wn7] */
    static {
        C832160Wkg c832160Wkg = new C832160Wkg();
        LJ = c832160Wkg;
        C832160Wkg c832160Wkg2 = new C832160Wkg();
        LJFF = c832160Wkg2;
        AbstractC831970WkN abstractC831970WkN = new AbstractC831970WkN() { // from class: X.0Wmv
            @Override // X.AbstractC831970WkN
            public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, Object obj, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
                return new C833900WnU(context, looper, c831470WjZ, (C833910WnV) obj, interfaceC832260Wkq, interfaceC832270Wkr);
            }
        };
        AbstractC831970WkN abstractC831970WkN2 = new AbstractC831970WkN() { // from class: X.0Wms
            @Override // X.AbstractC832100Wka
            public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (googleSignInOptions == null) {
                    return Collections.emptyList();
                }
                return googleSignInOptions.LJLZ();
            }

            @Override // X.AbstractC831970WkN
            public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, Object obj, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
                return new C833480Wmo(context, looper, c831470WjZ, (GoogleSignInOptions) obj, interfaceC832260Wkq, interfaceC832270Wkr);
            }
        };
        LIZ = new C832010WkR<>("Auth.CREDENTIALS_API", abstractC831970WkN, c832160Wkg);
        LIZIZ = new C832010WkR<>("Auth.GOOGLE_SIGN_IN_API", abstractC831970WkN2, c832160Wkg2);
        LIZJ = new Object() { // from class: X.0Wn8
        };
        LIZLLL = new Object() { // from class: X.0Wn7
        };
    }
}
