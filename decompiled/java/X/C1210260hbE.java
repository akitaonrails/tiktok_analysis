package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0hbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210260hbE implements InterfaceC1603360rpG {
    public final C1252490ihL LL = new C1252490ihL();
    public WeakReference<InterfaceC1209780haS> LLILLJJLI = null;
    public final C728560Shy LLILLL = new C728560Shy();

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 7000;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
        this.LLILLJJLI = null;
        this.LLILLL.LIZ();
        this.LLILLL.LJIILJJIL();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLILLL.LJIIL();
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this.LL;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LLILLJJLI = new WeakReference<>(interfaceC1209780haS);
        C728560Shy c728560Shy = this.LLILLL;
        c728560Shy.LLILLJJLI = interfaceC1209780haS;
        c728560Shy.LJIIJ(this.LL);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        WeakReference<InterfaceC1209780haS> weakReference = this.LLILLJJLI;
        if (weakReference != null && weakReference.get() != null) {
            this.LLILLJJLI.get().S();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLILLL.LIZJ(c2189821An6.getAid(), c2189821An6.getEventType());
    }
}
