package Y;

import X.C123100dR;
import X.C1308910kAL;
import X.C1613030s4r;
import X.C1615420s8i;
import X.C1615460s8m;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC345960DhK;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.components.purchasebutton.PurchaseButtonParams;
import com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverComponent;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS129S0300000_24 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS129S0300000_24 aObserverS129S0300000_24, Object obj) {
        Map map = (Map) obj;
        List list = (List) aObserverS129S0300000_24.l0;
        PaidContentVideoPanel paidContentVideoPanel = (PaidContentVideoPanel) aObserverS129S0300000_24.l2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(paidContentVideoPanel.F2);
                sbLIZ.append('_');
                sbLIZ.append(i);
                C1615460s8m c1615460s8m = (C1615460s8m) map.get(C2188811AlT.LIZIZ(sbLIZ));
                if (c1615460s8m != null) {
                    arrayList.add(new C1613030s4r(i, c1615460s8m.LIZ, c1615460s8m.LIZIZ, c1615460s8m.LIZJ, c1615460s8m.LIZLLL, c1615460s8m.LJ, c1615460s8m.LJFF, c1615460s8m.LJI, c1615460s8m.LJII, c1615460s8m.LJIIIIZZ, c1615460s8m.LJIIIZ));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((Function1) aObserverS129S0300000_24.l1).invoke(arrayList);
    }

    public static final void onChanged$1(AObserverS129S0300000_24 aObserverS129S0300000_24, Object obj) {
        ((Function0) aObserverS129S0300000_24.l0).invoke();
        ((EventCenter) aObserverS129S0300000_24.l1).AQ2(((FeedRefreshRecoverComponent) aObserverS129S0300000_24.l2).LLIZ);
    }

    public static final void onChanged$2(AObserverS129S0300000_24 aObserverS129S0300000_24, Object obj) {
        C1615460s8m c1615460s8m;
        ForegroundColorSpan foregroundColorSpan;
        Map map = (Map) obj;
        if (map.containsKey(((C1615420s8i) aObserverS129S0300000_24.l0).LIZ) && (c1615460s8m = (C1615460s8m) map.get(((C1615420s8i) aObserverS129S0300000_24.l0).LIZ)) != null) {
            PurchaseButtonParams purchaseButtonParams = (PurchaseButtonParams) aObserverS129S0300000_24.l1;
            InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) aObserverS129S0300000_24.l2;
            if (C123100dR.LIZ(c1615460s8m.LJ)) {
                String str = c1615460s8m.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(purchaseButtonParams.buttonText);
                sbLIZ.append(' ');
                sbLIZ.append(c1615460s8m.LJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(' ');
                sbLIZ2.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int iLJJJ = a0.LJJJ(strLIZIZ2, str, 0, false, 6);
                int length = str.length() + iLJJJ;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ2);
                C786410Ut5.q2(spannableStringBuilder, new StrikethroughSpan(), iLJJJ, length, 33);
                C844470XAv.LIZ.getClass();
                Integer numLIZ = C1308910kAL.LIZ(R.attr.a0x, C844470XAv.LIZ());
                if (numLIZ != null) {
                    foregroundColorSpan = new ForegroundColorSpan(numLIZ.intValue());
                } else {
                    foregroundColorSpan = null;
                }
                C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, iLJJJ, length, 33);
                C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(13, true), iLJJJ, length, 33);
                interfaceC345960DhK.setValue(spannableStringBuilder);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(purchaseButtonParams.buttonText);
            sbLIZ3.append(' ');
            sbLIZ3.append(c1615460s8m.LIZIZ);
            interfaceC345960DhK.setValue(new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ3)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS129S0300000_24(Object obj, List<PurchaseOption> list, Function1<? super List<C1613030s4r>, Unit> function1, PaidContentVideoPanel paidContentVideoPanel) {
        this.$t = paidContentVideoPanel;
        this.l0 = obj;
        this.l1 = list;
        this.l2 = function1;
    }
}
