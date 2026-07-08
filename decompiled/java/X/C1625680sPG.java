package X;

import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625680sPG extends AbstractC2255721DQs<InterfaceC1625720sPK> implements InterfaceC1625720sPK, InterfaceC379610EuV {
    public final C1DRG LL;
    public final ShortVideoContext LLILLJJLI;
    public final InterfaceC1625720sPK LLILLL = this;
    public Function0<? extends EnumC1448590nnd> LLILZ = AFwS214S0000000_25.get$arr$(160);

    private final void W1() {
        VESize vESizeLIZLLL = new C1625700sPI(this.LLILLJJLI, iN1()).LIZLLL(1, null);
        if (vESizeLIZLLL != null) {
            float fLIZIZ = C1625700sPI.LIZIZ(vESizeLIZLLL);
            ShortVideoContext shortVideoContext = this.LLILLJJLI;
            int i = vESizeLIZLLL.width;
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.mVideoWidth = i;
            cameraComponentModel.mVideoHeight = vESizeLIZLLL.height;
            shortVideoContext.creativeModel.recordDowngradeModel.resolution = C1625690sPH.LIZ(vESizeLIZLLL);
            this.LLILLJJLI.creativeModel.recordDowngradeModel.bitrate = Float.valueOf(fLIZIZ);
            RecordDowngradeModel recordDowngradeModel = this.LLILLJJLI.creativeModel.recordDowngradeModel;
            recordDowngradeModel.hasDowngradeBeforeCameraInit = true;
            recordDowngradeModel.enterRecordPageWithProp = true;
        }
    }

    public InterfaceC1625720sPK X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1625720sPK
    public Function0<EnumC1448590nnd> iN1() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1625720sPK
    public void pi0(Function0<? extends EnumC1448590nnd> function0) {
        this.LLILZ = function0;
    }

    public C1625680sPG(C1DRG c1drg, ShortVideoContext shortVideoContext) {
        this.LL = c1drg;
        this.LLILLJJLI = shortVideoContext;
        W1();
    }
}
