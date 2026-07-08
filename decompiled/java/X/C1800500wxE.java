package X;

import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.0wxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800500wxE {
    public static void LIZ(InterfaceC214902198i interfaceC214902198i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish, scene: ");
        sbLIZ.append(interfaceC214902198i.ib());
        C1606580ruS.LIZIZ(interfaceC214902198i, C2188811AlT.LIZIZ(sbLIZ));
        SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
        if (sAFFragmentRootSceneIb != null) {
            C20630415o6.LIZ(sAFFragmentRootSceneIb);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
