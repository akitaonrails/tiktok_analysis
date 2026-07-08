package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0e0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@InterfaceC20647615qs("global_email_auth_dialog")
public final class C1072090e0N extends C10GR {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final InterfaceC20236714Gf<Boolean> LLILLL;
    public final int LLILZ = 6000;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0e0O] */
    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        C1072130e0R c1072130e0R = C1072130e0R.LIZ;
        final C19EG c19eg = this.LL;
        final String str = this.LLILLJJLI;
        ?? r7 = new InterfaceC1072110e0P() { // from class: X.0e0O
            @Override // X.InterfaceC1072110e0P
            public final void LIZ() {
                if (this.LIZ.LLILLL.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LIZ.LLILLL;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
                c20656615sK.LIZ();
            }

            @Override // X.InterfaceC1072110e0P
            public final void LIZIZ() {
                if (this.LIZ.LLILLL.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LIZ.LLILLL;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
                c20656615sK.LIZ();
            }
        };
        c1072130e0R.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(C20642515q3.LJI(2131829467));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C20642515q3.LJI(2131829464));
        sbLIZ.append('\n');
        sbLIZ.append(C20642515q3.LJI(2131829463));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0e0L
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https://support.tiktok.com/");
                C1072130e0R.LIZ.getClass();
                String appLanguage = ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
                if (Intrinsics.LJFF(appLanguage, "he")) {
                    appLanguage = "he_IL";
                } else if (Intrinsics.LJFF(appLanguage, "zh-Hant")) {
                    appLanguage = "zh-Hant-TW";
                }
                sbLIZ2.append(appLanguage);
                sbLIZ2.append("/account-and-privacy/account-privacy-settings/link-your-email-on-android-devices");
                ((IBulletService) ServiceManager.get().getService(IBulletService.class)).LIZ(c19eg, UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", C2188811AlT.LIZIZ(sbLIZ2)).build().toString());
                C1071990e0D c1071990e0D = C1071990e0D.LIZ;
                String str2 = str;
                C2452109jD.LIZ.getClass();
                int i = C2452109jD.LIZLLL.getInt("email_dialog_show_times", 0) + 1;
                EnumC1072080e0M enumC1072080e0M = EnumC1072080e0M.LEARN_MORE;
                c1071990e0D.getClass();
                C1071990e0D.LIZIZ(str2, i, enumC1072080e0M);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(C960203pA.LIZ(R.attr.a1j, c19eg));
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(82);
                textPaint.setTypeface(c444890HcV.getTypeface());
                textPaint.setUnderlineText(false);
            }
        }, a0.LJJJ(strLIZIZ, C20642515q3.LJI(2131829463), 0, false, 6), strLIZIZ.length(), 33);
        c1397580mTM.LIZIZ(spannableString);
        C985403tE.LIZ(c1397580mTM, AFwS245S0000000_12.get$arr$(18));
        c1397580mTM.LIZLLL(new AwS130S1100000_16(str, (C1072100e0O) r7, 1));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF, "bind_email_dialog");
        c1397510mTF.LIZLLL();
        C1071990e0D c1071990e0D = C1071990e0D.LIZ;
        C2452109jD.LIZ.getClass();
        int i = C2452109jD.LIZLLL.getInt("email_dialog_show_times", 0) + 1;
        c1071990e0D.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "auto");
        c2344009Gk.LJIIIIZZ("verify_type", "email");
        c2344009Gk.LIZJ(i, "show_index");
        c2344009Gk.LJIIIIZZ("show_type", "contact_sync_pop_up");
        if (str != null) {
            c2344009Gk.LJFF("enter_from", str);
        }
        C20684815ws.LJIILLIIL("contact_sync_prompt_show", c2344009Gk.LIZ);
    }

    public C1072090e0N(C19EG c19eg, String str, C2252611DEt c2252611DEt) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = c2252611DEt;
    }
}
