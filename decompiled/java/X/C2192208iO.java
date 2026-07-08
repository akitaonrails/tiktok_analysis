package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel;

/* JADX INFO: renamed from: X.08iO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2192208iO {
    public final String LIZ;
    public Object LIZIZ;
    public final C2192508iR LIZJ = new C2192508iR();
    public final C2192408iQ LIZLLL;
    public final C23119094b LJ;
    public final C054G LJFF;
    public final C2252321DDq LJI;
    public final C2252321DDq LJII;

    public C2192208iO(ViewModelStoreOwnerViewModel viewModelStoreOwnerViewModel, String str, Object obj, Lifecycle lifecycle) {
        this.LIZ = str;
        this.LIZIZ = obj;
        C2192408iQ c2192408iQ = new C2192408iQ();
        this.LIZLLL = c2192408iQ;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LJ = c23119094bLIZ;
        C054G c054gLJII = C2296808zG.LJII(ViewModelKt.getViewModelScope(viewModelStoreOwnerViewModel), c23119094bLIZ);
        this.LJFF = c054gLJII;
        this.LJI = C1BNE.LIZ(lifecycle);
        this.LJII = C1BNE.LIZ(Boolean.FALSE);
        c2192408iQ.LL.setCurrentState(Lifecycle.State.CREATED);
        C23250099c.LIZLLL(c054gLJII, null, null, new C2192008iM(this, null), 3);
        C23250099c.LIZLLL(c054gLJII, null, null, new C2191808iK(this, viewModelStoreOwnerViewModel, null), 3);
    }
}
