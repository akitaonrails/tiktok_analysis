package X;

import Y.ACListenerS92S0300000_28;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS123S0400000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("au_16_age_compliance_banner")
public final class C1915020zvw extends AbstractC20660815t0 {
    public final C19EG LL;
    public final ViewGroup LLILLJJLI;
    public final String LLILLL;
    public final C01GW LLILZ;
    public final int LLILZIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    public static void LJIIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("style", "bottom");
        c2344009Gk.LJFF("business", "notify_au_u16_profile_privacy_setting_bottom");
        c2344009Gk.LJFF("enter_from", "personal_homepage");
        c2344009Gk.LJFF("action", str);
        C20684815ws.LJIILLIIL("pns_popup_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
        InterfaceC1915180zwC interfaceC1915180zwC = new InterfaceC1915180zwC() { // from class: X.0zvv
            @Override // X.InterfaceC1915180zwC
            public final void LIZ() {
            }

            @Override // X.InterfaceC1915180zwC
            public final void LIZJ(EnumC1876780ywG enumC1876780ywG) {
            }

            @Override // X.InterfaceC1915180zwC
            public final void LJ() {
            }

            @Override // X.InterfaceC1915180zwC
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1915180zwC
            public final void onRejected() {
            }

            @Override // X.InterfaceC1915180zwC
            public final boolean LIZIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
                return C1914950zvp.LIZ(enumC1876780ywG, collectConsentParam);
            }

            @Override // X.InterfaceC1915180zwC
            public final void LIZLLL(Context context, CollectConsentParam collectConsentParam, C1914970zvr c1914970zvr, AwS429S0200000_28 awS429S0200000_28, AwS394S0200000_28 awS394S0200000_28, C1914980zvs c1914980zvs) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_info_circle;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LJ = Integer.valueOf(R.attr.ui);
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ui, context);
                C20515215Pi c20515215Pi = new C1257230ioz(this.LIZ.LLILLJJLI, true).LIZ;
                C1915020zvw c1915020zvw = this.LIZ;
                c20515215Pi.LJFF(c419910GdJ);
                String string = c1915020zvw.LL.getString(2131826723);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1915020zvw.LL.getString(2131826726));
                sbLIZ.append(' ');
                sbLIZ.append(string);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                SpannableString spannableString = new SpannableString(strLIZIZ);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1q, c1915020zvw.LL));
                boolean z = false;
                int iLJJJ = a0.LJJJ(strLIZIZ, string, 0, false, 6);
                int length = string.length() + iLJJJ;
                C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, length, 33);
                C786410Ut5.p2(spannableString, new C444920HcY(82, true), iLJJJ, length, 33);
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJFF = spannableString;
                c1057450dcl.LIZJ = false;
                c1057450dcl.LJIIJ = 2;
                AwS123S0400000_28 awS123S0400000_28 = new AwS123S0400000_28(c1915020zvw, awS429S0200000_28, c1914980zvs, collectConsentParam, 7);
                C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
                c1057450dcl2.LJIILJJIL = awS123S0400000_28;
                c1057450dcl2.LJIIJJI = new ACListenerS92S0300000_28(collectConsentParam, c1915020zvw, c20515215Pi, 15);
                c20515215Pi.LIZLLL();
                C1915020zvw c1915020zvw2 = this.LIZ;
                int i = ((Keva) c1915020zvw2.LLILZ.getValue()).getInt("count", 0);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("style", "bottom");
                c2344009Gk.LJFF("business", "notify_au_u16_profile_privacy_setting_bottom");
                c2344009Gk.LJFF("enter_from", "personal_homepage");
                if (i != 0) {
                    z = true;
                }
                c2344009Gk.LJ(Boolean.valueOf(z), "popup_shown");
                C20684815ws.LJIILLIIL("pns_popup_shown", c2344009Gk.LIZ);
                ((Keva) c1915020zvw2.LLILZ.getValue()).storeInt("count", i + 1);
                c1914970zvr.invoke();
            }
        };
        if (iPNSConsentCollectorService != null) {
            String str = this.LLILLL;
            if (str == null) {
                str = "";
            }
            CollectConsentParam collectConsentParamLJ = iPNSConsentCollectorService.LJ(str);
            if (collectConsentParamLJ != null) {
                iPNSConsentCollectorService.LJFF(this.LL, collectConsentParamLJ, interfaceC1915180zwC, null);
            }
        }
    }

    public C1915020zvw(C19EG c19eg, ViewGroup viewGroup, C0TGX c0tgx, String str) {
        super(c0tgx);
        this.LL = c19eg;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = str;
        this.LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(796));
        this.LLILZIL = 111;
    }
}
