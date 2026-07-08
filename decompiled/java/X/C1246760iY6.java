package X;

import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS85S0300000_19;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.experiment.ProfileTabDoubleTapSwitchConfig;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("profile_tab_double_tap_switch_confirm")
public final class C1246760iY6 extends AbstractC20659615so<TuxSheet> {
    public final C19EG LL;
    public final SignificantUserInfo LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public int LLJ;
    public String LLJI;
    public final int LLIZ = 200;
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean(false);
    public final String LLJIJIL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        this.LLILZ.invoke();
        C1246790iY9.LIZ().storeInt("show_count", C1246790iY9.LIZ().getInt("show_count", 0) + 1);
        C1246790iY9.LIZ().storeLong("last_show_time", System.currentTimeMillis());
        this.LLJ = C1246790iY9.LIZ().getInt("show_count", 0);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
        c2344009Gk.LIZJ(this.LLJ, "freq");
        c2344009Gk.LIZJ(C0XQ5.LIZ().LJJI().size(), "account_cnt");
        C20684815ws.LJIILLIIL("switch_account_dialog_show", c2344009Gk.LIZ);
    }

    public final void LJIIL() {
        if (this.LLIZLLLIL.compareAndSet(false, true)) {
            this.LLILZLL.invoke();
        }
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZ;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        boolean z;
        if (!this.LL.isFinishing() && !this.LL.isDestroyed() && !this.LL.getSupportFragmentManager().LJLJJI()) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            String str = this.LLJIJIL;
            if (str != null && str.length() != 0 && Intrinsics.LJFF(curUserId, this.LLJIJIL)) {
                final View viewSd = C786410Ut5.Sd(R.layout.xq, C786410Ut5.ne(c688120Qyw.LIZ), null);
                SignificantUserInfo significantUserInfo = this.LLILLJJLI;
                SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.bhb);
                SmartImageView smartImageView2 = (SmartImageView) viewSd.findViewById(R.id.bh6);
                View viewFindViewById = viewSd.findViewById(R.id.bhc);
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZ = C418440Gaw.LIZIZ(38);
                c19659111vp.LIZIZ = 0.0f;
                c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(10);
                c19659111vp.LJFF = 301989888;
                viewFindViewById.setBackground(c19659111vp.LIZ(viewSd.getContext()));
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(significantUserInfo.avatarUrl);
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C0XQ5.LIZIZ.LJIIJ().getCurUser().getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                if (C426750GoL.LIZLLL(viewSd.getContext())) {
                    C786410Ut5.hc((TuxIconView) viewSd.findViewById(R.id.yhn), -1.0f);
                }
                SignificantUserInfo significantUserInfo2 = this.LLILLJJLI;
                TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.fso);
                tuxTextView.setText(2131849410);
                tuxTextView.LJJJJI(28.0f);
                String strLIZIZ = significantUserInfo2.nickname;
                if (strLIZIZ.length() == 0) {
                    strLIZIZ = significantUserInfo2.LIZIZ();
                }
                ((TextView) viewSd.findViewById(R.id.xdt)).setText(strLIZIZ);
                TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.xdu);
                String strLIZIZ2 = significantUserInfo2.LIZIZ();
                if (strLIZIZ2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(strLIZIZ2);
                    tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                final C013C c013c = new C013C();
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                boolean zLJ = c19252910Tv.LIZLLL().LIZIZ().LJ(this.LL);
                if (zLJ) {
                    c19252910Tv.LIZLLL().LIZIZ().LIZIZ(null, "DoubleClickConfirmPopupTask", this.LLILLL);
                }
                C1390920mIc c1390920mIc = new C1390920mIc(zLJ, C1389340mG4.LIZJ(this.LL, null).LIZIZ);
                c1390920mIc.LIZ.LLJJIII = viewSd;
                c1390920mIc.LJIIIIZZ(0);
                c1390920mIc.LIZ.LLJJIJIIJIL = true;
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJI = 0;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLILLL = false;
                tuxSheet.LLJLLIL = true;
                tuxSheet.LLJLLL = true;
                tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0iY7
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (!c013c.element) {
                            String str2 = this.LLJI;
                            if (str2 == null) {
                                String str3 = TuxSheet._pnsPageId;
                                if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343960De6) {
                                    str2 = "dismiss";
                                } else {
                                    str2 = "pull_down";
                                }
                            }
                            this.LJIILIIL(viewSd, str2);
                            this.LJIIL();
                        }
                    }
                };
                AwS263S0300000_19 awS263S0300000_19 = new AwS263S0300000_19(c013c, this, viewSd, 26);
                LinearLayout linearLayout = (LinearLayout) viewSd.findViewById(R.id.dql);
                TuxTextView tuxTextView3 = (TuxTextView) viewSd.findViewById(R.id.daw);
                C0HZQ c0hzq = (C0HZQ) viewSd.findViewById(R.id.g36);
                TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.e1i);
                C786410Ut5.U8((C197039127h) viewSd.findViewById(R.id.wsw), new ACListenerS85S0300000_19(this, viewSd, awS263S0300000_19, 25));
                if (ProfileTabDoubleTapSwitchConfig.LIZ().popupVersion == 1) {
                    C786410Ut5.LJZL(8, linearLayout);
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                    C786410Ut5.h9(tuxTextView3, new ACListenerS122S0200000_19(this, viewSd, 54));
                    return tuxSheet;
                }
                C786410Ut5.LJZL(0, linearLayout);
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                C786410Ut5.a9(tuxIconView, new ACListenerS122S0200000_19(this, viewSd, 55));
                C786410Ut5.R7(linearLayout, new ACListenerS154S0100000_19(c0hzq, 243));
                C416380GUi.LIZ(8, tuxIconView);
                C416380GUi.LIZ(13, linearLayout);
                return tuxSheet;
            }
            LJIIL();
            return null;
        }
        LJIIL();
        return null;
    }

    public final void LJIILIIL(View view, String str) {
        CompoundButton compoundButton;
        int i = 0;
        if (ProfileTabDoubleTapSwitchConfig.LIZ().popupVersion != 1 && (compoundButton = (CompoundButton) view.findViewById(R.id.g36)) != null && compoundButton.isChecked()) {
            i = 1;
            if (Intrinsics.LJFF(str, "switch")) {
                C1246790iY9.LIZ().storeBoolean("dont_show_again", true);
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
        c2344009Gk.LIZJ(this.LLJ, "freq");
        c2344009Gk.LJIIIIZZ("button_type", str);
        c2344009Gk.LIZJ(i, "do_not_show");
        c2344009Gk.LIZJ(C0XQ5.LIZ().LJJI().size(), "account_cnt");
        C20684815ws.LJIILLIIL("switch_account_dialog_close", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        LJIIL();
    }

    public C1246760iY6(C19EG c19eg, SignificantUserInfo significantUserInfo, String str, AwS572S0100000_28 awS572S0100000_28, C1913360ztG c1913360ztG, AwS572S0100000_28 awS572S0100000_282) {
        this.LL = c19eg;
        this.LLILLJJLI = significantUserInfo;
        this.LLILLL = str;
        this.LLILZ = awS572S0100000_28;
        this.LLILZIL = c1913360ztG;
        this.LLILZLL = awS572S0100000_282;
    }
}
