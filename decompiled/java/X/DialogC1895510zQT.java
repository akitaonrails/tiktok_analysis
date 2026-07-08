package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.touchpoint.api.ITouchPointService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC1895510zQT extends DialogC1899840zXS implements InterfaceC1141530foN {
    public final Activity LLILZ;
    public final C1895440zQM LLILZIL;
    public final boolean LLILZLL;
    public boolean LLIZ;
    public final UUID LLIZLLLIL;
    public final boolean LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public final String LLJILJIL;
    public boolean LLJILJILJ;

    public final void LJJLIIIJLLLLLLLZ() throws Throwable {
        Object obj;
        if (!this.LLILZ.isFinishing() && !isShowing()) {
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQafke3hNgW94d+Ig8oW0KOtmCtBxj3a1SaOsNO4GhgoWdz/gcTkRBi7WEAdL9OdFG", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = new Object[0];
            C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                dialogC19728412Gs.show();
                c0wst.LIZ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
            }
            InterfaceC1895520zQU interfaceC1895520zQU = this.LLILZIL.LJ;
            if (interfaceC1895520zQU != null) {
                interfaceC1895520zQU.onShow();
            }
        }
        InterfaceC1895520zQU interfaceC1895520zQU2 = this.LLILZIL.LJ;
        if (interfaceC1895520zQU2 != null) {
            interfaceC1895520zQU2.LJIJJLI();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            if (this.LLJ) {
                C1548820qPI.LJIIIIZZ("support_receipt", this);
                C1548820qPI.LJIIIIZZ("support_age_gate_receipt", this);
                C1548820qPI.LJIIIIZZ("support_login_receipt", this);
                C1548820qPI.LJIIIIZZ("support_dialog_show", this);
            }
            if (!this.LLJILJILJ) {
                this.LLJILJILJ = true;
                InterfaceC1895520zQU interfaceC1895520zQU = this.LLILZIL.LJ;
                if (interfaceC1895520zQU != null) {
                    interfaceC1895520zQU.onDismiss();
                }
            }
            super.dismiss();
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws Throwable {
        Map<String, Object> mapLJIIIIZZ;
        String str;
        int iLIZLLL;
        String strLJFF;
        String strLJFF2;
        String strLJFF3;
        String strLJFF4;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive JsEvent: ");
            sbLIZ.append(c262100zr.LIZ);
            sbLIZ.append(", ");
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                mapLJIIIIZZ = C1871910yoP.LJIIIIZZ(interfaceC1107590evd);
            } else {
                mapLJIIIIZZ = null;
            }
            sbLIZ.append(mapLJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
            String str2 = c262100zr.LIZ;
            String str3 = "";
            int i = 1;
            switch (str2.hashCode()) {
                case -1561634360:
                    if (!str2.equals("support_receipt")) {
                        return;
                    }
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null) {
                        iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd2, "res", 0);
                    } else {
                        iLIZLLL = 0;
                    }
                    InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd3 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, "data", "")) == null) {
                        strLJFF = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 == null || (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd4, "stage", "")) == null) {
                        strLJFF2 = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd5 != null && (strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd5, "container_id", "")) != null) {
                        str3 = strLJFF3;
                    }
                    if (Intrinsics.LJFF(this.LLIZLLLIL.toString(), str3)) {
                        InterfaceC1895520zQU interfaceC1895520zQU = this.LLILZIL.LJ;
                        if (interfaceC1895520zQU != null) {
                            interfaceC1895520zQU.LIZJ();
                        }
                        dismiss();
                        C785410UrT.LIZ(this);
                        InterfaceC1895520zQU interfaceC1895520zQU2 = this.LLILZIL.LJ;
                        if (interfaceC1895520zQU2 == null) {
                            return;
                        }
                        ITouchPointService iTouchPointService = (ITouchPointService) PluggableExtentionKt.pluggableSpi$default(ITouchPointService.class, false, false, false, 14, null);
                        if (iTouchPointService == null || !iTouchPointService.isLogin()) {
                            i = 0;
                        }
                        interfaceC1895520zQU2.LIZ(new C1875750yub(iLIZLLL, i, strLJFF2, strLJFF));
                        return;
                    }
                    return;
                case -1359723740:
                    if (str2.equals("support_dialog_show") && !this.LLILZLL) {
                        InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd6 != null && (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd6, "container_id", "")) != null) {
                            str3 = strLJFF4;
                        }
                        if (!Intrinsics.LJFF(this.LLIZLLLIL.toString(), str3)) {
                            return;
                        }
                        if (this.LLJI == 0) {
                            this.LLJIJIL = true;
                            return;
                        } else {
                            C01U6.LIZIZ(new AwS572S0100000_28(this, 1077));
                            LJJLIIIJLLLLLLLZ();
                            return;
                        }
                    }
                    return;
                case 122391282:
                    str = "support_login_receipt";
                    break;
                case 1075956852:
                    str = "support_age_gate_receipt";
                    break;
                default:
                    return;
            }
            str2.equals(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1895510zQT(Activity activity, C1895440zQM c1895440zQM, boolean z) throws JSONException {
        super(activity, true, false, false);
        boolean z2 = true;
        this.LLILZ = activity;
        this.LLILZIL = c1895440zQM;
        this.LLILZLL = z;
        UUID uuidRandomUUID = UUID.randomUUID();
        this.LLIZLLLIL = uuidRandomUUID;
        this.LLJ = true;
        String str = (String) C01U6.LJ(new AwS572S0100000_28(this, 1074), null);
        this.LLJILJIL = str;
        String str2 = c1895440zQM.LIZLLL;
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        }
        String str3 = z2 ? "" : (String) C01U6.LJ(new AwS572S0100000_28(this, 1075), "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://roma_redirect/?spark_page=common_support");
        sbLIZ.append("&container_id=");
        sbLIZ.append(uuidRandomUUID);
        sbLIZ.append("&show_support_result=");
        sbLIZ.append(c1895440zQM.LIZJ);
        sbLIZ.append("&support_link=");
        sbLIZ.append(URLEncoder.encode(c1895440zQM.LIZIZ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("&inc_pid=");
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!a0.LJJJIL(str3)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append('&');
            sbLIZ3.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        C1548820qPI.LJFF("support_login_receipt", this, UUID.randomUUID().toString());
        C1548820qPI.LJFF("support_age_gate_receipt", this, UUID.randomUUID().toString());
        C1548820qPI.LJFF("support_receipt", this, UUID.randomUUID().toString());
        C1548820qPI.LJFF("support_dialog_show", this, UUID.randomUUID().toString());
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C786410Ut5.a6(frameLayout, layoutParams);
        setContentView(frameLayout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        C19337010ky c19337010ky = new C19337010ky(this, 1);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZIZ);
        sparkContext.LJJJJLL(c19337010ky);
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(activity, sparkContext).LIZ(false);
        C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, layoutParams);
        frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
    }
}
