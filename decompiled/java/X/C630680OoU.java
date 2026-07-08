package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;

/* JADX INFO: renamed from: X.0OoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630680OoU implements InterfaceC1603360rpG, C0PDP {
    public InterfaceC1209780haS LL;
    public final Integer LLILLJJLI;

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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[PHI: r4 r7
      0x0032: PHI (r4v4 com.ss.android.ugc.aweme.services.MusicEntranceResult) = 
      (r4v1 com.ss.android.ugc.aweme.services.MusicEntranceResult)
      (r4v5 com.ss.android.ugc.aweme.services.MusicEntranceResult)
     binds: [B:11:0x0030, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r7v3 java.util.List) = (r7v0 java.util.List), (r7v4 java.util.List) binds: [B:11:0x0030, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[PHI: r4 r7
      0x0036: PHI (r4v3 com.ss.android.ugc.aweme.services.MusicEntranceResult) = 
      (r4v1 com.ss.android.ugc.aweme.services.MusicEntranceResult)
      (r4v4 com.ss.android.ugc.aweme.services.MusicEntranceResult)
     binds: [B:11:0x0030, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r7v2 java.util.List) = (r7v0 java.util.List), (r7v3 java.util.List) binds: [B:11:0x0030, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0PDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C630680OoU.getAwemeList():java.util.List");
    }

    public C630680OoU(C2189821An6 c2189821An6) {
        Integer storyMusicEntrancePageCode;
        DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
        if (navArgModel != null) {
            storyMusicEntrancePageCode = navArgModel.getStoryMusicEntrancePageCode();
        } else {
            storyMusicEntrancePageCode = null;
        }
        this.LLILLJJLI = storyMusicEntrancePageCode;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LL = interfaceC1209780haS;
    }
}
