package bn3;

import X.C1D99;
import X.C1DHP;
import X.C1DHV;
import X.C2187101Aii;
import X.C2188811AlT;
import X.C2209021Bcy;
import X.InterfaceC2208871Bcj;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class a implements C1DHP {
    public C1DHV LIZ = new C2187101Aii(new C1D99());
    public InterfaceC2208871Bcj LIZIZ = C2209021Bcy.LIZ;
    public Function0<Boolean> LIZJ = AFwS226S0000000_35.get$arr$(87);
    public boolean LIZLLL;

    @Override // X.C1DHP
    public final void LIZ() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableTakePhotoRatioType:");
        sbLIZ.append(0);
        sbLIZ.append(", forbidOpenCameraInBackground:");
        sbLIZ.append(this.LIZJ.invoke().booleanValue());
        sbLIZ.append(", enableSoftEncodeAcc:");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1DHP
    public final boolean LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1DHP
    public final Function0<Boolean> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.C1DHP
    public final InterfaceC2208871Bcj Tl() {
        return this.LIZIZ;
    }

    @Override // X.C1DHP
    public final C1DHV qa() {
        return this.LIZ;
    }
}
