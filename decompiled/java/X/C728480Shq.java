package X;

import Y.AfS147S0200000_11;
import Y.AfS180S0100000_11;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Shq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C728480Shq implements InterfaceC1603360rpG {
    public static final C01GW<HashMap<String, Aweme>> LLILZIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(399));
    public final C11NJ LL = new C11NJ();
    public InterfaceC1209780haS LLILLJJLI;
    public List<Aweme> LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean deleteItem(String str) {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public int getPageType(int i) {
        return 40;
    }

    @Override // X.InterfaceC1603360rpG
    public Object getViewModel() {
        return null;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean isDataEmpty() {
        List<Aweme> list = this.LLILLL;
        return list == null || list.isEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public void unInit() {
        this.LL.dispose();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLILZ;
    }

    public final void LIZ(List<? extends Aweme> list) {
        UserStory userStory;
        List<Aweme> stories;
        Bundle arguments;
        Fragment fragment;
        this.LLILLL = new ArrayList(list);
        if ((!list.isEmpty()) && (userStory = ((Aweme) ListProtector.get(list, 0)).getUserStory()) != null && (stories = userStory.getStories()) != null) {
            InterfaceC1209780haS interfaceC1209780haS = this.LLILLJJLI;
            if (interfaceC1209780haS != null && (fragment = interfaceC1209780haS.getFragment()) != null) {
                arguments = fragment.getArguments();
            } else {
                arguments = null;
            }
            C1380890m2R.LIZLLL(arguments, stories);
        }
        InterfaceC1209780haS interfaceC1209780haS2 = this.LLILLJJLI;
        if (interfaceC1209780haS2 != null) {
            interfaceC1209780haS2.LLJJJIL(list, false);
        }
        InterfaceC1209780haS interfaceC1209780haS3 = this.LLILLJJLI;
        if (interfaceC1209780haS3 != null) {
            interfaceC1209780haS3.G90(new Pair<>(0, ListProtector.get(list, 0)));
        }
    }

    public void LIZIZ(C2189821An6 c2189821An6) {
        C730000SkI.LIZIZ.LIZJ(249372176, 4);
        String aid = c2189821An6.getAid();
        if (aid == null || aid.length() <= 0) {
            aid = c2189821An6.getItemId();
        }
        StoryApi storyApi = StoryApi.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(aid);
        sbLIZ.append(']');
        this.LL.LIZ(storyApi.queryBatchAwemeRx(C2188811AlT.LIZIZ(sbLIZ), c2189821An6.getEventType(), c2189821An6.getPushParams(), 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS180S0100000_11(this, 7), new AfS147S0200000_11(c2189821An6, this, 7)));
    }

    public final void LIZJ(int i) {
        Fragment fragment;
        C19EG activity;
        InterfaceC1209780haS interfaceC1209780haS = this.LLILLJJLI;
        if (interfaceC1209780haS != null && (fragment = interfaceC1209780haS.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            String string = activity.getString(i);
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1603360rpG
    public void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LLILLJJLI = interfaceC1209780haS;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLILZ = true;
        LIZIZ(c2189821An6);
    }
}
