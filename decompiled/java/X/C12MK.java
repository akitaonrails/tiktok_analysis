package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.PreviewItemFragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12MK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12MK extends AbstractC480470Isn {
    public final ArrayList<Item> LLIZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    public C12MK(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLIZ = new ArrayList<>();
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        Item item = (Item) ListProtector.get(this.LLIZ, i);
        PreviewItemFragment previewItemFragment = new PreviewItemFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "args_item", item);
        previewItemFragment.setArguments(bundle);
        return previewItemFragment;
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        super.LJJIIZ(viewGroup, i, obj);
    }
}
