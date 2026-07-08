package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582190rH7 extends AbstractC1585810rMx {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(182));
    public final /* synthetic */ FriendsV3FeedListAssem LLILLJJLI;

    public C1582190rH7(FriendsV3FeedListAssem friendsV3FeedListAssem) {
        this.LLILLJJLI = friendsV3FeedListAssem;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL.getValue()).iterator();
        while (it2.hasNext()) {
            ((AbstractC1585810rMx) it2.next()).LJJIIJ(recyclerView, i);
        }
        this.LLILLJJLI.Zo(i);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LL.getValue()).iterator();
        while (it2.hasNext()) {
            ((AbstractC1585810rMx) it2.next()).LJJIIZI(recyclerView, i, i2);
        }
        this.LLILLJJLI.ap(recyclerView, i, i2);
    }
}
