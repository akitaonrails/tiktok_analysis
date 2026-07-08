package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.ECMMKGlobalContextCallback;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771880wD4 extends AbstractC1771860wD2 {
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1483));
    public String LLILZ;

    @Override // X.AbstractC1771860wD2
    public final void LJI() {
        String str = this.LLILZ;
        if (str != null) {
            LIZIZ().LIZ().LIZJ("page_visible", str, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            this.LLILZ = null;
        }
    }

    public final C18Z6 LJIILIIL() {
        return (C18Z6) this.LLILLL.getValue();
    }

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        this.LLILZ = LIZIZ().LIZ().LIZIZ("page_visible", new ECMMKGlobalContextCallback() { // from class: X.0wD5
            @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.ECMMKGlobalContextCallback
            public final void invoke(Object obj) {
                AbstractC1773460wFc abstractC1773460wFc;
                if (!(obj instanceof Boolean)) {
                    obj = null;
                }
                int i = 0;
                if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                    C1771880wD4 c1771880wD4 = this.LIZ;
                    int childCount = c1771880wD4.LJIILIIL().getChildCount();
                    while (i < childCount) {
                        ((AbstractC1773460wFc) c1771880wD4.LJIILIIL().getChildViewHolder(c1771880wD4.LJIILIIL().getChildAt(i))).b6();
                        i++;
                    }
                    return;
                }
                C1771880wD4 c1771880wD42 = this.LIZ;
                int childCount2 = c1771880wD42.LJIILIIL().getChildCount();
                while (i < childCount2) {
                    RecyclerView.ViewHolder childViewHolder = c1771880wD42.LJIILIIL().getChildViewHolder(c1771880wD42.LJIILIIL().getChildAt(i));
                    if ((childViewHolder instanceof AbstractC1773460wFc) && (abstractC1773460wFc = (AbstractC1773460wFc) childViewHolder) != null) {
                        abstractC1773460wFc.c6();
                    }
                    i++;
                }
            }
        }, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
    }
}
