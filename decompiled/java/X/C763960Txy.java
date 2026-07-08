package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Txy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763960Txy extends FragmentStateAdapter {
    public final List<Long> LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJI).size();
    }

    public C763960Txy(Fragment fragment) {
        super(fragment);
        this.LLJI = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        String str;
        long jLongValue = ((Number) ListProtector.get(this.LLJI, i)).longValue();
        if (i == 0) {
            str = "Creator sings";
        } else {
            str = "Viewer sings";
        }
        return C765010Tzf.LIZ(4, jLongValue, str);
    }
}
