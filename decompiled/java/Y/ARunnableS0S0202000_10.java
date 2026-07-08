package Y;

import X.C092O;
import X.C0P6H;
import X.C0PQZ;
import X.C0PRC;
import X.C0Q3E;
import X.C1C7U;
import X.C20600815jK;
import X.C641800PFi;
import X.C641820PFk;
import X.C645130PSd;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS0S0202000_10 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<String> urlList;
        Object obj;
        UrlModel avatarThumb;
        UrlModel cover;
        int i = this.i2;
        if (i > this.i3) {
            return;
        }
        while (true) {
            List list = (List) this.l0;
            synchronized (list) {
                try {
                    urlList = null;
                    obj = (!(list.isEmpty() ^ true) || i >= list.size()) ? null : list.get(i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (obj != null) {
                C0PQZ c0pqz = C0PQZ.LIZ;
                C0P6H c0p6h = (C0P6H) this.l1;
                Aweme aweme = (Aweme) obj;
                Video video = aweme.getVideo();
                List<String> urlList2 = (video == null || (cover = video.getCover()) == null) ? null : cover.getUrlList();
                c0p6h.getClass();
                String strLIZIZ = C0P6H.LIZIZ(urlList2);
                c0pqz.getClass();
                C0PQZ.LIZJ(strLIZIZ, null, "", -1, -1);
                C0P6H c0p6h2 = (C0P6H) this.l1;
                User author = aweme.getAuthor();
                if (author != null && (avatarThumb = author.getAvatarThumb()) != null) {
                    urlList = avatarThumb.getUrlList();
                }
                c0p6h2.getClass();
                String strLIZIZ2 = C0P6H.LIZIZ(urlList);
                c0pqz.getClass();
                C0PQZ.LIZJ(strLIZIZ2, null, "", -1, -1);
            }
            if (i == this.i3) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void run$0(ARunnableS0S0202000_10 aRunnableS0S0202000_10) {
        long jCurrentTimeMillis;
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aRunnableS0S0202000_10.l0;
        int i = aRunnableS0S0202000_10.i2;
        int i2 = aRunnableS0S0202000_10.i3;
        C641820PFk c641820PFk = (C641820PFk) aRunnableS0S0202000_10.l1;
        searchContainerFragment.getClass();
        C1C7U.LIZ("SearchContainerFragment@41cd.lambda$observeTabReorderAndChooseAction$10$1L");
        String str = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        searchContainerFragment.cS(i);
        if (i != i2) {
            if (c641820PFk.LIZLLL > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - c641820PFk.LIZLLL;
            } else {
                jCurrentTimeMillis = 0;
            }
            C641800PFi.LIZ(2, str, Math.max(0L, jCurrentTimeMillis), c641820PFk.LIZJ);
        }
        C1C7U.LIZIZ("SearchContainerFragment@41cd.lambda$observeTabReorderAndChooseAction$10$1L");
    }

    public static final void run$1(ARunnableS0S0202000_10 aRunnableS0S0202000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchImagePreloader@5679.prefetchOnFling$1");
        try {
            aRunnableS0S0202000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchImagePreloader@5679.prefetchOnFling$1");
    }

    public static final void run$2(ARunnableS0S0202000_10 aRunnableS0S0202000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchJediMixFeedAdapter@86a9.findViewHolderForAdapterPosition$1");
        try {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((C645130PSd) aRunnableS0S0202000_10.l0).LL.findViewHolderForAdapterPosition(aRunnableS0S0202000_10.i2);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                int i = aRunnableS0S0202000_10.i3;
                if (i < 10) {
                    ((C645130PSd) aRunnableS0S0202000_10.l0).LLLLIIL(aRunnableS0S0202000_10.i2, i + 1, (C092O) aRunnableS0S0202000_10.l1);
                }
            } else {
                ((C092O) aRunnableS0S0202000_10.l1).accept(viewHolderFindViewHolderForAdapterPosition);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchJediMixFeedAdapter@86a9.findViewHolderForAdapterPosition$1");
    }

    public static final void run$3(ARunnableS0S0202000_10 aRunnableS0S0202000_10) {
        boolean zLIZ;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("SkylightListViewModel@8bc2.updateActiveStatusData$2$1$invoke$$inlined$safeMutateListAlways$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SkylightListViewModel) aRunnableS0S0202000_10.l0).LLJJIJI;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                C20600815jK.LJIILLIIL(state, aRunnableS0S0202000_10.i2, aRunnableS0S0202000_10.i3, (List) aRunnableS0S0202000_10.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.updateActiveStatusData$2$1$invoke$$inlined$safeMutateListAlways$1");
    }

    public static final void run$4(ARunnableS0S0202000_10 aRunnableS0S0202000_10) {
        boolean zLIZ;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("SkylightListViewModel@8bc2.applyActiveStatusInPlace$2$invoke$$inlined$safeMutateListAlways$2");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SkylightListViewModel) aRunnableS0S0202000_10.l0).LLJJIJI;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                C20600815jK.LJIILLIIL(state, aRunnableS0S0202000_10.i2, aRunnableS0S0202000_10.i3, (List) aRunnableS0S0202000_10.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.applyActiveStatusInPlace$2$invoke$$inlined$safeMutateListAlways$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S0202000_10(int i, int i2, int i3, List<? extends Aweme> list, C0P6H<Object> c0p6h) {
        this.$t = c0p6h;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = i3;
        this.l1 = list;
    }
}
