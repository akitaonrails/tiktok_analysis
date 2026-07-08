package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.effect.music.BGMListFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763030TwT extends FragmentStateAdapter {
    public final DataChannel LLJI;
    public final List<BGMListFragment> LLJIJIL;
    public final List<C763220Twm> LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJILJIL).size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        DataChannel dataChannel = this.LLJI;
        String str = ((C763220Twm) ListProtector.get(this.LLJILJIL, i)).LIZ;
        long j = ((C763220Twm) ListProtector.get(this.LLJILJIL, i)).LIZIZ;
        BGMListFragment bGMListFragment = new BGMListFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("name", str, bundle);
        bundle.putLong("albumId", j);
        bGMListFragment.setArguments(bundle);
        bGMListFragment.LL = dataChannel;
        if (!((ArrayList) this.LLJIJIL).contains(bGMListFragment)) {
            ((ArrayList) this.LLJIJIL).add(bGMListFragment);
        }
        return bGMListFragment;
    }

    public C763030TwT(Fragment fragment, DataChannel dataChannel) {
        super(fragment);
        this.LLJI = dataChannel;
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new ArrayList();
    }
}
