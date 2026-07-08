package X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerTextV3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762380vxk extends FrameLayout implements InterfaceC10331042f {
    public InterfaceC1763080vys LL;
    public ConstraintLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public View LLILZIL;
    public SmartImageView LLILZLL;
    public final ConstraintLayout LLIZ;
    public final View LLIZLLLIL;
    public PromotionWaist LLJ;
    public String LLJI;
    public C951203ni LLJIJIL;
    public long LLJILJIL;

    public final SmartImageView getBackgroundImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bo6);
            this.LLILZLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final View getBackgroundMaskFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.boi);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    public final InterfaceC1763080vys getActionListener() {
        return this.LL;
    }

    public final ConstraintLayout getContentContainer() {
        return this.LLILLJJLI;
    }

    public final FrameLayout getHeadComponentContainer() {
        return this.LLILLL;
    }

    public final FrameLayout getTailComponentContainer() {
        return this.LLILZ;
    }

    public C1762380vxk(Context context) {
        super(context, null, 0);
        this.LLJI = "";
        this.LLJILJIL = -1L;
        C954703oH.LIZ(context, R.layout.au9, this, true);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.waist_container);
        this.LLIZLLLIL = findViewById(R.id.fyx);
        this.LLILLJJLI = (ConstraintLayout) findViewById(R.id.eux);
        this.LLILLL = (FrameLayout) findViewById(R.id.jhp);
        this.LLILZ = (FrameLayout) findViewById(R.id.x2u);
    }

    @Override // X.InterfaceC10331042f
    public final void V2(long j) {
        if (j < 0) {
            return;
        }
        this.LLJILJIL = j;
        C951203ni c951203ni = this.LLJIJIL;
        if (c951203ni != null) {
            c951203ni.V2(j);
        }
    }

    public final void setActionListener(InterfaceC1763080vys interfaceC1763080vys) {
        this.LL = interfaceC1763080vys;
    }

    public final void setBackgroundImageFromXml(SmartImageView smartImageView) {
        this.LLILZLL = smartImageView;
    }

    public final void setBackgroundMaskFromXml(View view) {
        this.LLILZIL = view;
    }

    public final void setContentContainer(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setHeadComponentContainer(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setListener(InterfaceC1763080vys interfaceC1763080vys) {
        this.LL = interfaceC1763080vys;
    }

    public final void setTailComponentContainer(FrameLayout frameLayout) {
        this.LLILZ = frameLayout;
    }

    public static final boolean LIZIZ(BannerComponent bannerComponent, BannerComponent bannerComponent2) {
        if (bannerComponent != null && bannerComponent2 != null && Intrinsics.LJFF(BannerComponent.LIZ(bannerComponent), BannerComponent.LIZ(bannerComponent2))) {
            C7902036u c7902036u = ReminderButton.Companion;
            ReminderButton reminderButton = bannerComponent.reminderButton;
            ReminderButton reminderButton2 = bannerComponent2.reminderButton;
            c7902036u.getClass();
            if (!C7902036u.LIZ(reminderButton, reminderButton2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0157 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:75:0x013c, B:77:0x0140, B:84:0x014d, B:86:0x0157, B:88:0x015f, B:80:0x0145, B:82:0x0149), top: B:104:0x012c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762380vxk.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0vyF, android.view.View] */
    public final View LIZJ(BannerComponent bannerComponent, String str) {
        String string;
        String text;
        String text2;
        CharSequence text3;
        CharSequence text4;
        float f;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        float fFloatValue;
        String string2 = null;
        if (bannerComponent == null) {
            return null;
        }
        int i = bannerComponent.componentType;
        if (i != 1) {
            if (i == 2 && bannerComponent.bannerCountdown != null) {
                C951203ni c951203ni = new C951203ni(getContext(), null, 6);
                c951203ni.LIZ(bannerComponent.bannerCountdown, this.LLJI);
                long j = this.LLJILJIL;
                if (j > 0) {
                    c951203ni.V2(j);
                }
                this.LLJIJIL = c951203ni;
                return c951203ni;
            }
        } else if (bannerComponent.bannerTextV3 != null) {
            final Context context = getContext();
            ?? r2 = new FrameLayout(context) { // from class: X.0vyF
                public LinearLayout LL;
                public TuxTextView LLILLJJLI;
                public SmartImageView LLILLL;
                public TuxTextView LLILZ;
                public SmartImageView LLILZIL;
                public C427870Gq9 LLILZLL;

                public final LinearLayout getBannerContainer() {
                    KeyEvent.Callback callbackFindViewById = this.LL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.za1);
                        this.LL = (LinearLayout) callbackFindViewById;
                    }
                    return (LinearLayout) callbackFindViewById;
                }

                public final C427870Gq9 getBrandPrefixIcon() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.v6_);
                        this.LLILZLL = (C427870Gq9) callbackFindViewById;
                    }
                    return (C427870Gq9) callbackFindViewById;
                }

                public final SmartImageView getPrefixIcon() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.ro9);
                        this.LLILLL = (SmartImageView) callbackFindViewById;
                    }
                    return (SmartImageView) callbackFindViewById;
                }

                public final TuxTextView getSubTitle() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.wgz);
                        this.LLILZ = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                public final SmartImageView getSuffixIcon() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.wn8);
                        this.LLILZIL = (SmartImageView) callbackFindViewById;
                    }
                    return (SmartImageView) callbackFindViewById;
                }

                public final TuxTextView getTitle() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.title);
                        this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                {
                    super(context, null, 0);
                    C954703oH.LIZ(context, R.layout.ato, this, true);
                    setFocusable(true);
                    setImportantForAccessibility(1);
                    setDescendantFocusability(393216);
                }

                public final void setBannerContainer(LinearLayout linearLayout) {
                    this.LL = linearLayout;
                }

                public final void setBrandPrefixIcon(C427870Gq9 c427870Gq9) {
                    this.LLILZLL = c427870Gq9;
                }

                public final void setPrefixIcon(SmartImageView smartImageView) {
                    this.LLILLL = smartImageView;
                }

                public final void setSubTitle(TuxTextView tuxTextView) {
                    this.LLILZ = tuxTextView;
                }

                public final void setSuffixIcon(SmartImageView smartImageView) {
                    this.LLILZIL = smartImageView;
                }

                public final void setTitle(TuxTextView tuxTextView) {
                    this.LLILLJJLI = tuxTextView;
                }
            };
            BannerTextV3 bannerTextV3 = (BannerTextV3) C7727030b.LIZ(0, bannerComponent.bannerTextV3);
            if (bannerTextV3 != null) {
                ECRichText eCRichText = (ECRichText) C7727030b.LIZ(0, bannerTextV3.ecRichTexts);
                if (eCRichText != null) {
                    TuxTextView title = r2.getTitle();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unify_title_");
                    sbLIZ.append(str);
                    C03B0 c03b0 = new C03B0(title, C2188811AlT.LIZIZ(sbLIZ));
                    C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                    title.setText(c03b0.LIZJ);
                }
                Icon icon = bannerTextV3.prefixIcon;
                int iIntValue4 = 15;
                if (icon != null) {
                    Integer viewWidth = icon.getViewWidth();
                    if (viewWidth != null) {
                        iIntValue4 = viewWidth.intValue();
                    }
                    Integer viewHeight = icon.getViewHeight();
                    if (viewHeight != null) {
                        iIntValue3 = viewHeight.intValue();
                    } else {
                        iIntValue3 = 12;
                    }
                    if (iIntValue4 >= 32) {
                        C427870Gq9 brandPrefixIcon = r2.getBrandPrefixIcon();
                        C03DZ.LIZJ(brandPrefixIcon);
                        C1744700vVE.LJIIL(brandPrefixIcon, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4))));
                        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3))), brandPrefixIcon);
                        C03DZ.LIZ(r2.getPrefixIcon());
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        String str2 = bannerComponent.prefixIconInnerBorderColor;
                        if (str2 != null) {
                            try {
                                Float f2 = bannerComponent.prefixIconInnerBorderTransparency;
                                try {
                                    int iLIZIZ = C0HEZ.LIZIZ(str2);
                                    int i2 = (16711680 & iLIZIZ) >> 16;
                                    int i3 = (65280 & iLIZIZ) >> 8;
                                    int i4 = iLIZIZ & 255;
                                    if (f2 == null) {
                                        fFloatValue = 1.0f;
                                    } else {
                                        fFloatValue = f2.floatValue();
                                    }
                                    Integer numValueOf = Integer.valueOf(Color.argb((int) (fFloatValue * 255), i2, i3, i4));
                                    if (numValueOf != null) {
                                        int iIntValue5 = numValueOf.intValue();
                                        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
                                        c1331750klB.LIZJ = iIntValue5;
                                        c1331750klB.LIZIZ = fLIZIZ;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR85;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("getAlphaColor: ");
                                sbLIZ2.append(e);
                                C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)), null);
                            }
                        }
                        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                        Image imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(r2.getContext());
                        c1326790kdB.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode);
                        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
                        c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
                        c1331670kl3LIZLLL.LJJ(r2.getBrandPrefixIcon());
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    } else {
                        SmartImageView prefixIcon = r2.getPrefixIcon();
                        C03DZ.LIZJ(prefixIcon);
                        C1744700vVE.LJIIL(prefixIcon, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4))));
                        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3))), prefixIcon);
                        C03DZ.LIZ(r2.getBrandPrefixIcon());
                        C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
                        Image imageRequireImageForEcDarkMode2 = icon.requireImageForEcDarkMode(r2.getContext());
                        c1326790kdB2.getClass();
                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode2);
                        c1331670kl3LIZLLL2.LJJ = EnumC1338240kve.CENTER_CROP;
                        c1331670kl3LIZLLL2.LJJ(r2.getPrefixIcon());
                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                    }
                }
                Icon icon2 = bannerTextV3.suffixIcon;
                if (icon2 != null) {
                    SmartImageView suffixIcon = r2.getSuffixIcon();
                    Integer viewWidth2 = icon2.getViewWidth();
                    if (viewWidth2 != null) {
                        iIntValue = viewWidth2.intValue();
                    } else {
                        iIntValue = 6;
                    }
                    C1744700vVE.LJIIL(suffixIcon, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
                    SmartImageView suffixIcon2 = r2.getSuffixIcon();
                    Integer viewHeight2 = icon2.getViewHeight();
                    if (viewHeight2 != null) {
                        iIntValue2 = viewHeight2.intValue();
                    } else {
                        iIntValue2 = 12;
                    }
                    C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2))), suffixIcon2);
                    C786410Ut5.LLFF(0, r2.getSuffixIcon());
                    C1326790kdB c1326790kdB3 = C1326790kdB.LIZ;
                    Image imageRequireImageForEcDarkMode3 = icon2.requireImageForEcDarkMode(r2.getContext());
                    c1326790kdB3.getClass();
                    C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode3);
                    c1331670kl3LIZLLL3.LJJ = EnumC1338240kve.CENTER_CROP;
                    c1331670kl3LIZLLL3.LJJI(r2.getSuffixIcon());
                    if (((Boolean) C268760Ag6.LIZ.getValue()).booleanValue()) {
                        C786410Ut5.h3(c1331670kl3LIZLLL3);
                    } else {
                        c1331670kl3LIZLLL3.LJIIJJI();
                    }
                }
                ECRichText eCRichText2 = (ECRichText) C7727030b.LIZ(1, bannerTextV3.ecRichTexts);
                if (eCRichText2 != null) {
                    TuxTextView subTitle = r2.getSubTitle();
                    C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4 + 4))), subTitle);
                    C03DZ.LIZJ(subTitle);
                    TuxTextView subTitle2 = r2.getSubTitle();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("unify_subtext_");
                    sbLIZ3.append(str);
                    C03B0 c03b02 = new C03B0(subTitle2, C2188811AlT.LIZIZ(sbLIZ3));
                    C03B0.LIZ(c03b02, eCRichText2, null, null, false, null, null, 126);
                    SpannableStringBuilder spannableStringBuilder = c03b02.LIZJ;
                    C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(8, true), 0, spannableStringBuilder.length(), 33);
                    C786410Ut5.q2(spannableStringBuilder, new C434230H0z(C0H9H.LIZIZ(8)), 0, spannableStringBuilder.length(), 33);
                    subTitle2.setText(spannableStringBuilder);
                    String string3 = r2.getSubTitle().getText().toString();
                    TuxTextView subTitle3 = r2.getSubTitle();
                    if (string3 != null) {
                        if (string3.length() < 10) {
                            f = 0.3f;
                        } else {
                            f = 0.1f;
                        }
                    } else {
                        f = 0.0f;
                    }
                    subTitle3.setLetterSpacing(f);
                } else {
                    C03DZ.LIZ(r2.getSubTitle());
                }
                TuxTextView title2 = r2.getTitle();
                if (title2 != null && (text4 = title2.getText()) != null) {
                    string2 = text4.toString();
                }
                String str3 = "";
                if (string2 == null) {
                    string2 = "";
                }
                TuxTextView subTitle4 = r2.getSubTitle();
                if (subTitle4 == null || (text3 = subTitle4.getText()) == null || (string = text3.toString()) == null) {
                    string = "";
                }
                Icon icon3 = bannerTextV3.prefixIcon;
                if (icon3 == null || (text = icon3.getText()) == null) {
                    text = "";
                }
                Icon icon4 = bannerTextV3.suffixIcon;
                if (icon4 != null && (text2 = icon4.getText()) != null) {
                    str3 = text2;
                }
                List listLJIIJJI = C1697810uHb.LJIIJJI(text, string2, string, str3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJIIJJI) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
                if (a0.LJJJIL(strLJJLIIIJ)) {
                    strLJJLIIIJ = " ";
                }
                r2.setContentDescription(strLJJLIIIJ);
            }
            C786410Ut5.W5(r2, new FrameLayout.LayoutParams(-2, -2));
            return r2;
        }
        return null;
    }
}
