package Y;

import X.AbstractC1387200mCc;
import X.C08CX;
import X.C0N4G;
import X.C123100dR;
import X.C1295960jpS;
import X.C13LP;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1720106oR;
import X.C1749280vcc;
import X.C1801980wzc;
import X.C1802070wzl;
import X.C1906580ziK;
import X.C197039127h;
import X.C19719512Dh;
import X.C1BMY;
import X.C1C7U;
import X.C20647815qu;
import X.C20684815ws;
import X.C2089608Go;
import X.C2090408Gw;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2196701AyC;
import X.C2196981Aye;
import X.C2197091Ayp;
import X.C2197221Az2;
import X.C2200391B9x;
import X.C2203571BMd;
import X.C2217521Bqg;
import X.C2217531Bqh;
import X.C2238191Civ;
import X.C2248981D0u;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C736460Sui;
import X.C786410Ut5;
import X.C800880VbK;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC20654715s1;
import X.EnumC2194261AuG;
import X.InterfaceC2196591Ay1;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.experiment.CommitConfig;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.minis.page.main.functions.guide.MinisShortCutSnackbarProtocol;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.EnterExitRuleInfo;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.EventParam;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.ExitRule;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS52S0110000_34 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        SchemaParserData schemaParserData;
        String str2;
        int i = C2187451AjH.LIZ;
        MinisFragment minisFragment = (MinisFragment) this.l0;
        if (minisFragment.LLJLLIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMinisLoadFinish, minisLoadError:");
            sbLIZ.append(((MinisFragment) this.l0).LLJLLIL);
            sbLIZ.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        C2196981Aye c2196981Aye = minisFragment.LLJJJ;
        if (c2196981Aye != null) {
            boolean z = this.z1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLoadFinish, context:");
            sbLIZ2.append(c2196981Aye.LIZ);
            sbLIZ2.append(", statusView:");
            sbLIZ2.append(c2196981Aye.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ2);
            c2196981Aye.LJI();
            C1749280vcc c1749280vcc = c2196981Aye.LIZLLL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            View view = c2196981Aye.LJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            if (!c2196981Aye.LJIILLIIL && !z) {
                C2196701AyC c2196701AyC = C2196701AyC.LIZ;
                int value = C0N4G.SUCCESS.getValue();
                c2196701AyC.getClass();
                C2196701AyC.LJIILL(value, true);
                c2196981Aye.LJIILLIIL = true;
            }
        }
        MinisFragment minisFragment2 = (MinisFragment) this.l0;
        if (minisFragment2.LLLJIL) {
            TuxNavBar tuxNavBar = minisFragment2.LLJILJIL;
            if (tuxNavBar != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBar, 8);
            }
        } else {
            TuxNavBar tuxNavBar2 = minisFragment2.LLJILJIL;
            if (tuxNavBar2 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBar2, 0);
            }
        }
        ((MinisFragment) this.l0).US(true);
        if (((MinisFragment) this.l0).hS() instanceof InterfaceC2196591Ay1) {
            ((MinisFragment) this.l0).YS(false);
        }
        MinisFragment minisFragment3 = (MinisFragment) this.l0;
        SchemaParserData schemaParserData2 = minisFragment3.LLJJL;
        if (schemaParserData2 == null || (str = schemaParserData2.schemaUrl) == null || !a0.LJJIIZI(str, "enter_from", false) || (schemaParserData = minisFragment3.LLJJL) == null || (str2 = schemaParserData.schemaUrl) == null || !a0.LJJIIZI(str2, "anchor_selection", false)) {
            C197039127h c197039127h = minisFragment3.LLJJJJJIL;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 8);
            }
        } else {
            C197039127h c197039127h2 = minisFragment3.LLJJJJJIL;
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 0);
            }
            AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
            C197039127h c197039127h3 = minisFragment3.LLJJJJJIL;
            if (c197039127h3 != null) {
                C786410Ut5.U8(c197039127h3, new ACListenerS124S0200000_21(abstractC1387200mCcLIZLLL, minisFragment3, 106));
            }
        }
        ((MinisFragment) this.l0).fT();
        C2197091Ayp.LIZLLL = true;
        ((MinisFragment) this.l0).RS(EnumC2194261AuG.LOAD_SUCCESS, false);
        ((MinisFragment) this.l0).PS();
    }

    public final void LIZ$1() {
        int iLIZIZ;
        int i;
        int i2 = C2187451AjH.LIZ;
        MinisFragment minisFragment = (MinisFragment) this.l0;
        minisFragment.LLJLLIL = null;
        final C2196981Aye c2196981Aye = minisFragment.LLJJJ;
        if (c2196981Aye != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadStart, context:");
            sbLIZ.append(c2196981Aye.LIZ);
            sbLIZ.append(", statusView:");
            sbLIZ.append(c2196981Aye.LIZLLL);
            sbLIZ.append(", isSuppressed:");
            sbLIZ.append(c2196981Aye.LJIIZILJ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!c2196981Aye.LJIIZILJ) {
                final Activity activity = c2196981Aye.LIZ;
                if (activity != null) {
                    View viewSd = C786410Ut5.Sd(R.layout.dn0, C786410Ut5.ne(activity), null);
                    TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.zxn);
                    c2196981Aye.LJIILIIL = tuxTextView;
                    if (tuxTextView != null) {
                        String str = c2196981Aye.LJIIL;
                        if (str == null) {
                            str = "";
                        }
                        tuxTextView.setText(str);
                    }
                    c2196981Aye.LJIILJJIL = (TuxTextView) viewSd.findViewById(R.id.tv_privacy_term);
                    if (C2197221Az2.LIZ(C2195221Avo.LIZ())) {
                        TuxTextView tuxTextView2 = c2196981Aye.LJIILJJIL;
                        if (tuxTextView2 != null) {
                            String string = activity.getString(2131822218);
                            String string2 = activity.getString(2131822207);
                            String string3 = activity.getString(2131822375, string, string2, string2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(string3));
                            if (string.length() != 0 || string2.length() != 0) {
                                int iLJJJJI = a0.LJJJJI(string3, string, 0, 6);
                                int length = string.length() + iLJJJJI;
                                int iLJJJ = a0.LJJJ(string3, string2, 0, false, 6);
                                int length2 = string2.length() + iLJJJ;
                                int iLJJJJI2 = a0.LJJJJI(string3, string2, 0, 6);
                                int length3 = string2.length() + iLJJJJI2;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("getSpannableStringBuilderGame, secondStringStartIndex:");
                                sbLIZ2.append(iLJJJJI);
                                sbLIZ2.append(", secondStringEndIndex:");
                                sbLIZ2.append(length);
                                sbLIZ2.append(", thirdStringStartIndex:");
                                sbLIZ2.append(iLJJJJI2);
                                sbLIZ2.append(", thirdStringEndIndex:");
                                sbLIZ2.append(length3);
                                sbLIZ2.append(", result:");
                                sbLIZ2.append(string3);
                                sbLIZ2.append(", secondString:");
                                sbLIZ2.append(string);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                if (iLJJJJI >= 0 && iLJJJ >= 0 && iLJJJJI2 >= 0) {
                                    if (C123100dR.LIZ(string)) {
                                        i = 1;
                                        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJJI, length, 33);
                                        C786410Ut5.q2(spannableStringBuilder, new C2248981D0u(c2196981Aye, activity, 1), iLJJJJI, length, 33);
                                    } else {
                                        i = 1;
                                    }
                                    if (C123100dR.LIZ(string2)) {
                                        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(i), iLJJJ, length2, 33);
                                        C786410Ut5.q2(spannableStringBuilder, new C2248981D0u(c2196981Aye, activity, 2), iLJJJ, length2, 33);
                                    }
                                    if (C123100dR.LIZ(string2)) {
                                        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(i), iLJJJJI2, length3, 33);
                                        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.14Cg
                                            @Override // android.text.style.ClickableSpan
                                            public final void onClick(View view) {
                                                int i3 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("getSpannableStringBuilderGame, privacyTosUrl:");
                                                sbLIZ3.append("https://www.tiktok.com/legal/privacy-policy");
                                                C2188811AlT.LIZIZ(sbLIZ3);
                                                C2196981Aye.LIZIZ(c2196981Aye.LIZ, "https://www.tiktok.com/legal/privacy-policy");
                                            }

                                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                            public final void updateDrawState(TextPaint textPaint) {
                                                int i3 = C2187451AjH.LIZ;
                                                textPaint.setUnderlineText(false);
                                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, activity);
                                                if (numLIZJ != null) {
                                                    textPaint.setColor(numLIZJ.intValue());
                                                }
                                            }
                                        }, iLJJJJI2, length3, 33);
                                    }
                                    tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                    tuxTextView2.setHighlightColor(0);
                                }
                            }
                            tuxTextView2.setText(spannableStringBuilder);
                        }
                    } else {
                        TuxTextView tuxTextView3 = c2196981Aye.LJIILJJIL;
                        if (tuxTextView3 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView3, 8);
                        }
                    }
                    C1295960jpS c1295960jpS = (C1295960jpS) viewSd.findViewById(R.id.nrk);
                    c2196981Aye.LJI = c1295960jpS;
                    if (c1295960jpS != null) {
                        C786410Ut5.LLD(0, c1295960jpS);
                    }
                    if (c2196981Aye.LIZ == null || (!C960203pA.LIZIZ(r0))) {
                        C1295960jpS c1295960jpS2 = c2196981Aye.LJI;
                        if (c1295960jpS2 != null) {
                            c1295960jpS2.setAnimation(R.raw.tux_lottie_common_infrastructure_minis_open_loading);
                        }
                    } else {
                        C1295960jpS c1295960jpS3 = c2196981Aye.LJI;
                        if (c1295960jpS3 != null) {
                            c1295960jpS3.setAnimation(R.raw.tux_lottie_common_infrastructure_minis_open_loading_dark);
                        }
                    }
                    C1295960jpS c1295960jpS4 = c2196981Aye.LJI;
                    if (c1295960jpS4 != null) {
                        c1295960jpS4.playAnimation();
                    }
                    C427870Gq9 c427870Gq9 = (C427870Gq9) viewSd.findViewById(R.id.vmc);
                    c2196981Aye.LJII = c427870Gq9;
                    c2196981Aye.LIZJ(c427870Gq9);
                    View viewFindViewById = viewSd.findViewById(R.id.zxq);
                    c2196981Aye.LJIIIZ = viewFindViewById;
                    if (c2196981Aye.LIZJ) {
                        if (viewFindViewById != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        }
                    } else if (viewFindViewById != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    }
                    c2196981Aye.LJIIJ = (TuxTextView) viewSd.findViewById(R.id.zxp);
                    C1749280vcc c1749280vcc = c2196981Aye.LIZLLL;
                    if (c1749280vcc != null) {
                        c1749280vcc.LIZIZ(viewSd);
                    }
                    C1749280vcc c1749280vcc2 = c2196981Aye.LIZLLL;
                    if (c1749280vcc2 != null) {
                        c1749280vcc2.LJ();
                    }
                }
                C1749280vcc c1749280vcc3 = c2196981Aye.LIZLLL;
                if (c1749280vcc3 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc3, 0);
                }
                View view = c2196981Aye.LJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                c2196981Aye.LJIILLIIL = false;
            }
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF((MinisFragment) this.l0, null), MinisShortCutSnackbarProtocol.class, false);
        if (listLIZIZ != null) {
            MinisFragment minisFragment2 = (MinisFragment) this.l0;
            for (MinisShortCutSnackbarProtocol minisShortCutSnackbarProtocol : (ArrayList) listLIZIZ) {
                C2196981Aye c2196981Aye2 = minisFragment2.LLJJJ;
                if (c2196981Aye2 != null) {
                    TuxTextView tuxTextView4 = c2196981Aye2.LJIILJJIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.measure(0, 0);
                    }
                    TuxTextView tuxTextView5 = c2196981Aye2.LJIILJJIL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.measure(View.MeasureSpec.makeMeasureSpec(C418440Gaw.LIZLLL(tuxTextView5.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        iLIZIZ = tuxTextView5.getMeasuredHeight();
                        if (iLIZIZ == 0) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        }
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    }
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                }
                minisShortCutSnackbarProtocol.fr0(iLIZIZ);
            }
        }
        TuxNavBar tuxNavBar = ((MinisFragment) this.l0).LLJILJIL;
        if (tuxNavBar != null) {
            C786410Ut5.LLLLZLLLI(tuxNavBar, 4);
        }
        ((MinisFragment) this.l0).US(true);
        if (((MinisFragment) this.l0).hS() instanceof InterfaceC2196591Ay1) {
            ((MinisFragment) this.l0).YS(true);
        }
        C2197091Ayp.LIZLLL = false;
        C1802070wzl c1802070wzl = ((MinisFragment) this.l0).LLJJJIL;
        if (c1802070wzl != null) {
            c1802070wzl.LJIIJJI = false;
            c1802070wzl.LJII.removeCallbacks(c1802070wzl.LJIILIIL);
            c1802070wzl.LJIIL = false;
            C1801980wzc c1801980wzc = c1802070wzl.LJIIIIZZ;
            c1801980wzc.LJI++;
            c1801980wzc.LJ = null;
            c1801980wzc.LIZIZ.LJ(c1801980wzc);
            c1802070wzl.LJIIIZ.LIZ();
        }
        if (this.z1) {
            ((MinisFragment) this.l0).RS(EnumC2194261AuG.MAINFRAME_LOAD_SUCCESS, false);
        } else {
            ((MinisFragment) this.l0).RS(EnumC2194261AuG.LOAD_START, false);
        }
    }

    public final void LIZ$2() {
        List<ExitRule> list;
        EventParam next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2238191Civ c2238191Civ = C2238191Civ.LIZ;
        String str = ((OutreachBannerData) this.l0).key;
        c2238191Civ.getClass();
        Set<String> setLLIIIZ = C13LP.LLIIIZ(C2238191Civ.LIZJ().getStringSet(C2238191Civ.LIZ("exposure_ts", str), C08CX.INSTANCE));
        OutreachBannerData outreachBannerData = (OutreachBannerData) this.l0;
        setLLIIIZ.add(String.valueOf(jCurrentTimeMillis));
        C2238191Civ.LIZJ().storeStringSet(C2238191Civ.LIZ("exposure_ts", outreachBannerData.key), setLLIIIZ);
        List<EventParam> list2 = ((OutreachBannerData) this.l0).eventParams;
        ExitRule exitRule = null;
        if (list2 != null) {
            Iterator<EventParam> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                EventParam eventParam = next;
                Integer num = eventParam.type;
                if (num != null && num.intValue() == 3 && C736460Sui.LIZIZ(eventParam.event)) {
                    break;
                }
            }
            EventParam eventParam2 = next;
            if (eventParam2 != null) {
                Map<String, String> map = eventParam2.bizParams;
                if (C19719512Dh.LJII(map) && map != null) {
                    map.put("enter_from", "personal_homepage");
                }
                C20684815ws.LJIILLIIL(eventParam2.event, eventParam2.bizParams);
            }
        }
        C2238191Civ c2238191Civ2 = C2238191Civ.LIZ;
        String str2 = ((OutreachBannerData) this.l0).key;
        c2238191Civ2.getClass();
        int i = C2238191Civ.LIZJ().getInt(C2238191Civ.LIZ("not_click_times", str2), 0);
        if (this.z1) {
            C2238191Civ.LIZLLL(null, ((OutreachBannerData) this.l0).key);
            C20647815qu c20647815qu = C20647815qu.LIZ;
            c20647815qu.getClass();
            if (C20647815qu.LIZJ) {
                EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.PROFILE_BANNER;
                OutreachBannerData outreachBannerData2 = (OutreachBannerData) this.l0;
                String str3 = outreachBannerData2.key;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = outreachBannerData2.LIZ;
                if (str4 == null) {
                    str4 = "";
                }
                c20647815qu.getClass();
                C20647815qu.LIZ(enumC20654715s1, str3, null, "profile", str4);
            }
        }
        OutreachBannerData outreachBannerData3 = (OutreachBannerData) this.l0;
        if (C2238191Civ.LIZIZ(outreachBannerData3.key) == null && (list = outreachBannerData3.exitRules) != null) {
            Iterator<ExitRule> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ExitRule next2 = it3.next();
                ExitRule exitRule2 = next2;
                Integer num2 = exitRule2.activeStrategyType;
                if (num2 != null && num2.intValue() == 1) {
                    int i2 = i + 1;
                    Integer num3 = exitRule2.count;
                    if (i2 >= (num3 != null ? num3.intValue() : 0)) {
                        exitRule = next2;
                        break;
                    }
                }
            }
            ExitRule exitRule3 = exitRule;
            if (exitRule3 != null) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter exit because never clicked. ruleId:");
                sbLIZ.append(exitRule3.ruleId);
                C1720106oR.LIZ("ProfileOutreachBanner", C2188811AlT.LIZIZ(sbLIZ));
                C2238191Civ c2238191Civ3 = C2238191Civ.LIZ;
                EnterExitRuleInfo enterExitRuleInfo = new EnterExitRuleInfo(exitRule3, Long.valueOf(jCurrentTimeMillis));
                String str5 = outreachBannerData3.key;
                c2238191Civ3.getClass();
                C2238191Civ.LIZLLL(enterExitRuleInfo, str5);
                if (this.z1) {
                    C2238191Civ c2238191Civ4 = C2238191Civ.LIZ;
                    String str6 = ((OutreachBannerData) this.l0).key;
                    c2238191Civ4.getClass();
                    C2238191Civ.LJ(0, str6);
                    return;
                }
                C2238191Civ c2238191Civ5 = C2238191Civ.LIZ;
                String str7 = ((OutreachBannerData) this.l0).key;
                c2238191Civ5.getClass();
                C2238191Civ.LJ(i + 1, str7);
                return;
            }
        }
        C2238191Civ c2238191Civ6 = C2238191Civ.LIZ;
        String str8 = ((OutreachBannerData) this.l0).key;
        c2238191Civ6.getClass();
        C2238191Civ.LJ(i + 1, str8);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002e -> B:15:0x003d). Please report as a decompilation issue!!! */
    public static final void run$0(ARunnableS52S0110000_34 aRunnableS52S0110000_34) {
        boolean zLIZ;
        C1C7U.LIZ("InitKitaTask@70e2.run$1");
        try {
            try {
                if (((CommitConfig) C800880VbK.LIZIZ.getValue()).open) {
                    C2217521Bqg c2217521Bqg = ((InitKitaTask) aRunnableS52S0110000_34.l0).LLILZIL;
                    C2090408Gw.LJFF = aRunnableS52S0110000_34.z1;
                    C2089608Go.LIZJ(c2217521Bqg);
                } else {
                    C2217531Bqh c2217531Bqh = ((InitKitaTask) aRunnableS52S0110000_34.l0).LLILZLL;
                    C2090408Gw.LJFF = aRunnableS52S0110000_34.z1;
                    C2089608Go.LIZJ(c2217531Bqh);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InitKitaTask@70e2.run$1");
    }

    public static final void run$1(ARunnableS52S0110000_34 aRunnableS52S0110000_34) {
        boolean zLIZ;
        C1C7U.LIZ("MinisFragment@a9ca.onMinisLoadFinish$1");
        try {
            aRunnableS52S0110000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisFragment@a9ca.onMinisLoadFinish$1");
    }

    public static final void run$2(ARunnableS52S0110000_34 aRunnableS52S0110000_34) {
        boolean zLIZ;
        C1C7U.LIZ("MinisFragment@a9ca.onMinisLoadStart$1");
        try {
            aRunnableS52S0110000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisFragment@a9ca.onMinisLoadStart$1");
    }

    public static final void run$3(ARunnableS52S0110000_34 aRunnableS52S0110000_34) {
        C1BMY c1bmy = (C1BMY) aRunnableS52S0110000_34.l0;
        boolean z = aRunnableS52S0110000_34.z1;
        c1bmy.getClass();
        C1C7U.LIZ("BootProtector@bc63.startCheckAppBoot$1L");
        C2200391B9x.LIZJ(C786410Ut5.j4("begin startCheckAppBoot lazyLoadData %b", new Object[]{Boolean.valueOf(z)}));
        if (c1bmy.LJFF == null) {
            c1bmy.LJFF = SmartProtectedStateMachine.LIZLLL(c1bmy.LJ);
        }
        SmartProtectedStateMachine smartProtectedStateMachine = c1bmy.LJFF;
        if (smartProtectedStateMachine == null) {
            C2200391B9x.LIZJ(C786410Ut5.j4("machine is null, lazyLoadData %b", new Object[]{Boolean.valueOf(z)}));
            C1C7U.LIZIZ("BootProtector@bc63.startCheckAppBoot$1L");
            return;
        }
        if (!smartProtectedStateMachine.LIZJ) {
            if (!z) {
                C2203571BMd.LJIILLIIL.LIZIZ();
            }
            c1bmy.LJFF.LJII();
            C2200391B9x.LIZJ(C786410Ut5.j4("startCheckAppBoot isEnable %b", new Object[]{Boolean.TRUE}));
        }
        if (!c1bmy.LIZIZ) {
            System.currentTimeMillis();
            C2203571BMd.LJIILLIIL.getClass();
            c1bmy.LIZIZ = false;
            synchronized (c1bmy.LIZ) {
                try {
                    if (c1bmy.LIZIZ) {
                        c1bmy.LIZ.shutdown();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C2200391B9x.LIZJ(C786410Ut5.j4("end startCheckAppBoot lazyLoadData %b", new Object[]{Boolean.valueOf(z)}));
        C1C7U.LIZIZ("BootProtector@bc63.startCheckAppBoot$1L");
    }

    public static final void run$4(ARunnableS52S0110000_34 aRunnableS52S0110000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileOutreachBannerTracker@e3d7.recordExposure$1");
        try {
            aRunnableS52S0110000_34.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileOutreachBannerTracker@e3d7.recordExposure$1");
    }

    public ARunnableS52S0110000_34(C1BMY c1bmy, int i) {
        this.$t = i;
        this.l0 = c1bmy;
        this.z1 = true;
    }

    public ARunnableS52S0110000_34(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
