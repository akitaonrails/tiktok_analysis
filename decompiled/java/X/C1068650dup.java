package X;

import Y.ACListenerS151S0100000_16;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.feed.model.AutofillDisclaimerModel;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AutofillWindowModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068650dup {
    public static boolean LJI;
    public final C19EG LIZ;
    public final boolean LIZIZ;
    public final AutofillModel LIZJ;
    public final View LIZLLL;
    public AdAutofillPopupModel LJ;
    public AdAutofillModel LJFF;

    public final void LIZLLL() {
        String str;
        AdAutofillAdInfo adAutofillAdInfo;
        AdAutofillAdInfo adAutofillAdInfo2;
        String str2 = TuxSheet._pnsPageId;
        str = null;
        String str3 = null;
        C1391190mJ3.LJ(this.LIZLLL, new C1068340duK(false, null));
        if (!this.LIZIZ) {
            C1068020dto.LIZIZ(false);
            try {
                View view = this.LIZLLL;
                AdAutofillPopupModel adAutofillPopupModel = this.LJ;
                C1068020dto.LJIILLIIL(view, new JSONObject(C08JS.LIZLLL(adAutofillPopupModel != null ? adAutofillPopupModel.autofillInfo : null)), true, false, true, new AwS595S0100000_16(this, 202));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return;
            }
        }
        C1068020dto.LIZIZ(true);
        InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
        C1043510dGH.LIZ.getClass();
        C1023960ckk c1023960ckk = C1043510dGH.LJIILJJIL;
        AdAutofillPopupModel adAutofillPopupModel2 = this.LJ;
        if (adAutofillPopupModel2 == null || (adAutofillAdInfo2 = adAutofillPopupModel2.adInfo) == null || (str = adAutofillAdInfo2.cid) == null) {
            str = "";
        }
        if (adAutofillPopupModel2 != null && (adAutofillAdInfo = adAutofillPopupModel2.adInfo) != null) {
            str3 = adAutofillAdInfo.logExtra;
        }
        interfaceC1009950cO9.logAd(c1023960ckk, str, str3, null, new AwS595S0100000_16(this, 201));
        C1391190mJ3.LJ(this.LIZLLL, C343970De7.LIZ);
    }

    public final void LJ() {
        String strLIZIZ;
        String strLIZIZ2;
        AdAutofillPopupModel adAutofillPopupModel = this.LJ;
        this.LJFF = adAutofillPopupModel != null ? adAutofillPopupModel.autofillInfo : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        AdAutofillModel adAutofillModel = this.LJFF;
        sbLIZ.append(adAutofillModel != null ? adAutofillModel.firstName : null);
        AdAutofillModel adAutofillModel2 = this.LJFF;
        sbLIZ.append(adAutofillModel2 != null ? adAutofillModel2.lastName : null);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
        AdAutofillModel adAutofillModel3 = this.LJFF;
        if (adAutofillModel3 != null) {
            strLIZIZ = adAutofillModel3.email;
            strLIZIZ2 = adAutofillModel3.mobile;
        } else {
            strLIZIZ = null;
            strLIZIZ2 = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        AdAutofillModel adAutofillModel4 = this.LJFF;
        sbLIZ2.append(adAutofillModel4 != null ? adAutofillModel4.unit : null);
        AdAutofillModel adAutofillModel5 = this.LJFF;
        sbLIZ2.append(adAutofillModel5 != null ? adAutofillModel5.address : null);
        AdAutofillModel adAutofillModel6 = this.LJFF;
        sbLIZ2.append(adAutofillModel6 != null ? adAutofillModel6.city : null);
        AdAutofillModel adAutofillModel7 = this.LJFF;
        sbLIZ2.append(adAutofillModel7 != null ? adAutofillModel7.state : null);
        AdAutofillModel adAutofillModel8 = this.LJFF;
        sbLIZ2.append(adAutofillModel8 != null ? adAutofillModel8.zipCode : null);
        AdAutofillModel adAutofillModel9 = this.LJFF;
        sbLIZ2.append(adAutofillModel9 != null ? adAutofillModel9.country : null);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ2);
        String strLIZIZ5 = "";
        if (C123100dR.LIZ(strLIZIZ3)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(strLIZIZ3);
            strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (C123100dR.LIZ(strLIZIZ)) {
            if (C123100dR.LIZ(strLIZIZ5)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ5);
                sbLIZ4.append('\n');
                sbLIZ4.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            strLIZIZ5 = strLIZIZ;
        }
        if (C123100dR.LIZ(strLIZIZ2)) {
            if (C123100dR.LIZ(strLIZIZ5)) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ5);
                sbLIZ5.append('\n');
                sbLIZ5.append(strLIZIZ2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
            }
            strLIZIZ5 = strLIZIZ2;
        }
        if (C123100dR.LIZ(strLIZIZ4)) {
            if (C123100dR.LIZ(strLIZIZ5)) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ5);
                sbLIZ6.append('\n');
                sbLIZ6.append(strLIZIZ4);
                strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
            }
            strLIZIZ5 = strLIZIZ4;
        }
        ((TextView) this.LIZLLL.findViewById(R.id.bfr)).setText(strLIZIZ5);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[PHI: r4
      0x006b: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:13:0x0069, B:11:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[PHI: r4
      0x007d: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:13:0x0069, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings$AdAutofillConfig r0 = com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings.LIZ()
            java.lang.String r2 = r0.settingLynxSchema
            X.0q7g r1 = X.C1541950qED.LIZJ
            X.0dut r0 = new X.0dut
            r0.<init>()
            r1.getClass()
            X.C1537900q7g.LJIIIIZZ(r0)
            X.19EG r3 = r8.LIZ     // Catch: java.lang.Exception -> L41
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Exception -> L41
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "initialData"
            com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel r0 = r8.LJ     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = X.C08JS.LIZLLL(r0)     // Catch: java.lang.Exception -> L41
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "target_handler"
            java.lang.String r0 = "ad_autofill_edit"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L41
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L41
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r3, r0)     // Catch: java.lang.Exception -> L41
            r0.open()     // Catch: java.lang.Exception -> L41
            goto L48
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L48:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.log.IAdWebEventLogger> r0 = com.ss.android.ugc.aweme.log.IAdWebEventLogger.class
            java.lang.Object r2 = r1.getService(r0)
            X.0cO9 r2 = (X.InterfaceC1009950cO9) r2
            X.0dGH r0 = X.C1043510dGH.LIZ
            r0.getClass()
            X.0ckk r3 = X.C1043510dGH.LJIIZILJ
            com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel r1 = r8.LJ
            if (r1 == 0) goto L67
            com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo r0 = r1.adInfo
            if (r0 == 0) goto L67
            java.lang.String r4 = r0.cid
            if (r4 != 0) goto L6b
        L67:
            java.lang.String r4 = ""
            if (r1 == 0) goto L7d
        L6b:
            com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo r0 = r1.adInfo
            if (r0 == 0) goto L7d
            java.lang.String r5 = r0.logExtra
        L71:
            r6 = 0
            kotlin.jvm.internal.AwS595S0100000_16 r7 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 200(0xc8, float:2.8E-43)
            r7.<init>(r8, r0)
            r2.logAd(r3, r4, r5, r6, r7)
            return
        L7d:
            r5 = 0
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1068650dup.LIZJ():void");
    }

    public final C444910HcX LIZ(boolean z) {
        AutofillModel autofillModel;
        AutofillDisclaimerModel disclaimer;
        String prompt;
        String learnMore;
        AutofillDisclaimerModel disclaimer2;
        AutofillModel autofillModel2;
        AutofillDisclaimerModel disclaimer3;
        String str = "";
        if (!z ? !((autofillModel = this.LIZJ) == null || (disclaimer = autofillModel.getDisclaimer()) == null || (prompt = disclaimer.getPrompt()) == null) : !((autofillModel2 = this.LIZJ) == null || (disclaimer3 = autofillModel2.getDisclaimer()) == null || (prompt = disclaimer3.getDesc()) == null)) {
            str = prompt;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        AutofillModel autofillModel3 = this.LIZJ;
        if (autofillModel3 != null && (disclaimer2 = autofillModel3.getDisclaimer()) != null) {
            learnMore = disclaimer2.getLearnMore();
        } else {
            learnMore = null;
        }
        sbLIZ.append(learnMore);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int length = str.length() - 1;
        int length2 = str.length() + strLIZIZ.length();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(strLIZIZ);
        C444910HcX c444910HcX = new C444910HcX(C2188811AlT.LIZIZ(sbLIZ2));
        c444910HcX.LIZ(61);
        int i = length + 1;
        C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0dur
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LIZJ(view.getContext(), "user_information_page", AdAutofillConfigSettings.LIZ().learnMoreLink);
            }
        }, i, length2, 33);
        C786410Ut5.s2(c444910HcX, new C444920HcY(63, true), i, length2, 33);
        return c444910HcX;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[PHI: r4
      0x0037: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:12:0x0035, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r9) {
        /*
            r8 = this;
            r0 = 0
            X.C1068020dto.LIZIZ(r0)
            com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel r0 = r8.LJ
            r5 = 0
            if (r0 == 0) goto L49
            java.lang.String r1 = r0.requestId
        Lb:
            boolean r0 = r8.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C1068020dto.LJIILJJIL(r0, r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.log.IAdWebEventLogger> r0 = com.ss.android.ugc.aweme.log.IAdWebEventLogger.class
            java.lang.Object r2 = r1.getService(r0)
            X.0cO9 r2 = (X.InterfaceC1009950cO9) r2
            X.0dGH r0 = X.C1043510dGH.LIZ
            r0.getClass()
            X.0ckk r3 = X.C1043510dGH.LJIILL
            com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel r1 = r8.LJ
            if (r1 == 0) goto L33
            com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo r0 = r1.adInfo
            if (r0 == 0) goto L33
            java.lang.String r4 = r0.cid
            if (r4 != 0) goto L37
        L33:
            java.lang.String r4 = ""
            if (r1 == 0) goto L3d
        L37:
            com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo r0 = r1.adInfo
            if (r0 == 0) goto L3d
            java.lang.String r5 = r0.logExtra
        L3d:
            r6 = 0
            kotlin.jvm.internal.AwS124S0101000_16 r7 = new kotlin.jvm.internal.AwS124S0101000_16
            r0 = 11
            r7.<init>(r8, r9, r0)
            r2.logAd(r3, r4, r5, r6, r7)
            return
        L49:
            r1 = r5
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1068650dup.LIZIZ(int):void");
    }

    public C1068650dup(C19EG c19eg, boolean z, JSONObject jSONObject, AutofillModel autofillModel) {
        AutofillWindowModel updateWindow;
        String deny;
        AutofillWindowModel updateWindow2;
        String confirm;
        AutofillWindowModel updateWindow3;
        String header;
        AutofillWindowModel saveWindow;
        String deny2;
        AutofillWindowModel saveWindow2;
        String confirm2;
        AutofillWindowModel saveWindow3;
        String header2;
        AutofillDisclaimerModel disclaimer;
        String desc;
        AutofillWindowModel autofillWindow;
        String deny3;
        AutofillWindowModel autofillWindow2;
        String confirm3;
        AutofillWindowModel autofillWindow3;
        String edit;
        AutofillWindowModel autofillWindow4;
        String header3;
        this.LIZ = c19eg;
        this.LIZIZ = z;
        this.LIZJ = autofillModel;
        this.LIZLLL = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.lh, null, false);
        try {
            this.LJ = (AdAutofillPopupModel) C08JS.LIZ(C786410Ut5.J3(jSONObject), AdAutofillPopupModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        String str = "";
        if (this.LIZIZ) {
            TextView textView = (TextView) this.LIZLLL.findViewById(R.id.y3j);
            AutofillModel autofillModel2 = this.LIZJ;
            textView.setText((autofillModel2 == null || (autofillWindow4 = autofillModel2.getAutofillWindow()) == null || (header3 = autofillWindow4.getHeader()) == null) ? "" : header3);
            TextView textView2 = (TextView) this.LIZLLL.findViewById(R.id.wmy);
            AutofillModel autofillModel3 = this.LIZJ;
            textView2.setText((autofillModel3 == null || (autofillWindow3 = autofillModel3.getAutofillWindow()) == null || (edit = autofillWindow3.getEdit()) == null) ? "" : edit);
            TextView textView3 = (TextView) this.LIZLLL.findViewById(R.id.wpw);
            AutofillModel autofillModel4 = this.LIZJ;
            textView3.setText((autofillModel4 == null || (autofillWindow2 = autofillModel4.getAutofillWindow()) == null || (confirm3 = autofillWindow2.getConfirm()) == null) ? "" : confirm3);
            TextView textView4 = (TextView) this.LIZLLL.findViewById(R.id.pc2);
            AutofillModel autofillModel5 = this.LIZJ;
            if (autofillModel5 != null && (autofillWindow = autofillModel5.getAutofillWindow()) != null && (deny3 = autofillWindow.getDeny()) != null) {
                str = deny3;
            }
            textView4.setText(str);
            C786410Ut5.LLLLZLL((TuxTextView) this.LIZLLL.findViewById(R.id.bfh), 0);
            ((TextView) this.LIZLLL.findViewById(R.id.bfh)).setText(LIZ(true));
            ((TextView) this.LIZLLL.findViewById(R.id.bfh)).setMovementMethod(C431260Gvc.LIZ);
            C786410Ut5.LLLLZLL((TuxTextView) this.LIZLLL.findViewById(R.id.bfi), 8);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.LIZLLL.findViewById(R.id.bfh), 0);
            ((TextView) this.LIZLLL.findViewById(R.id.bfh)).setText(LIZ(false));
            ((TextView) this.LIZLLL.findViewById(R.id.bfh)).setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView5 = (TextView) this.LIZLLL.findViewById(R.id.bfi);
            AutofillModel autofillModel6 = this.LIZJ;
            textView5.setText((autofillModel6 == null || (disclaimer = autofillModel6.getDisclaimer()) == null || (desc = disclaimer.getDesc()) == null) ? "" : desc);
            C786410Ut5.LLLLZLL((TuxTextView) this.LIZLLL.findViewById(R.id.bfi), 0);
            if (C1068020dto.LJIIJ() == null) {
                TextView textView6 = (TextView) this.LIZLLL.findViewById(R.id.y3j);
                AutofillModel autofillModel7 = this.LIZJ;
                textView6.setText((autofillModel7 == null || (saveWindow3 = autofillModel7.getSaveWindow()) == null || (header2 = saveWindow3.getHeader()) == null) ? "" : header2);
                TextView textView7 = (TextView) this.LIZLLL.findViewById(R.id.wpw);
                AutofillModel autofillModel8 = this.LIZJ;
                textView7.setText((autofillModel8 == null || (saveWindow2 = autofillModel8.getSaveWindow()) == null || (confirm2 = saveWindow2.getConfirm()) == null) ? "" : confirm2);
                TextView textView8 = (TextView) this.LIZLLL.findViewById(R.id.pc2);
                AutofillModel autofillModel9 = this.LIZJ;
                if (autofillModel9 != null && (saveWindow = autofillModel9.getSaveWindow()) != null && (deny2 = saveWindow.getDeny()) != null) {
                    str = deny2;
                }
                textView8.setText(str);
            } else {
                TextView textView9 = (TextView) this.LIZLLL.findViewById(R.id.y3j);
                AutofillModel autofillModel10 = this.LIZJ;
                textView9.setText((autofillModel10 == null || (updateWindow3 = autofillModel10.getUpdateWindow()) == null || (header = updateWindow3.getHeader()) == null) ? "" : header);
                TextView textView10 = (TextView) this.LIZLLL.findViewById(R.id.wpw);
                AutofillModel autofillModel11 = this.LIZJ;
                textView10.setText((autofillModel11 == null || (updateWindow2 = autofillModel11.getUpdateWindow()) == null || (confirm = updateWindow2.getConfirm()) == null) ? "" : confirm);
                TextView textView11 = (TextView) this.LIZLLL.findViewById(R.id.pc2);
                AutofillModel autofillModel12 = this.LIZJ;
                if (autofillModel12 != null && (updateWindow = autofillModel12.getUpdateWindow()) != null && (deny = updateWindow.getDeny()) != null) {
                    str = deny;
                }
                textView11.setText(str);
            }
        }
        if (!this.LIZIZ) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LIZLLL.findViewById(R.id.wmy), 8);
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LIZLLL.findViewById(R.id.k1_), 8);
        }
        C786410Ut5.h9((TuxTextView) this.LIZLLL.findViewById(R.id.wmy), new ACListenerS151S0100000_16(this, 63));
        C786410Ut5.a9((TuxIconView) this.LIZLLL.findViewById(R.id.k1_), new ACListenerS151S0100000_16(this, 64));
        LJ();
        if (this.LIZIZ) {
            C786410Ut5.U8((C197039127h) this.LIZLLL.findViewById(R.id.wpw), new ACListenerS151S0100000_16(this, 65));
        } else {
            C786410Ut5.U8((C197039127h) this.LIZLLL.findViewById(R.id.wpw), new ACListenerS151S0100000_16(this, 66));
        }
        C786410Ut5.h9((TuxTextView) this.LIZLLL.findViewById(R.id.pc2), new ACListenerS151S0100000_16(this, 67));
    }
}
