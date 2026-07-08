package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469320Iao extends AbstractC480450Isl {
    public final List<DrawerTabsItem> LLJ;
    public InterfaceC469760IbW LLJI;
    public Bundle LLJIJIL;
    public Fragment LLJILJIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLJ).size();
    }

    public C469320Iao(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLJ = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (C497740JfY.LJJ()) {
            i = (getCount() - i) - 1;
        }
        return ((DrawerTabsItem) ListProtector.get(this.LLJ, i)).tabName;
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        String str;
        String str2;
        EnumC469490Ib5 enumC469490Ib5;
        if (i < ((ArrayList) this.LLJ).size()) {
            str = ((DrawerTabsItem) ListProtector.get(this.LLJ, i)).tabType;
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C469770IbX c469770IbX = new C469770IbX(str2);
        if (Intrinsics.LJFF(str, "game")) {
            enumC469490Ib5 = EnumC469490Ib5.GAME_CATEGORY;
        } else {
            enumC469490Ib5 = EnumC469490Ib5.DEFAULT;
        }
        Fragment fragmentYU = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).YU(this.LLJI, c469770IbX, enumC469490Ib5);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIJZLJL(bundle, this.LLJIJIL);
        fragmentYU.setArguments(bundle);
        return fragmentYU;
    }

    public final String LJJIJL(int i) {
        if (i >= 0 && i < ((ArrayList) this.LLJ).size()) {
            return ((DrawerTabsItem) ListProtector.get(this.LLJ, i)).tabType;
        }
        return "";
    }

    @Override // X.AbstractC480450Isl, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        Fragment fragment;
        if (!Intrinsics.LJFF(this.LLJILJIL, obj)) {
            if (obj instanceof Fragment) {
                fragment = (Fragment) obj;
            } else {
                fragment = null;
            }
            this.LLJILJIL = fragment;
        }
        super.LJJIIZ(viewGroup, i, obj);
    }
}
