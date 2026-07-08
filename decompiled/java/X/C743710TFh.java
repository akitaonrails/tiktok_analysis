package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.sticker.dialog.RankStickerPreviewFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743710TFh extends AbstractC480450Isl {
    public final List<RankStickerPreviewFragment> LLJ;

    @Override // X.AbstractC480450Isl, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLJ).size();
    }

    public C743710TFh(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLJ = new ArrayList();
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(this.LLJ, i);
    }
}
