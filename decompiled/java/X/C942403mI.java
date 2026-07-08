package X;

import Y.ACListenerS105S0200000_1;
import Y.ACListenerS77S1100000_1;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.03mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C942403mI extends AbstractC941303m7 {
    public View LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public PaymentMethod LLJL;
    public ElementDTO LLJLIL;
    public List<Region> LLJLILLLLZIIL;
    public Function1<? super EnumC863903Zd, Unit> LLJLL;
    public Function1<? super List<PaymentElement>, Unit> LLJLLIL;

    @Override // X.C1745300vWC
    public int getContentViewLayoutId() {
        return R.layout.aqg;
    }

    @Override // X.AbstractC941303m7
    public C1748260vay getInputView() {
        return null;
    }

    public final View getDelimiterFromXml() {
        View view = this.LLJJL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.flf);
        this.LLJJL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> getValue() {
        /*
            r11 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r11.LLJLILLLLZIIL
            kotlin.ranges.IntRange r1 = X.C1697810uHb.LJIIIZ(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            X.0Kt9 r1 = r1.iterator()
        L15:
            boolean r0 = r1.LLILLL
            if (r0 == 0) goto Lac
            int r4 = r1.nextInt()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r11.LLJLILLLLZIIL
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r6 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r6
            r9 = 0
            if (r4 != 0) goto La9
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r11.getElementDTO()
            if (r0 == 0) goto La7
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.subElementDTOList
            if (r0 == 0) goto La7
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            if (r0 == 0) goto La7
            java.lang.String r3 = r0.id
        L3c:
            java.lang.String r0 = "eg_ccdc_global_billing_address_country_regin"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto La9
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r6.geoNameId
            java.lang.String r0 = X.C749702wJ.LIZ(r0)
            r5.append(r0)
            r3 = 44
            r5.append(r3)
            java.lang.String r0 = r6.name
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r6.geoNameId
            r5.append(r0)
            java.lang.String r8 = X.C2188811AlT.LIZIZ(r5)
        L67:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r5 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r11.getElementDTO()
            if (r0 == 0) goto La5
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.subElementDTOList
            if (r0 == 0) goto La5
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            if (r0 == 0) goto La5
            java.lang.String r6 = r0.id
        L7d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r11.getElementDTO()
            if (r0 == 0) goto La3
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.subElementDTOList
            if (r0 == 0) goto La3
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            if (r0 == 0) goto La3
            java.lang.String r7 = r0.paramName
        L91:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r11.getElementDTO()
            if (r0 == 0) goto L99
            java.lang.Boolean r9 = r0.needEncryption
        L99:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r5.<init>(r6, r7, r8, r9, r10)
            r2.add(r5)
            goto L15
        La3:
            r7 = r9
            goto L91
        La5:
            r6 = r9
            goto L7d
        La7:
            r3 = r9
            goto L3c
        La9:
            java.lang.String r8 = r6.name
            goto L67
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942403mI.getValue():java.util.List");
    }

    public final void LJIIIIZZ() {
        getTextViewFromXml().setText(C13LP.LJJLIIIJ(C13LP.LJLJJLL(this.LLJLILLLLZIIL), ", ", null, null, 0, null, AFwS228S0000000_1.get$arr$(750), 30));
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLJLIL;
    }

    public final Function1<EnumC863903Zd, Unit> getOnRegionPanelStatus() {
        return this.LLJLL;
    }

    @Override // X.AbstractC941303m7
    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC941303m7
    public PaymentMethod getPaymentMethod() {
        return this.LLJL;
    }

    public final List<Region> getRegionList() {
        return this.LLJLILLLLZIIL;
    }

    public C942403mI(Context context) {
        super(context, null, 0);
        this.LLJLILLLLZIIL = C13BV.INSTANCE;
        this.LLJLL = AFwS228S0000000_1.get$arr$(753);
        this.LLJLLIL = AFwS228S0000000_1.get$arr$(754);
    }

    public final void setDelimiterFromXml(View view) {
        this.LLJJL = view;
    }

    @Override // X.AbstractC941303m7
    public void setElementDTO(ElementDTO elementDTO) {
        this.LLJLIL = elementDTO;
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
    }

    public final void setOnRegionPanelStatus(Function1<? super EnumC863903Zd, Unit> function1) {
        this.LLJLL = function1;
    }

    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLJLLIL = function1;
    }

    @Override // X.AbstractC941303m7
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLJL = paymentMethod;
    }

    public final void setRegionList(List<Region> list) {
        this.LLJLILLLLZIIL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // X.AbstractC941303m7, X.InterfaceC884803d0
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        Region region;
        ?? LJJLIIIJILLIZJL;
        ?? r7;
        ?? r8;
        ?? r9;
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        ?? r10 = 0;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (PaymentElement paymentElement : list) {
                if (Intrinsics.LJFF(paymentElement.element, "eg_ccdc_global_billing_address_country_regin")) {
                    String str = paymentElement.paramValue;
                    if (str != null) {
                        LJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
                    } else {
                        LJJLIIIJILLIZJL = r10;
                    }
                    if (LJJLIIIJILLIZJL != 0) {
                        String str2 = (String) C13LP.LJJJLZIJ(1, LJJLIIIJILLIZJL);
                        r7 = str2;
                        r8 = (String) C13LP.LJJJLZIJ(2, LJJLIIIJILLIZJL);
                        r9 = (String) C13LP.LJJJLZIJ(0, LJJLIIIJILLIZJL);
                    } else {
                        r7 = r10;
                        r8 = r10;
                        r9 = r10;
                    }
                    region = new Region(r7, r8, r9, r10, r10, r10, r10);
                } else {
                    ?? r82 = r10;
                    ?? r92 = r10;
                    r10 = r10;
                    region = new Region(paymentElement.paramValue, r82, r92, r10, r10, r10, r10);
                }
                arrayList.add(region);
                r10 = r10;
            }
            this.LLJLILLLLZIIL = arrayList;
        }
        LJIIIIZZ();
        String str3 = elementDTO.notificationUrl;
        if (C703302op.LIZ(str3) && str3 != null) {
            C786410Ut5.LJLLLLLL(0, getDelimiterFromXml());
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 0);
            C786410Ut5.a9(getIconFromXml(), new ACListenerS77S1100000_1(this, str3, 5));
        } else {
            C786410Ut5.LJLLLLLL(8, getDelimiterFromXml());
            C786410Ut5.LLLLLLZZ(getIconFromXml(), 8);
        }
        getTextViewFromXml().setHint(elementDTO.placeholderDisplayName);
        View.OnClickListener aCListenerS105S0200000_1 = new ACListenerS105S0200000_1(this, elementDTO, 15);
        if (C1848410yCV.LIZ) {
            aCListenerS105S0200000_1 = new f(aCListenerS105S0200000_1);
        }
        a aVar = new a(aCListenerS105S0200000_1);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
