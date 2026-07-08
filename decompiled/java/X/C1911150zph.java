package X;

import android.content.Context;
import android.graphics.Color;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridMemoryLeakFixSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911150zph implements InterfaceC20484815Dq {
    public final SparkContext LL;
    public final SheetOptions LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public Fragment LLILZIL;
    public C20484615Do LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;

    @Override // X.InterfaceC20484815Dq
    public final /* synthetic */ boolean bN() {
        return false;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean eO() {
        return false;
    }

    @Override // X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C513200KAs.LIZ(context);
    }

    @Override // X.InterfaceC20484815Dq
    public final /* synthetic */ boolean isCancelable() {
        return true;
    }

    @Override // X.InterfaceC20484815Dq
    public final String j4() {
        return null;
    }

    @Override // X.InterfaceC20484815Dq
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // X.InterfaceC20484815Dq
    public final /* synthetic */ void sl() {
        C1911200zpm.LIZIZ(this);
    }

    @Override // X.InterfaceC20484815Dq
    public final void TF() {
        InterfaceC1800900wxs interfaceC1800900wxs;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = this.LL.LJJIJLIJ();
        if (!(interfaceC1059280dfiLJJIJLIJ instanceof InterfaceC1800900wxs) || (interfaceC1800900wxs = (InterfaceC1800900wxs) interfaceC1059280dfiLJJIJLIJ) == null) {
            return;
        }
        interfaceC1800900wxs.Lm();
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean fv() {
        return this.LLIZ && this.LLILLJJLI.fullscreenEnabled;
    }

    @Override // X.InterfaceC20484815Dq
    public final Fragment getFragment() {
        Fragment fragment = this.LLILZIL;
        if (fragment == null) {
            return null;
        }
        return fragment;
    }

    @Override // X.InterfaceC20484815Dq
    public final void hide() {
        C20484615Do c20484615Do = this.LLILZLL;
        if (c20484615Do != null) {
            c20484615Do.LJFF(this);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean isAdded() {
        Fragment fragment = this.LLILZIL;
        if (fragment == null) {
            fragment = null;
        }
        return fragment.isAdded();
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean isHidden() {
        Fragment fragment = this.LLILZIL;
        if (fragment == null) {
            fragment = null;
        }
        return fragment.isHidden();
    }

    @Override // X.InterfaceC20484815Dq
    public final String lr() {
        return this.LL.containerId;
    }

    @Override // X.InterfaceC20484815Dq
    public final void show() {
        C20484615Do c20484615Do = this.LLILZLL;
        if (c20484615Do != null) {
            c20484615Do.LJIILL(this);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean sk() {
        return this.LLILLJJLI.draggable;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean LLIIIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20484815Dq
    public final String gE() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC20484815Dq
    public final C20484615Do ij() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20484815Dq
    public final SheetOptions iw() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean xB() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC20484815Dq
    public final int QM(Context context) {
        String strLIZIZ;
        String str = this.LLILZ;
        if (str != null && !a0.LJJJIL(str)) {
            try {
                String str2 = this.LLILZ;
                if (str2 != null && u.LJJIIJZLJL(str2, "#", false)) {
                    strLIZIZ = this.LLILZ;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(this.LLILZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                return Color.parseColor(strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return C1911200zpm.LIZ(context);
    }

    @Override // X.InterfaceC20484815Dq
    public final void fq(String str) {
        this.LLIZLLLIL = str;
    }

    @Override // X.InterfaceC20484815Dq
    public final void hK(C20484615Do c20484615Do) {
        this.LLILZLL = c20484615Do;
    }

    @Override // X.InterfaceC20484815Dq
    public final int l5(Context context) {
        return QM(context);
    }

    @Override // X.InterfaceC20484815Dq
    public final void x1(int i) throws JSONException {
        String str;
        SparkPopup sparkPopup;
        Fragment fragment = this.LLILZIL;
        if (fragment == null) {
            fragment = null;
        }
        if ((fragment instanceof SparkPopup) && LiveHybridMemoryLeakFixSetting.INSTANCE.getValue()) {
            Fragment fragment2 = this.LLILZIL;
            if (fragment2 == null) {
                fragment2 = null;
            }
            if ((fragment2 instanceof SparkPopup) && (sparkPopup = (SparkPopup) fragment2) != null) {
                sparkPopup.gS(false);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "unknown";
                    } else {
                        str = "navigateUp";
                    }
                } else {
                    str = "pullDown";
                }
            } else {
                str = "touchOutside";
            }
        } else {
            str = "manually";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("container_id", this.LL.containerId);
        jSONObject.put("dismiss_source", str);
        C389001fE.LIZ("sheet_on_close", jSONObject, System.currentTimeMillis(), false);
    }

    public C1911150zph(SparkContext sparkContext, SheetOptions sheetOptions, boolean z, String str) {
        this.LL = sparkContext;
        this.LLILLJJLI = sheetOptions;
        this.LLILLL = z;
        this.LLILZ = str;
    }
}
