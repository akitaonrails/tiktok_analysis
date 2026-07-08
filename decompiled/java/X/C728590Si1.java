package X;

import Y.ARunnableS111S0100000_11;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Si1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728590Si1 implements InterfaceC1603360rpG, C0PDP {
    public final C728350Shd LL;
    public InterfaceC1209780haS LLILLJJLI;
    public final C728520Shu LLILLL = new C1260870iur<C728350Shd, InterfaceC728550Shx>() { // from class: X.0Shu
        @Override // X.C1260870iur, X.InterfaceC1526205yG
        public final void onSuccess() {
            InterfaceC728550Shx interfaceC728550Shx = (InterfaceC728550Shx) this.LLILLJJLI;
            if (interfaceC728550Shx != null) {
                interfaceC728550Shx.G90(new Pair<>(0, C13LP.LJJJLL(((C728350Shd) this.LL).LLILLL)));
            }
        }

        @Override // X.C1260870iur, X.InterfaceC1526205yG
        public final void onFailed(Exception exc) {
            InterfaceC728550Shx interfaceC728550Shx = (InterfaceC728550Shx) this.LLILLJJLI;
            if (interfaceC728550Shx != null) {
                interfaceC728550Shx.qJ1(exc);
            }
        }
    };
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(425));
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);
    public final C728600Si2 LLIZ = new InterfaceC1526205yG() { // from class: X.0Si2
        @Override // X.InterfaceC1526205yG
        public final void onFailed(Exception exc) {
        }

        @Override // X.InterfaceC1526205yG
        public final void onSuccess() {
            if (this.LL.LLILZLL.compareAndSet(false, true)) {
                this.LL.LIZ();
            }
        }
    };

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return null;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return false;
    }

    public final void LIZ() {
        InterfaceC1209780haS interfaceC1209780haS;
        Fragment fragment;
        Bundle arguments;
        String str;
        C19EG activity;
        Aweme aweme;
        UserStory userStory;
        if (this.LLILZIL.get() || (interfaceC1209780haS = this.LLILLJJLI) == null || (fragment = interfaceC1209780haS.getFragment()) == null || (arguments = fragment.getArguments()) == null || !arguments.getBoolean("story_preload_already_done", false)) {
            return;
        }
        C728350Shd c728350Shd = this.LL;
        List<Aweme> stories = null;
        if (c728350Shd != null) {
            str = c728350Shd.LL;
            List<Aweme> list = c728350Shd.LLILLL;
            if (list != null && (aweme = (Aweme) C13LP.LJJJLL(list)) != null && (userStory = aweme.getUserStory()) != null) {
                stories = userStory.getStories();
            }
        } else {
            str = null;
        }
        if ((stories == null || stories.isEmpty()) && this.LLILZIL.compareAndSet(false, true) && (activity = fragment.getActivity()) != null) {
            if (str != null && str.length() != 0) {
                User user = new User();
                user.setUid(str);
                C1605650rsx.LIZIZ.LJIIL(Collections.singletonList(user), EnumC1606080rte.FEED, true);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131849048);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            C786410Ut5.LJLIIL(500L, (Handler) this.LLILZ.getValue(), new ARunnableS111S0100000_11(this, 131));
        }
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        C728350Shd c728350Shd = this.LL;
        return c728350Shd != null ? c728350Shd.LLILLL : new ArrayList();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        List<Aweme> list;
        C728350Shd c728350Shd = this.LL;
        return c728350Shd == null || (list = c728350Shd.LLILLL) == null || list.isEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
        C11NJ c11nj;
        C728350Shd c728350Shd = this.LL;
        if (c728350Shd != null && (c11nj = c728350Shd.LLILZ) != null) {
            c11nj.dispose();
        }
        C728350Shd c728350Shd2 = this.LL;
        if (c728350Shd2 != null) {
            c728350Shd2.clearNotifyListener(this.LLIZ);
        }
        ((Handler) this.LLILZ.getValue()).removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Shu] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Si2] */
    public C728590Si1(C728350Shd c728350Shd) {
        this.LL = c728350Shd;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LLILLJJLI = interfaceC1209780haS;
        C728520Shu c728520Shu = this.LLILLL;
        c728520Shu.LLILLJJLI = interfaceC1209780haS;
        C728350Shd c728350Shd = this.LL;
        if (c728350Shd != null) {
            c728520Shu.LJIIJ(c728350Shd);
            this.LL.addNotifyListener(this.LLIZ);
        }
        C728350Shd c728350Shd2 = this.LL;
        if (c728350Shd2 != null && c728350Shd2.LLILLJJLI != null) {
            LIZ();
        }
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        LIZJ(1);
    }
}
