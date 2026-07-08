package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("poi_retag_banner_confirm_dialog")
public final class C1201090hMR extends AbstractC20659715sp<C1397510mTF> {
    public final String LL;
    public final InterfaceC20660615sy LLILLJJLI;
    public final Activity LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        int iLJJJ;
        int length;
        Activity activity = this.LLILLL;
        String string = null;
        if (activity == null) {
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_RETAG;
            Throwable th = new Throwable();
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "banner_retag_dialog", null, th);
            return null;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJI(activity.getString(2131838934));
        String str = this.LL;
        Activity activity2 = this.LLILLL;
        if (activity2 != null) {
            string = activity2.getString(2131838930);
        }
        String strLIZ = C1196060hEK.LIZ(string, str);
        C444910HcX c444910HcX = new C444910HcX(strLIZ);
        if (strLIZ != null && (iLJJJ = a0.LJJJ(strLIZ, String.valueOf(str), 0, false, 6)) != -1) {
            C444920HcY c444920HcY = new C444920HcY(43, false);
            if (str != null) {
                length = str.length();
            } else {
                length = 0;
            }
            C786410Ut5.s2(c444910HcX, c444920HcY, iLJJJ, length + iLJJJ, 33);
        }
        c1397580mTM.LIZIZ(c444910HcX);
        C1397720mTa.LIZ(c1397580mTM, this.LLILLL.getString(2131838931), new AwS597S0100000_18(this, 1037));
        C1238130iKB.LIZ(c1397580mTM, new AwS597S0100000_18(this, 1039));
        c1397580mTM.LIZLLL(new AwS597S0100000_18(this, 1040));
        c1397580mTM.LJ(AFwS256S0000000_18.get$arr$(1014));
        c1397580mTM.LJIIIIZZ = true;
        c1397580mTM.LJII = false;
        return new C1397510mTF(c1397580mTM);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C1201090hMR(String str, C1194940hCW c1194940hCW, Activity activity, AwS419S0200000_18 awS419S0200000_18, AwS262S0300000_18 awS262S0300000_18, AwS562S0100000_18 awS562S0100000_18) {
        super(c1194940hCW);
        this.LL = str;
        this.LLILLJJLI = c1194940hCW;
        this.LLILLL = activity;
        this.LLILZ = awS419S0200000_18;
        this.LLILZIL = awS262S0300000_18;
        this.LLILZLL = awS562S0100000_18;
    }
}
