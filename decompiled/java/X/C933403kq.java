package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.CCDCAddCardLongTextAdjust;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcCcdcRulesConfigModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C933403kq extends C958503ot {
    public Function0<? extends List<String>> LLJILJILJ;
    public boolean LLJILLL;
    public Function1<? super List<PaymentElement>, Unit> LLJJ;
    public Function1<? super List<PaymentElement>, Unit> LLJJI;
    public Function1<? super PaymentMethod, Unit> LLJJIII;
    public String LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;
    public Function1<? super Boolean, Unit> LLJJIJIL;
    public List<PaymentMethod> LLJJJ;
    public C933303kp LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final C1331730kl9 LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public ElementDTO LLJLIL;
    public boolean LLJLILLLLZIIL;
    public List<PaymentMethod> LLJLL;
    public PaymentMethod LLJLLIL;

    public final void LJI() throws Throwable {
        Editable editableLLJILLL = C2204961BRm.LLJILLL(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde58Xh1PqZqcfZdpwTaFa9PE8fZDD7JFVaA==", null));
        boolean z = editableLLJILLL == null || editableLLJILLL.length() == 0;
        C933503kr.LIZ.getClass();
        if (C933503kr.LIZIZ() && z) {
            setEndInfoIcon(new AwS545S0100000_1(this, 1673));
        } else {
            this.LLILLJJLI.LJFF(null);
        }
    }

    public final EditText getInputView() {
        return getEditText();
    }

    @Override // X.C958503ot
    public List<PaymentElement> getValue() throws Throwable {
        String str;
        String str2;
        String string;
        String strLJJIFFI;
        Boolean bool = null;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde58Xh1PqZqcfZdpwTaFa9PE8fZDD7JFVaA==", null));
        String str3 = "";
        if (editableLLJILLL != null && (string = editableLLJILLL.toString()) != null && (strLJJIFFI = u.LJJIFFI(string, " ", "", false)) != null) {
            str3 = strLJJIFFI;
        }
        ElementDTO elementDTO = this.LLJLIL;
        if (elementDTO != null) {
            str = elementDTO.id;
            str2 = elementDTO.paramName;
            bool = elementDTO.needEncryption;
        } else {
            str = null;
            str2 = null;
        }
        return Collections.singletonList(new PaymentElement(str, str2, str3, bool, Boolean.FALSE));
    }

    public final Function1<List<PaymentElement>, Unit> getAfterValueChanged() {
        return this.LLJJI;
    }

    public final String getCurrentPaymentId() {
        return this.LLJJIJI;
    }

    public final Function0<List<String>> getIconsProvider() {
        return this.LLJILJILJ;
    }

    public final Function1<Boolean, Unit> getOnFocusChange() {
        return this.LLJJIJIL;
    }

    public final Function1<PaymentMethod, Unit> getOnPaymentMethodIdentify() {
        return this.LLJJIII;
    }

    public final Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJJ;
    }

    public final PaymentMethod getParentPaymentMethod() {
        return this.LLJLLIL;
    }

    public final List<PaymentMethod> getPaymentMethodList() {
        return this.LLJJJ;
    }

    public final List<PaymentMethod> getPaymentSubPaymentMethodList() {
        return this.LLJLL;
    }

    public final Function0<Unit> getRequestOCR() {
        return this.LLJJIJIIJIL;
    }

    public final boolean getTextHasFocus() {
        return this.LLJILLL;
    }

    public C933403kq(Context context) {
        super(context, null, 0);
        this.LLJJ = AFwS228S0000000_1.get$arr$(724);
        this.LLJJI = AFwS228S0000000_1.get$arr$(721);
        this.LLJJIII = AFwS228S0000000_1.get$arr$(723);
        this.LLJJIJIIJIL = AFwS185S0000000_1.get$arr$(462);
        this.LLJJIJIL = AFwS228S0000000_1.get$arr$(722);
        this.LLJJJJ = C679280Qkg.LIZ(6);
        this.LLJJJJJIL = C679280Qkg.LIZ(32);
        this.LLJJJJLIIL = C679280Qkg.LIZ(20);
        this.LLJJL = C679280Qkg.LIZ(8);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C679280Qkg.LIZ(2);
        this.LLJJLIIIJLLLLLLLZ = new C1331730kl9(c1331750klB);
        getEditText().setInputType(2);
    }

    public final void LJII(List<String> list) {
        boolean z;
        ViewParent parent;
        TextView headerTitleTextView;
        boolean z2;
        boolean z3;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        String str = this.LLJJIJI;
        Throwable th = null;
        if (str == null) {
            PaymentMethod paymentMethod = this.LLJLLIL;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
        }
        if (str == null) {
            C196100pD c196100pD = C196100pD.LIZ;
        } else {
            C196100pD c196100pD2 = C196100pD.LIZ;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PipoEcCcdcRulesConfigModel pipoEcCcdcRulesConfigModel = C196100pD.LIZIZ;
            PipoEcCcdcRulesConfigModel pipoEcCcdcRulesConfigModel2 = (PipoEcCcdcRulesConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ec_ccdc_rules_config", PipoEcCcdcRulesConfigModel.class, pipoEcCcdcRulesConfigModel);
            if (pipoEcCcdcRulesConfigModel2 != null) {
                pipoEcCcdcRulesConfigModel = pipoEcCcdcRulesConfigModel2;
            }
            List<String> list2 = pipoEcCcdcRulesConfigModel.enableDeduplicationIcons;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<String> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    C196100pD.LIZ.getClass();
                    if (C196100pD.LIZ(next, str)) {
                        list = C13LP.LJJJJI(list);
                        break;
                    }
                }
            }
        }
        List<String> listSubList = C13BV.INSTANCE;
        if (list.size() > 4) {
            List<String> listSubList2 = list.subList(0, 3);
            listSubList = list.subList(3, list.size());
            list = listSubList2;
            z = true;
        } else {
            z = false;
        }
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            List listLJJII = C09RB.LJJII(new C09RD(this));
            ArrayList<View> arrayList = new ArrayList();
            for (Object obj : listLJJII) {
                View view = (View) obj;
                if (view == this.LLJL || Intrinsics.LJFF(view.getTag(), "ccdc_card_brand_icon_container")) {
                    arrayList.add(obj);
                }
            }
            for (View view2 : arrayList) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
                removeView(view2);
            }
            if (list.isEmpty()) {
                this.LLJL = null;
            }
        }
        LinearLayout linearLayout3 = this.LLJL;
        if (linearLayout3 != null) {
            parent = linearLayout3.getParent();
        } else {
            parent = null;
        }
        if (Intrinsics.LJFF(parent, this)) {
            LinearLayout linearLayout4 = this.LLJL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, linearLayout4);
            removeView(linearLayout4);
        }
        if (list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout5, new FrameLayout.LayoutParams(-2, -2, 8388661));
        linearLayout5.setOrientation(0);
        this.LLJL = linearLayout5;
        if (CCDCAddCardLongTextAdjust.LIZ() && (linearLayout2 = this.LLJL) != null) {
            linearLayout2.setTag("ccdc_card_brand_icon_container");
        }
        Iterator<String> it3 = list.iterator();
        int i = 0;
        while (true) {
            String str2 = "";
            if (it3.hasNext()) {
                String next2 = it3.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str3 = next2;
                    SmartImageView smartImageView = new SmartImageView(getContext());
                    C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(this.LLJJJJJIL, this.LLJJJJLIIL));
                    smartImageView.setCircleOptions(this.LLJJLIIIJLLLLLLLZ);
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    if (str3.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (Boolean.valueOf(z3).booleanValue()) {
                        str2 = str3;
                    }
                    c1326790kdB.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
                    c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
                    c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
                    c1331670kl3LIZLLL.LJJI(smartImageView);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                    LinearLayout linearLayout6 = this.LLJL;
                    if (linearLayout6 != null) {
                        linearLayout6.addView(smartImageView);
                    }
                    if (i < list.size() - 1 && (linearLayout = this.LLJL) != null) {
                        Space space = new Space(getContext());
                        C786410Ut5.f6(space, new LinearLayout.LayoutParams(this.LLJJJJ, 0));
                        linearLayout.addView(space);
                    }
                    i = i2;
                    th = null;
                } else {
                    C1697810uHb.LJIJI();
                    throw th;
                }
            } else {
                if (z) {
                    LinearLayout linearLayout7 = this.LLJL;
                    if (linearLayout7 != null) {
                        Space space2 = new Space(getContext());
                        C786410Ut5.f6(space2, new LinearLayout.LayoutParams(this.LLJJJJ, 0));
                        linearLayout7.addView(space2);
                    }
                    ViewFlipper viewFlipper = new ViewFlipper(getContext());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFlipper);
                    viewFlipper.setLayoutParams(layoutParams);
                    for (String str4 : listSubList) {
                        SmartImageView smartImageView2 = new SmartImageView(getContext());
                        C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(this.LLJJJJJIL, this.LLJJJJLIIL));
                        smartImageView2.setCircleOptions(this.LLJJLIIIJLLLLLLLZ);
                        C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
                        if (str4.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!Boolean.valueOf(z2).booleanValue()) {
                            str4 = "";
                        }
                        c1326790kdB2.getClass();
                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str4);
                        c1331670kl3LIZLLL2.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
                        c1331670kl3LIZLLL2.LJJ = EnumC1338240kve.FIT_XY;
                        c1331670kl3LIZLLL2.LJJI(smartImageView2);
                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                        viewFlipper.addView(smartImageView2);
                    }
                    viewFlipper.setFlipInterval(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                    viewFlipper.startFlipping();
                    LinearLayout linearLayout8 = this.LLJL;
                    if (linearLayout8 != null) {
                        linearLayout8.addView(viewFlipper);
                    }
                }
                LinearLayout linearLayout9 = this.LLJL;
                if (linearLayout9 != null) {
                    addView(linearLayout9);
                }
                if (CCDCAddCardLongTextAdjust.LIZ() && (headerTitleTextView = getHeaderTitleTextView()) != null) {
                    LinearLayout linearLayout10 = this.LLJL;
                    if (linearLayout10 == null) {
                        int i3 = 0 + this.LLJJL;
                        if (headerTitleTextView.getPaddingEnd() != i3) {
                            headerTitleTextView.setPaddingRelative(headerTitleTextView.getPaddingStart(), headerTitleTextView.getPaddingTop(), i3, headerTitleTextView.getPaddingBottom());
                            return;
                        }
                        return;
                    }
                    if (linearLayout10.getWidth() > 0) {
                        LJFF(headerTitleTextView, linearLayout10.getWidth());
                        return;
                    } else {
                        linearLayout10.addOnLayoutChangeListener(new C04JH(this, headerTitleTextView, 1));
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void setAfterValueChanged(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setCCI(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setCurrentPaymentId(String str) {
        this.LLJJIJI = str;
    }

    public final void setIconsProvider(Function0<? extends List<String>> function0) {
        this.LLJILJILJ = function0;
    }

    public final void setOnFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJJIJIL = function1;
    }

    public final void setOnPaymentMethodIdentify(Function1<? super PaymentMethod, Unit> function1) {
        this.LLJJIII = function1;
    }

    public final void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setParentPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJLLIL = paymentMethod;
    }

    public final void setPaymentMethodList(List<PaymentMethod> list) {
        this.LLJJJ = list;
    }

    public final void setPaymentSubPaymentMethodList(List<PaymentMethod> list) {
        this.LLJLL = list;
    }

    public final void setRequestOCR(Function0<Unit> function0) {
        this.LLJJIJIIJIL = function0;
    }

    public final void setTextHasFocus(boolean z) {
        this.LLJILLL = z;
    }

    public final void LJFF(final TextView textView, final int i) {
        View view;
        int i2;
        Object parent = textView.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            int width = view.getWidth();
            if (width <= 0) {
                if (view != null) {
                    view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.03ks
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                            view2.removeOnLayoutChangeListener(this);
                            this.LL.LJFF(textView, i);
                        }
                    });
                    return;
                }
                return;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            if (textView.getPaddingEnd() != 0) {
                textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), 0, textView.getPaddingBottom());
            }
            textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = textView.getMeasuredWidth() + i;
            int i3 = this.LLJJL;
            if (measuredWidth + i3 > width && textView.getPaddingEnd() != (i2 = i + i3)) {
                textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), i2, textView.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.03kp] */
    @Override // X.C958503ot
    public final void LIZLLL(ElementDTO elementDTO, List<PaymentElement> list, String str) throws Throwable {
        final int iIntValue;
        PaymentElement paymentElement;
        String str2;
        Integer num;
        super.LIZLLL(elementDTO, list, str);
        this.LLJLIL = elementDTO;
        C914303hl.LIZ.getClass();
        C914303hl.LJ("ccdc_card_info");
        C933303kp c933303kp = this.LLJJJIL;
        if (c933303kp != null) {
            getEditText().removeTextChangedListener(c933303kp);
        }
        final EditText editText = getEditText();
        Configuration configuration = elementDTO.configuration;
        if (configuration != null && (num = configuration.maxLength) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 19;
        }
        this.LLJJJIL = new C933903kv(editText, iIntValue) { // from class: X.03kp
            @Override // X.C933903kv, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) throws Throwable {
                super.afterTextChanged(editable);
                this.LLILZIL.getAfterValueChanged().invoke(this.LLILZIL.getValue());
                this.LLILZIL.LJI();
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0108 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:2:0x0000, B:4:0x0018, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:10:0x002c, B:12:0x0032, B:13:0x0034, B:15:0x003a, B:16:0x0043, B:18:0x004f, B:20:0x005d, B:21:0x0061, B:23:0x0067, B:25:0x0076, B:26:0x0078, B:27:0x007b, B:43:0x00b5, B:45:0x00bb, B:47:0x00bf, B:48:0x00c3, B:50:0x00c9, B:52:0x00d8, B:54:0x00dc, B:57:0x00e3, B:60:0x00ec, B:62:0x00f2, B:69:0x010d, B:63:0x00f8, B:65:0x0100, B:68:0x010a, B:67:0x0108, B:58:0x00e8, B:30:0x008a, B:32:0x0095, B:34:0x009b, B:36:0x00a2, B:38:0x00aa), top: B:74:0x0000 }] */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
                /*
                    Method dump skipped, instruction units count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C933303kp.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }
        };
        getEditText().addTextChangedListener(this.LLJJJIL);
        getEditText().setOnFocusChangeListener(new C04JP(this, 1));
        getEditText().setImeOptions(6);
        LJI();
        if (list != null && (!list.isEmpty()) && (paymentElement = (PaymentElement) ListProtector.get(list, 0)) != null && (str2 = paymentElement.paramValue) != null) {
            getEditText().setText(str2);
            if (str2.length() > 0) {
                Boolean bool = EcPaymentIndependentPriceDefaultConfig.LIZJ().disableRequestFocus;
                if ((bool != null && bool.booleanValue()) || str == null || str.length() == 0) {
                    HandlerHook.viewPost(getEditText(), new ARunnableS101S0100000_1((Object) this, 65));
                }
            }
        }
    }
}
