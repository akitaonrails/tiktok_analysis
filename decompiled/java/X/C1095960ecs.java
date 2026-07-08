package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ecs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095960ecs implements InterfaceC1096110ed7 {
    public final /* synthetic */ C1095920eco LIZ;

    @Override // X.InterfaceC1096110ed7
    public final void LIZ() {
        C1096040ed0 c1096040ed0;
        C1095920eco c1095920eco = this.LIZ;
        c1095920eco.LJJ = false;
        c1095920eco.LJIIJ = "normal";
        C1092520eXK c1092520eXK = c1095920eco.LJJIFFI;
        DataChannel dataChannel = c1095920eco.LJIILL;
        if (dataChannel != null) {
            C500260Jjc.LJJLIIIJ(dataChannel);
        }
        C1092530eXL c1092530eXL = c1092520eXK.LIZ;
        if (c1092530eXL != null) {
            c1092530eXL.LIZIZ = false;
            c1092530eXL.LIZJ = "";
            c1092530eXL.LIZ = 0;
            c1092530eXL.LIZLLL = null;
        }
        C1095920eco c1095920eco2 = this.LIZ;
        C1096050ed1 c1096050ed1 = c1095920eco2.LJJI;
        if (!(!c1096050ed1.LIZ.isEmpty()) || (c1096040ed0 = (C1096040ed0) C19719612Di.LJJIIZI(c1096050ed1.LIZ)) == null) {
            return;
        }
        c1095920eco2.LJIJJ(c1096040ed0.LIZ, c1096040ed0.LIZIZ, null);
    }

    public C1095960ecs(C1095920eco c1095920eco) {
        this.LIZ = c1095920eco;
    }
}
