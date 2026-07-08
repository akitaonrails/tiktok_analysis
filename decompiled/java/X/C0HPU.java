package X;

import Y.ARunnableS2S0102000_6;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HPU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HPU extends ViewOnAttachStateChangeListenerC20604515jv {
    public final C01GW LLILZ;
    public final Map<Integer, Integer> LLILZIL;
    public ARunnableS2S0102000_6 LLILZLL;
    public Integer LLIZ;
    public C439980HNc LLIZLLLIL;
    public int LLJ;
    public final C2252321DDq LLJI;
    public final C2252321DDq LLJIJIL;
    public C0HPW LLJILJIL;

    private final C1910890zpH getLogger() {
        return (C1910890zpH) this.LLILZ.getValue();
    }

    public final C0HPW getClickListener() {
        return this.LLJILJIL;
    }

    public final C439980HNc getElementDisplayProducer() {
        return this.LLIZLLLIL;
    }

    public final int getElementsPerRow() {
        return this.LLJ;
    }

    public C0HPU(final Context context) {
        super(context, null);
        this.LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(146));
        this.LLILZIL = new LinkedHashMap();
        this.LLJ = 5;
        this.LLJI = C1BNE.LIZ(null);
        this.LLJIJIL = C1BNE.LIZ(Boolean.FALSE);
        setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.MixStudioHomeRowsContainer$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        });
        ((PowerAdapter) getAdapter()).LLLLII(new C0HPQ() { // from class: X.0HPV
            @Override // X.C0HPQ
            public final AnonymousClass0951 kH() {
                return C09IC.LIZIZ(this.LL.LLJIJIL);
            }

            @Override // X.C0HPQ
            public final void o8() {
                C0HPW clickListener = this.LL.getClickListener();
                if (clickListener != null) {
                    clickListener.o8();
                }
            }

            @Override // X.C0HPQ
            public final AnonymousClass0951 v11() {
                return C09IC.LIZIZ(this.LL.LLJI);
            }

            @Override // X.C0HPQ
            public final void vl(C0H6M c0h6m) {
                C0HPW clickListener = this.LL.getClickListener();
                if (clickListener != null) {
                    clickListener.vl(c0h6m);
                }
            }
        }, C0HPV.class);
        LJIILJJIL(HomePageElementRowPowerCell.class);
        setNestedScrollingEnabled(false);
        setOverScrollMode(2);
    }

    public final void setClickListener(C0HPW c0hpw) {
        this.LLJILJIL = c0hpw;
    }

    public final void setElementDisplayProducer(C439980HNc c439980HNc) {
        this.LLIZLLLIL = c439980HNc;
    }

    public final void setElementsPerRow(int i) {
        this.LLJ = i;
    }

    public final void setHomeRows(LinkedHashMap<Integer, C0HPS> linkedHashMap) {
        C439980HNc c439980HNc = this.LLIZLLLIL;
        if (c439980HNc == null) {
            if (!C1948707kD.LIZ().isDebug()) {
                return;
            } else {
                throw new Exception("[setHomeRows] elementDisplayProducer is null");
            }
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        int i = 0;
        for (Map.Entry<Integer, C0HPS> entry : linkedHashMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C0HPS value = entry.getValue();
            this.LLILZIL.put(Integer.valueOf(iIntValue), Integer.valueOf(i));
            arrayList.add(new C0HPT(iIntValue, value, this.LLJ, c439980HNc));
            i++;
        }
        getState().LJIIJJI(arrayList, null);
    }
}
