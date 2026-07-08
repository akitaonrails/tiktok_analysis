package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.select.PlaybookEditSelectFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.10x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19412010x4 extends FragmentStateAdapter {
    public final BasePlaybookEditorViewModel LLJI;
    public final InterfaceC19411910x3 LLJIJIL;
    public final DataChannel LLJILJIL;
    public List<String> LLJILJILJ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJILJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        BasePlaybookEditorViewModel basePlaybookEditorViewModel = this.LLJI;
        InterfaceC19411910x3 interfaceC19411910x3 = this.LLJIJIL;
        String str = (String) ListProtector.get(this.LLJILJILJ, i);
        DataChannel dataChannel = this.LLJILJIL;
        PlaybookEditSelectFragment playbookEditSelectFragment = new PlaybookEditSelectFragment();
        playbookEditSelectFragment.LL = str;
        playbookEditSelectFragment.LLILLJJLI = basePlaybookEditorViewModel;
        playbookEditSelectFragment.LLILLL = interfaceC19411910x3;
        playbookEditSelectFragment.LLILZIL = dataChannel;
        return playbookEditSelectFragment;
    }

    public C19412010x4(Fragment fragment, BasePlaybookEditorViewModel basePlaybookEditorViewModel, InterfaceC19411910x3 interfaceC19411910x3, DataChannel dataChannel) {
        super(fragment);
        this.LLJI = basePlaybookEditorViewModel;
        this.LLJIJIL = interfaceC19411910x3;
        this.LLJILJIL = dataChannel;
        this.LLJILJILJ = C13BV.INSTANCE;
    }
}
