package X;

import android.content.Context;
import android.view.SurfaceHolder;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.1Cy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247601Cy6 extends AbstractC2247641CyA {
    public final boolean LIZ;
    public boolean LIZIZ;
    public AbstractC2239111CkP LIZJ;
    public AbstractC2239111CkP LIZLLL;

    public final void LIZJ() {
        C20441214yg.LIZIZ("VirtualAvatarDoubleHolder", "pause");
        this.LIZIZ = true;
        AbstractC2239111CkP abstractC2239111CkP = this.LIZJ;
        if (abstractC2239111CkP != null) {
            abstractC2239111CkP.LIZ();
        }
        AbstractC2239111CkP abstractC2239111CkP2 = this.LIZLLL;
        if (abstractC2239111CkP2 != null) {
            abstractC2239111CkP2.LIZ();
        }
    }

    public final void LIZLLL() {
        C20441214yg.LIZIZ("VirtualAvatarDoubleHolder", "release");
        AbstractC2239111CkP abstractC2239111CkP = this.LIZJ;
        if (abstractC2239111CkP != null) {
            abstractC2239111CkP.LIZIZ();
        }
        AbstractC2239111CkP abstractC2239111CkP2 = this.LIZLLL;
        if (abstractC2239111CkP2 != null) {
            abstractC2239111CkP2.LIZIZ();
        }
    }

    public final void LJFF() {
        C20441214yg.LIZIZ("VirtualAvatarDoubleHolder", "start");
        this.LIZIZ = false;
        if (this.LIZ) {
            AbstractC2239111CkP abstractC2239111CkP = this.LIZJ;
            if (abstractC2239111CkP != null) {
                abstractC2239111CkP.LIZLLL();
                return;
            }
            return;
        }
        AbstractC2239111CkP abstractC2239111CkP2 = this.LIZLLL;
        if (abstractC2239111CkP2 != null) {
            abstractC2239111CkP2.LIZLLL();
        }
    }

    public C2247601Cy6(boolean z) {
        this.LIZ = z;
    }

    public final void LIZ(boolean z) {
        if (this.LIZIZ) {
            C20441214yg.LJIIIZ("VirtualAvatarDoubleHolder", "paused, not handleSpeak");
            return;
        }
        if (z) {
            AbstractC2239111CkP abstractC2239111CkP = this.LIZLLL;
            if (abstractC2239111CkP != null) {
                abstractC2239111CkP.LIZ();
            }
            AbstractC2239111CkP abstractC2239111CkP2 = this.LIZJ;
            if (abstractC2239111CkP2 != null) {
                abstractC2239111CkP2.LIZLLL();
                return;
            }
            return;
        }
        AbstractC2239111CkP abstractC2239111CkP3 = this.LIZJ;
        if (abstractC2239111CkP3 != null) {
            abstractC2239111CkP3.LIZ();
        }
        AbstractC2239111CkP abstractC2239111CkP4 = this.LIZLLL;
        if (abstractC2239111CkP4 == null) {
            return;
        }
        abstractC2239111CkP4.LIZLLL();
    }

    public final void LJ(SurfaceHolder surfaceHolder, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurfaceHolder ");
        sbLIZ.append(surfaceHolder);
        C20441214yg.LIZIZ("VirtualAvatarDoubleHolder", C2188811AlT.LIZIZ(sbLIZ));
        surfaceHolder.setFixedSize(i, i2);
        AbstractC2239111CkP abstractC2239111CkP = this.LIZJ;
        if (abstractC2239111CkP != null) {
            abstractC2239111CkP.LIZ = surfaceHolder;
        }
        AbstractC2239111CkP abstractC2239111CkP2 = this.LIZLLL;
        if (abstractC2239111CkP2 != null) {
            abstractC2239111CkP2.LIZ = surfaceHolder;
        }
    }

    public final void LIZIZ(Context context, AbstractC1273900jFs abstractC1273900jFs, C773070UUf c773070UUf, boolean z) {
        boolean z2;
        long j;
        long j2;
        if (c773070UUf == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("liveCore=");
            sbLIZ.append(abstractC1273900jFs);
            sbLIZ.append(" , avatarAsset=");
            sbLIZ.append(c773070UUf);
            C20441214yg.LJ("VirtualAvatarDoubleHolder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (C500260Jjc.LJJJI(Boolean.valueOf(c773070UUf.LIZLLL()))) {
            c773070UUf.LIZJ();
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init player needPush:");
        sbLIZ2.append(z2);
        C20441214yg.LIZIZ("VirtualAvatarDoubleHolder", C2188811AlT.LIZIZ(sbLIZ2));
        long j3 = 0;
        if (z) {
            C2247621Cy8 c2247621Cy8 = new C2247621Cy8(context);
            c2247621Cy8.LIZLLL = "speak";
            Avatar avatar = c773070UUf.LIZ;
            if (avatar != null) {
                j2 = avatar.avatarId;
            } else {
                j2 = 0;
            }
            c2247621Cy8.LJ = j2;
            c2247621Cy8.LIZIZ = c773070UUf.LIZIZ();
            c2247621Cy8.LIZJ = abstractC1273900jFs;
            c2247621Cy8.LIZ = z2;
            c2247621Cy8.LJFF = c773070UUf.LIZLLL;
            this.LIZJ = new C2247591Cy5(context, c2247621Cy8);
            C2247621Cy8 c2247621Cy82 = new C2247621Cy8(context);
            c2247621Cy82.LIZLLL = "quiet";
            Avatar avatar2 = c773070UUf.LIZ;
            if (avatar2 != null) {
                j3 = avatar2.avatarId;
            }
            c2247621Cy82.LJ = j3;
            c2247621Cy82.LIZIZ = c773070UUf.LIZ();
            c2247621Cy82.LIZ = z2;
            c2247621Cy82.LJFF = c773070UUf.LIZLLL;
            c2247621Cy82.LIZJ = abstractC1273900jFs;
            this.LIZLLL = new C2247591Cy5(context, c2247621Cy82);
            return;
        }
        C2247631Cy9 c2247631Cy9 = new C2247631Cy9(context);
        c2247631Cy9.LIZLLL = "speak";
        Avatar avatar3 = c773070UUf.LIZ;
        if (avatar3 != null) {
            j = avatar3.avatarId;
        } else {
            j = 0;
        }
        c2247631Cy9.LJ = j;
        c2247631Cy9.LIZIZ = c773070UUf.LIZIZ();
        c2247631Cy9.LIZJ = abstractC1273900jFs;
        c2247631Cy9.LIZ = z2;
        c2247631Cy9.LJFF = c773070UUf.LIZLLL;
        this.LIZJ = new C2247581Cy4(context, c2247631Cy9);
        C2247631Cy9 c2247631Cy92 = new C2247631Cy9(context);
        c2247631Cy92.LIZLLL = "quiet";
        Avatar avatar4 = c773070UUf.LIZ;
        if (avatar4 != null) {
            j3 = avatar4.avatarId;
        }
        c2247631Cy92.LJ = j3;
        c2247631Cy92.LIZIZ = c773070UUf.LIZ();
        c2247631Cy92.LIZ = z2;
        c2247631Cy92.LJFF = c773070UUf.LIZLLL;
        c2247631Cy92.LIZJ = abstractC1273900jFs;
        this.LIZLLL = new C2247581Cy4(context, c2247631Cy92);
    }
}
