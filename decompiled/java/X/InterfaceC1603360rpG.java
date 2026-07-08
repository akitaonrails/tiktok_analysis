package X;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0rpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1603360rpG {
    void bindView(InterfaceC1209780haS interfaceC1209780haS);

    boolean cannotLoadLatest();

    boolean cannotLoadMore();

    boolean deleteItem(String str);

    int getPageType(int i);

    Object getViewModel();

    boolean init(Fragment fragment);

    boolean isDataEmpty();

    boolean isLoading();

    void request(int i, C2189821An6 c2189821An6, int i2, boolean z);

    void unInit();
}
