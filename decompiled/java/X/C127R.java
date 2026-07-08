package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.SetTranslationAgreementRequest;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.SetTranslationAgreementResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.127R, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127R extends FrameLayout {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final VideoPublishEditModel LL;
    public TuxSheet LLILLJJLI;
    public final long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public C11JL LLJIJIL;
    public C11JL LLJILJIL;
    public final C127K LLJILJILJ;
    public final C127K LLJILLL;
    public final C127A LLJJ;
    public final C127A LLJJI;
    public final TuxIconView LLJJIII;
    public boolean LLJJIJI;

    public final void LIZJ() {
        boolean z;
        boolean z2 = false;
        if (!this.LLILZLL && !this.LLIZ) {
            z = false;
            boolean z3 = C1420670n4b.LJIIJJI(this.LL);
            this.LLIZLLLIL = z3;
            this.LLJJ.LJIIJJI(z);
            this.LLJJ.LJIIIZ(this.LLIZLLLIL);
            this.LLJILJILJ.setCellEnabled(this.LLIZLLLIL);
            if (this.LLIZLLLIL && this.LLJJIJI) {
                z2 = true;
            }
            this.LLJJI.LJIIJJI(z);
            this.LLJJI.LJIIIZ(z2);
            this.LLJILLL.setCellEnabled(z2);
            C786410Ut5.x5(this.LLJJIII, 1.0f);
        }
        z = true;
        this.LLIZLLLIL = z3;
        this.LLJJ.LJIIJJI(z);
        this.LLJJ.LJIIIZ(this.LLIZLLLIL);
        this.LLJILJILJ.setCellEnabled(this.LLIZLLLIL);
        if (this.LLIZLLLIL) {
            z2 = true;
        }
        this.LLJJI.LJIIJJI(z);
        this.LLJJI.LJIIIZ(z2);
        this.LLJILLL.setCellEnabled(z2);
        C786410Ut5.x5(this.LLJJIII, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C11JL c11jl = this.LLJIJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        C11JL c11jl2 = this.LLJILJIL;
        if (c11jl2 != null) {
            c11jl2.dispose();
        }
        super.onDetachedFromWindow();
    }

    public final TuxSheet getSheet() {
        return this.LLILLJJLI;
    }

    private final void setSwitch2DependencyEnabled(boolean z) {
        this.LLJJIJI = z;
        LIZJ();
    }

    public final void LIZ(int i) {
        Pair pair;
        if (i != 1) {
            if (i != 2) {
                Boolean bool = Boolean.FALSE;
                pair = new Pair(bool, bool);
            } else {
                Boolean bool2 = Boolean.TRUE;
                pair = new Pair(bool2, bool2);
            }
        } else {
            pair = new Pair(Boolean.TRUE, Boolean.FALSE);
        }
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
        this.LLILZIL = true;
        this.LLJJ.LJIILJJIL(zBooleanValue);
        this.LLJJI.LJIILJJIL(zBooleanValue2);
        this.LLILZIL = false;
        setSwitch2DependencyEnabled(zBooleanValue);
    }

    public final void setSheet(TuxSheet tuxSheet) {
        this.LLILLJJLI = tuxSheet;
    }

    public C127R(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        int iIntValue;
        String string;
        boolean z;
        Integer numValueOf;
        super(c19eg);
        this.LL = videoPublishEditModel;
        this.LLILLL = 500L;
        String strLJII = C1420670n4b.LJII(videoPublishEditModel, "_ECVideoAITranslateType");
        Keva kevaLJIIIIZZ = C1420670n4b.LJIIIIZZ();
        if (kevaLJIIIIZZ.contains(strLJII) && (numValueOf = Integer.valueOf(kevaLJIIIIZZ.getInt(strLJII, 0))) != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
            for (CreateAnchorInfo createAnchorInfo : (ArrayList) C1420670n4b.LJ(videoPublishEditModel)) {
                if (C1420670n4b.LJIIL(createAnchorInfo.getType())) {
                    try {
                        int iOptInt = new JSONObject(createAnchorInfo.getContent()).optInt("enable_ec_video_ai_translate_type", 0);
                        if (iOptInt > iIntValue) {
                            iIntValue = iOptInt;
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        this.LLJI = iIntValue;
        C127K c127k = new C127K(c19eg, null, 6);
        this.LLJILJILJ = c127k;
        C127K c127k2 = new C127K(c19eg, null, 6);
        this.LLJILLL = c127k2;
        this.LLJJ = new C127A(c19eg);
        C127A c127a = new C127A(c19eg);
        this.LLJJI = c127a;
        TuxIconView tuxIconView = new TuxIconView(c19eg, null, 0, 6, null);
        this.LLJJIII = tuxIconView;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setBackgroundColor(C960203pA.LIZ(R.attr.bs, getContext()));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(getContext());
        C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
        TextView textView = new TextView(getContext());
        textView.setText(textView.getContext().getString(2131830355));
        textView.setGravity(17);
        textView.setTextSize(17.0f);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        textView.setTextColor(C960203pA.LIZ(R.attr.a1h, textView.getContext()));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        layoutParams2.gravity = 17;
        C786410Ut5.g6(textView, layoutParams2);
        frameLayout.addView(textView);
        TuxIconView tuxIconView2 = this.LLJJIII;
        tuxIconView2.setIconRes(R.raw.icon_x_mark_small);
        tuxIconView2.setTintColor(C960203pA.LIZ(R.attr.a1h, tuxIconView2.getContext()));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams3.gravity = 8388629;
        layoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C786410Ut5.M6(tuxIconView2, layoutParams3);
        C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 33));
        frameLayout.addView(tuxIconView);
        linearLayout.addView(frameLayout);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams4.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C786410Ut5.d6(linearLayout2, layoutParams4);
        Context context = linearLayout2.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C960203pA.LIZ(R.attr.zm, context));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.setClipToOutline(true);
        c127k.setTitle(c127k.getContext().getString(2131834253));
        c127k.setSubtitle(c127k.getContext().getString(2131834252));
        c127k.setWithSeparator(false);
        c127k.setBackgroundColor(0);
        this.LLJILJILJ.setAccessory(this.LLJJ);
        linearLayout2.addView(c127k);
        c127k2.setTitle(c127k2.getContext().getString(2131834251));
        Context context2 = c127k2.getContext();
        String string2 = context2.getString(2131834249);
        String string3 = context2.getString(2131834250);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string2);
        sbLIZ.append(' ');
        sbLIZ.append(string3);
        CharSequence charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ec_sv_ai_multi_dubbing_learn_more", "");
        strLJI = strLJI == null ? "" : strLJI;
        if (strLJI.length() != 0) {
            SpannableString spannableString = new SpannableString(charSequenceLIZIZ);
            int iLJJJ = a0.LJJJ(charSequenceLIZIZ, string3, 0, false, 6);
            if (iLJJJ >= 0) {
                C786410Ut5.p2(spannableString, new C04J6(context2, strLJI, 0), iLJJJ, string3.length() + iLJJJ, 17);
                C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, string3.length() + iLJJJ, 17);
            }
            charSequenceLIZIZ = spannableString;
        }
        c127k2.setSubtitle(charSequenceLIZIZ);
        c127k2.setWithSeparator(false);
        c127k2.setBackgroundColor(0);
        c127k2.setOnClickListener(new AwS608S0100000_29(this, 86));
        this.LLJILLL.setAccessory(this.LLJJI);
        c127a.LJI(new AwS573S0100000_29(this, 101));
        linearLayout2.addView(c127k2);
        linearLayout.addView(linearLayout2);
        LIZ(this.LLJI);
        this.LLILZLL = true;
        LIZJ();
        VideoPublishEditModel videoPublishEditModel2 = this.LL;
        Iterator it2 = ((ArrayList) C1420670n4b.LJ(videoPublishEditModel2)).iterator();
        while (true) {
            if (it2.hasNext()) {
                CreateAnchorInfo createAnchorInfo2 = (CreateAnchorInfo) it2.next();
                if (C1420670n4b.LJIIL(createAnchorInfo2.getType())) {
                    try {
                        string = new JSONObject(createAnchorInfo2.getContent()).optString("product_id", "");
                        if ((!a0.LJJJIL(string)) && string != null && !a0.LJJJIL(string)) {
                            z = a0.LJJJIL(string);
                        }
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            } else {
                string = null;
                break;
            }
        }
        if (!z) {
            if (!a0.LJJJIL(string)) {
                C1420670n4b.LJIIIIZZ().storeString(C1420670n4b.LJII(videoPublishEditModel2, "_ECVideoAITranslateProductId"), string);
            }
        } else {
            string = C1420670n4b.LJIIIIZZ().getString(C1420670n4b.LJII(videoPublishEditModel2, "_ECVideoAITranslateProductId"), "");
            if (string == null || !(!a0.LJJJIL(string))) {
                string = null;
            }
        }
        this.LLJ = string;
        C127T.LIZ.getClass();
        C127T c127tLIZ = C127U.LIZ();
        if (string != null && !a0.LJJJIL(string) && c127tLIZ != null) {
            C11JL c11jl = this.LLJIJIL;
            if (c11jl != null) {
                c11jl.dispose();
            }
            this.LLJIJIL = (C11JL) c127tLIZ.LIZIZ(string, 1).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516801zq(this, string, 7), new C516201zk(this, 94));
        } else {
            this.LLILZLL = false;
            LIZJ();
        }
        this.LLJJ.LJIILLIIL(new C12YG(this, 0));
        this.LLJJI.LJIILLIIL(new C12YG(this, 1));
        VideoPublishEditModel videoPublishEditModel3 = this.LL;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel3.getEnterFrom());
        c0lab.LJ("function_show", "dubbing_auth_multi");
        C20684815ws.LJIILLIIL("ai_dubbing_auth", c0lab.LIZ);
    }

    public final void LIZIZ(final int i, final int i2, final boolean z, final boolean z2) {
        C127T.LIZ.getClass();
        C127T c127tLIZ = C127U.LIZ();
        if (c127tLIZ == null) {
            LIZ(i);
            return;
        }
        this.LLIZ = true;
        LIZJ();
        C11JL c11jl = this.LLJILJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LLJILJIL = (C11JL) c127tLIZ.LIZ(new SetTranslationAgreementRequest(Integer.valueOf(i2), 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.127S
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str;
                C1C7U.LIZ("AIDubbingSheetLayout@4825.submitTranslationAgreement$1");
                this.LL.LLIZ = false;
                Integer num = ((SetTranslationAgreementResponse) obj).statusCode;
                if (num != null && num.intValue() == 0) {
                    C127R c127r = this.LL;
                    int i3 = i2;
                    c127r.LLJI = i3;
                    C1420670n4b.LIZ(c127r.LL, i3, null, null, c127r.LLJ);
                    this.LL.LIZ(i2);
                    boolean z3 = z;
                    boolean z4 = z2;
                    if (z3) {
                        if (z4) {
                            str = "multi_auth_on";
                        } else {
                            str = "multi_auth_off";
                        }
                    } else if (z4) {
                        str = "single_auth_on";
                    } else {
                        str = "single_auth_off";
                    }
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_from", "video_post_page");
                    c0lab.LJ("content_type", "video");
                    c0lab.LJ("content_source", "shoot");
                    c0lab.LJ("action_type", str);
                    C20684815ws.LJIILLIIL("ai_dubbing_toggle", c0lab.LIZ);
                } else {
                    this.LL.LIZ(i);
                }
                this.LL.LIZJ();
                C1C7U.LIZIZ("AIDubbingSheetLayout@4825.submitTranslationAgreement$1");
            }
        }, new C09JN() { // from class: X.127V
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AIDubbingSheetLayout@4825.submitTranslationAgreement$2");
                C127R c127r = this.LL;
                c127r.LLIZ = false;
                c127r.LIZ(i);
                this.LL.LIZJ();
                C1C7U.LIZIZ("AIDubbingSheetLayout@4825.submitTranslationAgreement$2");
            }
        });
    }
}
