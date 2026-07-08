package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForPublishPage;
import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11Fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471511Fx extends AbstractC19511111Vd {
    public final View LLILLJJLI;
    public final C127K LLILLL;
    public final LinearLayout LLILZ;
    public final LinearLayout LLILZIL;
    public TuxIconView LLILZLL;
    public final View LLIZ;
    public TuxTextView LLIZLLLIL;
    public final TextView LLJ;
    public View LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final List<C19400610vE> LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;

    @Override // X.AbstractC19511111Vd
    public final void LIZ() {
        this.LLJIJIL = true;
        LJI();
    }

    @Override // X.AbstractC19511111Vd
    public final void LJFF() {
        this.LLJILJIL = false;
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIILL() {
    }

    private final IAVPublishService getPublishService() {
        return (IAVPublishService) this.LLJILJILJ.getValue();
    }

    @Override // X.AbstractC19511111Vd
    public final void LIZJ() {
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        this.LLJJIJIL = 0;
        IAVPublishPageUIRefactorService publishUIRefactorService = getPublishUIRefactorService();
        if (publishUIRefactorService == null || !publishUIRefactorService.isRefactorPublishAddLinkOption()) {
            return;
        }
        ((ArrayList) this.LLJJ).clear();
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJ() {
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            c127k.setShowAlertBadge(false);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJI() {
        C12ES.LJIILL(8, this.LLIZLLLIL);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJII() {
        C127M accessory;
        View viewLJFF;
        C127M accessory2;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        C127K c127k = this.LLILLL;
        boolean z = false;
        if (c127k != null) {
            c127k.setCellEnabled(false);
        }
        IAVPublishPageUIRefactorService publishUIRefactorService = getPublishUIRefactorService();
        if (publishUIRefactorService != null && publishUIRefactorService.isRefactorPublishAddLinkOption()) {
            z = true;
        }
        if (!z) {
            C127K c127k2 = this.LLILLL;
            if (c127k2 != null) {
                C786410Ut5.F5(c127k2, 0.4f);
                return;
            }
            return;
        }
        C127K c127k3 = this.LLILLL;
        if (c127k3 != null && (viewFindViewById4 = c127k3.findViewById(R.id.k1_)) != null) {
            C786410Ut5.T4(viewFindViewById4, 0.4f);
        }
        C127K c127k4 = this.LLILLL;
        if (c127k4 != null && (viewFindViewById3 = c127k4.findViewById(R.id.y3j)) != null) {
            C786410Ut5.T4(viewFindViewById3, 0.4f);
        }
        C127K c127k5 = this.LLILLL;
        if (c127k5 != null && (viewFindViewById2 = c127k5.findViewById(R.id.wmy)) != null) {
            C786410Ut5.T4(viewFindViewById2, 0.4f);
        }
        C127K c127k6 = this.LLILLL;
        if (c127k6 != null && (viewFindViewById = c127k6.findViewById(R.id.uqb)) != null) {
            C786410Ut5.T4(viewFindViewById, 0.4f);
        }
        if (this.LLJJI) {
            C127K c127k7 = this.LLILLL;
            if (c127k7 == null || (accessory2 = c127k7.getAccessory()) == null) {
                return;
            }
            accessory2.LJIIIZ(true);
            return;
        }
        C127K c127k8 = this.LLILLL;
        if (c127k8 == null || (accessory = c127k8.getAccessory()) == null || (viewLJFF = accessory.LJFF()) == null) {
            return;
        }
        C786410Ut5.T4(viewLJFF, 0.4f);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIIJJI() {
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            c127k.setShowAlertBadge(true);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIILJJIL() {
        C127M accessory;
        View viewLJFF;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            c127k.setCellEnabled(true);
        }
        IAVPublishPageUIRefactorService publishUIRefactorService = getPublishUIRefactorService();
        if (publishUIRefactorService != null && publishUIRefactorService.isRefactorPublishAddLinkOption()) {
            C127K c127k2 = this.LLILLL;
            if (c127k2 != null) {
                C786410Ut5.F5(c127k2, 1.0f);
            }
            C127K c127k3 = this.LLILLL;
            if (c127k3 != null && (viewFindViewById4 = c127k3.findViewById(R.id.k1_)) != null) {
                C786410Ut5.T4(viewFindViewById4, 1.0f);
            }
            C127K c127k4 = this.LLILLL;
            if (c127k4 != null && (viewFindViewById3 = c127k4.findViewById(R.id.y3j)) != null) {
                C786410Ut5.T4(viewFindViewById3, 1.0f);
            }
            C127K c127k5 = this.LLILLL;
            if (c127k5 != null && (viewFindViewById2 = c127k5.findViewById(R.id.wmy)) != null) {
                C786410Ut5.T4(viewFindViewById2, 1.0f);
            }
            C127K c127k6 = this.LLILLL;
            if (c127k6 != null && (viewFindViewById = c127k6.findViewById(R.id.uqb)) != null) {
                C786410Ut5.T4(viewFindViewById, 1.0f);
            }
            C127K c127k7 = this.LLILLL;
            if (c127k7 != null && (accessory = c127k7.getAccessory()) != null && (viewLJFF = accessory.LJFF()) != null) {
                C786410Ut5.T4(viewLJFF, 1.0f);
            }
        } else {
            C127K c127k8 = this.LLILLL;
            if (c127k8 != null) {
                C786410Ut5.F5(c127k8, 1.0f);
            }
        }
        C127K c127k9 = this.LLILLL;
        if (c127k9 != null) {
            C786410Ut5.LLZLL(c127k9, 0);
        }
        View view = this.LLIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final IAVPublishPageUIRefactorService getPublishUIRefactorService() {
        return (IAVPublishPageUIRefactorService) this.LLJILLL.getValue();
    }

    @Override // X.AbstractC19511111Vd
    public final void LIZLLL() {
        View view;
        IAVPublishPageUIRefactorService publishUIRefactorService = getPublishUIRefactorService();
        if (publishUIRefactorService == null || !publishUIRefactorService.isRefactorPublishAddLinkOption() || (view = this.LLJI) == null) {
            return;
        }
        view.setOnTouchListener(null);
        C786410Ut5.I7(null, view);
        view.setClickable(false);
        view.setEnabled(false);
    }

    @Override // X.AbstractC19511111Vd
    public final boolean LJIIJ() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC19511111Vd
    public List<C19400610vE> getAddedAnchorList() {
        return this.LLJJ;
    }

    @Override // X.AbstractC19511111Vd
    public ViewGroup getAnchorListContent() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19511111Vd
    public TuxIconView getRightIcon() {
        return this.LLILZLL;
    }

    public C19471511Fx(Context context) {
        C127M accessory;
        C11G4 c11g4;
        C11G4 c11g42;
        super(context);
        this.LLJILJIL = true;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(112));
        this.LLJILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(113));
        this.LLJJ = new ArrayList();
        InjectLayoutInflater injectLayoutInflaterCreateInjectLayoutInflater = ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).createInjectLayoutInflater();
        if (injectLayoutInflaterCreateInjectLayoutInflater.isInjectionEnabled()) {
            injectLayoutInflaterCreateInjectLayoutInflater.setTag("MultiAnchorPublishSettingItem#item_publish_multi_anchor");
            injectLayoutInflaterCreateInjectLayoutInflater.inflate(context, R.layout.cxu, this, true);
        } else {
            this.LLILLJJLI = ((ILayoutPreloadServiceForPublishPage) ServiceManager.get().getService(ILayoutPreloadServiceForPublishPage.class)).loadOtherLayoutFiles("item_publish_multi_anchor", context, C786410Ut5.ne(context), R.layout.cxu, this, true);
        }
        C127K c127k = (C127K) findViewById(R.id.rvl);
        this.LLILLL = c127k;
        if (c127k != null) {
            c127k.setIcon(new AwS608S0100000_29(this, 103));
            C444910HcX c444910HcX = new C444910HcX(context.getString(2131829793));
            c444910HcX.LIZ(42);
            c127k.setTitle(c444910HcX);
        }
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if ((accessory instanceof C11G4) && (c11g42 = (C11G4) accessory) != null) {
            c11g42.LJIILLIIL(false);
        }
        this.LLJI = LJIJ(context);
        C127M accessory2 = c127k != null ? c127k.getAccessory() : null;
        if ((accessory2 instanceof C11G4) && (c11g4 = (C11G4) accessory2) != null) {
            c11g4.LJIILIIL(this.LLJI);
        }
        this.LLILZ = (LinearLayout) findViewById(R.id.rv3);
        this.LLILZIL = (LinearLayout) findViewById(R.id.ex6);
        this.LLIZ = findViewById(R.id.h3n);
        this.LLJ = (TextView) findViewById(R.id.rv6);
    }

    @Override // X.AbstractC19511111Vd
    public final boolean LIZIZ(List<AnchorTransData> list) {
        if (((ArrayList) this.LLJJ).size() != list.size()) {
            this.LLJJIII = true;
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnchorTransData anchorTransData = ((C19400610vE) ListProtector.get(this.LLJJ, i)).LIZ;
            AnchorTransData anchorTransData2 = (AnchorTransData) ListProtector.get(list, i);
            if (anchorTransData.businessType != anchorTransData2.businessType || !Intrinsics.LJFF(anchorTransData.subtype, anchorTransData2.subtype) || !Intrinsics.LJFF(anchorTransData.title, anchorTransData2.title) || !Intrinsics.LJFF(anchorTransData.url, anchorTransData2.url)) {
                this.LLJJIII = true;
                return true;
            }
        }
        this.LLJJIII = false;
        return false;
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIIL(boolean z) {
        String string;
        ViewGroup.LayoutParams layoutParams;
        CharSequence text;
        if (this.LLJIJIL) {
            return;
        }
        C12ES.LJIILL(0, this.LLIZLLLIL);
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(getContext().getText(2131832658));
        }
        if (!z) {
            return;
        }
        try {
            Paint paint = new Paint();
            paint.setTextSize(C12ES.LIZJ(15.0f, getContext()));
            TextView textView = this.LLJ;
            if (textView != null) {
                C786410Ut5.LJLLLLLL(0, textView);
            }
            TuxTextView tuxTextView2 = this.LLIZLLLIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView2);
            }
            TextView textView2 = this.LLJ;
            if (textView2 != null) {
                textView2.setText(getContext().getText(2131832658));
            }
            TuxTextView tuxTextView3 = this.LLIZLLLIL;
            if (tuxTextView3 == null || (text = tuxTextView3.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            float fMeasureText = paint.measureText(string);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMeasureText, 0.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            TextView textView3 = this.LLJ;
            if (textView3 != null) {
                textView3.setTextColor(getResources().getColor(R.color.ct));
            }
            TextView textView4 = this.LLJ;
            RelativeLayout.LayoutParams layoutParams2 = null;
            if (textView4 != null) {
                layoutParams = textView4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.width = (int) fMeasureText;
                layoutParams2.addRule(21, -1);
                layoutParams2.setMarginEnd((int) C12ES.LIZJ(32.0f, getContext()));
            }
            TextView textView5 = this.LLJ;
            if (textView5 != null) {
                C786410Ut5.g6(textView5, layoutParams2);
            }
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 7));
            valueAnimatorOfFloat.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIILIIL(int i) {
        Integer numLIZJ;
        String strLJJIFFI;
        if (this.LLJIJIL) {
            return;
        }
        if (i > 0) {
            C12ES.LJIILL(0, this.LLIZLLLIL);
            TuxTextView tuxTextView = this.LLIZLLLIL;
            if (tuxTextView != null) {
                if (i == 1) {
                    strLJJIFFI = C20642515q3.LJI(2131821552);
                } else {
                    strLJJIFFI = u.LJJIFFI(C20642515q3.LJI(2131821551), "{{count}}", String.valueOf(i), false);
                }
                tuxTextView.setText(strLJJIFFI);
            }
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJZ()) {
                C127K c127k = this.LLILLL;
                if (c127k != null) {
                    C337180DJs.LIZJ(c127k);
                    Context context = getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context)) != null) {
                        c127k.setBackgroundColor(numLIZJ.intValue());
                    }
                }
                ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLI();
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLIZLLLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("");
        }
        C12ES.LJIILL(4, this.LLIZLLLIL);
        C127K c127k2 = this.LLILLL;
        if (c127k2 == null) {
            return;
        }
        c127k2.setBackgroundColor(0);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIILLIIL(Function1<? super View, Unit> function1) {
        IAVPublishPageUIRefactorService publishUIRefactorService = getPublishUIRefactorService();
        if (publishUIRefactorService == null || !publishUIRefactorService.isRefactorPublishAddLinkOption() || !this.LLJJIII) {
            return;
        }
        this.LLJJIII = false;
        HandlerHook.viewPost(this, new ARunnableS98S0200000_29(this, function1, 23));
    }

    public final View LJIJ(Context context) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView = null;
        View viewSd = C786410Ut5.Sd(R.layout.cxw, C786410Ut5.ne(context), null);
        if (viewSd != null) {
            tuxIconView = (TuxIconView) viewSd.findViewById(R.id.k27);
        } else {
            tuxIconView = null;
        }
        this.LLILZLL = tuxIconView;
        if (viewSd != null) {
            tuxTextView = (TuxTextView) viewSd.findViewById(R.id.yyf);
        }
        this.LLIZLLLIL = tuxTextView;
        return viewSd;
    }

    public final void LJIJJ(boolean z) {
        int iLIZIZ;
        IAVPublishPageUIRefactorService publishUIRefactorService = getPublishUIRefactorService();
        if (publishUIRefactorService != null && publishUIRefactorService.isRefactorPublishAddLinkOption()) {
            int iLJ = C11VU.LJ(getContext());
            C127K c127k = this.LLILLL;
            TextView textView = null;
            if (c127k != null) {
                textView = (TextView) c127k.findViewById(R.id.y3j);
            }
            if ((textView instanceof TextView) && textView != null) {
                int width = textView.getWidth();
                int iLIZIZ2 = (((iLJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                if (!z) {
                    textView.setMaxLines(1);
                    textView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)) + iLIZIZ2);
                } else {
                    textView.setMaxLines(2);
                    textView.setMaxWidth(iLIZIZ2);
                }
                if (width < iLIZIZ2) {
                    iLIZIZ = (iLIZIZ2 - width) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                }
                this.LLJJIJIIJIL = iLIZIZ;
            }
        }
    }

    @Override // X.AbstractC19511111Vd
    public void setDisableClickListener(Function0<Unit> function0) {
        C127K c127k = this.LLILLL;
        C127M accessory = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        }
        if ((accessory instanceof C11G4) && accessory != null) {
            accessory.LJI(function0);
        }
    }

    @Override // X.AbstractC19511111Vd
    public void setFromCreateTemplate(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.AbstractC19511111Vd
    public void setLeftIcon(int i) {
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            c127k.setIcon(new AwS30S0001000_16(i, 9));
        }
    }

    @Override // X.AbstractC19511111Vd
    public void setOnAddClickListener(Function1<? super View, Unit> function1) {
        C11G4 c11g4;
        C127K c127k = this.LLILLL;
        C127M accessory = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        }
        if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
            c11g4.LJIILL(new ACListenerS163S0100000_29(function1, 66));
        }
    }

    @Override // X.AbstractC19511111Vd
    public void setRightIcon(C419910GdJ c419910GdJ) {
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    @Override // X.AbstractC19511111Vd
    public void setLeftIcon(C419910GdJ c419910GdJ) {
        C127K c127k = this.LLILLL;
        if (c127k != null) {
            c127k.setIcon(c419910GdJ);
        }
    }

    public static void LJIIZILJ(View view, Number number, Number number2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!Intrinsics.LJFF(number, -1)) {
            layoutParams.width = number.intValue();
        }
        if (!Intrinsics.LJFF(number2, -1)) {
            layoutParams.height = number2.intValue();
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LJIJI(LinearLayout linearLayout, List list, List list2, String str) {
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((UploadableDraftEffect) it2.next()).effectName.equals(str) && linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
            }
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((UploadableMobileEffect) it3.next()).effectName.equals(str) && linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0218  */
    @Override // X.AbstractC19511111Vd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(final com.ss.android.ugc.aweme.creative.model.AnchorTransData r26, com.ss.android.ugc.aweme.base.model.UrlModel r27, java.lang.String r28, boolean r29, java.util.List r30, java.util.List r31, kotlin.jvm.functions.Function1 r32, android.text.SpannedString r33, boolean r34, boolean r35, final kotlin.jvm.functions.Function0 r36) {
        /*
            Method dump skipped, instruction units count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19471511Fx.LJIIIIZZ(com.ss.android.ugc.aweme.creative.model.AnchorTransData, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, boolean, java.util.List, java.util.List, kotlin.jvm.functions.Function1, android.text.SpannedString, boolean, boolean, kotlin.jvm.functions.Function0):void");
    }
}
