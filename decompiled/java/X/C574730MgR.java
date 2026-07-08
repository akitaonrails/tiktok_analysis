package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VETimelineParams;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574730MgR implements InterfaceC574710MgP {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC1452170ntP LIZ;
    public VETimelineParams LIZIZ;
    public int LIZJ;
    public VideoSegment LIZLLL;

    @Override // X.InterfaceC574710MgP
    public final void LIZIZ(Pair pair, boolean z, boolean z2) {
    }

    public C574730MgR(InterfaceC1452170ntP interfaceC1452170ntP, VETimelineParams vETimelineParams) {
        this.LIZ = interfaceC1452170ntP;
        this.LIZIZ = vETimelineParams;
    }

    @Override // X.InterfaceC574710MgP
    public final boolean LIZ(float f, float f2, float f3, int i, int i2) {
        this.LIZ.setDisplayState(f2, f3, f, i, i2);
        return true;
    }
}
