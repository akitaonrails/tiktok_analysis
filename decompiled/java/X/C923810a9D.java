package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0a9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923810a9D {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final LiveEffect LJ;
    public final C0UDD LJFF;
    public final int LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewData(isAvatarSwitch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isVideoSwitchOn=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isUsingBackCamera=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", beautyLevel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sticker=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stickerImageBean=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mirrorStatus=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C923810a9D(boolean z, boolean z2, int i, LiveEffect liveEffect) {
        this(false, z, z2, i, liveEffect, null, 0);
    }

    public C923810a9D(boolean z, boolean z2, boolean z3, int i, LiveEffect liveEffect, C0UDD c0udd, int i2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i;
        this.LJ = liveEffect;
        this.LJFF = c0udd;
        this.LJI = i2;
    }
}
