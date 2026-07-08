package X;

import android.text.SpannableString;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewManualSpeedTestSheet;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UWO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PreviewManualSpeedTestSheet LL;
    public final /* synthetic */ C1D49 LLILLJJLI;
    public final /* synthetic */ C0UWN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UWO(PreviewManualSpeedTestSheet previewManualSpeedTestSheet, C1D49 c1d49, C0UWN c0uwn) {
        super(0);
        this.LL = previewManualSpeedTestSheet;
        this.LLILLJJLI = c1d49;
        this.LLILLL = c0uwn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLIZIZ;
        C20483915Dh c20483915Dh = this.LL.LLIZ;
        if (c20483915Dh != null) {
            c20483915Dh.setEndTextButtonEnable(true);
        }
        PreviewManualSpeedTestSheet previewManualSpeedTestSheet = this.LL;
        String str = PreviewManualSpeedTestSheet._pnsPageId;
        previewManualSpeedTestSheet.zS((Math.min((this.LLILLJJLI.LIZIZ - 0.0f) / (PreviewManualSpeedTestSheet.LLLIZZ - 0.0f), 1.0f) * 174.0f) + 6.0f, false, true);
        C16F5 c16f5 = this.LL.LLJZIJLIL;
        if (c16f5 != null) {
            C0UWN c0uwn = this.LLILLL;
            int i = this.LLILLJJLI.LIZIZ;
            c0uwn.getClass();
            c16f5.setText(C0UWN.LIZJ(i));
        }
        C0UWN c0uwn2 = this.LLILLL;
        C1D49 c1d49 = this.LLILLJJLI;
        c0uwn2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCommentStr: ");
        sbLIZ.append(c1d49);
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = C0UWP.LIZ[c1d49.LJIIJ.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (c1d49.LJIIJ == C0UWQ.GOOD_NETWORK) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C497740JfY.LJIJI(2131853086));
                sbLIZ2.append(c0uwn2.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C497740JfY.LJIJI(2131853085));
                sbLIZ3.append(c0uwn2.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            String strLIZ = C758140Toa.LIZ(C475510Ikn.LJ(c0uwn2.LIZIZ), Integer.valueOf(c1d49.LIZIZ()));
            if (strLIZ == null) {
                strLIZ = "";
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(strLIZ);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ4));
            C1119920fFW.LJIIIIZZ(spannableString, strLIZIZ.length(), spannableString.length(), 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
            C16F5 c16f52 = c0uwn2.LIZIZ.LLL;
            if (c16f52 != null) {
                c16f52.setText(spannableString);
            }
        } else {
            C16F5 c16f53 = c0uwn2.LIZIZ.LLL;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131853093));
            }
        }
        C0UWN c0uwn3 = this.LLILLL;
        C1D49 c1d492 = this.LLILLJJLI;
        C16FS c16fs = c0uwn3.LIZIZ.LLLFF;
        if (c16fs != null) {
            c16fs.setEnabled(true);
            if (c1d492.LJIIJ == C0UWQ.POOR_NETWORK) {
                c16fs.setText(C497740JfY.LJIJI(2131853092));
            } else {
                c16fs.setText(C497740JfY.LJIJI(2131853081));
            }
        }
        return Unit.LIZ;
    }
}
