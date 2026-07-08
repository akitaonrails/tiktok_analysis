package X;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14rK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20395614rK {
    public final DataChannel LIZ;
    public final RecyclerView LIZIZ;
    public final PlaybookAnchorViewModel LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final Function1<Integer, Integer> LJFF;
    public final Map<Integer, Set<Long>> LJI;

    public final void LIZ(String str) {
        LinearLayoutManager linearLayoutManager;
        C1117360fBO c1117360fBO;
        int iLJJIL;
        boolean z;
        C20384514pX c20384514pX;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        View viewFindViewByPosition;
        C20384514pX c20384514pX2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onExpose: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RecommendListExposureHelper_");
        sbLIZ2.append(this.LIZLLL);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
        RecyclerView recyclerView = this.LIZIZ;
        RecyclerView.LayoutManager layoutManager = null;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            AbstractC21673619ry adapter = this.LIZIZ.getAdapter();
            if (!(adapter instanceof C1117360fBO) || (c1117360fBO = (C1117360fBO) adapter) == null || iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                if (iFindFirstVisibleItemPosition < linearLayoutManager.getItemCount()) {
                    Object obj = ListProtector.get(c1117360fBO.LL, iFindFirstVisibleItemPosition);
                    PlaybookAnchorViewModel playbookAnchorViewModel = this.LIZJ;
                    int iLJJIL2 = 0;
                    if (playbookAnchorViewModel != null && (c20384514pX2 = playbookAnchorViewModel.LLJJJJJIL) != null) {
                        iLJJIL = c20384514pX2.LJJIL();
                    } else {
                        iLJJIL = 0;
                    }
                    Set<Long> linkedHashSet = (Set) ((LinkedHashMap) this.LJI).get(Integer.valueOf(iLJJIL));
                    if ((obj instanceof C20390914qZ) && ((linkedHashSet == null || !linkedHashSet.contains(Long.valueOf(((C20390914qZ) obj).LIZ.playbookId))) && (!this.LJ || ((viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null && viewFindViewByPosition.getGlobalVisibleRect(new Rect()))))) {
                        if (linkedHashSet == null) {
                            linkedHashSet = new LinkedHashSet<>();
                            this.LJI.put(Integer.valueOf(iLJJIL), linkedHashSet);
                        }
                        C20390914qZ c20390914qZ = (C20390914qZ) obj;
                        linkedHashSet.add(Long.valueOf(c20390914qZ.LIZ.playbookId));
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        C978360bZC.LJJIIZ(c20390914qZ.LIZ.playbookId, new C978410bZH("recommend", "recommend", this.LIZLLL));
                        DataChannel dataChannel = this.LIZ;
                        Playbook playbook2 = c20390914qZ.LIZ;
                        int iIntValue = this.LJFF.invoke(Integer.valueOf(iFindFirstVisibleItemPosition)).intValue() + 1;
                        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LIZJ;
                        if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && playbook.playbookId == c20390914qZ.LIZ.playbookId) {
                            z = true;
                        } else {
                            z = false;
                        }
                        PlaybookAnchorViewModel playbookAnchorViewModel3 = this.LIZJ;
                        if (playbookAnchorViewModel3 != null && (c20384514pX = playbookAnchorViewModel3.LLJJJJJIL) != null) {
                            iLJJIL2 = c20384514pX.LJJIL();
                        }
                        C978360bZC.LJIILL(dataChannel, "show", playbook2, "recommend", iIntValue, z, false, Integer.valueOf(iLJJIL2), Integer.valueOf(this.LIZLLL), 0, null, null, 3648);
                    }
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }

    public C20395614rK(DataChannel dataChannel, RecyclerView recyclerView, PlaybookAnchorViewModel playbookAnchorViewModel, int i, boolean z, C20397414rc c20397414rc, int i2) {
        i = (i2 & 8) != 0 ? 2 : i;
        z = (i2 & 16) != 0 ? false : z;
        Function1<Integer, Integer> c1123104aL = (i2 & 32) != 0 ? new C1123104aL() : c20397414rc;
        this.LIZ = dataChannel;
        this.LIZIZ = recyclerView;
        this.LIZJ = playbookAnchorViewModel;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = c1123104aL;
        this.LJI = new LinkedHashMap();
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.14sr
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i3) {
                    this.LL.LIZ("onScrollStateChanged");
                }
            });
        }
    }
}
