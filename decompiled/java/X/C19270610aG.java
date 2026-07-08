package X;

import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10aG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19270610aG {
    public static final boolean LIZIZ(AbstractActivityC1602020rn6 abstractActivityC1602020rn6) {
        NavigationScene navigationScene;
        InterfaceC214902198i interfaceC214902198iLIZ;
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        AnonymousClass1993 anonymousClass1993;
        if (Intrinsics.LJFF(abstractActivityC1602020rn6.getRootFragmentClz(), MainRootFragment.class) || (navigationScene = abstractActivityC1602020rn6.getNavigationScene()) == null || (interfaceC214902198iLIZ = C20629915o1.LIZ(abstractActivityC1602020rn6)) == null || (sAFFragmentRootSceneIb = interfaceC214902198iLIZ.ib()) == null) {
            return false;
        }
        AnonymousClass1991 anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(interfaceC214902198iLIZ);
        if (!(anonymousClass1991LIZIZ instanceof AnonymousClass1993) || (anonymousClass1993 = (AnonymousClass1993) anonymousClass1991LIZIZ) == null || !anonymousClass1993.LJJIII) {
            return false;
        }
        SAFFragmentRootScene sAFFragmentRootScene = new SAFFragmentRootScene();
        C1602220rnQ c1602220rnQ = C1602220rnQ.LL;
        abstractActivityC1602020rn6.replaceRoot(MainRootFragment.class, c1602220rnQ, sAFFragmentRootScene);
        AnonymousClass1999.LIZJ(navigationScene, sAFFragmentRootSceneIb, MainRootFragment.class, c1602220rnQ, 0, null, null, null, null, sAFFragmentRootScene, 248);
        navigationScene.remove(sAFFragmentRootSceneIb);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c A[PHI: r7
      0x011c: PHI (r7v1 boolean) = (r7v0 boolean), (r7v4 boolean) binds: [B:76:0x0118, B:38:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.AbstractActivityC1602020rn6 r18, android.content.Intent r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19270610aG.LIZ(X.0rn6, android.content.Intent, java.lang.String, boolean):void");
    }
}
