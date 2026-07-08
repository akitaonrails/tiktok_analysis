package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewManualSpeedTestSheet;
import java.util.Arrays;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UWN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWN implements C0UWZ {
    public final String LIZ = C497740JfY.LJIJI(2131853100);
    public final /* synthetic */ PreviewManualSpeedTestSheet LIZIZ;

    @Override // X.C0UWZ
    public final void onFail() {
        String str = PreviewManualSpeedTestSheet._pnsPageId;
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", "onFail");
        PreviewManualSpeedTestSheet previewManualSpeedTestSheet = this.LIZIZ;
        previewManualSpeedTestSheet.LLLILZ = false;
        C2250021D4u c2250021D4u = C1D4I.LIZ;
        if (c2250021D4u != null) {
            c2250021D4u.LJIILJJIL = null;
        }
        previewManualSpeedTestSheet.wS(previewManualSpeedTestSheet.LLLIIL, -1, false);
        C11LS c11ls = this.LIZIZ.LLLFZ;
        if (c11ls != null) {
            C500260Jjc.LJJLIIIJLJLI(c11ls);
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this.LIZIZ, 196));
    }

    public C0UWN(PreviewManualSpeedTestSheet previewManualSpeedTestSheet) {
        this.LIZIZ = previewManualSpeedTestSheet;
    }

    public static String LIZJ(int i) {
        if (i < 1000) {
            return C497740JfY.LJIJJ(2131853097, Integer.valueOf(i));
        }
        return C497740JfY.LJIJJ(2131853096, C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000.0f)}, 1)));
    }

    @Override // X.C0UWZ
    public final void LIZ(C1D49 c1d49) {
        String str = PreviewManualSpeedTestSheet._pnsPageId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess: ");
        sbLIZ.append(c1d49);
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        C11LS c11ls = this.LIZIZ.LLLFZ;
        if (c11ls != null) {
            C500260Jjc.LJJLIIIJLJLI(c11ls);
        }
        PreviewManualSpeedTestSheet previewManualSpeedTestSheet = this.LIZIZ;
        previewManualSpeedTestSheet.LLLILZ = false;
        previewManualSpeedTestSheet.LLLIIIIL = c1d49;
        previewManualSpeedTestSheet.wS(previewManualSpeedTestSheet.LLLIIL, c1d49.LIZIZ(), false);
        this.LIZIZ.LLLIIL = c1d49.LIZIZ();
        C500260Jjc.LJJLIIIJJIZ(new C0UWO(this.LIZIZ, c1d49, this));
        C2250021D4u c2250021D4u = C1D4I.LIZ;
        if (c2250021D4u != null) {
            c2250021D4u.LJIILJJIL = null;
        }
    }

    @Override // X.C0UWZ
    public final void LIZIZ(C2249361D2g c2249361D2g) {
        String str = PreviewManualSpeedTestSheet._pnsPageId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("progress: ");
        sbLIZ.append(c2249361D2g);
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJLIIIJJIZ(new AwS256S0300000_12(this.LIZIZ, this, c2249361D2g, 1));
    }
}
