package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Sf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726780Sf6 implements InterfaceC1603360rpG, C0PDP {
    public final C2189821An6 LL;

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
    }

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
        return i;
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
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        String storyToPostAid = this.LL.getStoryToPostAid();
        if (storyToPostAid != null && (obj = ((LinkedHashMap) C712310Rwr.LIZ.getValue()).get(storyToPostAid)) != null) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public C726780Sf6(C2189821An6 c2189821An6) {
        this.LL = c2189821An6;
    }
}
