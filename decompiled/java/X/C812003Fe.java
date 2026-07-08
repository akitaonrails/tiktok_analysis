package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C812003Fe extends PagerAdapter {
    public final List<? extends View> LLILLJJLI;
    public String[] LLILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLJJLI.size();
    }

    public C812003Fe(List<? extends View> list) {
        this.LLILLJJLI = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        String[] strArr = this.LLILLL;
        if (strArr != null) {
            return strArr[i];
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        viewGroup.addView((View) ListProtector.get(this.LLILLJJLI, i));
        return ListProtector.get(this.LLILLJJLI, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJLIL(i, viewGroup);
    }
}
