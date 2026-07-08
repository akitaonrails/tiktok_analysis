package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.livesdk.game.bottombar.feed.GameLiveBottombarFlowFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483860IyG extends FragmentStateAdapter {
    public final List<C483880IyI> LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJI.size();
    }

    public static C483880IyI LLLJ(C483880IyI c483880IyI) {
        LinkedHashMap linkedHashMap;
        Map<String, String> map = c483880IyI.LIZJ;
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
        } else {
            linkedHashMap = null;
        }
        return C483880IyI.LIZ(c483880IyI, linkedHashMap);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LLLI(long j) {
        int i = (int) ((j >> 32) & 4294967295L);
        if (i < 0 || i >= this.LLJI.size()) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        LinkedHashMap linkedHashMap;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createFragment position:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GameLiveBottombarFlowViewPagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        C483880IyI c483880IyILLLILZLLLI = LLLILZLLLI(i);
        GameLiveBottombarFlowFragment gameLiveBottombarFlowFragment = new GameLiveBottombarFlowFragment();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setFeedConfig: ");
        sbLIZ2.append(c483880IyILLLILZLLLI.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ2));
        Map<String, String> map = c483880IyILLLILZLLLI.LIZJ;
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
        } else {
            linkedHashMap = null;
        }
        gameLiveBottombarFlowFragment.LLILZ = C483880IyI.LIZ(c483880IyILLLILZLLLI, linkedHashMap);
        return gameLiveBottombarFlowFragment;
    }

    public final C483880IyI LLLILZLLLI(int i) {
        List listLLIIII = C13LP.LLIIII(this.LLJI);
        if (i >= 0 && i < listLLIIII.size()) {
            return (C483880IyI) ListProtector.get(listLLIIII, i);
        }
        if (!listLLIIII.isEmpty()) {
            return (C483880IyI) ListProtector.get(listLLIIII, 0);
        }
        return new C483880IyI((String) null, (String) null, (Map) null, (InterfaceC483890IyJ) null, 31);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
    public final long getItemId(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemId position:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GameLiveBottombarFlowViewPagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= 0 && i < this.LLJI.size()) {
            C483880IyI c483880IyI = (C483880IyI) ListProtector.get(this.LLJI, i);
            long j = (((long) i) << 32) | (c483880IyI.LIZLLL & 4294967295L);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getItemId position:");
            sbLIZ2.append(i);
            sbLIZ2.append(", avatarId:");
            sbLIZ2.append(c483880IyI.LIZLLL);
            sbLIZ2.append(", stableId:");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("GameLiveBottombarFlowViewPagerAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            return j;
        }
        return i;
    }

    public C483860IyG(C19EG c19eg, List<C483880IyI> list) {
        super(c19eg);
        this.LLJI = list;
        if (list.isEmpty()) {
            list.add(new C483880IyI((String) null, (String) null, (Map) null, (InterfaceC483890IyJ) null, 31));
        }
    }
}
