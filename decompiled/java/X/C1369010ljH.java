package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventInviteGuestFragment;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventRegisteredGuestFragment;
import com.ss.android.ugc.aweme.sharer.model.MultiGuestLiveEventRegisteredUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ljH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369010ljH extends FragmentStateAdapter {
    public final SharePackage LLJI;
    public final String LLJIJIL;
    public final Pair<List<Long>, List<MultiGuestLiveEventRegisteredUser>> LLJILJIL;
    public final long LLJILJILJ;
    public final List<Integer> LLJILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJILLL).size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        ArrayList arrayList;
        Set setLLIIIZ;
        ArrayList arrayList2;
        long jLongValue;
        if (((Number) ListProtector.get(this.LLJILLL, i)).intValue() == 0) {
            SharePackage sharePackage = this.LLJI;
            String str = this.LLJIJIL;
            List<Long> first = this.LLJILJIL.getFirst();
            if (first != null && (setLLIIIZ = C13LP.LLIIIZ(first)) != null) {
                List<MultiGuestLiveEventRegisteredUser> second = this.LLJILJIL.getSecond();
                if (second != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(second, 10));
                    Iterator<MultiGuestLiveEventRegisteredUser> it2 = second.iterator();
                    while (it2.hasNext()) {
                        Long l = it2.next().uid;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        arrayList2.add(Long.valueOf(jLongValue));
                    }
                } else {
                    arrayList2 = new ArrayList();
                }
                setLLIIIZ.addAll(arrayList2);
                arrayList = new ArrayList(setLLIIIZ);
            } else {
                arrayList = null;
            }
            C1369050ljL c1369050ljL = C1369050ljL.LIZ;
            LiveEventInviteGuestFragment liveEventInviteGuestFragment = new LiveEventInviteGuestFragment();
            liveEventInviteGuestFragment.LLILLJJLI = null;
            liveEventInviteGuestFragment.LLILLL = false;
            liveEventInviteGuestFragment.LLILZ = null;
            liveEventInviteGuestFragment.LLILZIL = false;
            liveEventInviteGuestFragment.LLILZLL = sharePackage;
            liveEventInviteGuestFragment.LLIZ = null;
            liveEventInviteGuestFragment.LLIZLLLIL = null;
            liveEventInviteGuestFragment.LLJ = null;
            liveEventInviteGuestFragment.LLJI = null;
            liveEventInviteGuestFragment.LLJIJIL = null;
            liveEventInviteGuestFragment.LLJILJIL = true;
            liveEventInviteGuestFragment.LLJILJILJ = false;
            liveEventInviteGuestFragment.LLJILLL = false;
            liveEventInviteGuestFragment.LLJJ = true;
            liveEventInviteGuestFragment.LLJJI = false;
            liveEventInviteGuestFragment.LLJJIII = false;
            liveEventInviteGuestFragment.LLJJIJI = false;
            liveEventInviteGuestFragment.LLJJIJIIJIL = c1369050ljL;
            liveEventInviteGuestFragment.LLJJIJIL = false;
            liveEventInviteGuestFragment.LLJL = str;
            liveEventInviteGuestFragment.LL = arrayList;
            return liveEventInviteGuestFragment;
        }
        if (((Number) ListProtector.get(this.LLJILLL, i)).intValue() == 1) {
            String str2 = this.LLJIJIL;
            long j = this.LLJILJILJ;
            List<MultiGuestLiveEventRegisteredUser> second2 = this.LLJILJIL.getSecond();
            LiveEventRegisteredGuestFragment liveEventRegisteredGuestFragment = new LiveEventRegisteredGuestFragment();
            liveEventRegisteredGuestFragment.LL = str2;
            liveEventRegisteredGuestFragment.LLILLJJLI = j;
            liveEventRegisteredGuestFragment.LLILLL = second2;
            return liveEventRegisteredGuestFragment;
        }
        return new Fragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1369010ljH(Fragment fragment, SharePackage sharePackage, String str, Pair<? extends List<Long>, ? extends List<MultiGuestLiveEventRegisteredUser>> pair, long j) {
        super(fragment);
        this.LLJI = sharePackage;
        this.LLJIJIL = str;
        this.LLJILJIL = pair;
        this.LLJILJILJ = j;
        this.LLJILLL = new ArrayList();
    }
}
