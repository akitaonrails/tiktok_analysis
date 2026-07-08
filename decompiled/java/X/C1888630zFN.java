package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888630zFN extends PagerAdapter {
    public final InterfaceC1888610zFL LLILLJJLI;
    public final List<BadgeIconTab> LLILLL = new ArrayList();
    public final RecyclerView.RecycledViewPool LLILZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public C1888630zFN(InterfaceC1888610zFL interfaceC1888610zFL) {
        this.LLILLJJLI = interfaceC1888610zFL;
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 20);
        this.LLILZ = recycledViewPool;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        BadgeIconTab badgeIconTab = (BadgeIconTab) ListProtector.get(this.LLILLL, i);
        C1888640zFO c1888640zFO = new C1888640zFO(viewGroup, this.LLILZ, this.LLILLJJLI);
        C1888510zFB c1888510zFB = c1888640zFO.LIZIZ;
        c1888510zFB.LLILLL = badgeIconTab;
        ((ArrayList) c1888510zFB.LLILZ).clear();
        ((ArrayList) c1888510zFB.LLILZ).addAll(badgeIconTab.iconList);
        c1888510zFB.notifyDataSetChanged();
        viewGroup.addView(c1888640zFO.LIZ);
        return c1888640zFO;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (obj instanceof C1888640zFO) {
            return Intrinsics.LJFF(((C1888640zFO) obj).LIZ, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof C1888640zFO) {
            C786410Ut5.LJJJLZIJ(((C1888640zFO) obj).LIZ, viewGroup);
        }
    }
}
