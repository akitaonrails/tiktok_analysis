package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoriteSelectFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.14rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20396514rT extends FragmentStateAdapter {
    public final PlaybookAnchorViewModel LLJI;
    public final InterfaceC20403914sf LLJIJIL;
    public final InterfaceC1631620sYq<String, C1117360fBO, LinearLayoutManager, Unit> LLJILJIL;
    public final DataChannel LLJILJILJ;
    public List<String> LLJILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILLL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        String str = (String) ListProtector.get(this.LLJILLL, i);
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLJI;
        InterfaceC20403914sf interfaceC20403914sf = this.LLJIJIL;
        InterfaceC1631620sYq<String, C1117360fBO, LinearLayoutManager, Unit> interfaceC1631620sYq = this.LLJILJIL;
        DataChannel dataChannel = this.LLJILJILJ;
        PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment = new PlaybookFavoriteSelectFragment();
        playbookFavoriteSelectFragment.LLILLJJLI = str;
        playbookFavoriteSelectFragment.LLILLL = playbookAnchorViewModel;
        playbookFavoriteSelectFragment.LLILZ = interfaceC20403914sf;
        playbookFavoriteSelectFragment.LLILZIL = interfaceC1631620sYq;
        playbookFavoriteSelectFragment.LL = dataChannel;
        return playbookFavoriteSelectFragment;
    }

    public C20396514rT(Fragment fragment, PlaybookAnchorViewModel playbookAnchorViewModel, C20392914qt c20392914qt, C20390614qW c20390614qW, DataChannel dataChannel) {
        super(fragment);
        this.LLJI = playbookAnchorViewModel;
        this.LLJIJIL = c20392914qt;
        this.LLJILJIL = c20390614qW;
        this.LLJILJILJ = dataChannel;
        this.LLJILLL = C13BV.INSTANCE;
    }
}
