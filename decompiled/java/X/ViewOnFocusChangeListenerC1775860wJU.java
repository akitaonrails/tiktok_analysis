package X;

import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfCell;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.DiscountTemplateEditAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS57S0100100_26;
import kotlin.jvm.internal.AwS5S2100100_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS77S0210000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnFocusChangeListenerC1775860wJU implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Throwable {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
            case 5:
                onFocusChange$5(this, view, z);
                break;
            case 6:
                onFocusChange$6(this, view, z);
                break;
            case 7:
                onFocusChange$7(this, view, z);
                break;
            case 8:
                onFocusChange$8(this, view, z);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onFocusChange$9(this, view, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onFocusChange$10(this, view, z);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onFocusChange$11(this, view, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onFocusChange$12(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC1775860wJU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        ((C1754650vlH) viewOnFocusChangeListenerC1775860wJU.l0).LJFF(z);
        ((C1754650vlH) viewOnFocusChangeListenerC1775860wJU.l0).invalidate();
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        Editable editableLLLLJI;
        View.OnFocusChangeListener onEditTextFocusChangeListener = ((C1748260vay) viewOnFocusChangeListenerC1775860wJU.l0).getOnEditTextFocusChangeListener();
        if (onEditTextFocusChangeListener != null) {
            onEditTextFocusChangeListener.onFocusChange(view, z);
        }
        C1748260vay c1748260vay = (C1748260vay) viewOnFocusChangeListenerC1775860wJU.l0;
        boolean z2 = false;
        if (z && (editableLLLLJI = C2204961BRm.LLLLJI(c1748260vay.getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqi6I6dDLMeXd+lTqJrgEJKW5hA==", null))) != null && editableLLLLJI.length() > 0) {
            z2 = true;
        }
        c1748260vay.setIndicatorVisible(z2);
    }

    public static final void onFocusChange$10(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        if (z) {
            ((AddressIdentityAssem) viewOnFocusChangeListenerC1775860wJU.l0).LLJJIII = SystemClock.elapsedRealtime();
            C1748720vbi.LIZLLL(view, new C10510049c(), new AwS605S0100000_26((AddressIdentityAssem) viewOnFocusChangeListenerC1775860wJU.l0, 554));
        } else {
            C1748720vbi.LIZLLL(view, new C10511049d(), new AwS57S0100100_26((AddressIdentityAssem) viewOnFocusChangeListenerC1775860wJU.l0, SystemClock.elapsedRealtime() - ((AddressIdentityAssem) viewOnFocusChangeListenerC1775860wJU.l0).LLJJIII, 3));
        }
    }

    public static final void onFocusChange$11(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) throws Throwable {
        String string;
        int length;
        String str;
        Editable editableLLLLJI = C2204961BRm.LLLLJI(((DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0).cS().getEditTextView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LQRh/Q5yecw1sHAjas4jycaZEkmdbR+2P13KWXNf7OtwsnEeOV4JY7vDPY2SQ==", null));
        if (editableLLLLJI != null) {
            string = editableLLLLJI.toString();
        } else {
            string = null;
        }
        int length2 = 0;
        if (z) {
            DistrictFragment districtFragment = (DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0;
            if (string != null) {
                length2 = string.length();
            }
            districtFragment.LLLFZ = length2;
            ((DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0).LLLFFI = SystemClock.elapsedRealtime();
            View view2 = ((DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0).getView();
            if (view2 != null) {
                C1748720vbi.LIZLLL(view2, new C10510049c(), null);
                return;
            }
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        DistrictFragment districtFragment2 = (DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0;
        long j = jElapsedRealtime - districtFragment2.LLLFFI;
        if (string != null) {
            length = string.length();
        } else {
            length = -districtFragment2.LLLFZ;
        }
        if (length > 0) {
            str = "add";
        } else if (length < 0) {
            str = "del";
        } else {
            str = "";
        }
        View view3 = ((DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0).getView();
        if (view3 != null) {
            C1748720vbi.LIZLLL(view3, new C10511049d(), new AwS5S2100100_26(j, str, string, (DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0, 3));
        }
        ((DistrictFragment) viewOnFocusChangeListenerC1775860wJU.l0).LLLI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFocusChange$12(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) throws Throwable {
        int length;
        T t;
        ((CpfCell) viewOnFocusChangeListenerC1775860wJU.l0).P5(z);
        int length2 = 0;
        if (z) {
            ((CpfCell) viewOnFocusChangeListenerC1775860wJU.l0).LLJILLL = System.currentTimeMillis();
            CpfCell cpfCell = (CpfCell) viewOnFocusChangeListenerC1775860wJU.l0;
            Editable editableLLLLJI = C2204961BRm.LLLLJI((C0I7D) cpfCell.itemView.findViewById(R.id.hcd), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzNkFmcbsUcvn1n6A=", null));
            if (editableLLLLJI != null) {
                length2 = editableLLLLJI.length();
            }
            cpfCell.LLJJIJIIJIL = length2;
            C1748720vbi.LIZLLL(((CpfCell) viewOnFocusChangeListenerC1775860wJU.l0).itemView, new C10510049c(), AFwS268S0000000_26.get$arr$(753));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        CpfCell cpfCell2 = (CpfCell) viewOnFocusChangeListenerC1775860wJU.l0;
        long j = jCurrentTimeMillis - cpfCell2.LLJILLL;
        Editable editableLLLLJI2 = C2204961BRm.LLLLJI((C0I7D) cpfCell2.itemView.findViewById(R.id.hcd), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzNkFmcbsUcvn1n6A=", null));
        if (editableLLLLJI2 != null) {
            length = editableLLLLJI2.length();
        } else {
            length = 0;
        }
        int i = length - ((CpfCell) viewOnFocusChangeListenerC1775860wJU.l0).LLJJIJIIJIL;
        C259800zU c259800zU = new C259800zU();
        if (i > 0) {
            t = "add";
        } else if (i < 0) {
            t = "del";
        } else {
            t = "";
        }
        c259800zU.element = t;
        CpfCell cpfCell3 = (CpfCell) viewOnFocusChangeListenerC1775860wJU.l0;
        if (cpfCell3.LLJJIJIL) {
            c259800zU.element = "sug";
        }
        C1748720vbi.LIZLLL(cpfCell3.itemView, new C10511049d(), new C1749120vcM(j, c259800zU, (CpfCell) viewOnFocusChangeListenerC1775860wJU.l0));
        ((CpfCell) viewOnFocusChangeListenerC1775860wJU.l0).LLJJIJIL = false;
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        if (z) {
            ((CpfAssem) viewOnFocusChangeListenerC1775860wJU.l0).LLJILJILJ = SystemClock.elapsedRealtime();
            C1748720vbi.LIZLLL(view, new C10510049c(), new AwS605S0100000_26((CpfAssem) viewOnFocusChangeListenerC1775860wJU.l0, 29));
            return;
        }
        C1748720vbi.LIZLLL(view, new C10511049d(), new AwS605S0100000_26((CpfAssem) viewOnFocusChangeListenerC1775860wJU.l0, 30));
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        ((C1754640vlG) viewOnFocusChangeListenerC1775860wJU.l0).LJIIIIZZ(z);
        ((C1754640vlG) viewOnFocusChangeListenerC1775860wJU.l0).invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFocusChange$4(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        String string;
        if (!z) {
            String str = ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).b6().LLJIJIL;
            if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                string = "";
            }
            C1745340vWG c1745340vWGKR2 = ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).b6().kR2(string, ((C1746310vXp) ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).LLILLJJLI).LIZ.rules);
            ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).b6().LLJIJIL = string;
            DeliveryInstructionViewModel deliveryInstructionViewModelB6 = ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).b6();
            C1746310vXp c1746310vXpLIZ = C1746310vXp.LIZ((C1746310vXp) ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).LLILLJJLI, false, c1745340vWGKR2, 11);
            deliveryInstructionViewModelB6.getClass();
            deliveryInstructionViewModelB6.withState(new AwS77S0210000_26(deliveryInstructionViewModelB6, c1746310vXpLIZ, false, 7));
            return;
        }
        DeliveryInstructionViewModel deliveryInstructionViewModelB62 = ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).b6();
        C1746310vXp c1746310vXpLIZ2 = C1746310vXp.LIZ((C1746310vXp) ((DeliveryInstructionItemViewHolder) viewOnFocusChangeListenerC1775860wJU.l0).LLILLJJLI, false, null, 11);
        deliveryInstructionViewModelB62.getClass();
        deliveryInstructionViewModelB62.withState(new AwS77S0210000_26(deliveryInstructionViewModelB62, c1746310vXpLIZ2, false, 7));
    }

    public static final void onFocusChange$5(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) throws Throwable {
        if (!z) {
            ((C1744460vUq) viewOnFocusChangeListenerC1775860wJU.l0).LLILZ.LIZIZ();
        }
        C1744460vUq c1744460vUq = (C1744460vUq) viewOnFocusChangeListenerC1775860wJU.l0;
        for (InterfaceC1744450vUp interfaceC1744450vUp : c1744460vUq.LLILLL) {
            String string = null;
            Editable editableLLLLJI = C2204961BRm.LLLLJI(c1744460vUq.getSearchEditFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqjSD+NfcDs7G6skoCS8=", null));
            if (editableLLLLJI != null) {
                string = editableLLLLJI.toString();
            }
            interfaceC1744450vUp.p(view, z, string);
        }
    }

    public static final void onFocusChange$6(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) throws Throwable {
        if (!z) {
            C1746700vYS<T> c1746700vYS = ((C1746710vYT) viewOnFocusChangeListenerC1775860wJU.l0).LLILZIL;
            if (c1746700vYS != 0) {
                c1746700vYS.LIZJ();
            }
        } else {
            C1746700vYS<T> c1746700vYS2 = ((C1746710vYT) viewOnFocusChangeListenerC1775860wJU.l0).LLILZIL;
            if (c1746700vYS2 != 0) {
                c1746700vYS2.LJIIJJI.removeMessages(1);
                c1746700vYS2.LJIIJJI.sendEmptyMessageDelayed(1, 10L);
            }
        }
        C1746710vYT c1746710vYT = (C1746710vYT) viewOnFocusChangeListenerC1775860wJU.l0;
        for (InterfaceC1747130vZ9 interfaceC1747130vZ9 : (ArrayList) c1746710vYT.LLILZ) {
            String string = null;
            Editable editableLLLLJI = C2204961BRm.LLLLJI(c1746710vYT.getSearchEditFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqhSD+NfcDqLm/KtnAPUNgUI5K3KXERta", null));
            if (editableLLLLJI != null) {
                string = editableLLLLJI.toString();
            }
            interfaceC1747130vZ9.p(view, z, string);
        }
    }

    public static final void onFocusChange$7(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        if (z) {
            ((DiscountTemplateEditAssem) viewOnFocusChangeListenerC1775860wJU.l0).Ep().vQ2("billboard_title");
        }
    }

    public static final void onFocusChange$8(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        if (z) {
            ((DiscountTemplateEditAssem) viewOnFocusChangeListenerC1775860wJU.l0).Ep().vQ2("billboard_customized_text");
        }
    }

    public static final void onFocusChange$9(ViewOnFocusChangeListenerC1775860wJU viewOnFocusChangeListenerC1775860wJU, View view, boolean z) {
        int i;
        C1748330vb5 c1748330vb5 = ((C1748630vbZ) viewOnFocusChangeListenerC1775860wJU.l0).LLILZIL;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLLLLLLZIL(c1748330vb5, i);
    }
}
