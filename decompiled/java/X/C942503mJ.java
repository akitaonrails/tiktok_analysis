package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;

/* JADX INFO: renamed from: X.03mJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C942503mJ extends LinearLayout implements InterfaceC884803d0 {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public C127K LL;
    public PaymentMethod LLILLJJLI;
    public ElementDTO LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public Function1<? super List<PaymentElement>, Unit> LLILZLL;
    public C03WH LLIZ;
    public Function1<? super EnumC863903Zd, Unit> LLIZLLLIL;
    public Function1<? super Boolean, Unit> LLJ;
    public Address LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;

    public final TuxIconView getIconView() {
        return (TuxIconView) this.LLJILJIL.getValue();
    }

    public final C127K getSwitchLineFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsz);
            this.LL = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    @Override // X.InterfaceC884803d0
    public List<PaymentElement> getValue() {
        List<PaymentElement> value;
        C1076804Ja c1076804Ja = new C1076804Ja(this, 18);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c1076804Ja.iterator();
        while (true) {
            C1076904Jb c1076904Jb = (C1076904Jb) it2;
            if (!c1076904Jb.hasNext()) {
                return C15438062q.LJIJJLI(arrayList);
            }
            KeyEvent.Callback callback = (View) c1076904Jb.next();
            if ((callback instanceof InterfaceC884803d0) && (value = ((InterfaceC884803d0) callback).getValue()) != null) {
                arrayList.add(value);
            }
        }
    }

    @Override // X.InterfaceC884803d0
    public ElementDTO getElementDTO() {
        return this.LLILLL;
    }

    public final C03WH getLogger() {
        return this.LLIZ;
    }

    public final Function1<EnumC863903Zd, Unit> getOnRegionPanelStatus() {
        return this.LLIZLLLIL;
    }

    public final Function1<Boolean, Unit> getOnUseShippingAddressChange() {
        return this.LLJ;
    }

    public Function1<List<PaymentElement>, Unit> getOnValueChange() {
        return this.LLILZLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LLILLJJLI;
    }

    public final Address getShippingAddress() {
        return this.LLJI;
    }

    public final boolean getUseShippingAddress() {
        return this.LLJIJIL;
    }

    public C942503mJ(Context context) {
        super(context, null, 0);
        this.LLILZ = (int) C12ES.LIZJ(14.0f, context);
        this.LLILZIL = (int) C12ES.LIZJ(4.0f, context);
        this.LLILZLL = AFwS228S0000000_1.get$arr$(739);
        this.LLIZLLLIL = AFwS228S0000000_1.get$arr$(735);
        this.LLJ = AFwS228S0000000_1.get$arr$(737);
        this.LLJIJIL = true;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS402S0200000_1(context, this, 81));
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
        C786410Ut5.LJLLJ(context, R.layout.aje, this);
        C426750GoL.LJIIIZ(getSwitchLineFromXml(), null, 0, null, null, false, 29);
        getSwitchLineFromXml().setBackground(null);
    }

    public final void setAllElementsVisible(boolean z) {
        int i;
        for (View view : new C1076804Ja(this, 9)) {
            if (view instanceof InterfaceC884803d0) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
            }
        }
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LLILLL = elementDTO;
    }

    public final void setLogger(C03WH c03wh) {
        this.LLIZ = c03wh;
    }

    public final void setOnRegionPanelStatus(Function1<? super EnumC863903Zd, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setOnUseShippingAddressChange(Function1<? super Boolean, Unit> function1) {
        this.LLJ = function1;
    }

    @Override // X.InterfaceC884803d0
    public void setOnValueChange(Function1<? super List<PaymentElement>, Unit> function1) {
        this.LLILZLL = function1;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LLILLJJLI = paymentMethod;
    }

    public final void setShippingAddress(Address address) {
        this.LLJI = address;
    }

    public final void setSwitchLineFromXml(C127K c127k) {
        this.LL = c127k;
    }

    public final void setUseShippingAddress(boolean z) {
        this.LLJIJIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.03m7] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.03d0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    @Override // X.InterfaceC884803d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r21, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r22, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942503mJ.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.List, java.lang.Object):void");
    }
}
