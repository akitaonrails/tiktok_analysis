package X;

import Y.ACListenerS39S0201000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mf.a;

/* JADX INFO: renamed from: X.03bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C874003bG extends LinearLayout implements InterfaceC884803d0 {
    public Function1<? super List<PaymentElement>, Unit> LL;
    public PaymentMethod LLILLJJLI;
    public ElementDTO LLILLL;
    public Function1<? super PaymentMethod, Unit> LLILZ;
    public Function1<? super PaymentMethod, Unit> LLILZIL;
    public C03WH LLILZLL;
    public final List<String> LLIZ;
    public PaymentMethod LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public ButtonStyle LLJIJIL;
    public PaymentViewModel LLJILJIL;

    public final void LIZIZ() {
        C1076804Ja<View> c1076804Ja = new C1076804Ja(this, 21);
        ArrayList<C874103bH> arrayList = new ArrayList();
        for (View view : c1076804Ja) {
            if ((view instanceof C874103bH) && view != null) {
                arrayList.add(view);
            }
        }
        for (C874103bH c874103bH : arrayList) {
            if (c874103bH.LIZ()) {
                c874103bH.setChecked(false);
            }
        }
    }

    @Override // X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        C1076804Ja c1076804Ja = new C1076804Ja(this, 22);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c1076804Ja.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            View view = (View) it2.next();
            if ((view instanceof C874103bH) && view != null) {
                arrayList.add(view);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((C874103bH) next).LIZ()) {
                if (next != null) {
                    ElementDTO elementDTO = getElementDTO();
                    String str = elementDTO != null ? elementDTO.id : null;
                    ElementDTO elementDTO2 = getElementDTO();
                    String str2 = elementDTO2 != null ? elementDTO2.paramName : null;
                    ElementDTO elementDTO3 = getElementDTO();
                    return Collections.singletonList(new PaymentElement(str, str2, null, elementDTO3 != null ? elementDTO3.needEncryption : null, Boolean.FALSE));
                }
            }
        }
        return C13BV.INSTANCE;
    }

    public final boolean getAutoSelect() {
        return this.LLJI;
    }

    public final boolean getDefaultChoose() {
        return this.LLJ;
    }

    @Override // X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLILLL;
    }

    public final Function1<PaymentMethod, Unit> getOnSubPaymentCheckChanged() {
        return this.LLILZ;
    }

    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LL;
    }

    public final C03WH getPaymentLogger() {
        return this.LLILZLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LLILLJJLI;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.LLJILJIL;
    }

    public final ButtonStyle getStyle() {
        return this.LLJIJIL;
    }

    public final Function1<PaymentMethod, Unit> getSubPromotionClickListener() {
        return this.LLILZIL;
    }

    public C874003bG(Context context) {
        super(context, null, 0);
        this.LL = AFwS228S0000000_1.get$arr$(736);
        this.LLILZ = AFwS228S0000000_1.get$arr$(734);
        this.LLILZIL = AFwS228S0000000_1.get$arr$(738);
        this.LLIZ = new ArrayList();
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setAutoSelect(boolean z) {
        this.LLJI = z;
    }

    public final void setDefaultChoose(boolean z) {
        this.LLJ = z;
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LLILLL = elementDTO;
    }

    public final void setOnSubPaymentCheckChanged(Function1<? super PaymentMethod, Unit> function1) {
        this.LLILZ = function1;
    }

    @Override // X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LL = function1;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLILZLL = c03wh;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLILLJJLI = paymentMethod;
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.LLJILJIL = paymentViewModel;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLJIJIL = buttonStyle;
    }

    public final void setSubPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLILZIL = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        List list2;
        PaymentMethod subPaymentMethod;
        Availability availability;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        String strNR2;
        boolean z;
        TuxTextView tvPromotionDescFromXml;
        String strLJJIIZ;
        String str;
        String strLJJIJ;
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        this.LLIZLLLIL = paymentMethod.LIZ;
        C1076804Ja c1076804Ja = new C1076804Ja(this, 23);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c1076804Ja.iterator();
        while (true) {
            C1076904Jb c1076904Jb = (C1076904Jb) it2;
            if (!c1076904Jb.hasNext()) {
                break;
            }
            Object next = c1076904Jb.next();
            if (next instanceof C874103bH) {
                arrayList.add(next);
            }
        }
        PaymentMethod paymentMethod4 = getPaymentMethod();
        if (paymentMethod4 == null || (list2 = paymentMethod4.subPaymentMethods) == null) {
            list2 = C13BV.INSTANCE;
        }
        Object obj2 = null;
        ?? r5 = 0;
        if (list2.size() > arrayList.size()) {
            C531650Kt9 it3 = new IntRange(1, list2.size() - arrayList.size()).iterator();
            int i = 0;
            while (it3.LLILLL) {
                it3.nextInt();
                int i2 = i + 1;
                if (i >= 0) {
                    View c874103bH = new C874103bH(getContext());
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.leftMargin = C679280Qkg.LIZ(60);
                    marginLayoutParams.topMargin = C679280Qkg.LIZ(6);
                    marginLayoutParams.bottomMargin = C679280Qkg.LIZ(6);
                    marginLayoutParams.setMarginStart(C679280Qkg.LIZ(44));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c874103bH);
                    c874103bH.setLayoutParams(marginLayoutParams);
                    View.OnClickListener aCListenerS39S0201000_1 = new ACListenerS39S0201000_1(c874103bH, this, i, 1);
                    if (C1848410yCV.LIZ) {
                        aCListenerS39S0201000_1 = new f(aCListenerS39S0201000_1);
                    }
                    View.OnClickListener aVar = new a(aCListenerS39S0201000_1);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(c874103bH);
                    }
                    c874103bH.setOnClickListener(aVar);
                    addView(c874103bH);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else if (list2.size() < arrayList.size()) {
            int size = arrayList.size() - list2.size();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeViews(0, size);
        }
        Boolean bool = null;
        int i3 = 0;
        for (Object obj3 : list2) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                PaymentMethod paymentMethod5 = (PaymentMethod) obj3;
                C874103bH c874103bH2 = (C874103bH) getChildAt(i3);
                if (this.LLJIJIL == ButtonStyle.TOKO_STYLE) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                c874103bH2.LLJ = paymentMethod5;
                String str2 = paymentMethod5.iconUrl;
                if (str2 != null) {
                    Drawable drawableLJ = C1308910kAL.LJ(R.attr.c7, c874103bH2.getContext());
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                    c1331670kl3LJIIIZ.LJJIIZI(drawableLJ);
                    c1331670kl3LJIIIZ.LJJI(c874103bH2.getIvSubPaymentIconFromXml());
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
                c874103bH2.getTvSubPaymentNameFromXml().setText(paymentMethod5.displayName);
                c874103bH2.LIZIZ();
                c874103bH2.LIZLLL();
                c874103bH2.LIZJ(c874103bH2.getLayoutSubPaymentFromXml().isSelected());
                c874103bH2.setEnabled(true);
                C786410Ut5.x5(c874103bH2.getIvSubPaymentIconFromXml(), 1.0f);
                c874103bH2.getTvSubPaymentNameFromXml().setTextColorRes(R.attr.a1h);
                c874103bH2.getTvExtraInfoRightFromXml().setTextColorRes(R.attr.a04);
                c874103bH2.getTvExtraInfoBelowFromXml().setTextColorRes(R.attr.a04);
                Availability availability2 = paymentMethod5.availability;
                if (availability2 != null && Intrinsics.LJFF(availability2.isAvailable(), Boolean.FALSE)) {
                    c874103bH2.getTvSubPaymentNameFromXml().setTextColorRes(R.attr.a1p);
                    c874103bH2.getTvExtraInfoRightFromXml().setTextColorRes(R.attr.a1p);
                    c874103bH2.getTvExtraInfoBelowFromXml().setTextColorRes(R.attr.a1p);
                    C786410Ut5.x5(c874103bH2.getIvSubPaymentIconFromXml(), 0.3f);
                    c874103bH2.setEnabled(r5);
                }
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(boolValueOf, bool2)) {
                    c874103bH2.getLayoutSubPaymentFromXml().setBackgroundResource(R.drawable.b32);
                }
                c874103bH2.setSubPromotionViewClickListener(this.LLILZIL);
                if (!((ArrayList) this.LLIZ).contains(paymentMethod5.LJIIJ())) {
                    boolean zLIZIZ = C899503fN.LIZIZ(this.LLIZLLLIL, paymentMethod5);
                    C03WH c03wh = this.LLILZLL;
                    if (c03wh != null) {
                        PaymentMethod paymentMethod6 = getPaymentMethod();
                        if (paymentMethod6 != null) {
                            strLJJIIZ = paymentMethod6.LJJIIZ();
                        } else {
                            strLJJIIZ = "";
                        }
                        String strLJJIIZ2 = paymentMethod5.LJJIIZ();
                        boolean zLIZIZ2 = C770702zh.LIZIZ(paymentMethod5.extraInfo);
                        Availability availability3 = paymentMethod5.availability;
                        if (availability3 != null) {
                            str = availability3.statusCode;
                        } else {
                            str = null;
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(zLIZIZ);
                        PaymentMethod paymentMethod7 = getPaymentMethod();
                        PaymentMethod subPaymentMethod2 = c874103bH2.getSubPaymentMethod();
                        if (subPaymentMethod2 != null) {
                            strLJJIJ = subPaymentMethod2.LJJIJ();
                        } else {
                            strLJJIJ = null;
                        }
                        c03wh.LJIJJLI(strLJJIIZ, strLJJIIZ2, i3, zLIZIZ2, str, boolValueOf2, null, null, paymentMethod7, null, null, strLJJIJ);
                    }
                    ((ArrayList) this.LLIZ).add(paymentMethod5.LJIIJ());
                }
                if (c874103bH2.getTvExtraInfoRightFromXml().getVisibility() == 0 || c874103bH2.getTvExtraInfoBelowFromXml().getVisibility() == 0 || ((tvPromotionDescFromXml = c874103bH2.getTvPromotionDescFromXml()) != null && tvPromotionDescFromXml.getVisibility() == 0)) {
                    bool = bool2;
                }
                i3 = i4;
                r5 = 0;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        PaymentMethod paymentMethod8 = getPaymentMethod();
        if (paymentMethod8 != null) {
            PaymentViewModel paymentViewModel = this.LLJILJIL;
            if (paymentViewModel != null) {
                strNR2 = paymentViewModel.nR2();
            } else {
                strNR2 = null;
            }
            C1440005kM.LIZ(new C03ZJ(paymentMethod8, bool, null, null, strNR2));
        }
        PaymentMethod paymentMethod9 = getPaymentMethod();
        if (paymentMethod9 != null && paymentMethod9.LIZ != null) {
            PaymentMethod paymentMethod10 = C03WH.LJIILJJIL;
            PaymentMethod paymentMethod11 = getPaymentMethod();
            if (paymentMethod11 != null) {
                paymentMethod2 = paymentMethod11.LIZ;
            } else {
                paymentMethod2 = null;
            }
            this.LLJI = !C899503fN.LIZIZ(paymentMethod10, paymentMethod2);
            this.LLJ = r5;
            LIZIZ();
            Iterator it4 = ((ArrayList) C13EQ.LJJIJL(new C1076804Ja(this, 24), C874103bH.class)).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                PaymentMethod subPaymentMethod3 = ((C874103bH) next2).getSubPaymentMethod();
                PaymentMethod paymentMethod12 = getPaymentMethod();
                if (paymentMethod12 != null) {
                    paymentMethod3 = paymentMethod12.LIZ;
                } else {
                    paymentMethod3 = null;
                }
                if (C899503fN.LIZIZ(subPaymentMethod3, paymentMethod3)) {
                    obj2 = next2;
                    break;
                }
            }
            View view = (View) obj2;
            if (view != null) {
                view.performClick();
                return;
            }
            return;
        }
        LIZIZ();
        C874103bH c874103bH3 = (C874103bH) C13LP.LJJJLZIJ(r5, C13EQ.LJJIJL(new C1076804Ja(this, 25), C874103bH.class));
        if (c874103bH3 != null && (subPaymentMethod = c874103bH3.getSubPaymentMethod()) != null && (availability = subPaymentMethod.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE)) {
            this.LLJ = true;
            this.LLJI = true;
            c874103bH3.performClick();
            return;
        }
        this.LLJI = r5;
    }
}
