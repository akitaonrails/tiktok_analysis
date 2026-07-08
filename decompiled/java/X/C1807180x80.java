package X;

import Y.AsS53S0100000_27;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0x80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807180x80 {
    public final RecyclerView LIZ;
    public final InterfaceC1806590x73 LIZIZ;
    public final RechargeViewModel LIZJ;
    public final InterfaceC1806410x6l LIZLLL;
    public final HashMap<String, Integer> LJ = new HashMap<>();
    public final List<C1806600x74> LJFF = new ArrayList();
    public final SparseArray<Long> LJI = new SparseArray<>(32);
    public final C01GW LJII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1398));

    public final void LIZ() {
        int[] iArr = new int[2];
        RecyclerView recyclerView = this.LIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        iArr[0] = linearLayoutManager.findFirstVisibleItemPosition();
        iArr[1] = linearLayoutManager.findLastVisibleItemPosition();
        int orientation = linearLayoutManager.getOrientation();
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > i2) {
            return;
        }
        while (true) {
            if (i >= 0 && i < ((ArrayList) this.LJFF).size()) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                C1806600x74 c1806600x74 = (C1806600x74) ListProtector.get(this.LJFF, i);
                Object obj = c1806600x74.LIZIZ;
                if (obj instanceof InterfaceC1806820x7Q) {
                    this.LIZIZ.LJIILL((InterfaceC1806820x7Q) obj);
                } else {
                    Integer num = this.LJ.get(LIZIZ(c1806600x74));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (viewFindViewByPosition != null) {
                            Rect rect = new Rect();
                            boolean z = orientation == 1 && ((float) rect.height()) >= ((float) viewFindViewByPosition.getMeasuredHeight()) / 1.25f && viewFindViewByPosition.getGlobalVisibleRect(rect);
                            Long l = this.LJI.get(iIntValue, -1L);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (l.longValue() > 0) {
                                if (!z && l.longValue() != jCurrentTimeMillis) {
                                    this.LJI.put(iIntValue, -1L);
                                    this.LIZIZ.LIZJ(false, iIntValue, c1806600x74);
                                }
                            } else if (z) {
                                this.LJI.put(iIntValue, Long.valueOf(jCurrentTimeMillis));
                                this.LIZIZ.LIZJ(true, iIntValue, c1806600x74);
                            }
                        }
                    }
                }
            }
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final C1806990x7h LIZJ() {
        return (C1806990x7h) this.LJII.getValue();
    }

    public final void LIZLLL() {
        SparseArray<Long> sparseArray = this.LJI;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            sparseArray.valueAt(i).longValue();
            this.LJI.put(iKeyAt, -1L);
        }
        LIZ();
    }

    public static String LIZIZ(C1806600x74 c1806600x74) {
        String str;
        Diamond diamond;
        Object obj = c1806600x74.LIZIZ;
        if (!(obj instanceof Diamond) || (diamond = (Diamond) obj) == null || (str = diamond.iapId) == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('$');
        sbLIZ.append(c1806600x74.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ(List<C1806600x74> list) {
        this.LJ.clear();
        int i = 0;
        for (C1806600x74 c1806600x74 : list) {
            int i2 = c1806600x74.LIZ;
            if (i2 == 0 || i2 == 7) {
                this.LJ.put(LIZIZ(c1806600x74), Integer.valueOf(i));
                i++;
            }
        }
    }

    public C1807180x80(RecyclerView recyclerView, C1805180x4m c1805180x4m, RechargeViewModel rechargeViewModel, InterfaceC1806410x6l interfaceC1806410x6l) {
        this.LIZ = recyclerView;
        this.LIZIZ = c1805180x4m;
        this.LIZJ = rechargeViewModel;
        this.LIZLLL = interfaceC1806410x6l;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            final Context context = recyclerView.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context) { // from class: com.bytedance.android.live.wallet.dialog.RechargePanelListPresenter$setupView$layoutManager$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return false;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return true;
                }
            };
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(LIZJ());
            interfaceC1806410x6l.LIZ(recyclerView);
            interfaceC1806410x6l.LIZJ(recyclerView);
            gridLayoutManager.LLIZ = new C1864510ycT(this, 1);
            recyclerView.addOnScrollListener(new AsS53S0100000_27(this, 12));
        }
    }
}
