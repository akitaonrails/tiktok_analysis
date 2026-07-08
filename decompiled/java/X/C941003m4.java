package X;

import Y.ACListenerS105S0200000_1;
import Y.ACListenerS136S0100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C941003m4 extends AbstractC941303m7 {
    public TuxIconView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public LinearLayoutCompat LLJL;
    public View LLJLIL;
    public Function1<? super Boolean, Unit> LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public C03WH LLJLLL;
    public boolean LLJZ;
    public Function0<Unit> LLJZIJLIL;
    public PaymentMethod LLL;
    public ElementDTO LLLF;
    public List<PaymentMethod> LLLFF;
    public String LLLFFI;
    public C941103m5 LLLFZ;
    public final int LLLI;
    public final int LLLII;
    public final int LLLIIII;
    public final int LLLIIIIL;
    public Function1<? super PaymentMethod, Unit> LLLIIIL;
    public final C1331730kl9 LLLIIL;
    public Function1<? super List<PaymentElement>, Unit> LLLIILIL;

    @Override // X.C1745300vWC
    public int getContentViewLayoutId() {
        return R.layout.aqd;
    }

    public final View getDelimiterFromXml() {
        View view = this.LLJLIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.flf);
        this.LLJLIL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getIconClearFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxq);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconScanningFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jy6);
            this.LLJJL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayoutCompat getScanWrapperFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u0s);
            this.LLJL = (LinearLayoutCompat) callbackFindViewById;
        }
        return (LinearLayoutCompat) callbackFindViewById;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        ElementDTO elementDTO = getElementDTO();
        String str = elementDTO != null ? elementDTO.id : null;
        ElementDTO elementDTO2 = getElementDTO();
        String str2 = elementDTO2 != null ? elementDTO2.paramName : null;
        String strLJJIFFI = u.LJJIFFI(String.valueOf(C2204961BRm.LLLLJI(getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YxxIKud/4cdYdQ6sKp2JjPA42b0LEIGfxxR6r1SiA==", null))), " ", "", false);
        ElementDTO elementDTO3 = getElementDTO();
        return Collections.singletonList(new PaymentElement(str, str2, strLJJIFFI, elementDTO3 != null ? elementDTO3.needEncryption : null, Boolean.FALSE));
    }

    @Override // X.AbstractC941303m7
    public C1748260vay getInputView() {
        return getInputWithIndicatorFromXml();
    }

    public final List<String> getAllCardIcons() {
        return C13BV.INSTANCE;
    }

    public final C1331730kl9 getCircleOption() {
        return this.LLLIIL;
    }

    public final String getCurrentPaymentId() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLLF;
    }

    public final Function1<Boolean, Unit> getFocusChange() {
        return this.LLJLILLLLZIIL;
    }

    public final String getInputType() {
        return this.LLJLL;
    }

    public final String getLastOcrValue() {
        return this.LLJLLIL;
    }

    public final Function1<PaymentMethod, Unit> getOnPaymentMethodIdentify() {
        return this.LLLIIIL;
    }

    @Override // X.AbstractC941303m7
    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLLIILIL;
    }

    public final List<PaymentMethod> getPaymentList() {
        return this.LLLFF;
    }

    public final C03WH getPaymentLogger() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC941303m7
    public PaymentMethod getPaymentMethod() {
        return this.LLL;
    }

    public final Function0<Unit> getRequestOcr() {
        return this.LLJZIJLIL;
    }

    public final boolean getTextHasFocus() {
        return this.LLJZ;
    }

    public C941003m4(Context context) {
        super(context, null, 0);
        this.LLJLILLLLZIIL = AFwS228S0000000_1.get$arr$(745);
        this.LLJLL = "";
        this.LLJZIJLIL = AFwS185S0000000_1.get$arr$(467);
        this.LLLI = (int) C12ES.LIZJ(4.0f, context);
        this.LLLII = (int) C12ES.LIZJ(6.0f, context);
        this.LLLIIII = (int) C12ES.LIZJ(25.0f, context);
        this.LLLIIIIL = (int) C12ES.LIZJ(16.0f, context);
        this.LLLIIIL = AFwS228S0000000_1.get$arr$(747);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C12ES.LIZJ(2.0f, context);
        this.LLLIIL = new C1331730kl9(c1331750klB);
        this.LLLIILIL = AFwS228S0000000_1.get$arr$(748);
    }

    public final void LJIIIIZZ(String str) {
        PaymentMethod next;
        if (str != null) {
            if (str.length() != 0) {
                List<PaymentMethod> list = this.LLLFF;
                String str2 = null;
                if (list != null) {
                    Iterator<PaymentMethod> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.id, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod = next;
                    if (paymentMethod != null) {
                        str2 = paymentMethod.iconUrl;
                    }
                }
                LJIIIZ(this, Collections.singletonList(str2));
                return;
            }
            return;
        }
        LJIIIZ(this, C13BV.INSTANCE);
    }

    public final void setCurrentPaymentId(String str) {
        this.LLLFFI = str;
    }

    public final void setDelimiterFromXml(View view) {
        this.LLJLIL = view;
    }

    public final void setDelimiterVisible(boolean z) {
        int i;
        View delimiterFromXml = getDelimiterFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, delimiterFromXml);
    }

    @Override // X.AbstractC941303m7
    public void setElementDTO(ElementDTO elementDTO) {
        this.LLLF = elementDTO;
    }

    public final void setFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJLILLLLZIIL = function1;
    }

    public final void setIconClearFromXml(TuxIconView tuxIconView) {
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
    }

    public final void setIconScanningFromXml(TuxIconView tuxIconView) {
        this.LLJJL = tuxIconView;
    }

    public final void setInputType(String str) {
        this.LLJLL = str;
    }

    public final void setLastOcrValue(String str) {
        this.LLJLLIL = str;
    }

    public final void setOnPaymentMethodIdentify(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLIIIL = function1;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLLIILIL = function1;
    }

    public final void setPaymentList(List<PaymentMethod> list) {
        this.LLLFF = list;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLJLLL = c03wh;
    }

    @Override // X.AbstractC941303m7
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLL = paymentMethod;
    }

    public final void setRequestOcr(Function0<Unit> function0) {
        this.LLJZIJLIL = function0;
    }

    public final void setScanWrapperFromXml(LinearLayoutCompat linearLayoutCompat) {
        this.LLJL = linearLayoutCompat;
    }

    public final void setTextHasFocus(boolean z) {
        this.LLJZ = z;
    }

    public static void LJIIIZ(C941003m4 c941003m4, List list) {
        boolean z;
        int i;
        int i2;
        c941003m4.getClass();
        if ((!list.isEmpty()) && c941003m4.getInputWithIndicatorFromXml().getInputWithIndicatorClickContainerFromXml().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        c941003m4.setDelimiterVisible(z);
        LinearLayoutCompat scanWrapperFromXml = c941003m4.getScanWrapperFromXml();
        C786410Ut5.LJJJJI(scanWrapperFromXml);
        if (list.size() > 6) {
            list = list.subList(0, 6);
        }
        int size = list.size();
        for (int childCount = scanWrapperFromXml.getChildCount(); childCount < size; childCount++) {
            SmartImageView smartImageView = new SmartImageView(c941003m4.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c941003m4.LLLIIII, c941003m4.LLLIIIIL);
            layoutParams.weight = 1.0f;
            C786410Ut5.G6(smartImageView, layoutParams);
            smartImageView.setBackgroundResource(R.drawable.b2a);
            scanWrapperFromXml.addView(smartImageView);
        }
        int childCount2 = scanWrapperFromXml.getChildCount();
        for (int size2 = list.size(); size2 < childCount2; size2++) {
            View childAt = scanWrapperFromXml.getChildAt(size2);
            if (childAt != null) {
                C786410Ut5.LJLLLLLL(8, childAt);
            }
        }
        C531650Kt9 it2 = C1697810uHb.LJIIIZ(list).iterator();
        while (true) {
            Object obj = null;
            if (!it2.LLILLL) {
                break;
            }
            int iNextInt = it2.nextInt();
            View childAt2 = scanWrapperFromXml.getChildAt(iNextInt);
            if (childAt2 != null && (childAt2 instanceof SmartImageView)) {
                if (iNextInt != list.size() - 1) {
                    i = c941003m4.LLLI;
                } else {
                    i = 0;
                }
                if (iNextInt == 0) {
                    i2 = c941003m4.LLLII;
                } else {
                    i2 = 0;
                }
                C426750GoL.LJIIIZ(childAt2, Integer.valueOf(i2), null, Integer.valueOf(i), null, false, 26);
                Object obj2 = ListProtector.get(list, iNextInt);
                String str = (String) obj2;
                if (str != null && str.length() != 0) {
                    obj = obj2;
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = " ";
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                SmartImageView smartImageView2 = (SmartImageView) childAt2;
                c1331670kl3LJIIIZ.LJJIIZI(C1308910kAL.LJ(R.attr.c7, smartImageView2.getContext()));
                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
                c1331670kl3LJIIIZ.LJJI((ImageView) childAt2);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                smartImageView2.setCircleOptions(c941003m4.LLLIIL);
            }
        }
        if (TextUtils.isEmpty(c941003m4.getInputWithIndicatorFromXml().getText())) {
            LinearLayoutCompat scanWrapperFromXml2 = c941003m4.getScanWrapperFromXml();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(scanWrapperFromXml2, null);
            scanWrapperFromXml2.removeAllViews();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.03m5] */
    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int i;
        final int iIntValue;
        C03WH c03wh;
        PaymentElement paymentElement;
        String str;
        Integer num;
        super.LIZ(elementDTO, paymentMethod, list, obj);
        if (C426750GoL.LIZLLL(getContext())) {
            getInputView().getInputWithIndicatorEditTextFromXml().setLayoutDirection(0);
            getInputView().getInputWithIndicatorEditTextFromXml().setTextAlignment(6);
        }
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        this.LLLFF = paymentMethod.subPaymentMethods;
        C914303hl.LIZ.getClass();
        C914303hl.LJ("payment_method");
        TuxIconView iconScanningFromXml = getIconScanningFromXml();
        C933503kr.LIZ.getClass();
        if (C933503kr.LIZIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, iconScanningFromXml);
        C786410Ut5.a9(getIconClearFromXml(), new ACListenerS136S0100000_1(this, 27));
        C941103m5 c941103m5 = this.LLLFZ;
        if (c941103m5 != null) {
            getInputWithIndicatorEditTextFromXml().removeTextChangedListener(c941103m5);
        }
        final C0I7D inputWithIndicatorEditTextFromXml = getInputWithIndicatorEditTextFromXml();
        Configuration configuration = elementDTO.configuration;
        if (configuration != null && (num = configuration.maxLength) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 19;
        }
        this.LLLFZ = new C933903kv(inputWithIndicatorEditTextFromXml, iIntValue) { // from class: X.03m5
            /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
                /*
                    Method dump skipped, instruction units count: 210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C941103m5.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }
        };
        getInputWithIndicatorEditTextFromXml().addTextChangedListener(this.LLLFZ);
        getInputWithIndicatorFromXml().setOnEditTextFocusChangeListener(new C04JP(this, 5));
        getInputWithIndicatorFromXml().setOnIndicatorVisibleChangeListener(new AwS580S0100000_1(this, 806));
        if (list != null && (paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list)) != null && (str = paymentElement.paramValue) != null && str.length() != 0) {
            getInputWithIndicatorFromXml().setText(str);
        }
        getInputWithIndicatorEditTextFromXml().setImeOptions(6);
        TuxIconView iconScanningFromXml2 = getIconScanningFromXml();
        C786410Ut5.a9(iconScanningFromXml2, new ACListenerS105S0200000_1(this, paymentMethod, 14));
        if (iconScanningFromXml2.getVisibility() == 0 && (c03wh = this.LLJLLL) != null) {
            c03wh.LJII("card_number_ocr");
        }
    }
}
