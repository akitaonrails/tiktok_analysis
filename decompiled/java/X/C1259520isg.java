package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0isg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259520isg implements InterfaceC1259580ism {
    public static final C1259520isg LIZIZ = new C1259520isg();
    public final /* synthetic */ InterfaceC1259580ism LIZ = C1260090itb.LIZIZ.favoritesMobUtilsService();

    @Override // X.InterfaceC1259580ism
    public final boolean isDataSetChangedOnStart() {
        return this.LIZ.isDataSetChangedOnStart();
    }

    @Override // X.InterfaceC1259580ism
    public final void onVideoItemActionShow(Aweme aweme) {
        this.LIZ.onVideoItemActionShow(aweme);
    }

    @Override // X.InterfaceC1259580ism
    public final void setDataSetChangedOnStart(boolean z) {
        this.LIZ.setDataSetChangedOnStart(z);
    }
}
