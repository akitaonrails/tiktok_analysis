package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExplainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS7S0400000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10329042d extends FrameLayout implements InterfaceC10331042f, InterfaceC7903036v {
    public static final /* synthetic */ int LLJJ = 0;
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public SmartImageView LLILLL;
    public SmartImageView LLILZ;
    public ConstraintLayout LLILZIL;
    public View LLILZLL;
    public PromotionWaist LLIZ;
    public InterfaceC10331042f LLIZLLLIL;
    public C10330042e LLJ;
    public String LLJI;
    public Function1<? super BannerComponent, Unit> LLJIJIL;
    public Function1<? super ExplainInfo, Unit> LLJILJIL;
    public long LLJILJILJ;
    public final LinearLayout LLJILLL;

    public final SmartImageView getBackgroundImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bo6);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getCountdownSuffixIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f0z);
            this.LLILZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final View getDivideLineFromXml() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fyx);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getHeadComponentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jhp);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getTailComponentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x2u);
            this.LLILLJJLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ConstraintLayout getWaistContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.waist_container);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public C10329042d(Context context) {
        super(context, null, 0);
        this.LLJI = "";
        this.LLJILJILJ = -1L;
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(8388611);
        this.LLJILLL = linearLayout;
        C954703oH.LIZ(context, R.layout.au_, this, true);
    }

    private final void setInfoClickListener(Function1<? super ExplainInfo, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final View LIZJ(BannerComponent bannerComponent) {
        boolean z;
        Image icon = null;
        if (bannerComponent == null) {
            return null;
        }
        int i = bannerComponent.componentType;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && bannerComponent.bannerCountdown != null && bannerComponent.reminderButton != null) {
                    C10330042e c10330042e = new C10330042e(getContext());
                    String str = this.LLJI;
                    if (bannerComponent.bannerCountdown != null && bannerComponent.reminderButton != null) {
                        c10330042e.LLJ = bannerComponent;
                        ECRichText eCRichText = bannerComponent.bannerTextECRichText;
                        if (eCRichText != null) {
                            TuxTextView tuxTextView = c10330042e.LLIZ;
                            C03C8.LIZJ(tuxTextView, eCRichText, "CountDownRemindView", null);
                            C03DZ.LIZJ(tuxTextView);
                        } else {
                            C10332042g c10332042g = c10330042e.LLILZLL;
                            C10332042g.LJJJJL(c10332042g, bannerComponent.bannerText, 0, 6);
                            C03DZ.LIZJ(c10332042g);
                        }
                        c10330042e.LLILZIL.LIZ(bannerComponent.bannerCountdown, str);
                        ReminderButton reminderButton = bannerComponent.reminderButton;
                        Integer numValueOf = Integer.valueOf(reminderButton.buttonStatus);
                        SmartImageView smartImageView = c10330042e.LLIZLLLIL;
                        if (numValueOf != null && numValueOf.intValue() == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        smartImageView.setEnabled(z);
                        if (reminderButton.buttonType == 1) {
                            C786410Ut5.LLFF(0, c10330042e.LLIZLLLIL);
                            boolean zLJ = C1744700vVE.LJ(c10330042e.getContext(), null);
                            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                            if (numValueOf != null && numValueOf.intValue() == 1) {
                                Icon icon2 = reminderButton.buttonImageActivated;
                                if (zLJ) {
                                    if (icon2 != null) {
                                        icon = icon2.getIconDark();
                                    }
                                } else if (icon2 != null) {
                                    icon = icon2.getIcon();
                                }
                            } else {
                                Icon icon3 = reminderButton.buttonImageInactivated;
                                if (zLJ) {
                                    if (icon3 != null) {
                                        icon = icon3.getIconDark();
                                    }
                                } else if (icon3 != null) {
                                    icon = icon3.getIcon();
                                }
                            }
                            c1326790kdB.getClass();
                            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
                            c1331670kl3LIZLLL.LJIJJ = c384050F3z.LIZ(c10330042e.getContext());
                            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_INSIDE;
                            c1331670kl3LIZLLL.LJJ(c10330042e.LLIZLLLIL);
                            c1331670kl3LIZLLL.LJIIJJI();
                        } else {
                            C786410Ut5.LLFF(8, c10330042e.LLIZLLLIL);
                        }
                    }
                    this.LLJ = c10330042e;
                    this.LLIZLLLIL = c10330042e;
                    Function1<? super BannerComponent, Unit> function1 = this.LLJIJIL;
                    if (function1 != null) {
                        c10330042e.setRemindButtonClick(function1);
                    }
                    long j = this.LLJILJILJ;
                    if (j > 0) {
                        c10330042e.V2(j);
                    }
                    C1748720vbi.LJFF(c10330042e, new C049X(), AFwS185S0000000_1.get$arr$(328), new AwS580S0100000_1(this, 629));
                    return c10330042e;
                }
            } else if (bannerComponent.bannerCountdown != null) {
                C951203ni c951203ni = new C951203ni(getContext(), null, 6);
                c951203ni.LIZ(bannerComponent.bannerCountdown, this.LLJI);
                long j2 = this.LLJILJILJ;
                if (j2 > 0) {
                    c951203ni.V2(j2);
                }
                this.LLIZLLLIL = c951203ni;
                return c951203ni;
            }
            return null;
        }
        if (bannerComponent.bannerText == null && bannerComponent.bannerTextECRichText == null) {
            return null;
        }
        if (bannerComponent.bannerTextECRichText != null) {
            TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
            C786410Ut5.R6(tuxTextView2, new FrameLayout.LayoutParams(-2, -2));
            C03C8.LIZJ(tuxTextView2, bannerComponent.bannerTextECRichText, "UniversalWaistView", null);
            return tuxTextView2;
        }
        C10332042g c10332042g2 = new C10332042g(getContext(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c10332042g2);
        c10332042g2.setLayoutParams(layoutParams);
        C10332042g.LJJJJL(c10332042g2, bannerComponent.bannerText, C0H9H.LIZIZ(4), 4);
        return c10332042g2;
    }

    @Override // X.InterfaceC10331042f
    public final void V2(long j) {
        if (j < 0) {
            return;
        }
        this.LLJILJILJ = j;
        InterfaceC10331042f interfaceC10331042f = this.LLIZLLLIL;
        if (interfaceC10331042f != null) {
            interfaceC10331042f.V2(j);
        }
    }

    public final void setBackgroundImageFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setCountdownSuffixIconFromXml(SmartImageView smartImageView) {
        this.LLILZ = smartImageView;
    }

    public final void setDivideLineFromXml(View view) {
        this.LLILZLL = view;
    }

    public final void setHeadComponentContainerFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    @Override // X.InterfaceC7903036v
    public void setRemindButtonClick(Function1<? super BannerComponent, Unit> function1) {
        this.LLJIJIL = function1;
        C10330042e c10330042e = this.LLJ;
        if (c10330042e != null) {
            c10330042e.setRemindButtonClick(function1);
        }
    }

    public final void setTailComponentContainerFromXml(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setWaistContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
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

    public final void LIZ(PromotionWaist promotionWaist, ECBaseFragment eCBaseFragment, PdpViewModel pdpViewModel) {
        C786410Ut5.I7(new AjS7S0400000_1(promotionWaist, eCBaseFragment, this, pdpViewModel, 12), this);
        setRemindButtonClick(new AwS367S0200000_1(this, pdpViewModel, 251));
        setInfoClickListener(new AwS235S0300000_26(pdpViewModel, this, eCBaseFragment, 46));
    }
}
