package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Txq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763880Txq extends FragmentStateAdapter {
    public final List<C763890Txr> LLJI;

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJI).size();
    }

    public C763880Txq(Fragment fragment) {
        super(fragment);
        this.LLJI = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        KaraokePageFragment karaokePageFragment = new KaraokePageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.bytedance.android.live.design.view.sheet.PAGE_TAB_STYLE", 0);
        bundle.putInt("com.bytedance.android.live.effect.karaoke.CATEGORY_ID", ((C763890Txr) ListProtector.get(this.LLJI, i)).LIZIZ);
        karaokePageFragment.setArguments(bundle);
        return karaokePageFragment;
    }
}
