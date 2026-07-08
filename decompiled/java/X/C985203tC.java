package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03tC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C985203tC extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final TuxTextView getAddress() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final C03IW getEtErrorTips() {
        return (C03IW) this.LL.getValue();
    }

    private final TuxIconView getForward() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    private final C803403Bw getLlRichContainer() {
        return (C803403Bw) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getName() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public final C426770GoN getBadge() {
        return (C426770GoN) this.LLILZLL.getValue();
    }

    public final void setAddressCardInfo(AnonymousClass0376 anonymousClass0376) {
        boolean z;
        int iIntValue = 0;
        if (!anonymousClass0376.LLJJIJIIJIL && !Intrinsics.LJFF(anonymousClass0376.LLJJIII, Boolean.FALSE)) {
            z = false;
        } else {
            z = true;
        }
        List<ShippingAddressRichInfo> list = anonymousClass0376.LLJJL;
        ShippingAddressRichInfo shippingAddressRichInfo = null;
        if (list != null) {
            Iterator<ShippingAddressRichInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ShippingAddressRichInfo next = it2.next();
                Integer num = next.showType;
                if (num != null && num.intValue() == 0) {
                    shippingAddressRichInfo = next;
                    break;
                }
            }
            ShippingAddressRichInfo shippingAddressRichInfo2 = shippingAddressRichInfo;
            if (shippingAddressRichInfo2 != null) {
                boolean z2 = !z;
                C803403Bw llRichContainer = getLlRichContainer();
                if (llRichContainer != null) {
                    C12ES.LJIILL(0, llRichContainer);
                }
                C03DZ.LIZ(getAddress());
                C03DZ.LIZ(getName());
                getLlRichContainer().e0(R.attr.a1h, shippingAddressRichInfo2, null, null, null, z2, false);
            }
        }
        C03IW etErrorTips = getEtErrorTips();
        etErrorTips.setStyle(C03IZ.LIZ(anonymousClass0376.LLJLLIL));
        etErrorTips.setMsg(anonymousClass0376.LLJILLL);
        C426750GoL.LJIIL(etErrorTips, 0, 0, 0, 0, 16);
        if (getForward().getVisibility() == 0) {
            TuxIconView forward = getForward();
            Integer numLIZ = C1308910kAL.LIZ(R.attr.a1j, forward.getContext());
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            }
            forward.setTintColor(iIntValue);
            C1744700vVE.LJIIIIZZ(C0H9H.LIZIZ(16), forward);
            C1744700vVE.LJIIL(forward, C0H9H.LIZIZ(16));
            ViewGroup.LayoutParams layoutParams = forward.getLayoutParams();
            C426750GoL.LJIIIZ(forward, 0, 0, Integer.valueOf(C0H9H.LIZIZ(4)), 0, false, 16);
            C786410Ut5.M6(forward, layoutParams);
        }
    }

    public C985203tC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C985203tC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 105));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 107));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 106));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 103));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 108));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 104));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b1r, this, true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }
}
