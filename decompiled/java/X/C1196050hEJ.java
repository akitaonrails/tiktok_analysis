package X;

import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("poi_retag_poi_search_confirm_dialog")
public final class C1196050hEJ extends AbstractC20659715sp<C1397510mTF> {
    public final String LL;
    public final JSONObject LLILLJJLI;
    public final InterfaceC20660615sy LLILLL;
    public final C19EG LLILZ;
    public final Function0<Unit> LLILZIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        int iLJJJ;
        int length;
        C19EG c19eg = this.LLILZ;
        String string = null;
        if (c19eg == null) {
            return null;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131838934));
        String str = this.LL;
        C19EG c19eg2 = this.LLILZ;
        if (c19eg2 != null) {
            string = c19eg2.getString(2131838930);
        }
        String strLIZ = C1196060hEK.LIZ(string, str);
        C444910HcX c444910HcX = new C444910HcX(strLIZ);
        if (strLIZ != null && (iLJJJ = a0.LJJJ(strLIZ, String.valueOf(str), 0, false, 6)) != -1) {
            C444920HcY c444920HcY = new C444920HcY(42, false);
            if (str != null) {
                length = str.length();
            } else {
                length = 0;
            }
            C786410Ut5.s2(c444910HcX, c444920HcY, iLJJJ, length + iLJJJ, 33);
        }
        c1397580mTM.LIZIZ(c444910HcX);
        C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 1043));
        c1397580mTM.LJ(new AwS597S0100000_18(this, 1044));
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

    public C1196050hEJ(String str, JSONObject jSONObject, C634140Ou4 c634140Ou4, C19EG c19eg, AwS262S0300000_18 awS262S0300000_18) {
        super(c634140Ou4);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
        this.LLILLL = c634140Ou4;
        this.LLILZ = c19eg;
        this.LLILZIL = awS262S0300000_18;
    }
}
