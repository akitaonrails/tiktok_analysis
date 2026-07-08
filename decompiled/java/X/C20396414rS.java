package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.adapter.RecommendListFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.14rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20396414rS extends FragmentStateAdapter {
    public final PlaybookAnchorViewModel LLJI;
    public final InterfaceC20406714t7 LLJIJIL;
    public final DataChannel LLJILJIL;
    public List<PlaybookTagAggregation> LLJILJILJ;
    public final List<PlaybookTagAggregation> LLJILLL;
    public final C01GW LLJJ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJILJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        PlaybookTagAggregation playbookTagAggregation;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLJI;
        if (playbookAnchorViewModel != null && (playbookTagAggregation = (PlaybookTagAggregation) ListProtector.get(playbookAnchorViewModel.NQ2(), i)) != null) {
            String str = RecommendListFragment._pnsPageId;
            return new RecommendListFragment(playbookTagAggregation.playbookFirstLevelTagType, this.LLJI, this.LLJIJIL, this.LLJILJIL);
        }
        return new Fragment();
    }

    public C20396414rS(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog, PlaybookAnchorViewModel playbookAnchorViewModel, C20394514r9 c20394514r9, DataChannel dataChannel) {
        super(playbookInteractivePolymerizationDialog);
        this.LLJI = playbookAnchorViewModel;
        this.LLJIJIL = c20394514r9;
        this.LLJILJIL = dataChannel;
        this.LLJILJILJ = C13BV.INSTANCE;
        this.LLJILLL = new ArrayList();
        this.LLJJ = C452501pT.LIZIZ(new C20406314t3(this));
    }
}
