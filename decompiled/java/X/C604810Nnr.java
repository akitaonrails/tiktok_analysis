package X;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0Nnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604810Nnr {
    public final long LIZ;
    public final LifecycleOwner LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinInviteConfig(bbId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lifecycleOwner=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initSubscribeStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", noNeedFollowOnSubscribe=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bbOwnerUId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", subscribedButtonStyle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", unSubscribedButtonStyle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C604810Nnr(long j, LifecycleOwner lifecycleOwner, int i, boolean z, String str, int i2, int i3) {
        this.LIZ = j;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = i2;
        this.LJI = i3;
    }
}
