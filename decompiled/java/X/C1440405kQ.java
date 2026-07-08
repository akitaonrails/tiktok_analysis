package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogc.declaration.repo.AuthorDeclarationResponse;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1440405kQ {
    public static final C1440405kQ LIZ = new C1440405kQ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1019));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1020));

    public static AuthorDeclarationResponse LIZ() {
        Object c098200Yq;
        if (!((Boolean) C1236904sh.LIZ.getValue()).booleanValue()) {
            return null;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String string = ((Keva) LIZJ.getValue()).getString("STORAGE_KEY_AUTHOR_DECLARATION_RESPONSE", "");
            c1227904rF.getClass();
            c098200Yq = (AuthorDeclarationResponse) C1227904rF.LIZIZ(string, AuthorDeclarationResponse.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (AuthorDeclarationResponse) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
