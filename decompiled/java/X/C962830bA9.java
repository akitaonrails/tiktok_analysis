package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962830bA9 {
    public RecyclerView LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C1117360fBO LIZ = new C1117360fBO();
    public final List<C962860bAC> LIZIZ = new ArrayList();
    public final AwS594S0100000_15 LJFF = new AwS594S0100000_15(this, 49);

    public final List<QuickCohostContent> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        for (C962860bAC c962860bAC : this.LIZIZ) {
            if (c962860bAC.LJI == 1) {
                QuickCohostContent quickCohostContent = new QuickCohostContent();
                quickCohostContent.contentId = c962860bAC.LJFF;
                quickCohostContent.displayText = c962860bAC.LJ;
                arrayList.add(quickCohostContent);
            }
        }
        return arrayList;
    }

    public final void LIZ(List<QuickCohostContent> list) {
        boolean z;
        int i;
        boolean z2;
        if (list == null) {
            return;
        }
        ((ArrayList) this.LIZIZ).clear();
        if (C960270b61.LIZ().size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        for (QuickCohostContent quickCohostContent : list) {
            List<C962860bAC> list2 = this.LIZIZ;
            String str = quickCohostContent.displayText;
            long j = quickCohostContent.contentId;
            if (C960270b61.LIZ().contains(Long.valueOf(quickCohostContent.contentId))) {
                i = 1;
            } else if (z) {
                i = 2;
            } else {
                i = 0;
            }
            if (((ArrayList) this.LIZIZ).size() == list.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            ((ArrayList) list2).add(new C962860bAC(i, j, str, z2));
        }
        C1117360fBO c1117360fBO = this.LIZ;
        c1117360fBO.LL = this.LIZIZ;
        c1117360fBO.notifyDataSetChanged();
    }

    public final void LIZLLL(int i) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView;
        if (!this.LJ) {
            return;
        }
        RecyclerView recyclerView2 = this.LIZJ;
        RecyclerView.LayoutManager layoutManager = null;
        if (recyclerView2 != null) {
            layoutManager = recyclerView2.getLayoutManager();
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            if ((i < linearLayoutManager.findFirstCompletelyVisibleItemPosition() || linearLayoutManager.findLastCompletelyVisibleItemPosition() < i) && (recyclerView = this.LIZJ) != null) {
                recyclerView.smoothScrollToPosition(i);
            }
        }
    }

    public final void LIZJ(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager, final int i, final int i2, boolean z) {
        this.LIZJ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(layoutManager);
        }
        RecyclerView recyclerView2 = this.LIZJ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LIZ);
        }
        this.LJ = z;
        C1117360fBO c1117360fBO = this.LIZ;
        final AwS594S0100000_15 awS594S0100000_15 = this.LJFF;
        c1117360fBO.LLLI(C962860bAC.class, new AbstractC960410b6F<C962860bAC, C962850bAB>(i, i2, awS594S0100000_15) { // from class: X.0bAA
            public final int LIZIZ;
            public final int LIZJ;
            public final Function1<Integer, Unit> LIZLLL;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "InteractRandomLinkMicUnselectedInterestTagViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gsg, viewGroup, false);
                C500260Jjc.LJLJL(C439101nJ.LIZ(this.LIZIZ), viewTd);
                return new C962850bAB(this.LIZJ, viewTd, this.LIZLLL);
            }

            {
                this.LIZIZ = i;
                this.LIZJ = i2;
                this.LIZLLL = awS594S0100000_15;
            }
        });
    }
}
