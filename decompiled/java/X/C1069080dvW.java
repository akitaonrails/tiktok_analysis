package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import Y.ACListenerS5S1301000_16;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.autofill.AdPaymentList;
import com.ss.android.ugc.aweme.autofill.AdPaymentModel;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.web.experiment.AutofillPrefillConfigExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS7S1001000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069080dvW extends FrameLayout implements InterfaceC1036190d4T {
    public LinearLayout LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public C197039127h LLILZIL;
    public C1017520caM LLILZLL;
    public C1035880d3y LLIZ;
    public WebView LLIZLLLIL;
    public FrameLayout LLJ;
    public LinearLayout LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Runnable LLJILLL;
    public Runnable LLJJ;
    public Function0<Boolean> LLJJI;
    public Function0<Unit> LLJJIII;
    public final Rect LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C21282518Ql LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public LinearLayout LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public RecyclerView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public FrameLayout LLJZ;
    public String LLJZIJLIL;
    public List<String> LLL;
    public int LLLF;
    public String LLLFF;
    public List<String> LLLFFI;
    public int LLLFZ;
    public Integer LLLI;
    public boolean LLLII;
    public LinearLayout LLLIIII;
    public C21282518Ql LLLIIIIL;
    public C1826520xdC LLLIIIL;
    public Integer LLLIIL;
    public TuxIconView LLLIILIL;
    public LinearLayout LLLIL;
    public LinearLayout LLLILZ;
    public LinearLayout LLLILZJ;
    public RelativeLayout LLLILZLLLI;
    public RelativeLayout LLLIZZ;
    public C197039127h LLLJ;
    public TuxIconView LLLJIL;
    public C127K LLLJL;
    public C127K LLLL;
    public ImageView LLLLII;
    public TuxTextView LLLLIIIILLL;
    public C197039127h LLLLIIL;
    public RecyclerView LLLLIILL;
    public C127K LLLLIILLL;
    public C127K LLLLIL;
    public TuxTextView LLLLILI;
    public final InputMethodManager LLLLJ;
    public int LLLLJI;
    public Integer LLLLL;
    public Integer LLLLLIL;
    public Boolean LLLLLILLIL;
    public int LLLLLJIL;
    public Integer LLLLLJLJLL;
    public String LLLLLL;
    public int LLLLLLIL;
    public int LLLLLLJ;

    @Override // X.InterfaceC1036190d4T
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC1036190d4T
    public final void onHide() {
        this.LLJILJILJ = false;
        LIZLLL();
        LJIIL(-1);
        getPullRefreshController().LJFF(false);
        getPullRefreshController().LIZLLL();
        LinearLayout middleShadowFromXml = getMiddleShadowFromXml();
        if (middleShadowFromXml != null) {
            C786410Ut5.LJZL(8, middleShadowFromXml);
        }
        LJJ(true);
        if (LJIJJ()) {
            C11JF c11jf = this.LLJJIJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C1037380d6O.LJIIIIZZ(getJumpTextFromXml(), this.LLILZLL);
        }
    }

    private final List<AdPaymentModel> getLocalPaymentModel() {
        List<AdPaymentModel> arrayList;
        User currentUser;
        ArrayList arrayList2 = new ArrayList();
        AdPaymentList adPaymentListLJIL = C1067990dtl.LJIL();
        if (adPaymentListLJIL == null || (arrayList = adPaymentListLJIL.getList()) == null) {
            arrayList = new ArrayList<>();
        }
        arrayList2.addAll(arrayList);
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        C1068720duw.LIZ.getClass();
        List<MaskInstrumentInfo> list = C1068720duw.LIZJ.get(uid);
        if (list == null || list.isEmpty()) {
            return arrayList2;
        }
        if (arrayList.isEmpty()) {
            arrayList2.addAll(list);
            return arrayList2;
        }
        for (MaskInstrumentInfo maskInstrumentInfo : list) {
            boolean z = true;
            for (AdPaymentModel adPaymentModel : arrayList) {
                int length = maskInstrumentInfo.getCardNumber().length();
                int length2 = adPaymentModel.getCardNumber().length();
                if (length > 6 && length2 > 6 && TextUtils.equals(maskInstrumentInfo.getCardNumber().substring(0, 6), adPaymentModel.getCardNumber().substring(0, 6)) && TextUtils.equals(maskInstrumentInfo.getCardNumber().substring(length - 4, length), adPaymentModel.getCardNumber().substring(length2 - 4, length2))) {
                    z = false;
                }
            }
            if (z) {
                arrayList2.add(maskInstrumentInfo);
            }
        }
        return arrayList2;
    }

    private final C444910HcX getPrivacyTipText() {
        SpannableString spannableString = new SpannableString(getContext().getString(2131826938));
        SpannableString spannableString2 = new SpannableString(getContext().getString(2131826940));
        C786410Ut5.p2(spannableString2, new C444920HcY(82, false), 0, spannableString2.length(), 17);
        C786410Ut5.p2(spannableString2, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, getContext())), 0, spannableString2.length(), 17);
        C786410Ut5.p2(spannableString2, new AbstractC426530Gnz() { // from class: X.0dus
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                IAdAutofillService iAdAutofillService = (IAdAutofillService) PluggableExtentionKt.pluggableSpi$default(IAdAutofillService.class, false, false, false, 14, null);
                if (iAdAutofillService != null) {
                    iAdAutofillService.LIZJ(this.LL.getContext(), "autofill_dialog", AdAutofillConfigSettings.LIZ().learnMoreLink);
                }
            }
        }, 0, spannableString2.length(), 17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString2);
        return new C444910HcX(spannableStringBuilder);
    }

    @Override // X.InterfaceC1036190d4T
    public final void LIZLLL() {
        if (C1041180dCW.LIZ(this.LLIZ)) {
            return;
        }
        LinearLayout linearLayout = this.LLJJJJLIIL;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            C1069260dvo c1069260dvo = new C1069260dvo(LJIL());
            C1023960ckk c1023960ckk = C1069280dvq.LIZ;
            C1035880d3y c1035880d3y = this.LLIZ;
            c1069260dvo.logAd(c1023960ckk, c1035880d3y != null ? c1035880d3y.getAwemeRawAd() : null, AFwS252S0000000_16.get$arr$(613));
        }
        LinearLayout linearLayout2 = this.LLJJJJLIIL;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
        this.LLLII = false;
        LJJ(false);
        this.LLLLLJIL = 0;
        this.LLLLLJLJLL = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = -1;
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJIILIIL() {
        if (this.LLJIJIL) {
            getPullRefreshController().LIZJ();
        }
    }

    public final boolean LJIJJ() {
        return this.LLILZLL != null && C0C64.LJIILLIIL().LJIJ(31744, 0, "iab_mid_page_banner_style", true) == 0;
    }

    public final C1069150dvd LJIL() {
        List<AdPaymentModel> list;
        C1069150dvd c1069150dvd = new C1069150dvd();
        c1069150dvd.LIZ = Integer.valueOf(this.LLLLLJIL);
        c1069150dvd.LIZIZ = this.LLLI;
        c1069150dvd.LIZJ = this.LLLFF;
        c1069150dvd.LIZLLL = String.valueOf(this.LLLFFI);
        c1069150dvd.LJ = Integer.valueOf(this.LLLFZ);
        c1069150dvd.LJFF = Integer.valueOf(!C1067990dtl.LJIIZILJ() ? 1 : 0);
        c1069150dvd.LJI = Integer.valueOf(C1067990dtl.LJJ());
        AdPaymentList adPaymentListLJIL = C1067990dtl.LJIL();
        c1069150dvd.LJII = (adPaymentListLJIL == null || (list = adPaymentListLJIL.getList()) == null) ? null : Integer.valueOf(list.size());
        JSONArray jSONArrayLJIILJJIL = C1067990dtl.LJIILJJIL();
        c1069150dvd.LJIIIIZZ = jSONArrayLJIILJJIL != null ? jSONArrayLJIILJJIL.toString() : null;
        c1069150dvd.LJIIIZ = Integer.valueOf(C1068720duw.LJII());
        C1068720duw.LIZ.getClass();
        c1069150dvd.LJIIJ = Integer.valueOf(C1068720duw.LJ);
        c1069150dvd.LJIIJJI = this.LLLLLL;
        return c1069150dvd;
    }

    public final TuxIconView getCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e1g);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C197039127h getJumpButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m15);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxIconView getJumpIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m16);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getJumpTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m17);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getMiddleShadowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.obq);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1069090dvX getPullRefreshController() {
        return (C1069090dvX) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC1036190d4T
    public final void onShow() {
        this.LLJILJILJ = LJIJJ();
        LinearLayout middleShadowFromXml = getMiddleShadowFromXml();
        if (middleShadowFromXml != null) {
            C786410Ut5.LJZL(this.LLJILJILJ ? 0 : 8, middleShadowFromXml);
        }
        LJJ(false);
        if (this.LLJILJILJ) {
            this.LLJJJ = 3L;
            Context context = getContext();
            C1017520caM c1017520caM = this.LLILZLL;
            C1035880d3y c1035880d3y = this.LLIZ;
            this.LLJJIJIL = C1037380d6O.LJII(context, c1017520caM, c1035880d3y != null ? c1035880d3y.getAwemeRawAd() : null, this.LLIZ, this.LLIZLLLIL, getJumpTextFromXml(), C1037380d6O.LIZ(getContext(), this.LLILZLL), this.LLJJIJIL, this.LLJJJ, new AwS595S0100000_16(this, 409));
            C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(0, 0, null, null, this.LLIZ, 30));
            C1037680d6s.LIZ.getClass();
            C1023960ckk c1023960ckk = C1037680d6s.LIZIZ;
            C1035880d3y c1035880d3y2 = this.LLIZ;
            c1041160dCU.logAd(c1023960ckk, c1035880d3y2 != null ? c1035880d3y2.getAwemeRawAd() : null);
        }
    }

    @Override // X.InterfaceC1036190d4T
    public final boolean LIZ() {
        C1069090dvX pullRefreshController = getPullRefreshController();
        if (pullRefreshController.LJIIIIZZ.invoke().booleanValue() || !pullRefreshController.LJIJJLI) {
            return false;
        }
        EnumC1069130dvb enumC1069130dvb = pullRefreshController.LJIIJ;
        return enumC1069130dvb == EnumC1069130dvb.AWAITING_SCROLL_ACK || enumC1069130dvb == EnumC1069130dvb.ENABLED;
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJ() {
        String uid;
        User currentUser;
        String uid2;
        User currentUser2;
        if (AutofillPrefillConfigExp.LIZ()) {
            Keva repo = KevaImpl.getRepo("autofill_info", 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prefillAutofillContact");
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            String str = "default";
            if (iUserService == null || (currentUser2 = iUserService.getCurrentUser()) == null || (uid = currentUser2.getUid()) == null) {
                uid = "default";
            }
            sbLIZ.append(uid);
            if (repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Keva repo2 = KevaImpl.getRepo("autofill_info", 1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("prefillAutofillNoticeShowTime");
            IUserService iUserService2 = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService2 != null && (currentUser = iUserService2.getCurrentUser()) != null && (uid2 = currentUser.getUid()) != null) {
                str = uid2;
            }
            sbLIZ2.append(str);
            if (jCurrentTimeMillis - repo2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) < ((AutofillPrefillConfigExp.AutofillPrefillConfig) AutofillPrefillConfigExp.LIZIZ.getValue()).bannerShowFrequency * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                return;
            }
            FrameLayout frameLayout = this.LLJZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            LJJ(false);
            FrameLayout frameLayout2 = this.LLJZ;
            if (frameLayout2 != null) {
                C20515215Pi c20515215Pi = new C20515215Pi(frameLayout2);
                c20515215Pi.LIZ.LIZIZ = 8000L;
                String string = getContext().getString(2131845035);
                String strLJJIFFI = u.LJJIFFI(getContext().getString(2131845036), "%@", string, false);
                int iLJJJ = a0.LJJJ(strLJJIFFI, string, 0, false, 6);
                int length = string.length() + iLJJJ;
                C444910HcX c444910HcX = new C444910HcX(strLJJIFFI);
                c444910HcX.LIZ(61);
                C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0dvc
                    public final /* synthetic */ String LL = "prefill_notice";

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                    }

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        IAdAutofillService iAdAutofillService = (IAdAutofillService) PluggableExtentionKt.pluggableSpi$default(IAdAutofillService.class, false, false, false, 14, null);
                        if (iAdAutofillService != null) {
                            iAdAutofillService.LIZJ(view.getContext(), this.LL, ((AutofillPrefillConfigExp.AutofillPrefillConfig) AutofillPrefillConfigExp.LIZIZ.getValue()).learnMoreLink);
                        }
                    }
                }, iLJJJ, length, 33);
                C786410Ut5.s2(c444910HcX, new C444920HcY(62, true), iLJJJ, length, 33);
                c20515215Pi.LIZ.LJFF = c444910HcX;
                c20515215Pi.LIZ.LJI = getContext().getString(2131845039);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJII = iLIZIZ;
                c1057450dcl.LJIIJ = 0;
                int iLIZJ = (int) C12ES.LIZJ(8.0f, getContext());
                C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
                c1057450dcl2.LJIIIZ = iLIZJ;
                c1057450dcl2.LJIILL = true;
                c1057450dcl2.LJIILIIL = new ACListenerS119S0200000_16(c20515215Pi, this, 34);
                c20515215Pi.LIZ.LJIILJJIL = new AwS595S0100000_16(this, 410);
                c20515215Pi.LJ();
                AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LLIZ);
                C1023960ckk c1023960ckk = C1069170dvf.LIZ;
                C1035880d3y c1035880d3y = this.LLIZ;
                adWebEventLogger.logAd(c1023960ckk, c1035880d3y != null ? c1035880d3y.getAwemeRawAd() : null, AFwS252S0000000_16.get$arr$(616));
            }
        }
    }

    @Override // X.InterfaceC1036190d4T
    public final boolean LJI() {
        return getPullRefreshController().LJIIJJI;
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJIIJ() {
        C1069090dvX pullRefreshController = getPullRefreshController();
        if (pullRefreshController.LJIIJJI) {
            pullRefreshController.LIZ(null);
        }
    }

    public final C21282518Ql getPaymentItemAdapter() {
        return this.LLJJJJJIL;
    }

    public final C21282518Ql getPaymentItemAdapterDialog() {
        return this.LLLIIIIL;
    }

    public C1069080dvW(Context context) {
        super(context, null, 0);
        this.LLJJI = AFwS204S0000000_16.get$arr$(505);
        this.LLJJIII = AFwS204S0000000_16.get$arr$(503);
        this.LLJJIJI = new Rect();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS417S0200000_16(context, this, 112));
        this.LLJJJ = 3L;
        this.LLLF = -1;
        this.LLLFZ = -1;
        this.LLLLLL = "";
        C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.ah)), R.layout.ln, this, true);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLLLJ = (InputMethodManager) C786410Ut5.H2(context, "input_method");
        this.LLJ = (FrameLayout) findViewById(R.id.shy);
        this.LLJI = (LinearLayout) findViewById(R.id.shx);
        getPullRefreshController().LJI();
        getPullRefreshController().LIZLLL();
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(this, 5));
    }

    private final void setContactInfoInToolBar(JSONObject jSONObject) {
        boolean z;
        C1067990dtl c1067990dtl = C1067990dtl.LIZ;
        List<String> list = this.LLL;
        c1067990dtl.getClass();
        C1067990dtl.LJIIJ = list;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(jSONObject.optString(this.LLJZIJLIL));
        }
        List<String> list2 = this.LLL;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            List<String> list3 = this.LLL;
            String strSubstring = "";
            if (list3 != null) {
                for (String str : list3) {
                    if (!Intrinsics.LJFF(str, this.LLJZIJLIL)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strSubstring);
                        sbLIZ.append(jSONObject.opt(str));
                        sbLIZ.append(", ");
                        strSubstring = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
            if ((strSubstring.length() <= 2 || !Intrinsics.LJFF(strSubstring.substring(strSubstring.length() - 2, strSubstring.length()), ", ") || (strSubstring = strSubstring.substring(0, strSubstring.length() - 2)) != null) && strSubstring.length() != 0) {
                TuxTextView tuxTextView2 = this.LLJL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
                TuxTextView tuxTextView3 = this.LLJL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(strSubstring);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
            return;
        }
        TuxTextView tuxTextView5 = this.LLJL;
        if (tuxTextView5 != null) {
            C786410Ut5.LLLLZLL(tuxTextView5, 8);
        }
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJFF(MotionEvent motionEvent) {
        boolean pullRefreshIsAtTop;
        EnumC1069130dvb enumC1069130dvb;
        LinearLayout linearLayoutInvoke;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        LinearLayout linearLayoutInvoke2;
        LinearLayout linearLayoutInvoke3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        WebView webViewInvoke;
        if (this.LLJIJIL && getVisibility() == 0) {
            C1069090dvX pullRefreshController = getPullRefreshController();
            C1069090dvX pullRefreshController2 = getPullRefreshController();
            boolean z = this.LLJIJIL;
            C1035880d3y c1035880d3yInvoke = pullRefreshController2.LIZLLL.invoke();
            boolean z2 = true;
            if (c1035880d3yInvoke == null || !z || pullRefreshController2.LJJII || !c1035880d3yInvoke.getPullRefreshCssProbeReady() || pullRefreshController2.LJIILIIL || pullRefreshController2.LJ.invoke().booleanValue() || pullRefreshController2.LJIIIIZZ.invoke().booleanValue() || c1035880d3yInvoke.getCurrentOffset() > 0 || ((webViewInvoke = pullRefreshController2.LIZJ.invoke()) != null && webViewInvoke.canScrollVertically(-1))) {
                pullRefreshIsAtTop = false;
            } else {
                pullRefreshIsAtTop = c1035880d3yInvoke.getPullRefreshIsAtTop();
            }
            pullRefreshController.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                float fLIZLLL = 1.0f;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            if (!pullRefreshController.LJJII) {
                                pullRefreshController.LIZ(0);
                            }
                            VelocityTracker velocityTracker = pullRefreshController.LJIJJ;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                            }
                            pullRefreshController.LJIJJ = null;
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = pullRefreshController.LJIJJ;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    if (pullRefreshController.LJIIJ == EnumC1069130dvb.DISABLED) {
                        if (!pullRefreshController.LJIIIIZZ.invoke().booleanValue() || motionEvent.getRawY() - pullRefreshController.LJIJI < pullRefreshController.LJIIZILJ) {
                            return;
                        }
                        pullRefreshController.LJIIIZ.invoke();
                        return;
                    }
                    float rawX = motionEvent.getRawX() - pullRefreshController.LJIJ;
                    float rawY = motionEvent.getRawY() - pullRefreshController.LJIJI;
                    if (rawY < 0.0f) {
                        pullRefreshController.LIZLLL();
                        return;
                    }
                    if (!pullRefreshController.LJIJJLI) {
                        pullRefreshController.LIZLLL();
                        return;
                    }
                    if (rawY >= pullRefreshController.LJIIZILJ && Math.abs(rawY) * 1.73f < Math.abs(rawX)) {
                        pullRefreshController.LIZLLL();
                        return;
                    }
                    pullRefreshController.LJIIJ = EnumC1069130dvb.ENABLED;
                    LinearLayout linearLayoutInvoke4 = pullRefreshController.LIZIZ.invoke();
                    if (linearLayoutInvoke4 != null && (viewPropertyAnimatorAnimate2 = linearLayoutInvoke4.animate()) != null) {
                        viewPropertyAnimatorAnimate2.cancel();
                    }
                    float f = pullRefreshController.LJIIZILJ;
                    if (rawY < f) {
                        pullRefreshController.LJIIJJI = false;
                        FrameLayout frameLayoutInvoke = pullRefreshController.LIZ.invoke();
                        if (frameLayoutInvoke != null) {
                            C786410Ut5.LJZ(8, frameLayoutInvoke);
                        }
                        LinearLayout linearLayoutInvoke5 = pullRefreshController.LIZIZ.invoke();
                        if (linearLayoutInvoke5 != null) {
                            C786410Ut5.hd(linearLayoutInvoke5, -pullRefreshController.LJIILJJIL);
                        }
                        LinearLayout linearLayoutInvoke6 = pullRefreshController.LIZIZ.invoke();
                        if (linearLayoutInvoke6 == null) {
                            return;
                        }
                        C786410Ut5.W4(linearLayoutInvoke6, 0.0f);
                        return;
                    }
                    float f2 = (rawY - f) * 0.4f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float f3 = pullRefreshController.LJIILL;
                    if (f2 > f3) {
                        f2 = f3;
                    }
                    FrameLayout frameLayoutInvoke2 = pullRefreshController.LIZ.invoke();
                    if (frameLayoutInvoke2 != null) {
                        C786410Ut5.LJZ(0, frameLayoutInvoke2);
                    }
                    pullRefreshController.LJIIJJI = true;
                    LinearLayout linearLayoutInvoke7 = pullRefreshController.LIZIZ.invoke();
                    if (linearLayoutInvoke7 != null) {
                        C786410Ut5.hd(linearLayoutInvoke7, (-pullRefreshController.LJIILJJIL) + f2);
                    }
                    LinearLayout linearLayoutInvoke8 = pullRefreshController.LIZIZ.invoke();
                    if (linearLayoutInvoke8 == null) {
                        return;
                    }
                    float f4 = pullRefreshController.LJIILLIIL;
                    if (f4 > 0.0f) {
                        fLIZLLL = C13LZ.LIZLLL(f2 / f4, 0.0f, 1.0f);
                    }
                    C786410Ut5.W4(linearLayoutInvoke8, fLIZLLL);
                    return;
                }
                if (!pullRefreshController.LJJII && pullRefreshController.LJIIJJI && pullRefreshController.LJIJJLI && (linearLayoutInvoke2 = pullRefreshController.LIZIZ.invoke()) != null && linearLayoutInvoke2.getAlpha() >= 1.0f) {
                    if (!pullRefreshController.LJJII && pullRefreshController.LJI.invoke().booleanValue() && (linearLayoutInvoke3 = pullRefreshController.LIZIZ.invoke()) != null) {
                        FrameLayout frameLayoutInvoke3 = pullRefreshController.LIZ.invoke();
                        if (frameLayoutInvoke3 != null) {
                            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke3, pullRefreshController.LJJIFFI);
                        }
                        float f5 = (-pullRefreshController.LJIILJJIL) + pullRefreshController.LJIILLIIL;
                        linearLayoutInvoke3.animate().cancel();
                        linearLayoutInvoke3.animate().translationY(f5).alpha(1.0f).setDuration(300L).setInterpolator(C1619980sG4.LJIIJJI()).start();
                        pullRefreshController.LJIIJJI = true;
                        FrameLayout frameLayoutInvoke4 = pullRefreshController.LIZ.invoke();
                        if (frameLayoutInvoke4 != null) {
                            C786410Ut5.LJZ(0, frameLayoutInvoke4);
                        }
                    }
                } else if (!pullRefreshController.LJJII) {
                    pullRefreshController.LIZ(0);
                }
                VelocityTracker velocityTracker3 = pullRefreshController.LJIJJ;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                }
                pullRefreshController.LJIJJ = null;
                return;
            }
            VelocityTracker velocityTracker4 = pullRefreshController.LJIJJ;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            velocityTrackerObtain.addMovement(motionEvent);
            pullRefreshController.LJIJJ = velocityTrackerObtain;
            pullRefreshController.LJIJ = motionEvent.getRawX();
            pullRefreshController.LJIJI = motionEvent.getRawY();
            if (!pullRefreshIsAtTop || pullRefreshController.LJIIIIZZ.invoke().booleanValue()) {
                z2 = false;
            }
            pullRefreshController.LJIJJLI = z2;
            if (z2) {
                enumC1069130dvb = EnumC1069130dvb.AWAITING_SCROLL_ACK;
            } else {
                enumC1069130dvb = EnumC1069130dvb.DISABLED;
            }
            pullRefreshController.LJIIJ = enumC1069130dvb;
            if (enumC1069130dvb != EnumC1069130dvb.DISABLED || (linearLayoutInvoke = pullRefreshController.LIZIZ.invoke()) == null || (viewPropertyAnimatorAnimate = linearLayoutInvoke.animate()) == null) {
                return;
            }
            viewPropertyAnimatorAnimate.cancel();
        }
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJIIIIZZ(boolean z) {
        AwemeRawAd awemeRawAd;
        if (!LJIJJ()) {
            return;
        }
        if (z) {
            C11JF c11jf = this.LLJJIJIL;
            if (c11jf != null) {
                c11jf.dispose();
                return;
            }
            return;
        }
        if (getVisibility() == 8) {
            return;
        }
        if (this.LLJJJ > 0) {
            Context context = getContext();
            C1017520caM c1017520caM = this.LLILZLL;
            C1035880d3y c1035880d3y = this.LLIZ;
            if (c1035880d3y != null) {
                awemeRawAd = c1035880d3y.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            this.LLJJIJIL = C1037380d6O.LJII(context, c1017520caM, awemeRawAd, this.LLIZ, this.LLIZLLLIL, getJumpTextFromXml(), C1037380d6O.LIZ(getContext(), this.LLILZLL), this.LLJJIJIL, this.LLJJJ, new AwS595S0100000_16(this, 403));
            return;
        }
        C1037380d6O.LJIIIIZZ(getJumpTextFromXml(), this.LLILZLL);
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJIIIZ(int i) {
        WebView webViewInvoke;
        C1069090dvX pullRefreshController = getPullRefreshController();
        C1035880d3y c1035880d3yInvoke = pullRefreshController.LIZLLL.invoke();
        if (c1035880d3yInvoke != null) {
            boolean z = false;
            if (i <= 0 && ((webViewInvoke = pullRefreshController.LIZJ.invoke()) == null || !webViewInvoke.canScrollVertically(-1))) {
                z = true;
            }
            c1035880d3yInvoke.setPullRefreshIsAtTop(z);
        }
        if (i > 0 && pullRefreshController.LJIIJ == EnumC1069130dvb.AWAITING_SCROLL_ACK) {
            pullRefreshController.LIZLLL();
        }
    }

    @Override // X.InterfaceC1036190d4T
    public final boolean LJIIL(int i) {
        AwemeRawAd awemeRawAd;
        LinearLayout linearLayout = this.LLLIIII;
        boolean z = true;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
            if (c19egLIZIZ != null) {
                Boolean bool = this.LLLLLILLIL;
                if (bool != null) {
                    C486860J7k.LIZIZ(c19egLIZIZ).KQ2(bool.booleanValue());
                }
                C1069260dvo c1069260dvo = new C1069260dvo(LJIL());
                C1023960ckk c1023960ckk = C1069450dw7.LIZ;
                C1035880d3y c1035880d3y = this.LLIZ;
                if (c1035880d3y != null) {
                    awemeRawAd = c1035880d3y.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                c1069260dvo.logAd(c1023960ckk, awemeRawAd, new AwS30S0001000_16(i, 22));
            }
            LinearLayout linearLayout2 = this.LLLIIII;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
        } else {
            z = false;
        }
        LJJ(false);
        return z;
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJIILJJIL(WebView webView) {
        if (this.LLIZLLLIL == webView) {
            return;
        }
        this.LLIZLLLIL = webView;
        C1035880d3y c1035880d3y = this.LLIZ;
        if (c1035880d3y != null) {
            boolean z = false;
            if (webView != null && webView.canScrollVertically(-1)) {
                z = true;
            }
            c1035880d3y.setPullRefreshIsAtTop(!z);
        }
        getPullRefreshController().LJI();
        getPullRefreshController().LIZLLL();
        if (this.LLJIJIL) {
            getPullRefreshController().LIZJ();
        }
    }

    public final void LJIIZILJ(boolean z) {
        ViewTreeObserver viewTreeObserver;
        LinearLayout linearLayout = this.LLLILZ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        if (!C1067990dtl.LJIIZILJ()) {
            LinearLayout linearLayout2 = this.LLLIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            LinearLayout linearLayout3 = this.LLLILZJ;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(8, linearLayout3);
            }
            C127K c127k = this.LLLL;
            if (c127k != null) {
                C786410Ut5.LLZLL(c127k, 8);
            }
            TuxTextView tuxTextView = this.LLLLIIIILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(getContext().getString(2131836281));
            }
            C197039127h c197039127h = this.LLLLIIL;
            if (c197039127h != null) {
                c197039127h.setText(getContext().getString(2131836280));
            }
            C197039127h c197039127h2 = this.LLLLIIL;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS151S0100000_16(this, 150));
                return;
            }
            return;
        }
        AdAutofillModel adAutofillModelLJIIL = C1067990dtl.LJIIL();
        boolean z2 = true;
        if (!C123100dR.LIZ(adAutofillModelLJIIL.firstName) && !C123100dR.LIZ(adAutofillModelLJIIL.lastName) && !C123100dR.LIZ(adAutofillModelLJIIL.email) && !C123100dR.LIZ(adAutofillModelLJIIL.mobile) && !C123100dR.LIZ(adAutofillModelLJIIL.unit) && !C123100dR.LIZ(adAutofillModelLJIIL.address) && !C123100dR.LIZ(adAutofillModelLJIIL.city) && !C123100dR.LIZ(adAutofillModelLJIIL.state) && !C123100dR.LIZ(adAutofillModelLJIIL.zipCode) && !C123100dR.LIZ(adAutofillModelLJIIL.country)) {
            z2 = false;
        }
        if (!z2) {
            LinearLayout linearLayout4 = this.LLLIL;
            if (linearLayout4 != null) {
                C786410Ut5.LJZL(0, linearLayout4);
            }
            LinearLayout linearLayout5 = this.LLLILZJ;
            if (linearLayout5 != null) {
                C786410Ut5.LJZL(8, linearLayout5);
            }
            C127K c127k2 = this.LLLL;
            if (c127k2 != null) {
                C786410Ut5.LLZLL(c127k2, 0);
            }
            C127K c127k3 = this.LLLL;
            if (c127k3 != null) {
                c127k3.setTitle(getContext().getString(2131836282));
            }
            C127K c127k4 = this.LLLL;
            if (c127k4 != null) {
                c127k4.setOnClickListener(new AwS595S0100000_16(this, 404));
            }
            TuxTextView tuxTextView2 = this.LLLLIIIILLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(getContext().getString(2131836284));
            }
            C197039127h c197039127h3 = this.LLLLIIL;
            if (c197039127h3 != null) {
                c197039127h3.setText(getContext().getString(2131836277));
            }
            C197039127h c197039127h4 = this.LLLLIIL;
            if (c197039127h4 != null) {
                C786410Ut5.U8(c197039127h4, new ACListenerS151S0100000_16(this, 151));
                return;
            }
            return;
        }
        LinearLayout linearLayout6 = this.LLLIL;
        if (linearLayout6 != null) {
            C786410Ut5.LJZL(8, linearLayout6);
        }
        LinearLayout linearLayout7 = this.LLLILZJ;
        if (linearLayout7 != null) {
            C786410Ut5.LJZL(0, linearLayout7);
        }
        C127K c127k5 = this.LLLL;
        if (c127k5 != null) {
            C786410Ut5.LLZLL(c127k5, 8);
        }
        TuxIconView tuxIconView = this.LLLJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS151S0100000_16(this, 152));
        }
        RelativeLayout relativeLayout = this.LLLIZZ;
        if (relativeLayout != null && (viewTreeObserver = relativeLayout.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC1077350e8r viewTreeObserverOnPreDrawListenerC1077350e8r = new ViewTreeObserverOnPreDrawListenerC1077350e8r(this, 3);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1077350e8r);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1077350e8r, ViewTreeObserver.OnPreDrawListener.class);
        }
        if (z) {
            C197039127h c197039127h5 = this.LLLJ;
            if (c197039127h5 != null) {
                C786410Ut5.LLLLLLJ(c197039127h5, 0);
            }
            C197039127h c197039127h6 = this.LLLJ;
            if (c197039127h6 != null) {
                C786410Ut5.U8(c197039127h6, new ACListenerS151S0100000_16(this, 153));
            }
        } else {
            C197039127h c197039127h7 = this.LLLJ;
            if (c197039127h7 != null) {
                C786410Ut5.LLLLLLJ(c197039127h7, 8);
            }
        }
        C127K c127k6 = this.LLLJL;
        if (c127k6 != null) {
            c127k6.setTitle(getContext().getString(2131836282));
        }
        C127K c127k7 = this.LLLJL;
        if (c127k7 != null) {
            c127k7.setOnClickListener(new AwS595S0100000_16(this, 405));
        }
    }

    public final void LJIJ(boolean z) {
        String uid;
        List<AdPaymentModel> list;
        User currentUser;
        LinearLayout linearLayout = this.LLLILZJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        if (!C1067990dtl.LJJI()) {
            LinearLayout linearLayout2 = this.LLLIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            LinearLayout linearLayout3 = this.LLLILZ;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(8, linearLayout3);
            }
            C127K c127k = this.LLLL;
            if (c127k != null) {
                C786410Ut5.LLZLL(c127k, 8);
            }
            TuxTextView tuxTextView = this.LLLLIIIILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(getContext().getString(2131836281));
            }
            C197039127h c197039127h = this.LLLLIIL;
            if (c197039127h != null) {
                c197039127h.setText(getContext().getString(2131836280));
            }
            C197039127h c197039127h2 = this.LLLLIIL;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS151S0100000_16(this, 154));
                return;
            }
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        AdPaymentList adPaymentListLJIL = C1067990dtl.LJIL();
        if (adPaymentListLJIL == null || (list = adPaymentListLJIL.getList()) == null || list.isEmpty()) {
            C1068720duw.LIZ.getClass();
            List<MaskInstrumentInfo> list2 = C1068720duw.LIZJ.get(uid);
            if (list2 == null || list2.isEmpty()) {
                LinearLayout linearLayout4 = this.LLLIL;
                if (linearLayout4 != null) {
                    C786410Ut5.LJZL(0, linearLayout4);
                }
                LinearLayout linearLayout5 = this.LLLILZ;
                if (linearLayout5 != null) {
                    C786410Ut5.LJZL(8, linearLayout5);
                }
                C127K c127k2 = this.LLLL;
                if (c127k2 != null) {
                    C786410Ut5.LLZLL(c127k2, 0);
                }
                C127K c127k3 = this.LLLL;
                if (c127k3 != null) {
                    c127k3.setTitle(getContext().getString(2131836283));
                }
                C127K c127k4 = this.LLLL;
                if (c127k4 != null) {
                    c127k4.setOnClickListener(new AwS595S0100000_16(this, 406));
                }
                TuxTextView tuxTextView2 = this.LLLLIIIILLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(getContext().getString(2131836285));
                }
                C197039127h c197039127h3 = this.LLLLIIL;
                if (c197039127h3 != null) {
                    c197039127h3.setText(getContext().getString(2131836277));
                }
                C197039127h c197039127h4 = this.LLLLIIL;
                if (c197039127h4 != null) {
                    C786410Ut5.U8(c197039127h4, new ACListenerS151S0100000_16(this, 155));
                    return;
                }
                return;
            }
        }
        LinearLayout linearLayout6 = this.LLLIL;
        if (linearLayout6 != null) {
            C786410Ut5.LJZL(8, linearLayout6);
        }
        LinearLayout linearLayout7 = this.LLLILZ;
        if (linearLayout7 != null) {
            C786410Ut5.LJZL(0, linearLayout7);
        }
        final List<AdPaymentModel> localPaymentModel = getLocalPaymentModel();
        if (localPaymentModel != null && !localPaymentModel.isEmpty()) {
            if (!this.LLJJJJ) {
                RecyclerView recyclerView = this.LLLLIILL;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                }
                RecyclerView recyclerView2 = this.LLLLIILL;
                if (recyclerView2 != null) {
                    recyclerView2.addItemDecoration(new C1077180e8a(0));
                }
                this.LLJJJJ = true;
            }
            C21282518Ql c21282518Ql = new C21282518Ql(localPaymentModel, false, this.LLIZLLLIL, z, false, this.LLIZ);
            this.LLLIIIIL = c21282518Ql;
            RecyclerView recyclerView3 = this.LLLLIILL;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(c21282518Ql);
            }
            C21282518Ql c21282518Ql2 = this.LLLIIIIL;
            if (c21282518Ql2 != null) {
                c21282518Ql2.LLIZ = new InterfaceC21282718Qn() { // from class: X.0dvZ
                    @Override // X.InterfaceC21282718Qn
                    public final void LIZ(int i) {
                        JSONObject jSONObject;
                        String strLIZIZ = C20485080t.LIZIZ(ListProtector.get(localPaymentModel, i));
                        if (strLIZIZ != null) {
                            jSONObject = new JSONObject(strLIZIZ);
                        } else {
                            jSONObject = null;
                        }
                        C1069080dvW c1069080dvW = this;
                        C1067990dtl.LIZJ(true, 1, jSONObject, true, 2, c1069080dvW.LLLFF, c1069080dvW.LLLFFI, c1069080dvW.LLLLLL);
                        this.LJIIL(2);
                    }

                    @Override // X.InterfaceC21282718Qn
                    public final void LIZIZ(String str) {
                        this.LJIJI(1, str);
                        this.LJIIL(1);
                    }
                };
            }
        }
        C127K c127k5 = this.LLLLIILLL;
        if (c127k5 != null) {
            c127k5.setOnClickListener(new AwS595S0100000_16(this, 407));
        }
        C127K c127k6 = this.LLLLIL;
        if (c127k6 != null) {
            c127k6.setOnClickListener(new AwS595S0100000_16(this, 408));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(boolean r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L2f
            boolean r0 = r2.LLJILJILJ
            r1 = 0
            if (r0 != 0) goto L19
            boolean r0 = r2.LLJIJIL
            if (r0 != 0) goto L19
            boolean r0 = r2.LLLII
            if (r0 != 0) goto L19
            android.widget.LinearLayout r0 = r2.LLLIIII
            if (r0 == 0) goto L24
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L24
        L19:
            int r0 = r2.getVisibility()
            r2.setVisibility(r1)
            X.C1602160rnK.LIZIZ(r0, r1, r2)
            return
        L24:
            android.widget.FrameLayout r0 = r2.LLJZ
            if (r0 == 0) goto L2f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L2f
            goto L19
        L2f:
            r1 = 8
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1069080dvW.LJJ(boolean):void");
    }

    public final void setCloseFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setJumpButtonFromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void setJumpIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setJumpTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setMiddleShadowFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    @Override // X.InterfaceC1036190d4T
    public void setOnPullRefreshListener(Runnable runnable) {
        this.LLJILLL = runnable;
    }

    public final void setPaymentItemAdapter(C21282518Ql c21282518Ql) {
        this.LLJJJJJIL = c21282518Ql;
    }

    public final void setPaymentItemAdapterDialog(C21282518Ql c21282518Ql) {
        this.LLLIIIIL = c21282518Ql;
    }

    @Override // X.InterfaceC1036190d4T
    public void setPullRefreshCssSuppressed(boolean z) {
        getPullRefreshController().LJ(z);
    }

    @Override // X.InterfaceC1036190d4T
    public void setPullRefreshEnabled(boolean z) {
        this.LLJIJIL = z;
        C1069090dvX pullRefreshController = getPullRefreshController();
        if (!z) {
            pullRefreshController.LJJII = false;
            pullRefreshController.LIZLLL();
        } else {
            C1035880d3y c1035880d3yInvoke = pullRefreshController.LIZLLL.invoke();
            if (c1035880d3yInvoke == null || !c1035880d3yInvoke.getPullRefreshCssProbeReady()) {
                pullRefreshController.LIZJ();
            }
        }
        LJJ(false);
    }

    @Override // X.InterfaceC1036190d4T
    public void setPullRefreshPageLoading(boolean z) {
        getPullRefreshController().LJFF(z);
    }

    @Override // X.InterfaceC1036190d4T
    public void setRefreshCancelListener(Runnable runnable) {
        this.LLJJ = runnable;
    }

    @Override // X.InterfaceC1036190d4T
    public final void LIZJ(AwS560S0100000_16 awS560S0100000_16, AwS560S0100000_16 awS560S0100000_162) {
        this.LLJJI = awS560S0100000_16;
        this.LLJJIII = awS560S0100000_162;
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJIIJJI(int i, boolean z) {
        boolean z2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean zLIZ = C1041180dCW.LIZ(this.LLIZ);
        List<AdPaymentModel> localPaymentModel = getLocalPaymentModel();
        if (localPaymentModel != null && !localPaymentModel.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z4 = !z2;
        if (C1067990dtl.LJIILJJIL() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zBooleanValue = ((Boolean) C04SA.LIZ.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) C04S9.LIZ.getValue()).booleanValue();
        boolean zLJJI = C1067990dtl.LJJI();
        boolean zLJIIZILJ = C1067990dtl.LJIIZILJ();
        C1067990dtl.LIZ.getClass();
        boolean z5 = C1067990dtl.LIZJ;
        if (zLIZ) {
            return;
        }
        if (!zBooleanValue && !z4 && !z3) {
            return;
        }
        if (!zBooleanValue2 && !zLJJI && !zLJIIZILJ && !z5) {
            return;
        }
        this.LLLII = true;
        LJJ(false);
        LJIIL(14);
        LinearLayout linearLayout = this.LLJJJJLIIL;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
        }
        LinearLayout linearLayout2 = this.LLJJJJLIIL;
        if (linearLayout2 != null) {
            linearLayout2.requestLayout();
        }
        if (z) {
            this.LLLF = this.LLLFZ;
            this.LLJZIJLIL = this.LLLFF;
            this.LLL = this.LLLFFI;
            this.LLLLLJLJLL = this.LLLI;
        }
        LJIILLIIL(this.LLLLLJLJLL, this.LLJZIJLIL, this.LLLF, this.LLL);
    }

    public final void LJIJI(int i, String str) {
        AwemeRawAd awemeRawAd;
        C1068590duj c1068590duj = new C1068590duj();
        C1023960ckk c1023960ckk = C1068600duk.LIZ;
        C1035880d3y c1035880d3y = this.LLIZ;
        AwemeRawAd awemeRawAd2 = null;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1068590duj.logAd(c1023960ckk, awemeRawAd, new AwS7S1001000_16(str, i, 5));
        C1069150dvd c1069150dvdLJIL = LJIL();
        C1069260dvo c1069260dvo = new C1069260dvo(c1069150dvdLJIL);
        C1023960ckk c1023960ckk2 = C1069310dvt.LIZ;
        C1035880d3y c1035880d3y2 = this.LLIZ;
        if (c1035880d3y2 != null) {
            awemeRawAd2 = c1035880d3y2.getAwemeRawAd();
        }
        c1069260dvo.logAd(c1023960ckk2, awemeRawAd2, new AwS130S1100000_16(c1069150dvdLJIL, str, 25));
    }

    @Override // X.InterfaceC1036190d4T
    public final void LIZIZ(WebView webView, C1035880d3y c1035880d3y, boolean z) {
        Boolean boolValueOf;
        String creativeIdStr;
        C1017520caM c1017520caMSW0;
        InterfaceC1017210cZr interfaceC1017210cZr;
        AwemeRawAd awemeRawAd;
        boolean z2;
        this.LLJJJJLIIL = (LinearLayout) findViewById(R.id.bfj);
        this.LLJJL = (LinearLayout) findViewById(R.id.eqd);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) findViewById(R.id.eqi);
        this.LLJL = (TuxTextView) findViewById(R.id.eqg);
        this.LLJLIL = (RecyclerView) findViewById(R.id.q4l);
        this.LLJLILLLLZIIL = (TuxIconView) findViewById(R.id.hfn);
        this.LLJLL = (LinearLayout) findViewById(R.id.eq9);
        this.LLJLLIL = (TuxIconView) findViewById(R.id.eqc);
        this.LLJLLL = (TuxIconView) findViewById(R.id.q4j);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bfm);
        this.LLJZ = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        this.LLLIIII = (LinearLayout) findViewById(R.id.bfg);
        this.LLLIIIL = (C1826520xdC) findViewById(R.id.uju);
        this.LLLIILIL = (TuxIconView) findViewById(R.id.e1k);
        this.LLLIL = (LinearLayout) findViewById(R.id.p9w);
        this.LLLILZ = (LinearLayout) findViewById(R.id.q4k);
        this.LLLLIILL = (RecyclerView) findViewById(R.id.q4m);
        this.LLLILZJ = (LinearLayout) findViewById(R.id.eqe);
        this.LLLILZLLLI = (RelativeLayout) findViewById(R.id.eqb);
        this.LLLIZZ = (RelativeLayout) findViewById(R.id.eqa);
        this.LLLJ = (C197039127h) findViewById(R.id.bfd);
        this.LLLJIL = (TuxIconView) findViewById(R.id.gnf);
        this.LLLJL = (C127K) findViewById(R.id.nyx);
        this.LLLL = (C127K) findViewById(R.id.nyw);
        this.LLLLII = (ImageView) findViewById(R.id.w0o);
        this.LLLLIIIILLL = (TuxTextView) findViewById(R.id.w0s);
        this.LLLLIIL = (C197039127h) findViewById(R.id.w0m);
        this.LLLLIILLL = (C127K) findViewById(R.id.aci);
        this.LLLLIL = (C127K) findViewById(R.id.nyy);
        this.LLLLILI = (TuxTextView) findViewById(R.id.ru9);
        C1826520xdC c1826520xdC = this.LLLIIIL;
        if (c1826520xdC != null) {
            c1826520xdC.LIZ(new C1782380wU0(getContext().getString(2131836286), new C1183804k8(R.raw.icon_map_pin), 26));
        }
        C1826520xdC c1826520xdC2 = this.LLLIIIL;
        if (c1826520xdC2 != null) {
            c1826520xdC2.LIZ(new C1782380wU0(getContext().getString(2131836287), new C1183804k8(R.raw.icon_bank_card), 26));
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        AwemeRawAd awemeRawAd2 = null;
        if (c19egLIZIZ != null) {
            boolValueOf = Boolean.valueOf(C486860J7k.LIZIZ(c19egLIZIZ).DQ2());
        } else {
            boolValueOf = null;
        }
        this.LLLLLILLIL = boolValueOf;
        this.LLIZLLLIL = webView;
        this.LLIZ = c1035880d3y;
        int iIntValue = 0;
        if (c1035880d3y != null) {
            if (webView != null && webView.canScrollVertically(-1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1035880d3y.setPullRefreshIsAtTop(true ^ z2);
        }
        getPullRefreshController().LJI();
        getPullRefreshController().LIZLLL();
        LJIILIIL();
        LJJ(false);
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        if (z) {
            if (creativeIdStr != null && (interfaceC1017210cZr = (InterfaceC1017210cZr) C1043460dGC.LJI(InterfaceC1017210cZr.class)) != null) {
                c1017520caMSW0 = interfaceC1017210cZr.SW0(creativeIdStr);
            } else {
                c1017520caMSW0 = null;
            }
            this.LLILZLL = c1017520caMSW0;
        }
        if (!LJIJJ()) {
            LinearLayout middleShadowFromXml = getMiddleShadowFromXml();
            if (middleShadowFromXml != null) {
                C786410Ut5.LJZL(8, middleShadowFromXml);
            }
            LJJ(false);
            return;
        }
        C0GRG c0grg = new C0GRG();
        c0grg.LIZIZ = C418440Gaw.LIZIZ(12);
        c0grg.invalidateSelf();
        float fLIZIZ = C418440Gaw.LIZIZ(12);
        float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(0.0f));
        float fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(12.0f));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        ((Paint) c0grg.LIZ.getValue()).setShadowLayer(fLIZIZ, fLIZIZ2, fLIZIZ3, iIntValue);
        c0grg.invalidateSelf();
        LinearLayout middleShadowFromXml2 = getMiddleShadowFromXml();
        if (middleShadowFromXml2 != null) {
            middleShadowFromXml2.setBackground(c0grg);
        }
        C786410Ut5.a9(getCloseFromXml(), new ACListenerS119S0200000_16(this, c1035880d3y, 33));
        C1017520caM c1017520caM = this.LLILZLL;
        if (c1035880d3y != null) {
            awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        }
        C1037380d6O.LIZLLL(c1017520caM, awemeRawAd2, getJumpIconFromXml(), getJumpTextFromXml(), getJumpButtonFromXml(), this.LLJJIJIL, c1035880d3y, webView, new AwS595S0100000_16(this, 399));
    }

    public final void LJIILL(int i, final String str, final String str2, boolean z) {
        int i2 = 0;
        if (str2 != null && str2.length() != 0) {
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, i2);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, tuxTextView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
            tuxTextView.setId(i);
            tuxTextView.setText(str2);
            tuxTextView.setTuxFont(42);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, tuxTextView.getContext());
            tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
            int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2) + ((int) Math.ceil(tuxTextView.getPaint().measureText(str2))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            if (this.LLLLL == null) {
                if (!z) {
                    i2 = this.LLLLLLIL;
                    if (this.LLLLLIL != null || (this.LLLLLLJ - this.LLLLJI) - i2 >= iLIZIZ) {
                        this.LLLLJI += iLIZIZ;
                    }
                }
                this.LLLLL = this.LLLLLIL;
                this.LLLLLIL = null;
                this.LLLLJI = iLIZIZ;
            } else if (!z) {
                if (this.LLLLLIL != null) {
                }
                this.LLLLJI += iLIZIZ;
            } else {
                this.LLLLL = this.LLLLLIL;
                this.LLLLLIL = null;
                this.LLLLJI = iLIZIZ;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            Integer num = this.LLLLL;
            if (num == null) {
                layoutParams.addRule(10);
            } else {
                layoutParams.addRule(3, num.intValue());
            }
            Integer num2 = this.LLLLLIL;
            if (num2 == null) {
                layoutParams.addRule(20);
            } else {
                layoutParams.addRule(17, num2.intValue());
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }
            C786410Ut5.R6(tuxTextView, layoutParams);
            RelativeLayout relativeLayout = this.LLLILZLLLI;
            if (relativeLayout != null) {
                relativeLayout.addView(tuxTextView);
            }
            C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0dvi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1069080dvW c1069080dvW = this.LL;
                    String str3 = str2;
                    c1069080dvW.getClass();
                    KeyCharacterMap keyCharacterMapLoad = KeyCharacterMap.load(-1);
                    KeyEvent keyEvent = new KeyEvent(0, 67);
                    int i3 = 100;
                    do {
                        WebView webView = c1069080dvW.LLIZLLLIL;
                        if (webView != null) {
                            webView.dispatchKeyEvent(keyEvent);
                        }
                        i3--;
                    } while (i3 > 0);
                    for (KeyEvent keyEvent2 : keyCharacterMapLoad.getEvents(str3.toCharArray())) {
                        WebView webView2 = c1069080dvW.LLIZLLLIL;
                        if (webView2 != null) {
                            webView2.dispatchKeyEvent(keyEvent2);
                        }
                    }
                    c1069080dvW.LJ();
                    this.LL.LJIJI(0, str);
                    this.LL.LJIIL(1);
                }
            });
            this.LLLLLIL = Integer.valueOf(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.lang.Integer r24, java.lang.String r25, int r26, java.util.List r27) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1069080dvW.LJIILLIIL(java.lang.Integer, java.lang.String, int, java.util.List):void");
    }

    @Override // X.InterfaceC1036190d4T
    public final void LJII(int i, String str, Integer num, String str2, List list) {
        AwemeRawAd awemeRawAd;
        this.LLLF = i;
        this.LLJZIJLIL = str;
        this.LLL = list;
        this.LLLFZ = i;
        this.LLLFF = str;
        this.LLLFFI = list;
        this.LLLI = num;
        this.LLLLLJLJLL = num;
        if (str2 == null) {
            str2 = "";
        }
        this.LLLLLL = str2;
        if (this.LLLII) {
            LJIILLIIL(num, str, i, list);
        }
        C1069260dvo c1069260dvo = new C1069260dvo(LJIL());
        C1023960ckk c1023960ckk = C1069430dw5.LIZ;
        C1035880d3y c1035880d3y = this.LLIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, new AwS595S0100000_16(this, 395));
    }

    public final void LJIJJLI(boolean z, final boolean z2, final boolean z3, String str, List<String> list, int i, Integer num) {
        boolean z4;
        int i2;
        IBinder windowToken;
        InputMethodManager inputMethodManager = this.LLLLJ;
        AwemeRawAd awemeRawAd = null;
        if (inputMethodManager != null) {
            WebView webView = this.LLIZLLLIL;
            if (webView != null) {
                windowToken = webView.getWindowToken();
            } else {
                windowToken = null;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
        C1069260dvo c1069260dvo = new C1069260dvo(LJIL());
        C1023960ckk c1023960ckk = C1E1F.LIZ;
        C1035880d3y c1035880d3y = this.LLIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, AFwS252S0000000_16.get$arr$(614));
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(getContext());
        ImageView imageView = this.LLLLII;
        if (imageView != null) {
            imageView.setImageDrawable(drawableLIZ);
        }
        LinearLayout linearLayout = this.LLLIIII;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        LJJ(false);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            C486860J7k.LIZIZ(c19egLIZIZ).KQ2(false);
        }
        final C013C c013c = new C013C();
        Integer num2 = this.LLLIIL;
        int i3 = !z ? 1 : 0;
        if (num2 != null && num2.intValue() == i3) {
            z4 = true;
        } else {
            z4 = false;
        }
        c013c.element = z4;
        final C013C c013c2 = new C013C();
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.LLLIIL = i2;
        C1826520xdC c1826520xdC = this.LLLIIIL;
        if (c1826520xdC != null) {
            c1826520xdC.setSize(EnumC1119290fEV.SMALL);
            c1826520xdC.setVariant(EnumC1826490xd9.CAPSULE);
            c1826520xdC.setMaterial(EnumC1119280fEU.REGULAR);
            c1826520xdC.setOnSelectedChangeListener(new InterfaceC1119310fEX() { // from class: X.0dva
                @Override // X.InterfaceC1119310fEX
                public final void LIZ(int i4, boolean z5) {
                    AwemeRawAd awemeRawAd2;
                    if (z5) {
                        c013c2.element = true;
                        this.LLLIIL = Integer.valueOf(i4);
                        if (i4 == 0) {
                            this.LJIIZILJ(z2);
                        } else {
                            this.LJIJ(z3);
                        }
                        C013C c013c3 = c013c;
                        if (c013c3.element) {
                            C1069260dvo c1069260dvo2 = new C1069260dvo(this.LJIL());
                            C1023960ckk c1023960ckk2 = C1069470dw9.LIZ;
                            C1035880d3y c1035880d3y2 = this.LLIZ;
                            if (c1035880d3y2 != null) {
                                awemeRawAd2 = c1035880d3y2.getAwemeRawAd();
                            } else {
                                awemeRawAd2 = null;
                            }
                            c1069260dvo2.logAd(c1023960ckk2, awemeRawAd2, new AwS30S0001000_16(i4, 23));
                            return;
                        }
                        c013c3.element = true;
                    }
                }
            });
            c1826520xdC.setSelectedAt(i3);
        }
        TuxIconView tuxIconView = this.LLLIILIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS5S1301000_16(this, str, list, i, num, 3));
        }
        if (!c013c2.element) {
            if (z) {
                LJIIZILJ(z2);
            } else {
                LJIJ(z3);
            }
        }
        TuxTextView tuxTextView = this.LLLLILI;
        if (tuxTextView != null) {
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxTextView tuxTextView2 = this.LLLLILI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(getPrivacyTipText());
        }
    }
}
